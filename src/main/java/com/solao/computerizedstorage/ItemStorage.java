package com.solao.computerizedstorage;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ItemStorage {
    private final Map<String, ItemStack> storedItems;
    private final Connection dbConnection;

    public ItemStorage(JavaPlugin plugin) throws SQLException {
        this.storedItems = new HashMap<>();
        FileConfiguration config = plugin.getConfig();
        String dbType = config.getString("storage.backend", "h2");

        String dbUrl;
        if ("mariadb".equalsIgnoreCase(dbType)) {
            String host = config.getString("storage.mariadb.host", "localhost");
            int port = config.getInt("storage.mariadb.port", 3306);
            String database = config.getString("storage.mariadb.database", "minecraft");
            String user = config.getString("storage.mariadb.user", "root");
            String password = config.getString("storage.mariadb.password", "password");
            dbUrl = "jdbc:mariadb://" + host + ":" + port + "/" + database;
            dbConnection = DriverManager.getConnection(dbUrl, user, password);
        } else {
            String dbPath = config.getString("storage.h2.path", "database");
            dbUrl = "jdbc:h2:" + dbPath;
            dbConnection = DriverManager.getConnection(dbUrl);
        }
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

    public Connection getDbConnection() {
        return dbConnection;
    }
}