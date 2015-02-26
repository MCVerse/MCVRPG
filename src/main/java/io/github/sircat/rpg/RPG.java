package io.github.sircat.rpg;

import io.github.sircat.classes.tier1.Bomber;
import io.github.sircat.classes.tier1.Defence;
import io.github.sircat.classes.tier1.Fighter;
import io.github.sircat.classes.tier1.Recon;

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
		api.addClasses(new Fighter(), new Defence(), new Bomber(), new Recon());
		
	}

	@Override
	public void registerSkills(SkillAPI skillAPI) 
	{
		
		
	}
}
