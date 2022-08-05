package me.kinderix.HellEssentials.commands.moderation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KickCommand implements CommandExecutor {

    public boolean onCommand(CommandSender executor, Command command, String label, String[] args) {
        Player target;

        if (args.length == 0 && !(executor instanceof Player)) {
            executor.sendMessage(ChatColor.RED + "You must specify a player.");
            return true;
        }
        if (args.length == 0) {
            target = (Player) executor;
        }
        else {
            target = Bukkit.getServer().getPlayer(args[0]);

            if (target == null) {
                executor.sendMessage(ChatColor.RED + "Cannot find player " + args[0] + ".");
                return true;
            }
        }

        target.kickPlayer("You have been kicked by" + executor);
        return true;
    }
}
