package me.altex.joinMessage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Join extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "JoinMessage has been enabled!");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "JoinMessage has been disabled!");
	}
	
	@EventHandler
	public void onJoin (PlayerJoinEvent e) {
		Player player = e.getPlayer();
		String name = player.getName();
		
		player.sendMessage(ChatColor.GOLD + "Welcome to the server " + ChatColor.DARK_AQUA + name + ChatColor.GOLD + "!");
	}
	
}
