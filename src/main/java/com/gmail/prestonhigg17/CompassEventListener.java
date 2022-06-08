package com.gmail.prestonhigg17;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CompassEventListener implements Listener
{
    @EventHandler
    public void onPlayerMoveListener(InventoryClickEvent event)
    {
        try
        {
            ItemStack item = event.getCurrentItem();
            if (!item.equals(null))
            {
                if (item.getItemMeta().equals(ItemHandler.compass.getItemMeta()))
                {

                    event.setCancelled(true);
                }
            }
        } catch (NullPointerException e)
        {
        }
    }

    @EventHandler
    public void onPlayerDropListener(PlayerDropItemEvent event)
    {
        try
        {
            Item item = event.getItemDrop();
            if (!item.equals(null))
            {
                if (item.getItemStack().getItemMeta().equals(ItemHandler.compass.getItemMeta()))
                {
                    event.setCancelled(true);
                }
            }
        } catch (NullPointerException e)
        {
        }


    }

    @EventHandler
    public void onPlayerMoveItemListener(InventoryMoveItemEvent event)
    {
        try
        {
            ItemStack item = event.getItem();
            if (!item.equals(null))
            {
                if (item.getItemMeta().equals(ItemHandler.compass.getItemMeta()))
                {
                    event.setCancelled(true);
                }
            }
        } catch (NullPointerException e)
        {
        }


    }
}
