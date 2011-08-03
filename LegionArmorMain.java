package me.legion.legionarmor;

import java.util.logging.Logger;


import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LegionArmorMain extends JavaPlugin {
	public static LegionArmorMain plugin;
	
	public final Logger logger = Logger.getLogger("Minecraft");
	private final LegionPlayerListener playerListener = new LegionPlayerListener();
	
	
	
	@Override
	public void onDisable() {
	this.logger.info("LegionArmor Disabled.");

	}
	@Override
	public void onEnable() {
	PluginManager pm = getServer().getPluginManager();
	pm.registerEvent(Event.Type.PLAYER_INTERACT, this.playerListener, Event.Priority.Normal, this);
	PluginDescriptionFile pdfFile = this.getDescription(); 
	this.logger.info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
	}

	
	
}
