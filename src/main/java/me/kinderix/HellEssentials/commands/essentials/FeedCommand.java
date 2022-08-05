package me.kinderix.HellEssentials.commands.essentials;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setFoodLevel(20);
            player.setSaturation(0);
            player.sendMessage("Your appetite was satted!");
        }
        if (sender instanceof ConsoleCommandSender) {
            ConsoleCommandSender console = (ConsoleCommandSender) sender;
            System.out.println(ChatColor.RED + "[HellEssentials]" + " " +  ChatColor.WHITE + "You need to be a player to run this command!");
        }
        return true;
    }
}
