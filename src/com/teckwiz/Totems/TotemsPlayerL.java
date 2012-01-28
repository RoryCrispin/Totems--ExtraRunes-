package com.teckwiz.Totems;



import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.Plugin;

@SuppressWarnings("deprecation")
public class TotemsPlayerL extends PlayerListener { 
	public static Plugin plugin;
	public TotemsPlayerL(Plugin instance)
	{ plugin = instance; }
	
    public void onPlayerInteract(PlayerInteractEvent event) {
    Action eAction = event.getAction();
    Player player = event.getPlayer();
     
    if (eAction == Action.RIGHT_CLICK_AIR || eAction == Action.RIGHT_CLICK_BLOCK ) {
    	//player.sendMessage("Right click!");
	Block click = event.getClickedBlock();
	Location loclick = click.getLocation();
	World w = loclick.getWorld();
	Block base = w.getBlockAt(loclick);
	
	Location l2 = loclick.add(0, 1, 0);
	Block b2 = w.getBlockAt(l2);
	Location l3 = l2.add(0, 1, 0);
	Block b3 = w.getBlockAt(l3);
	Location l4 = l3.add(0, 1, 0);
	Block b4 = w.getBlockAt(l4);
	
	int[] IDary;
	IDary = new int[5];
	
	Material m1 = base.getType(); IDary[0] = m1.getId();
	Material m2 = b2.getType();   IDary[1] = m2.getId();
	Material m3 = b3.getType();   IDary[2] = m3.getId();
	Material m4 = b4.getType();   IDary[3] = m4.getId();

	PlayerInventory inventory = player.getInventory();
    new ItemStack(Material.AIR, 1);
    ItemStack newItem = new ItemStack(Material.DIAMOND_AXE, 1);
    ItemStack brick = new ItemStack(Material.BRICK, 1);
    ItemStack hand = inventory.getItemInHand();
    int handid = hand.getTypeId();
    int baseid = base.getTypeId();
    
    
    
	//*****************************************************//
    //*               BRICKBUILDING                       *//
	//*****************************************************//
    if(handid == 45 && baseid == 58) {
    TotemBrickBuild bb = new TotemBrickBuild();
	bb.brickbuild(IDary, base, b2, b3, b4, event, loclick, player,
					w, baseid, hand, newItem, inventory, handid, brick);
    }
	//*****************************************************//
	//*               	   PROSPECT                       *//
	//*****************************************************//
	if(IDary[0] == 22 && IDary[1] == 15 && IDary[2] == 15 && IDary[3] == 22) {
	TotemProspect tpr = new TotemProspect();
	tpr.prospect(IDary, base, b2, b3, b4, event, loclick, player, w, handid, hand);
	}
	//*****************************************************//
	//*               	     PLOW                         *//
	//*****************************************************//
		if(IDary[0] == 5 && IDary[1] == 3 && IDary[2] == 3 && IDary[3] == 5) {	
		TotemPlow tp = new TotemPlow();
		tp.plow(IDary, base, b2, b3, b4, event, loclick, player, w, handid, hand);
		}
	//*****************************************************//
	//*               	   LIGHTNING                      *//
	//*****************************************************//
		if(IDary[0] == 42 && IDary[2] == 49 && IDary[3] == 42) {
		TotemLightning tl = new TotemLightning();
		tl.lightning(IDary, base, b2, b3, b4, event, loclick, player, w, handid, hand);
		}
	//*****************************************************//
	//*                  EXPLOSTION                       *//
	//*****************************************************//
		if(IDary[0] == 87 && IDary[1] == 88 && IDary[2] == 88 && IDary[3] == 87) {
		TotemExplosion te = new TotemExplosion();
		te.explode(IDary, base, b2, b3, b4, event, loclick, player, w);
		}
	//*****************************************************//
	//*                  REPAIR ITEMS                     *//
	//*****************************************************//
		
		if(IDary[0] == 58 && IDary[1] == 45 && IDary[2] == 45 && IDary[3] == 58) {
		TotemRepair tr = new TotemRepair();
		tr.repair(IDary, base, b2, b3, b4, event, loclick, player, w, handid, hand, newItem);
}}}}
