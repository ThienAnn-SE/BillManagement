package com.andrew.billmanagement.service.impl;

import com.andrew.billmanagement.entity.Item;
import com.andrew.billmanagement.repository.ItemRepository;
import com.andrew.billmanagement.service.IItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }
}
