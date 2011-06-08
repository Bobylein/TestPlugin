package me.boby.TestPlugin;



import java.util.logging.Logger;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class TestPlugin extends JavaPlugin {
	
	private final TestPluginPlayerListener TestPluginPlayerListener = new TestPluginPlayerListener(this);
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){ 
		log.info("Test plugin has been enabled.");
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_EGG_THROW, this.TestPluginPlayerListener, Event.Priority.Normal, this);
		
		
	} 
	public void onDisable(){ 
		log.info("Test plugin has been disabled.");
	}
}
