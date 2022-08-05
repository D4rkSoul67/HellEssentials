package me.kinderix.HellEssentials.commands.gamemode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpectatorCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = (Player) sender;
        if (sender instanceof Player) {
            target.setGameMode(GameMode.SPECTATOR);
            target.sendMessage(ChatColor.GREEN + "Your gamemode has been changed.");
        }
        else {
            System.out.println("You need to be a player to run this command!");
        }
        return true;
    }
}
