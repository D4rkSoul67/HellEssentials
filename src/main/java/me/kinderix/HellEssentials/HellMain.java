package me.kinderix.HellEssentials;

import me.kinderix.HellEssentials.commands.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class HellMain extends JavaPlugin {

    @Override
    public void onEnable(){
        System.out.println(ChatColor.RED + "HellEssentials" + ChatColor.WHITE + "has been loaded");
        this.getCommand("feed").setExecutor(new FeedCommand());
        this.getCommand("heal").setExecutor(new HealCommand());
        this.getCommand("clear").setExecutor(new ClearCommand());
        this.getCommand("gmc").setExecutor(new CreativeCommand());
        this.getCommand("gms").setExecutor(new SurvivalCommand());
        this.getCommand("gmsp").setExecutor(new SpectatorCommand());
        this.getCommand("gma").setExecutor(new AdventureCommand());
    }

    @Override
    public void onDisable(){
        System.out.println(ChatColor.RED + "HellEssentials" + ChatColor.WHITE + "has been unloaded");

    }
}
