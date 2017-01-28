package me.DogFreedom.DFCommands.Commands;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class DogsOut implements CommandExecutor{
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	Player player = (Player) sender;
    	Server server = player.getServer();
    	if(commandLabel.equalsIgnoreCase("dogsout")){
    		server.broadcastMessage(ChatColor.RED + "Who let the dogs out?");
    		server.broadcastMessage(ChatColor.RED + "Who, who, who, who, who?");
    	    return false;
    	}
        return false;
    }
}
