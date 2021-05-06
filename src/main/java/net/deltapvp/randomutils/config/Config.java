package net.deltapvp.randomutils.config;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class Config {

    private final JavaPlugin plugin;
    private final File file;
    private final YamlConfiguration configuration;

    /**
     * @param plugin    the {@link JavaPlugin} where this {@link Config} belongs to
     * @param name      the name of this {@link Config} file
     * @param overwrite if it should overwrite the file if one exists
     */
    public Config(JavaPlugin plugin, String name, boolean overwrite) {
        this.plugin = plugin;
        this.file = new File(plugin.getDataFolder(), name + ".yml");
        plugin.saveResource(name + ".yml", overwrite);
        this.configuration = YamlConfiguration.loadConfiguration(this.file);
    }

    /**
     * @param plugin the {@link JavaPlugin} where this {@link Config} belongs to
     * @param name   the name of this {@link Config} file
     */
    public Config(JavaPlugin plugin, String name) {
        this(plugin, name, false);
    }

    /**
     * get the {@link String} value of a path
     *
     * @param path the path of it
     * @param def  default if path does not exist
     * @return the {@link String} value or the default
     */
    public String getString(String path, String def) {
        return configuration.getString(path, def);
    }

    /**
     * get the {@link String} value of a path
     *
     * @param path the path of it
     * @return the {@link String} value or null
     */
    public String getString(String path) {
        return getString(path, null);
    }

    /**
     * get the {@link Boolean} value of a path
     *
     * @param path the path of it
     * @param def  default if path does not exist
     * @return the {@link Boolean} value or the default
     */
    public boolean getBoolean(String path, boolean def) {
        return configuration.getBoolean(path, def);
    }

    /**
     * get the {@link Boolean} value of a path
     *
     * @param path the path of it
     * @return the {@link Boolean} value or false
     */
    public boolean getBoolean(String path) {
        return getBoolean(path, false);
    }

    /**
     * get the {@link Long} value of a path
     *
     * @param path the path of it
     * @param def  default if path does not exist
     * @return the {@link Long} value or the default
     */
    public long getLong(String path, long def) {
        return configuration.getLong(path, def);
    }

    /**
     * get the {@link Long} value of a path
     *
     * @param path the path of it
     * @return the {@link Long} value or 0
     */
    public long getLong(String path) {
        return getLong(path, 0);
    }

    /**
     * get the {@link Integer} value of a path
     *
     * @param path the path of it
     * @param def  default if path does not exist
     * @return the {@link Integer} value or the default
     */
    public int getInt(String path, int def) {
        return configuration.getInt(path, def);
    }

    /**
     * get the {@link Integer} value of a path
     *
     * @param path the path of it
     * @return the {@link Integer} value or 0
     */
    public int getInt(String path) {
        return getInt(path, 0);
    }

    /**
     * get the {@link Double} value of a path
     *
     * @param path the path of it
     * @param def  default if path does not exist
     * @return the {@link Double} value or the default
     */
    public double getDouble(String path, double def) {
        return configuration.getDouble(path, def);
    }

    /**
     * get the {@link Double} value of a path
     *
     * @param path the path of it
     * @return the {@link Double} value or 0
     */
    public double getDouble(String path) {
        return getDouble(path, 0.0);
    }

    /**
     * get the {@link Object} of a path
     *
     * @param path the path of it
     * @param def  default if path does not exist
     * @return the {@link Object} value or the default
     */
    public Object get(String path, Object def) {
        return this.configuration.get(path, def);
    }

    /**
     * get the {@link Object} value of a path
     *
     * @param path the path of it
     * @return the {@link Object} value or null
     */
    public Object get(String path) {
        return get(path, null);
    }

    /**
     * get the {@link List} value of a path
     *
     * @param path the path of it
     * @param def  default if path does not exist
     * @return the {@link List} value or the default
     */
    public List<String> getStringList(String path, List<String> def) {
        if (this.configuration.contains(path)) {
            return this.configuration.getStringList(path);
        }
        return def;
    }

    /**
     * get the {@link List} value of a path
     *
     * @param path the path of it
     * @return the {@link List} value or an empty {@link List}
     */
    public List<?> etList(String path) {
        return getList(path, Collections.emptyList());
    }

    /**
     * get the {@link List} value of a path
     *
     * @param path the path of it
     * @param def  default if path does not exist
     * @return the {@link List} value or the default
     */
    public List<?> getList(String path, List<?> def) {
        if (this.configuration.contains(path)) {
            return this.configuration.getList(path);
        }
        return def;
    }

    /**
     * get the {@link List} value of a path
     *
     * @param path the path of it
     * @return the {@link List} value or an empty {@link List}
     */
    public List<String> getStringList(String path) {
        return getStringList(path, Collections.emptyList());
    }

    /**
     * get the configuration {@link File}
     *
     * @return the {@link File} file
     */
    public File getFile() {
        return this.file;
    }

    /**
     * get the {@link JavaPlugin} of the config
     *
     * @return the {@link JavaPlugin} of this config file
     */
    public JavaPlugin getPlugin() {
        return this.plugin;
    }

    /**
     * get the {@link YamlConfiguration}
     *
     * @return the {@link YamlConfiguration}
     */
    public YamlConfiguration getConfiguration() {
        return this.configuration;
    }
}
