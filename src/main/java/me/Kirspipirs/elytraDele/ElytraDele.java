package me.Kirspipirs.elytraDele;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ElytraDele extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents( new ElytraRemover(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
