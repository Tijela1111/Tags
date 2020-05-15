package xyz.ultra.system;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import xyz.ultra.main.Main;

public class TagsAPI
{
    public static void setarTag(final Player p, final String tag) {
        new BukkitRunnable() {
            public void run() {
                p.setDisplayName(String.valueOf(tag) + p.getName());
            }
        }.runTaskAsynchronously((Plugin)Main.getInstance());
    }
}
