package com.andrew.billmanagement.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "topping")
public class Topping extends BaseEntity<Long>{
    @ManyToOne
    @JoinColumn(name = "type_id")
    private ItemType type;
    @Column(name = "name", length = 25)
    private String name;
    @Column(name = "price")
    private Double price = 0.0;
    @OneToMany(mappedBy = "topping")
    private List<OrderedTopping> orderedToppings = new ArrayList<>();

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
