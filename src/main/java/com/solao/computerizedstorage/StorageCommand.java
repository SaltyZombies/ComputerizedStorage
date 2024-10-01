// File: src/main/java/com/solao/computerizedstorage/StorageCommand.java
package com.solao.computerizedstorage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StorageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            StorageGUI gui = new StorageGUI();
            player.openInventory(gui.getStorageInventory());
        } else {
            sender.sendMessage("Only players can open the storage interface.");
        }
        return true;
    }
}