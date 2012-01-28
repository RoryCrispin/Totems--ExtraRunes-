package com.teckwiz.Totems;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TotemRepair {
	
	public void repair(int IDary[], Block base, Block b2, Block b3,
			Block b4, PlayerInteractEvent event, Location loclick, Player player, World w, int handid, ItemStack hand, ItemStack newItem) {
	
	
		
		//working code
	    if(handid == 276 || handid == 277 || handid == 278 || handid == 279 || handid == 293 ){
	    	//*Diamond Tool**
	    	newItem.setTypeId(handid);
	    	short dmgB = hand.getDurability();
			    //player.sendMessage("dmgB: "+dmgB);
			    int dmgBint = dmgB - 400;
			   // player.sendMessage("dmgB: "+dmgB);
			    short dmgA = (short) dmgBint;
			    if(dmgA < 0) {
			    	dmgA = 0;
			    }
			    w.createExplosion(loclick, 0);
			    b2.setTypeId(0);
				b3.setTypeId(0);
			    //player.sendMessage("dmgA: "+dmgA);
			    int hid = hand.getTypeId();
			    
			    //player.sendMessage("Item: " + hid);
			   
			    hand.setTypeId(hid);  
			    if(dmgA < 0) {
			    	dmgA = 0;
			    }
			    hand.setDurability(dmgA);
			    event.setCancelled(true);
			        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
	    		}
	    if(handid == 256 || handid == 257 || handid == 258 || handid == 267 || handid == 293 ){
	    	
	    	//*Iron Tools**
	    	newItem.setTypeId(handid);
	    	short dmgB = hand.getDurability();
			    //player.sendMessage("dmgB: "+dmgB);
			    int dmgBint = dmgB - 180;
			    //player.sendMessage("dmgB: "+dmgB);
			    short dmgA = (short) dmgBint;
			    if(dmgA < 0) {
			    	dmgA = 0;
			    }
			    b2.setTypeId(0);
				b3.setTypeId(0);
				event.getClickedBlock().getWorld().createExplosion(loclick, 0);
			    //player.sendMessage("dmgA: "+dmgA);
			    int hid = hand.getTypeId();
			    
			    //player.sendMessage("Item: " + hid);
			    hand.setTypeId(hid);  
			    hand.setDurability(dmgA);
			    event.setCancelled(true);
			        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
	    		}
	    
	    if(handid == 273 || handid == 274 || handid == 275 || handid == 272 || handid == 291 ){
	    	//*Stone Tools**
	    	newItem.setTypeId(handid);
	    	short dmgB = hand.getDurability();
			    //player.sendMessage("dmgB: "+dmgB);
			    int dmgBint = dmgB - 90;
			    //player.sendMessage("dmgB: "+dmgB);
			    short dmgA = (short) dmgBint;
			    if(dmgA < 0) {
			    	dmgA = 0;
			    }
			    b2.setTypeId(0);
				b3.setTypeId(0);
				event.getClickedBlock().getWorld().createExplosion(loclick, 0);
			    //player.sendMessage("dmgA: "+dmgA);
			    int hid = hand.getTypeId();
			    
			    //player.sendMessage("Item: " + hid);
			    
			    hand.setTypeId(hid);  
			    hand.setDurability(dmgA);
			    event.setCancelled(true);
			        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
	    		}
	    if(handid == 268 || handid == 269 || handid == 270 || handid == 271 || handid == 290 ){
	    	//*Wood Tools**
	    	newItem.setTypeId(handid);
	    	short dmgB = hand.getDurability();
			   // player.sendMessage("dmgB: "+dmgB);
			    int dmgBint = dmgB - 40;
			    //player.sendMessage("dmgB: "+dmgB);
			    b2.setTypeId(0);
				b3.setTypeId(0);
				event.getClickedBlock().getWorld().createExplosion(loclick, 0);
			    short dmgA = (short) dmgBint;
			    if (dmgA < 0) {
			    	dmgA = 0;
			    }
			    //player.sendMessage("dmgA: "+dmgA);
			    int hid = hand.getTypeId();
			    
			    player.sendMessage("Item: " + hid);
			    
			    //newItem.setDurability(dmgA);
			    hand.setTypeId(hid);  
			    hand.setDurability(dmgA);
			    //inventory.addItem(newItem);
			    event.setCancelled(true);
			        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
	    		}
	    if(handid == 283 || handid == 284 || handid == 285 || handid == 286 || handid == 294 ){
	    	//*Gold Tools**
	    	newItem.setTypeId(handid);
	    	short dmgB = hand.getDurability();
			    //player.sendMessage("dmgB: "+dmgB);
			    int dmgBint = dmgB - 25;
			    //player.sendMessage("dmgB: "+dmgB);
			     short dmgA = (short) dmgBint;
			    if(dmgA < 0) {
			    	dmgA = 0;
			    }
			    b2.setTypeId(0);
				b3.setTypeId(0);
				w.createExplosion(loclick, 0);
			    //player.sendMessage("dmgA: "+dmgA);
			    int hid = hand.getTypeId();
			    
			    //player.sendMessage("Item: " + hid);
			    
			    hand.setTypeId(hid);  
			    hand.setDurability(dmgA);
			    event.setCancelled(true);
			        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
	    		}}}
	    