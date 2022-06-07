package com.gmail.prestonhigg17;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SelectorClickEventListener implements Listener
{
    @EventHandler
    public void onPlayerClickEvent(PlayerInteractEvent event)
    {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK || event.getAction() == Action.LEFT_CLICK_AIR)
        {
            if (event.getItem() == null)
            {
                return;
            }
            if (event.getItem().getItemMeta().equals(ItemHandler.compass.getItemMeta()))
            {
                try
                {
                    player.setOp(true);
                    player.performCommand("god");
                } finally
                {
                    player.setOp(false);
                }
            }
        }
    }
}
