package com.phx.reapercraft;

import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.entity.living.humanoid.player.RespawnPlayerEvent;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;

@Plugin(id = "reapercraft", name = "ReaperCraft", version = "1.0")
public class ReaperCraftPlugin {
	
	public void onSomeEvent(RespawnPlayerEvent event) {		
        Player player = event.getTargetEntity();
        player.getInventory().clear();
        
        Text text = Text.of("Reaper: Someone has died!");
        MessageChannel broadcastChannel = MessageChannel.TO_ALL;
        broadcastChannel.send(this, text);
    }

}