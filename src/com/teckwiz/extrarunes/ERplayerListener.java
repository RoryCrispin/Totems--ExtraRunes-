package com.teckwiz.extrarunes;



import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent; 
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

public class ERplayerListener extends PlayerListener { 
	public static Plugin plugin;
	public ERplayerListener(Plugin instance)
	
	{
		plugin = instance; //bind
	}
	
	

	
    public void onPlayerInteract(PlayerInteractEvent event) {
    Action eAction = event.getAction();
    Player player = event.getPlayer();
     
    if (eAction == Action.RIGHT_CLICK_AIR || eAction == Action.RIGHT_CLICK_BLOCK ) {
    BlockFace block = event.getBlockFace();
    	//player.sendMessage("Right click!");
	Block click = event.getClickedBlock();
	Location loclick = click.getLocation();
	World w = loclick.getWorld();
	Block base = w.getBlockAt(loclick);
	//event.getClickedBlock().getWorld().createExplosion(loclick, 0);
	

	//4 high totem
	Location l2 = loclick.add(0, 1, 0);
	Block b2 = w.getBlockAt(l2);
	Location l3 = l2.add(0, 1, 0);
	Block b3 = w.getBlockAt(l3);
	Location l4 = l3.add(0, 1, 0);
	Block b4 = w.getBlockAt(l4);
	
	Material m1 = base.getType();
	int i1 = m1.getId();
	Material m2 = b2.getType();
	int i2 = m2.getId();
	Material m3 = b3.getType();
	int i3 = m3.getId();
	Material m4 = b4.getType();
	int i4 = m4.getId();
	
	//debug 
	//player.sendMessage("?Totem Clicked? : " + i1 +" " + i2 +" " + i3 + " " +  i4);
	//Explosion Totem
	
	if(i1 == 87 && i2 == 88 && i3 == 88 && i4 == 87) {
		//clear the blocks
		base.setTypeId(0);
		b2.setTypeId(0);
		b3.setTypeId(0);
		b4.setTypeId(0);
		event.getClickedBlock().getWorld().createExplosion(loclick, 10);
		player.sendMessage(ChatColor.RED + "You feel the ground ripple beneath you, and an almighty thunder!");
		}
		
	//Repair Items
	if(i1 == 58 && i2 == 45 && i3 == 45 && i4 == 58) {
			
			//working code
			PlayerInventory inventory = player.getInventory();
		    ItemStack empty = new ItemStack(Material.AIR, 1);
		    ItemStack newItem = new ItemStack(Material.DIAMOND_AXE, 1);
		    ItemStack hand = inventory.getItemInHand();
		    int handid = hand.getTypeId();
		    if(handid == 276 || handid == 277 || handid == 278 || handid == 279 || handid == 293 ){
		    	//*Diamond Tool**
		    	newItem.setTypeId(handid);
		    	short dmgB = hand.getDurability();
				    player.sendMessage("dmgB: "+dmgB);
				    int dmgBint = dmgB - 400;
				    player.sendMessage("dmgB: "+dmgB);
				    short dmgA = (short) dmgBint;
				    if(dmgA < 0) {
				    	dmgA = 0;
				    }
				    
				    
				    player.sendMessage("dmgA: "+dmgA);
				    int hid = hand.getTypeId();
				    
				    player.sendMessage("Item: " + hid);
				    
				    hand.setTypeId(hid);  
				    if(dmgA < 0) {
				    	dmgA = 0;
				    }
				    hand.setDurability(dmgA);
				        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
		    		}
		    if(handid == 256 || handid == 257 || handid == 258 || handid == 267 || handid == 293 ){
		    	//*Iron Tools**
		    	newItem.setTypeId(handid);
		    	short dmgB = hand.getDurability();
				    player.sendMessage("dmgB: "+dmgB);
				    int dmgBint = dmgB - 180;
				    player.sendMessage("dmgB: "+dmgB);
				    short dmgA = (short) dmgBint;
				    if(dmgA < 0) {
				    	dmgA = 0;
				    }
				    
				   
				    player.sendMessage("dmgA: "+dmgA);
				    int hid = hand.getTypeId();
				    
				    player.sendMessage("Item: " + hid);
				    
				    hand.setTypeId(hid);  
				    hand.setDurability(dmgA);
				        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
		    		}
		    
		    if(handid == 273 || handid == 274 || handid == 275 || handid == 272 || handid == 291 ){
		    	//*Stone Tools**
		    	newItem.setTypeId(handid);
		    	short dmgB = hand.getDurability();
				    player.sendMessage("dmgB: "+dmgB);
				    int dmgBint = dmgB - 90;
				    player.sendMessage("dmgB: "+dmgB);
				    short dmgA = (short) dmgBint;
				    if(dmgA < 0) {
				    	dmgA = 0;
				    }
				    
				    
				    player.sendMessage("dmgA: "+dmgA);
				    int hid = hand.getTypeId();
				    
				    player.sendMessage("Item: " + hid);
				    
				    hand.setTypeId(hid);  
				    hand.setDurability(dmgA);
				        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
		    		}
		    if(handid == 268 || handid == 269 || handid == 270 || handid == 271 || handid == 290 ){
		    	//*Wood Tools**
		    	newItem.setTypeId(handid);
		    	short dmgB = hand.getDurability();
				    player.sendMessage("dmgB: "+dmgB);
				    int dmgBint = dmgB - 40;
				    player.sendMessage("dmgB: "+dmgB);
				    
				    
				    short dmgA = (short) dmgBint;
				    if (dmgA < 0) {
				    	dmgA = 0;
				    }
				    player.sendMessage("dmgA: "+dmgA);
				    int hid = hand.getTypeId();
				    
				    player.sendMessage("Item: " + hid);
				    
				    //newItem.setDurability(dmgA);
				    hand.setTypeId(hid);  
				    hand.setDurability(dmgA);
				    //inventory.addItem(newItem);
				        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
		    		}
		    if(handid == 283 || handid == 284 || handid == 285 || handid == 286 || handid == 294 ){
		    	//*Gold Tools**
		    	newItem.setTypeId(handid);
		    	short dmgB = hand.getDurability();
				    player.sendMessage("dmgB: "+dmgB);
				    int dmgBint = dmgB - 25;
				    player.sendMessage("dmgB: "+dmgB);
				     short dmgA = (short) dmgBint;
				    if(dmgA < 0) {
				    	dmgA = 0;
				    }
				    
				   
				    player.sendMessage("dmgA: "+dmgA);
				    int hid = hand.getTypeId();
				    
				    player.sendMessage("Item: " + hid);
				    
				    hand.setTypeId(hid);  
				    hand.setDurability(dmgA);
				        player.sendMessage(ChatColor.GOLD + "You feel a surge of energy pass through your spine.");
		    		}
		    
		    
		}
		}
			
			
			}
	
	
	
	
    	
    	
    
    
    
    
    
	public void onPlayerDropItem(PlayerDropItemEvent event) {
	Player player = event.getPlayer();
	Item item = event.getItemDrop();
	Location loc = item.getLocation();
	World w = loc.getWorld();
	Block b = w.getBlockAt(loc);
	event.getItemDrop().getWorld().createExplosion(loc, 0);
	
	player.sendMessage("Plop!");
}

    
    
}
