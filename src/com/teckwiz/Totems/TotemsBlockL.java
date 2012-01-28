package com.teckwiz.Totems;


import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent; 
import org.bukkit.plugin.Plugin;

@SuppressWarnings("deprecation")
public class TotemsBlockL extends BlockListener { 
	public static Plugin plugin;
	public TotemsBlockL(Plugin instance)
	
	{
		plugin = instance; //bind
	}
	public void onBlockPlace(BlockPlaceEvent event) { 
		
		
}
}