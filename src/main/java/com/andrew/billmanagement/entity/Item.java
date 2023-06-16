package com.andrew.billmanagement.entity;

import com.andrew.billmanagement.entity.constant.EDiscountType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item")
public class Item extends BaseEntity<Long>{
    @ManyToOne
    @JoinColumn(name = "type_id")
    private ItemType type;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "code", length = 10)
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "price")
    private Double price = 0.0;
    @Column(name = "is_combo")
    private Boolean isCombo = false;
    @Column(name = "discount_type")
    private EDiscountType discountType;
    @Column(name = "discount_amount")
    private Double discountAmount = 0.0;
    @OneToMany(mappedBy = "item")
    private List<OrderedItem> orderedItems = new ArrayList<>();
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getCombo() {
        return isCombo;
    }

    public void setCombo(Boolean combo) {
        isCombo = combo;
    }

    public EDiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(EDiscountType discountType) {
        this.discountType = discountType;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        switch (this.discountType){
            case FIXED:
                if(discountAmount > 0){
                    this.discountAmount = discountAmount;
                }else{
                    this.discountAmount = 0.0;
                }
            break;
            case PERCENTAGE:
                if(discountAmount > 0 || discountAmount < 1){
                    this.discountAmount = discountAmount;
                }else{
                    this.discountAmount = 0.0;
                }
                break;
            default:
                this.discountAmount = 0.0;
        }
    }
}
