package io.github.sircat.classes.tier2;


import com.sucy.skill.api.classes.RPGClass;

public class Fighter2 extends RPGClass
{
	public static String NAME = "Tier 2 Fighter";
	public static String parent = "Fighter";
	
	public Fighter2()
	{
		super(NAME, null, 60, parent);
	}
}
