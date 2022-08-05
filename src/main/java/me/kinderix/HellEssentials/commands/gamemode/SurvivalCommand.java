package me.kinderix.HellEssentials.commands.gamemode;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurvivalCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = (Player) sender;
        if (sender instanceof Player) {
            target.setGameMode(GameMode.SURVIVAL);
            target.sendMessage("Your gamemode has been changed.");
        }
        else {
            System.out.println("You need to be a player to run this command!");
        }
        return true;
    }
}
