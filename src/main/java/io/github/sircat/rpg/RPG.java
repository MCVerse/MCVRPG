package io.github.sircat.rpg;


import org.bukkit.plugin.java.JavaPlugin;

public class RPG extends JavaPlugin
{
    @Override
    public void onEnable() 
    {
    	getLogger().info("Plugin has started!");
    	getServer().getPluginManager().registerEvents(new ExplosionPotion(), this);
    }
 
    @Override
    public void onDisable() 
    {
        getLogger().info("Plugin has been disabled!");
    }
}
