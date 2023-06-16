package com.andrew.billmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu_item")
public class MenuItem extends BaseEntity<Long>{
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @Column(name = "is_available")
    private Boolean isAvailable = true;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
