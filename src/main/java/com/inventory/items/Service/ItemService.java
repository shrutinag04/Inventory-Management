package com.inventory.items.Service;

import com.inventory.items.model.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItem();
    Item addItem(Item item);
    Item deleteItemById(int id);
}
