package com.inventory.items.Service.impl;

import com.inventory.items.Service.ItemService;
import com.inventory.items.model.Item;
import com.inventory.items.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {


    private ItemRepository itemRepository;

    public ItemServiceImpl(@Autowired ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }
    @Override
    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item deleteItemById(int id) {
        Item item=itemRepository.findById(id).orElse(null);
        itemRepository.deleteById(id);
        return item;
    }
}
