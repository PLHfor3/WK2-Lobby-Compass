package com.gmail.prestonhigg17;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ItemHandler
{
    public static ItemStack compass;

    public static void init()
    {
        createServerSelector();
    }

    private static void createServerSelector()
    {
        ItemStack item = new ItemStack(Material.COMPASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§9Server Selector");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§eweek2.hypixelstats.com");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compass = item;
    }


}
