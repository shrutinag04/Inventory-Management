package com.inventory.items.controllers;

import com.inventory.items.Service.ItemService;
import com.inventory.items.model.Item;
import com.inventory.items.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private ItemService itemService;
    public ItemController(@Autowired ItemService itemService){
        this.itemService=itemService;
    }
    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItem();
    }
    @PostMapping
    public Item addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }
    @DeleteMapping("/{id}")
    public Item deleteItem(@PathVariable("id") int id){
        return itemService.deleteItemById(id);
    }

}
