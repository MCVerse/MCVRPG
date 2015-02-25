package io.github.sircat.classes;

import net.minecraft.server.v1_8_R1.ItemStack;

import com.sucy.skill.api.classes.RPGClass;

public class Fighter extends RPGClass
{
	public static String NAME = "Fighter";
	
	public Fighter(String name, ItemStack icon, int maxLevel, String parent)
	{
		super(NAME, null, 30, null);
	}
}
