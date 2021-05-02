package net.deltapvp.randomutils.utils;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class ItemBuilder {

    private final ItemStack item;

    private ItemBuilder(ItemStack item) {
        this.item = item;
    }

    public static ItemBuilder of(Material material) {
        return new ItemBuilder(new ItemStack(material));
    }

    public ItemBuilder setName(String name) {
        ItemMeta meta = this.item.getItemMeta();
        meta.setDisplayName(name);
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLore(String lore) {
        ItemMeta meta = this.item.getItemMeta();
        meta.setLore(Collections.singletonList(lore));
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLore(List<String> lores) {
        ItemMeta meta = this.item.getItemMeta();
        meta.setLore(lores);
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder addLore(String lore) {
        ItemMeta meta = this.item.getItemMeta();
        List<String> oldComponents = meta.hasLore() ? meta.getLore() : new ArrayList<>();
        oldComponents.add(lore);
        meta.setLore(oldComponents);
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        this.item.setAmount(amount);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean value) {
        ItemMeta meta = this.item.getItemMeta();
        meta.spigot().setUnbreakable(value);
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setColor(Color color) {
        ItemMeta meta = this.item.getItemMeta();
        if (!(meta instanceof LeatherArmorMeta)) {
            throw new UnsupportedOperationException("Cannot set color of a non-leather armor item.");
        }
        ((LeatherArmorMeta) meta).setColor(color);
        this.item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setData(short data) {
        this.item.setDurability(data);
        return this;
    }

    public ItemBuilder addEnchant(Enchantment enchantment, int level) {
        this.item.addUnsafeEnchantment(enchantment, level);
        return this;
    }

    public ItemBuilder removeEnchant(Enchantment enchantment) {
        this.item.removeEnchantment(enchantment);
        return this;
    }

    public ItemStack build() {
        return this.item.clone();
    }
}
