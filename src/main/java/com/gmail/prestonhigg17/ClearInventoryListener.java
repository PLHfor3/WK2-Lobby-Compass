package com.gmail.prestonhigg17;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

public class ClearInventoryListener implements Listener
{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent p)
    {
        Player player = p.getPlayer();
        Inventory inventory = player.getInventory();
        if (!inventory.isEmpty())
        {
            player.getInventory().clear();
            player.getInventory().setItem(0, ItemHandler.compass);

        } else
        {
            player.getInventory().setItem(0, ItemHandler.compass);
        }
    }
}
