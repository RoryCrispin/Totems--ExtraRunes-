package com.teckwiz.Totems;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

public class TotemPlow {

		public void plow(int IDary[], Block base, Block b2, Block b3,
				Block b4, Event event, Location loclick, Player player, World w, int handid, ItemStack hand) {
			
			
				if( handid != 292) {
		    		player.sendMessage(ChatColor.GOLD+ "0The magic requires an Iron Hoe to be held!");
		    		player.sendMessage ("handid: " + handid);
				}
				for(int z = -5; z <= 5; z++) {
				  for(int x = -5; x <= 5; x++) {
				    for(int y = -5; y <= 5; y++) {
				     if(base.getRelative(x, y, z).getType().equals(Material.GRASS) || base.getRelative(x, y, z).getTypeId() == 3) {
				    Block fnd = base.getRelative(x, y, z);
				    Location locfnd = fnd.getLocation();
				    Location locfndup = locfnd.add(0, 1, 0);
				    World locfndupW = locfndup.getWorld();
				    Block locfndupB = locfndupW.getBlockAt(locfndup);
				    	 if(locfndupB.getTypeId() == 0) {
				    		 if(handid == 292){
				    		hand.setTypeId(0);
				    		 fnd.setTypeId(60);
				    	    
				    		base.setTypeId(0);
					        b2.setTypeId(0);
					        b3.setTypeId(0);
					        b4.setTypeId(0);				   
				      }}}}}}}}