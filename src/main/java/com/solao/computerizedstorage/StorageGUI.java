// File: src/main/java/com/solao/computerizedstorage/StorageGUI.java
package com.solao.computerizedstorage;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class StorageGUI implements Listener {
    public Inventory getStorageInventory() {
        Inventory inventory = Bukkit.createInventory(null, 54, "Storage System");
        // TODO: Populate inventory with stored items
        return inventory;
    }
}