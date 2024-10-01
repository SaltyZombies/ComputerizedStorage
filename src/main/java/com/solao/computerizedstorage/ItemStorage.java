// File: src/main/java/com/solao/computerizedstorage/ItemStorage.java
package com.solao.computerizedstorage;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class ItemStorage {
    private final Map<String, ItemStack> storedItems;

    public ItemStorage() {
        this.storedItems = new HashMap<>();
    }

    public void storeItem(String id, ItemStack item) {
        storedItems.put(id, item);
    }

    public ItemStack retrieveItem(String id) {
        return storedItems.get(id);
    }

    public Map<String, ItemStack> getStoredItems() {
        return storedItems;
    }
}