package com.andrew.billmanagement.entity;

import javax.persistence.Entity;


public class Department extends BaseEntity<Long>{
    private String name;
    private User person_in_charge;
    private Address address;
    private String phone;
    private String email;
}
