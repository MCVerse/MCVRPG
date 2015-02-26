package io.github.sircat.rpg;

import org.bukkit.plugin.java.JavaPlugin;

import com.sucy.skill.SkillAPI;
import com.sucy.skill.api.SkillPlugin;
import com.sucy.skill.api.classes.RPGClass;

public class RPG extends JavaPlugin implements SkillPlugin
{
	
    private SkillAPI api;

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
    	this.api = new SkillAPI();
		api.addClasses(RPGClass("Fighter"));
		api.addClasses(RPGClass("defense"));
		
	}

	private RPGClass RPGClass(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerSkills(SkillAPI skillAPI) 
	{
		
		
	}
}
