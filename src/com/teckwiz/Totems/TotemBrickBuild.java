package com.teckwiz.Totems;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TotemBrickBuild {

	public void brickbuild(int IDary[], Block base, Block b2, Block b3,
			Block b4, PlayerInteractEvent event, Location loclick, Player player, World w,
			int baseid, ItemStack hand, ItemStack newItem, Inventory inventory, int handid,
			ItemStack brick) {
	
	
	
		event.setCancelled(true);
		HitBlox hb = new HitBlox(player, player.getWorld());
		hb.getTargetBlock();
		Block nb = hb.getLastBlock(); 
		event.setCancelled(true);
		nb.setTypeId(45);
		player.sendMessage("Oops!");
		inventory.remove(brick);
		inventory.removeItem(brick);	
	}
	}

