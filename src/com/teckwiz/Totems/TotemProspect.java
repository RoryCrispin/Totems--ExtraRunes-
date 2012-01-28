package com.teckwiz.Totems;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

public class TotemProspect {
	public void prospect(int IDary[], Block base, Block b2, Block b3,
			Block b4, Event event, Location loclick, Player player, World w, int handid, ItemStack hand) {
	
	
	
		int bcount = 0;
		//event.getClickedBlock();
		for(int z = -8; z <= 8; z++) {
		  for(int x = -8; x <= 8; x++) {
		    for(int y = -80; y <= 10; y++) {
		    	int baseIDORE = base.getRelative(x, y, z).getTypeId();
		    	Block baseOREb = base.getRelative(x, y, z);
		     if(baseIDORE == 14 || baseIDORE == 15 || baseIDORE == 16 || baseIDORE == 56 || baseIDORE == 74){
		    	 if (baseIDORE == 2) {
		    		 baseOREb.setTypeId(1);
		    	 }
		    	 bcount = bcount+1;    	 
		    
		      } else {	    	 
		    	  baseOREb.setTypeId(20);
		     }}}	
		} 
		player.sendMessage("Ore Found: " + bcount);
	}}

