package com.phx.reapercraft;

import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.entity.living.humanoid.player.RespawnPlayerEvent;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import org.spongepowered.api.event.Listener;

@Plugin(id = "reapercraft", name = "ReaperCraft", version = "1.0")
public class ReaperCraftPlugin {
	
	@Listener
	public void onRespawnPlayer(RespawnPlayerEvent event) {		
        Player player = event.getTargetEntity();
        player.getInventory().clear();
        
        Text text = Text.of("Reaper: Cleared" + player.getName() + "'s inventory!");
        MessageChannel broadcastChannel = MessageChannel.TO_ALL;
        broadcastChannel.send(this, text);
    }

}