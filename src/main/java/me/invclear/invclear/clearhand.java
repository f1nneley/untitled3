package me.zrockie.invclear;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class clearhand implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command cmd, String cl, String[] args) {
        Player p = (Player)s;
        if (p.hasPermission("clear.hand"))
            p.setItemInHand(new ItemStack(Material.AIR));
        return true;
    }
}