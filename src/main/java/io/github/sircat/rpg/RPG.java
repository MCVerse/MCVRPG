package io.github.sircat.rpg;


import org.bukkit.plugin.java.JavaPlugin;

import com.sucy.skill.SkillAPI;
import com.sucy.skill.api.SkillPlugin;

public class RPG extends JavaPlugin implements SkillPlugin
{
	@SuppressWarnings("unused")
	private SkillAPI skillAPI;
	
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

	@Override
	public void registerClasses(SkillAPI skillAPI) 
	{
		this.skillAPI = new SkillAPI();
		
	}

	@Override
	public void registerSkills(SkillAPI skillAPI) 
	{
		
		
	}
    
    
}
