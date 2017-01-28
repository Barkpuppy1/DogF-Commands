package me.DogFreedom.DFCommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Kitty implements CommandExecutor{
	private FileConfiguration config = null;
	
	public Kitty(FileConfiguration config) { 
		this.setConfig(config);
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	Player player = (Player) sender;
    	if(commandLabel.equalsIgnoreCase("kitty")){
    			player.getServer().broadcastMessage(getConfig().getString("kittycommand-message"));
    			for(Player p : player.getServer().getOnlinePlayers()) {
    				//p.performCommand("skull MHF_Ocelot");
    				p.performCommand("give " + p.getName() + " minecraft:skull 1 3 {SkullOwner: MHF_Ocelot}");
    			}
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
