package me.DogFreedom.DFCommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class ClearChat implements CommandExecutor{
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	Player player = (Player) sender;
    	if(commandLabel.equalsIgnoreCase("clearchat") || commandLabel.equalsIgnoreCase("cc")){
    		if (player.isOp()){
    		for(int i=0; i < 100; i ++)
    		{
    		sender.getServer().broadcastMessage("");
    		}
    		player.getServer().broadcastMessage(ChatColor.AQUA + "Chat has been cleared by: " + sender.getName());
    		}else{
    			player.sendMessage(ChatColor.YELLOW + "You have no permission to use this command!");
    		}
    	    return false;
    	}
        return false;
    }
}
