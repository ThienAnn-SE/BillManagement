package com.andrew.billmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu_topping")
public class MenuTopping extends BaseEntity<Long>{
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @ManyToOne()
    @JoinColumn(name = "topping_id")
    private Topping topping;
    @Column(name = "is_available")
    private Boolean isAvailable = true;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
