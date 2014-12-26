package me.dragongott.joinsound;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class playerjoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		for (Player player : Bukkit.getServer().getOnlinePlayers()) {
			
			if (player.hasPermission("joinsound.join")) {
				
				if(joinsound.getInstance().getConfig().getString("Sound").equalsIgnoreCase("LEVEL_UP")) {
					
					Location location = player.getLocation();
					player.getWorld().playSound(location,Sound.LEVEL_UP,1, 0);
					
				}
				
				if(joinsound.getInstance().getConfig().getString("Sound").equalsIgnoreCase("DOOR_OPEN")) {
					
					Location location = player.getLocation();
					player.getWorld().playSound(location,Sound.DOOR_OPEN,1, 0);
					
				}
				
				if(joinsound.getInstance().getConfig().getString("Sound").equalsIgnoreCase("EXPLODE")) {
					
					Location location = player.getLocation();
					player.getWorld().playSound(location,Sound.EXPLODE,1, 0);
					
				}
				
				if(joinsound.getInstance().getConfig().getString("Sound").equalsIgnoreCase("ITEM_PICKUP")) {
					
					Location location = player.getLocation();
					player.getWorld().playSound(location,Sound.ITEM_PICKUP,1, 0);
					
				}
				
				
			}
			
		}
		
	}

}
