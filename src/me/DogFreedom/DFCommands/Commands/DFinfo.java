package me.DogFreedom.DFCommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class DFInfo implements CommandExecutor{
	private FileConfiguration config = null;
	
	public BFInfo(FileConfiguration config) { 
		this.setConfig(config);
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	Player player = (Player) sender;
    	if(commandLabel.equalsIgnoreCase("bfinfo")){
    			player.sendMessage(ChatColor.AQUA + "DogFreedom's Owners are xBarkPuppy1, Gdogg4.");
    			player.sendMessage(ChatColor.AQUA + "DogFreedom's Chief-Developers are .");
    			player.sendMessage(ChatColor.AQUA + getConfig().getString("dfinfo-forums"));
    			player.sendMessage(ChatColor.AQUA + getConfig().getString("dfinfo-github"));
    	    return false;
    	}
        return false;
    }


	private FileConfiguration getConfig() {
		return config;
	}


	private void setConfig(FileConfiguration config) {
		this.config = config;
	}
}
