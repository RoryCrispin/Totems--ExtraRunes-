package com.teckwiz.Totems;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public class TotemExplosion {

		public void explode(int[] IDary, Block base, Block b2, Block b3,
				Block b4, Event event, Location loclick, Player player, World w) {
	        
		
			
			//clear the blocks
			base.setTypeId(0);
			b2.setTypeId(0);
			b3.setTypeId(0);
			b4.setTypeId(0);
			w.createExplosion(loclick, 10);
			
			player.sendMessage(ChatColor.GOLD + "You feel the essence of a thousand souls errupt from the Totem");
		}}