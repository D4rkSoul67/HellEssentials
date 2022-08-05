package me.kinderix.HellEssentials.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


public class CreativeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = (Player) sender;
        if (sender instanceof Player) {
            ((Player) target).setGameMode(GameMode.CREATIVE);
            target.sendMessage(ChatColor.GREEN + "Your gamemode has been changed.");
        }
        else{
            System.out.println("You need to be a player to run this command!");
        }
        return true;
    }
}
