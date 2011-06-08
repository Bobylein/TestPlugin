package me.boby.TestPlugin;

import org.bukkit.event.player.PlayerListener;

public class TestPluginPlayerListener extends PlayerListener {
	public static TestPlugin plugin; public TestPluginPlayerListener(TestPlugin instance) { 
		 
	    plugin = instance;
	}
}

