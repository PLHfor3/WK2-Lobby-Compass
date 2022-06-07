package com.gmail.prestonhigg17;

import org.bukkit.plugin.java.JavaPlugin;

public class LobbySelector extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        super.onEnable();
        ItemHandler.init();
        getServer().getPluginManager().registerEvents(new ClearInventoryListener(), this);
        getServer().getPluginManager().registerEvents(new SelectorClickEventListener(), this);
        getServer().getPluginManager().registerEvents(new CompassEventListener(), this);
    }

    @Override
    public void onDisable()
    {
        super.onDisable();
    }
}
