package com.teckwiz.extrarunes;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent; 
import org.bukkit.plugin.Plugin;

public class ERblockListener extends BlockListener { 
	public static Plugin plugin;
	public ERblockListener(Plugin instance)
	
	{
		plugin = instance; //bind
	}
	public void onBlockPlace(BlockPlaceEvent event) { 
		
		Player player = event.getPlayer();
		Block block = event.getBlockPlaced();
		
		
			player.sendMessage(ChatColor.RED + "Block Placed!"); 
			//event.setCancelled(true); 
			
		
		
}
}