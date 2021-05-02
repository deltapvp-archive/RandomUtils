package net.deltapvp.randomutils;

import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import org.bukkit.plugin.java.JavaPlugin;

public final class RandomUtils extends JavaPlugin {

    static RandomUtils instance;
    private BukkitAudiences adventure;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static RandomUtils getInstance() {
        return instance;
    }

    public BukkitAudiences getAdventure() {
        if (this.adventure == null) {
            this.adventure = BukkitAudiences.create(this);
        }
        return this.adventure;
    }
}