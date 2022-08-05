package me.kinderix.HellEssentials.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Leave implements Listener {

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        String name = player.getName();
        Bukkit.broadcastMessage(ChatColor.RED + "[+] " + ChatColor.GRAY + name );
        event.setQuitMessage("");
    }
}
