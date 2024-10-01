// File: src/main/java/com/solao/computerizedstorage/ComputerizedStorage.java
package com.solao.computerizedstorage;

import org.bukkit.plugin.java.JavaPlugin;

public class ComputerizedStorage extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        loadConfig();
        this.getCommand("openstorage").setExecutor(new StorageCommand());
        getServer().getPluginManager().registerEvents(new StorageGUI(), this);
        getLogger().info("ComputerizedStorage has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ComputerizedStorage has been disabled!");
    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}