package com.teckwiz.extrarunes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin; 

public class ExtraRunes extends JavaPlugin {
	private static BlockListener blockListener; 
	private static PlayerListener playerListener; 

	public static ExtraRunes plugin;
	
	public final Logger logger = Logger.getLogger("Minecraft"); 
	public final HashMap<Player, ArrayList<Block>> pluginusers = new HashMap<Player, ArrayList<Block>>();
	private final HashMap <Player, Boolean> debugees = new HashMap<Player,Boolean>(); 
	
	
	
	

@Override
public void onDisable() { 
	this.logger.info("[plugin] plugin has been disabled"); 
}

@SuppressWarnings("deprecation")
@Override
public void onEnable() { 
blockListener  = new ERblockListener(this); 
playerListener = new ERplayerListener(this);
PluginManager pm = getServer().	getPluginManager(); 
pm.registerEvent(Event.Type.BLOCK_PLACE, blockListener, Event.Priority.Normal, this);
pm.registerEvent(Event.Type.PLAYER_INTERACT, playerListener, Event.Priority.Normal, this);
pm.registerEvent(Event.Type.PLAYER_DROP_ITEM, playerListener, Event.Priority.Normal, this);
PluginDescriptionFile pdfFile = this.getDescription();
this.logger.info("[plugin] plugin version " + pdfFile.getVersion() + " has been enabled!");

}




public boolean isDebugging(final Player player) {
	if (debugees.containsKey(player)) {
		return debugees.get(player);
	} else {
		return false;
		
	}
}


public void setDebugging(final Player player, final boolean value) {
	debugees.put(player, value);
}



public boolean enabled(Player player) {
	return this.pluginusers.containsKey(player);
	}

	
	public void toggleVision(Player player) {
		if (enabled(player)) {
			this.pluginusers.remove(player);
			player.sendMessage("plugin disabled");
		} else {
			this.pluginusers.put(player, null);
			player.sendMessage("plugin enabled");
	}
}
}