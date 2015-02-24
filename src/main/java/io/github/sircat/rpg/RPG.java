package io.github.sircat.rpg;

import io.github.sircat.skills.ExplosionPotion;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class RPG extends JavaPlugin
{
    @Override
    public void onEnable() 
    {
    	getLogger().info("Plugin has started!");
    	Bukkit.getServer().getPluginManager().registerEvents(new ExplosionPotion(), this);
    }
 
    @Override
    public void onDisable() 
    {
        getLogger().info("Plugin has been disabled!");
    }
}
