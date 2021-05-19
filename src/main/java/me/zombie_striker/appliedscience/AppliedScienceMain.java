package me.zombie_striker.appliedscience;

import me.zombiestriker.customitemframework.CustomBlock;
import me.zombiestriker.customitemframework.CustomItemFramework;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public final class AppliedScienceMain extends JavaPlugin {

    @Override
    public void onEnable() {
        CustomItemFramework.registerResourcepack(AppliedScienceMain.class.getResource("/resourcepack/"));
        CustomItemFramework.incrementResourcepackVersion(1);
        CustomItemFramework.registerCustomItem(new CustomBlock("solarbox", Material.STONE,"Solar Box","item/solarbox",12));
        CustomItemFramework.registerCustomItem(new CustomBlock("metalbox", Material.STONE,"Metal Box","item/metalbox",13));
        CustomItemFramework.registerCustomItem(new CustomBlock("generator", Material.STONE,"Generator","item/generator",14));
        CustomItemFramework.registerCustomItem(new CustomBlock("wire_up", Material.STONE,"Solar Box","item/wire_up",15));
        CustomItemFramework.registerCustomItem(new CustomBlock("wire_x", Material.STONE,"Solar Box","item/wire_x",16));
        CustomItemFramework.registerCustomItem(new CustomBlock("wire_z", Material.STONE,"Solar Box","item/wire_z",17));
        CustomItemFramework.registerCustomItem(new CustomBlock("wire_bus", Material.STONE,"Solar Box","item/wire_bus_all",18));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
