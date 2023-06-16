package com.andrew.billmanagement.controller;

import com.andrew.billmanagement.entity.Item;
import com.andrew.billmanagement.service.IItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/item")
public class ItemController {
    private final IItemService itemService;

    public ItemController(IItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAll(){
        return itemService.getAll();
    }
}
