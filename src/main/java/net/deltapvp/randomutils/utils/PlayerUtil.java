package net.deltapvp.randomutils.utils;

import net.deltapvp.randomutils.RandomUtils;
import net.kyori.adventure.text.ComponentLike;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

import java.util.Collections;
import java.util.List;

public class PlayerUtil {

    /**
     * Resets a {@link Player}
     *
     * @param player the {@link Player} to reset
     */
    public static void resetPlayer(Player player) {
        for (PotionEffect potionEffect : player.getActivePotionEffects()) {
            player.removePotionEffect(potionEffect.getType());
        }
        player.setAllowFlight(false);
        player.setDisplayName(player.getName());
        player.setFlying(false);
        player.setGameMode(GameMode.SURVIVAL);
        player.setOp(false);
        player.setWhitelisted(false);
        player.setHealth(player.getMaxHealth());
        player.setFallDistance(0.0f);
        player.setFoodLevel(20);
        player.setSaturation(10.0f);
        player.setLevel(0);
        player.setExp(0.0f);
        player.getOpenInventory().close();
        player.getInventory().clear();
        player.getInventory().setArmorContents(null);
        player.updateInventory();
        player.setFireTicks(0);
        player.spigot().setAffectsSpawning(true);
        player.spigot().setCollidesWithEntities(true);
    }

    /**
     * Sends a {@link List} to the player
     *
     * @param player to send the {@link List} to
     * @param components a {@link List} to send to the {@link Player}
     */
    public static void sendMessage(Player player, List<ComponentLike> components) {
        for (ComponentLike componentLike : components) {
            RandomUtils.getInstance().getAdventure().player(player).sendMessage(componentLike);
        }
    }

    /**
     * Send a {@link ComponentLike} to a player
     *
     * @param player the @{link Player} to send the message to
     * @param component the {@link ComponentLike} to send to the {@link Player}
     */
    public static void sendMessage(Player player, ComponentLike component) {
        sendMessage(player, Collections.singletonList(component));
    }

    /**
     * Get a {@link Player}'s ping
     *
     * @param player the {@link Player}
     * @return an {@link Integer} of the {@link Player}'s ping
     */
    public static int getPing(Player player) {
        return BukkitReflection.getPing(player);
    }
}
