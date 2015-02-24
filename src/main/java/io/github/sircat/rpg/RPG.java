package io.github.sircat.rpg;

import org.bukkit.plugin.java.JavaPlugin;

public class RPG extends JavaPlugin
{
    @Override
    public void onEnable() 
    {
    	getLogger().info("Plugin has started!");
    }
 
    @Override
    public void onDisable() 
    {
        getLogger().info("Plugin has been disabled!");
    }
}
