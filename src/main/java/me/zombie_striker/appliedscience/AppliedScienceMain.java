package me.zombie_striker.appliedscience;

import me.zombiestriker.customitemframework.CustomBlock;
import me.zombiestriker.customitemframework.CustomItem;
import me.zombiestriker.customitemframework.CustomItemFramework;
import org.bukkit.Bukkit;
import org.bukkit.Instrument;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.plugin.java.JavaPlugin;

public final class AppliedScienceMain extends JavaPlugin {

    @Override
    public void onEnable() {
        CustomItemFramework.registerResourcepack(AppliedScienceMain.class.getResource("/resourcepack/"));
        CustomItemFramework.incrementResourcepackVersion(1);
        CustomItemFramework.registerCustomItem(new CustomItem("solarbox", Material.STONE,"Solar Box","item/solarbox",12));
        CustomItemFramework.registerCustomItem(new CustomItem("metalbox", Material.STONE,"Metal Box","item/metalbox",13));
        CustomItemFramework.registerCustomItem(new CustomItem("generator", Material.STONE,"Generator","item/generator",14));
        CustomItemFramework.registerCustomItem(new CustomItem("wire_up", Material.STONE,"Wire","item/wire_up",15));
        CustomItemFramework.registerCustomItem(new CustomItem("wire_x", Material.STONE,"Wire","item/wire_x",16));
        CustomItemFramework.registerCustomItem(new CustomItem("wire_z", Material.STONE,"Wire","item/wire_z",17));
        CustomItemFramework.registerCustomItem(new CustomItem("wire_bus", Material.STONE,"Wire","item/wire_bus_all",18));
        CustomItemFramework.registerCustomItem(new CustomItem("battery", Material.STONE,"Battery","item/battery",19));
        //TODO: Add all custom wire configurations
        //TODO: Add Nuclear Generator
        //TODO: Add Uranium ore
        CustomItemFramework.registerCustomItem(new CustomItem("uranium_ore",Material.STONE,"Uranium Ore","item/uranium_ore",30));
        CustomItemFramework.registerCustomBlock(new CustomBlock("uranium_ore_block", Instrument.BANJO, Note.flat(0, Note.Tone.A),CustomItemFramework.generateCustomBlockModel("uranium_ore","item/uranium_ore"),"uranium_ore"));
        //TODO: Add Refined Uranium Ingot
        //TODO: Add Enrichment machine block
        //TODO: Add Auto Crafting table
        //TODO: Add Atomizer - break down items into its components.
        //TODO: Add Magnet Block - Attracts items when powered by redstone in a given radius
        //TODO: Add Water Coolant Cell
        //TODO: Add Uranium Fuel Cell
        //TODO: Add Inverted Hopper - pulls items up instead of down.

        Bukkit.getPluginManager().registerEvents(new ASListener(this),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static boolean isMachine(String name){
        return name.equals("alloyfurnace");
    }
    public static boolean isPowerGenerator(String internalname){
        return internalname.equals("solarbox") || internalname.equals("generator");
    }
    public static boolean isWire(String internalname){
        return internalname.equals("wire_up") || internalname.equals("wire_x") || internalname.equals("wire_z")|| internalname.equals("wire_bus");
    }
    public static boolean isBattery(String internalname){
        return internalname.equals("battery");
    }
    public static boolean isCustomBlock(String internalname){
        return isBattery(internalname) || isWire(internalname) || isPowerGenerator(internalname) || isMachine(internalname);
    }
}
