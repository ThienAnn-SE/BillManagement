package com.andrew.billmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address extends BaseEntity<Long>{
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private User user;
    @Column(name = "street", length = 100)
    private String street;
    @Column(name = "ward_code")
    private Integer wardCode;
    @Column(name = "district_code")
    private Integer districtCode;
    @Column(name = "province_code")
    private Integer provinceCode;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getWardCode() {
        return wardCode;
    }

    public void setWardCode(Integer wardCode) {
        this.wardCode = wardCode;
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }
}
