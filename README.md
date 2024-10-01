# Computerized Storage

**Computerized Storage** is a Minecraft Spigot plugin designed to emulate storage mechanisms similar to those found in the popular mod **Applied Energistics 2**. The plugin offers players an advanced storage solution for managing their items efficiently.

## Features

- **Custom Storage System:** Store and manage items in a custom GUI.
- **Commands:** Simple commands to open the storage interface.
- **GUI Based Interaction:** Easy to use graphical interface for interacting with the storage.

## Installation

1. **Download the Plugin:**
    - TBD: Provide link to download the plugin.

2. **Place in Plugins Folder:**
    - Copy the downloaded JAR file to the `plugins` folder of your Spigot server.

3. **Start the Server:**
    - Restart or start your Spigot server to load the plugin.

## Configuration

Currently, the plugin does not require any specific configuration. Future updates may include configurable options.

## Commands

- `/openstorage`
    - **Description:** Opens the storage interface.
    - **Usage:** `/openstorage`
    - **Permission:** None (default to all players)

## Development Setup

### Requirements

- **Java 8+**
- **Maven**
- **Spigot API**

### Setting Up the Development Environment

1. **Clone the Repository:**

    ```sh
    git clone https://github.com/yourusername/ComputerizedStorage.git
    cd ComputerizedStorage
    ```

2. **Import into IntelliJ IDEA:**

    - Open IntelliJ IDEA.
    - Select `File > Open` and choose the cloned directory.
    - Ensure Maven is setup and sync your dependencies.

3. **Modify `plugin.yml` as needed:**

    ```yml
    # Example plugin.yml
    name: ComputerizedStorage
    main: com.solao.computerizedstorage.ComputerizedStorage
    version: 1.0
    api-version: 1.21
    commands:
      openstorage:
        description: Opens the storage interface
    ```

### Project Structure

- `src/main/java/com/solao/computerizedstorage`
    - `ComputerizedStorage.java` - Main plugin class.
    - `StorageCommand.java` - Command executor to open the storage GUI.
    - `ItemStorage.java` - Class to manage stored items.
    - `StorageGUI.java` - Class to handle the storage interface.

### Contributing

1. Fork the repository.
2. Create your feature branch: `git checkout -b feature/YourFeature`
3. Commit your changes: `git commit -am 'Add your feature'`
4. Push to the branch: `git push origin feature/YourFeature`
5. Submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by **Applied Energistics 2**
- Thanks to the Bukkit and Spigot communities for their continuous support and resources.
