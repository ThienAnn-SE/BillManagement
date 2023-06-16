package com.andrew.billmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "ordered_topping")
public class OrderedTopping extends BaseEntity<Long>{
    @ManyToOne
    @JoinColumn(name = "ordered_item_id")
    private OrderedItem orderedItem;
    @ManyToOne
    @JoinColumn(name = "topping_id")
    private Topping topping;
    @Column(name = "quantity")
    private int quantity = 1;

    public OrderedItem getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(OrderedItem orderedItem) {
        this.orderedItem = orderedItem;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
