package com.gmail.prestonhigg17;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryMoveSelectorListener implements Listener
{
    @EventHandler
    public void onPlayerMoveListener(InventoryClickEvent event)
    {
        ItemStack item = event.getCurrentItem();
        System.out.println("Before cancel event:" + item);
        if (item.getItemMeta().equals(ItemHandler.compass.getItemMeta()))
        {

            event.setCancelled(true);
            System.out.println("After cancel event:" + item);
        }
    }
}
