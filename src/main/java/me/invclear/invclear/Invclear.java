package me.invclear.invclear;


import me.zrockie.invclear.clearhand;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Invclear extends JavaPlugin implements Listener {
    public void onEnable() {
        getServer().getLogger().info("This server is running ");
        getCommand("clearhand").setExecutor(new clearhand());
    }

    public void onDisable() {}
}