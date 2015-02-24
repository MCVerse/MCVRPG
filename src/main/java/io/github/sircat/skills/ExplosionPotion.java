package io.github.sircat.skills;

import com.sucy.skill.api.skills.Skill;
import com.sucy.skill.api.skills.SkillAttribute;
import com.sucy.skill.api.skills.SkillShot;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class ExplosionPotion extends Skill implements SkillShot, Listener {

    public static final String NAME = "Explosion Potion";
    private static final String
        DAMAGE = "Mob Damage",
        POWER = "Power";

    public ExplosionPotion() {
        super(NAME, "AOE Projectile", Material.TNT, 5);

        getDescription().add("Launches a potion that");
        getDescription().add("explodes upon impact,");
        getDescription().add("dealing damage and");
        getDescription().add("setting things on fire");

        settings.set(SkillAttribute.LEVEL, 1, 1);
        settings.set(SkillAttribute.COST, 1, 0);
        settings.set(SkillAttribute.COOLDOWN, 10, -1);
        settings.set(SkillAttribute.MANA, 22, -1);

        settings.set(DAMAGE, 6, 2);
        settings.set(POWER, 0.5, 0.125);
    }

    @Override
    public boolean cast(LivingEntity caster, int level) {

        Potion potion = new Potion(PotionType.FIRE_RESISTANCE, 1);
        potion.setSplash(true);

        ItemStack item = new ItemStack(Material.POTION);
        potion.apply(item);

        ThrownPotion thrownPotion = caster.launchProjectile(ThrownPotion.class);
        thrownPotion.setItem(item);
        thrownPotion.setMetadata(NAME, new FixedMetadataValue(Bukkit.getPluginManager().getPlugin("SkillAPI"), level));

        return true;
    }

    @EventHandler
    public void onPotionSplash(PotionSplashEvent event) {
        if (event.getEntity().hasMetadata(NAME)) {

            int level = event.getEntity().getMetadata(NAME).get(0).asInt();
            double damage = settings.getAttr(DAMAGE, level);
            for (LivingEntity entity : event.getAffectedEntities()) {
                if (entity instanceof Monster) {
                    entity.damage(damage, (Player)event.getEntity().getShooter());
                }
            }

            event.getAffectedEntities().clear();
            event.setCancelled(true);
            double power = settings.getAttr(POWER, level);
            Location l = event.getEntity().getLocation();
            l.getWorld().createExplosion(l.getX(), l.getY(), l.getZ(), (float)power, true, false);
        }
    }
}
