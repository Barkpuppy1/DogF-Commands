package me.DogFreedom.DFCommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Admin implements CommandExecutor{
	    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	    	Player player = (Player) sender;
	    	if(commandLabel.equalsIgnoreCase("admin")){
	    		player.sendMessage(ChatColor.RED + "Are you really that dumb?");
	    	    return false;
	    	}
	        return false;
	    }
	}
