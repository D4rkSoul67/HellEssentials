package me.kinderix.HellEssentials.commands.essentials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target;
        if (args.length == 0 && !(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must specify a player:");
            return true;
        }

        if (args.length == 0) {
            target = (Player) sender;
        }

        else {
            target = Bukkit.getServer().getPlayer(args[0]);

            if (target == null) {
                sender.sendMessage(ChatColor.RED + "Cannot find player " + args[0] + ".");
                return true;
            }
        }

        target.getInventory().clear();

        sender.sendMessage(ChatColor.GREEN + "You cleared " + target.getName() + " inventory.");
        target.sendMessage(ChatColor.GREEN + "Your inventory has been cleared.");
        return true;
    }
}
