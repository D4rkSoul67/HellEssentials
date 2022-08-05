package me.kinderix.HellEssentials;

import me.kinderix.HellEssentials.commands.essentials.ClearCommand;
import me.kinderix.HellEssentials.commands.essentials.FeedCommand;
import me.kinderix.HellEssentials.commands.essentials.HealCommand;
import me.kinderix.HellEssentials.commands.essentials.TeleportCommand;
import me.kinderix.HellEssentials.commands.gamemode.AdventureCommand;
import me.kinderix.HellEssentials.commands.gamemode.CreativeCommand;
import me.kinderix.HellEssentials.commands.gamemode.SpectatorCommand;
import me.kinderix.HellEssentials.commands.gamemode.SurvivalCommand;
import me.kinderix.HellEssentials.commands.moderation.KickCommand;
import me.kinderix.HellEssentials.events.Join;
import me.kinderix.HellEssentials.events.Leave;
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
        this.getCommand("tp").setExecutor(new TeleportCommand());
        this.getCommand("kick").setExecutor(new KickCommand());
        getServer().getPluginManager().registerEvents(new Join(), this);
        getServer().getPluginManager().registerEvents(new Leave(), this);
    }

    @Override
    public void onDisable(){
        System.out.println(ChatColor.RED + "HellEssentials" + ChatColor.WHITE + "has been unloaded");

    }
}
