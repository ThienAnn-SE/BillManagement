package com.andrew.billmanagement.entity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ordered_item")
public class OrderedItem extends BaseEntity<Long>{
    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @OneToMany(mappedBy = "orderedItem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderedTopping> orderedToppings = new ArrayList<>();
    @Column(name = "quantity")
    private int quantity = 1;
    @Column(name = "note", length = 50)
    private String note;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<OrderedTopping> getOrderedToppings() {
        return orderedToppings;
    }

    public void setOrderedToppings(List<OrderedTopping> orderedToppings) {
        this.orderedToppings = orderedToppings;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
