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
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_BOLD = "\u001B[1m";
	
	@Override
    public void onEnable() 
    {
    	getLogger().info(ANSI_BOLD + ANSI_BLUE + "[MCVRPG]" + ANSI_RESET + ANSI_GREEN + "Plugin enabled! Oh boy, oh boy, fun fun fun");
    }
 
    @Override
    public void onDisable() 
    {
        getLogger().info(ANSI_BOLD + ANSI_BLUE + "[MCVRPG]" + ANSI_RESET + ANSI_RED + "Back to serious mode");
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
