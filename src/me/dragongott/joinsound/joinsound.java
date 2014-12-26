 package me.dragongott.joinsound;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class joinsound extends JavaPlugin {
	
	public static joinsound instance;
	
	public void onEnable() {
		System.out.println("[JoinSound] version 1.1 enabled!");
		System.out.println("[JoinSound] coded by Dragongott");
		System.out.println("[JoinSound] idea from JokarLP!");
		
		final FileConfiguration config = this.getConfig();
		
		
		config.addDefault("Sound", "LEVEL_UP"); 
		config.addDefault("Leave_sound", "true"); 
		 
		
		config.options().copyDefaults(true);
		saveConfig();
		
		instance = this;
		
		getServer().getPluginManager().registerEvents(new playerjoin(), this);
	}
	
	public void onDisable() {
		System.out.println("[JoinSound] version 1.1 disabled!");
		System.out.println("[JoinSound] coded by Dragongott");
		System.out.println("[JoinSound] idea from JokarLP!");
	}
	
	public static joinsound getInstance(){
		  return instance;
		}

}
