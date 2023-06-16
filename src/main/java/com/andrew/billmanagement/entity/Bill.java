package com.andrew.billmanagement.entity;

import com.andrew.billmanagement.entity.constant.EDiscountType;
import com.andrew.billmanagement.entity.constant.EPaymentMethod;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bill")
public class Bill extends BaseEntity<Long>{
    @ManyToOne
    @JoinColumn(name = "submit_by")
    private User submitBy;
    @Column(name = "total_price")
    private Double totalPrice = 0.0;
    @Column(name = "discount_type")
    private EDiscountType discountType;
    @Column(name = "discount_amount")
    private Double discountAmount = 0.0;
    @Column(name = "payment_method")
    private EPaymentMethod paymentMethod;
    @Column(name = "note")
    private String note;

    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
    private List<OrderedItem> orderedItems = new ArrayList<>();

    public User getSubmitBy() {
        return submitBy;
    }

    public void setSubmitBy(User submitBy) {
        this.submitBy = submitBy;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
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
        this.discountAmount = discountAmount;
    }

    public EPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(EPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<OrderedItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<OrderedItem> orderedItems) {
        this.orderedItems = orderedItems;
    }
}
