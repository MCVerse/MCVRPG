package io.github.sircat.rpg;

import io.github.sircat.classes.Fighter;

import org.bukkit.plugin.java.JavaPlugin;

import com.sucy.skill.SkillAPI;
import com.sucy.skill.api.SkillPlugin;
import com.sucy.skill.api.classes.RPGClass;

public class RPG extends JavaPlugin implements SkillPlugin
{
	
    @Override
    public void onEnable() 
    {
    	getLogger().info("[MCVRPG] Plugin enabled!");
    }
 
    @Override
    public void onDisable() 
    {
        getLogger().info("[MCVRPG] Plugin diabled!");
    }

    @Override
	public void registerClasses(SkillAPI api) 
	{
		api.addClasses(RPGClass("Fighter"));
		
	}

	@Override
	public void registerSkills(SkillAPI skillAPI) 
	{
		
		
	}
}
