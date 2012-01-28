package com.teckwiz.Totems;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

public class TotemLightning {

	public void lightning(int IDary[], Block base, Block b2, Block b3,
			Block b4, Event event, Location loclick, Player player, World w, int handid, ItemStack hand) {
	
	
	    if(b2.getType() == Material.SIGN_POST){
	        BlockState state = b2.getState();
	        if(state instanceof Sign){
	        Sign sign = (Sign)state;
	        String line = sign.getLine(1);
	       // player.sendMessage("Line2:" + line);
	        Player target = (Bukkit.getServer().getPlayer(line));
	        if (target == null) {
	        	player.sendMessage("The target was not present!");
	        } else {
	        	target.setNoDamageTicks(6);
	        	target.setFireTicks(6);
	        	Location lightning = target.getLocation();
	        target.getWorld().strikeLightning(lightning);
	        b2.setTypeId(0);
	        b3.setTypeId(0);
	       w.createExplosion(loclick, 0);
	       w.createExplosion(lightning, 0);
	        }
	        
	        target.sendMessage("You feel a mighty thunder from the heavens...");
	        
	        }}}}