package net.deltapvp.randomutils;

import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import org.bukkit.plugin.java.JavaPlugin;

public final class RandomUtils extends JavaPlugin {

    static RandomUtils instance;
    private BukkitAudiences adventure;

    @Override
    public void onLoad() {
        instance = this;
        this.adventure = BukkitAudiences.create(this);
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static RandomUtils getInstance() {
        return instance;
    }

    public static void init() {
        new RandomUtils();
    }

    public RandomUtils() {
    }

    public BukkitAudiences getAdventure() {
        return this.adventure;
    }
}