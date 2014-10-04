package me.DJBiokinetix;

import org.bukkit.java.JavaPlugin;

public class Main extends JavaPlugin{

    public void onEnable(){
        getLogger().info("Plugin activado correctamente!");
    }

    public void onDisable(){
        getLogger().info("Plugin desactivado correctamente!");
    }

}
