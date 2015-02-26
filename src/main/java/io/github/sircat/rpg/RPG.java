package io.github.sircat.rpg;

import io.github.sircat.classes.Fighter;
import io.github.sircat.classes.bomber;
import io.github.sircat.classes.defense;

import org.bukkit.plugin.java.JavaPlugin;

import com.sucy.skill.SkillAPI;
import com.sucy.skill.api.SkillPlugin;

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
        getLogger().info("[MCVRPG] Back to serious mode");
    }

    @Override
	public void registerClasses(SkillAPI api) 
	{
		api.addClasses(new Fighter(), new defense(), new bomber());
		
	}

	@Override
	public void registerSkills(SkillAPI skillAPI) 
	{
		
		
	}
}
