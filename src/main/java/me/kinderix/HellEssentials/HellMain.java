package me.kinderix.HellEssentials;

import me.kinderix.HellEssentials.commands.FeedCommand;
import me.kinderix.HellEssentials.commands.HealCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class HellMain extends JavaPlugin {

    @Override
    public void onEnable(){
        System.out.println(ChatColor.RED + "HellEssentials" + ChatColor.WHITE + "has been loaded");
        this.getCommand("feed").setExecutor(new FeedCommand());
        this.getCommand("heal").setExecutor(new HealCommand());
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);
    }

    @Override
    public void onDisable(){
        System.out.println(ChatColor.RED + "HellEssentials" + ChatColor.WHITE + "has been unloaded");

    }
}
