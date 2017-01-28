package me.DogFreedom.DFCommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Apply implements CommandExecutor{
	private FileConfiguration config = null;
	
	public Apply(FileConfiguration config) { 
		this.setConfig(config);
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	Player player = (Player) sender;
    	if(commandLabel.equalsIgnoreCase("apply")){
    		player.sendMessage(ChatColor.GREEN + "How to apply: " + getConfig().getString("bfapply-info"));
    		player.sendMessage(ChatColor.AQUA + "Forums: " + getConfig().getString("bfinfo-forums"));
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
