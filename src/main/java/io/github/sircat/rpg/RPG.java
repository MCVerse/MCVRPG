package io.github.sircat.rpg;

import io.github.sircat.classes.tier1.Defence;
import io.github.sircat.classes.tier1.Fighter;
import io.github.sircat.classes.tier1.Heavy;
import io.github.sircat.classes.tier1.Recon;
import io.github.sircat.classes.tier2.Fighter2;

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
    	getLogger().info(ANSI_BLUE + "Plugin enabled!" + ANSI_RESET);
    }
 
    @Override
    public void onDisable() 
    {
        getLogger().info(ANSI_BLUE + "Back to serious mode" + ANSI_RESET);
    }

    @Override
	public void registerClasses(SkillAPI api) 
	{
		api.addClasses(new Fighter(), new Defence(), new Heavy(), new Recon(), new Fighter2());
		
	}

	@Override
	public void registerSkills(SkillAPI skillAPI) 
	{
		
		
	}
}
