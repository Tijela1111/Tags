package xyz.ultra.main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.ultra.comandos.TagCMD;

public class Main extends JavaPlugin {
	
	public void onLoad() {
		Bukkit.getConsoleSender().sendMessage("§e§lUltraTAGS§f Iniciando plugin...");
	}
	
	public void onEnable() {
		this.Comandos();
		Bukkit.getConsoleSender().sendMessage("§a§lUltraTags§f Plugin iniciado.");
	}

    public void onDisable() {
    	Bukkit.getConsoleSender().sendMessage("§c§lUltraTags§f Plugin desativado.");
    	
    }

    public void Comandos() {
    this.getCommand("tag").setExecutor((CommandExecutor)new TagCMD());
    }

	public static Main getInstance() {
		return getInstance();
	}
}
