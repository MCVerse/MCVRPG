package io.github.sircat.classes;

import com.sucy.skill.api.CustomClass;
import net.md_5.bungee.api.ChatColor;

public class Fighter extends CustomClass
{
	public static String NAME = "Fighter";
	
	public Fighter()
	{
		super(NAME, null, ChatColor.GRAY + NAME, 30, 30);
	}
}
