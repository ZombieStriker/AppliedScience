package me.zombie_striker.appliedscience;

import me.zombiestriker.customitemframework.CustomBlock;
import me.zombiestriker.customitemframework.CustomItemFramework;
import me.zombiestriker.customitemframework.events.PlayerBreakCustomBlockEvent;
import me.zombiestriker.customitemframework.events.PlayerPlaceCustomBlockEvent;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;

import java.util.concurrent.ThreadLocalRandom;

public class ASListener implements Listener {

    private AppliedScienceMain main;
    public ASListener(AppliedScienceMain appliedScienceMain) {
    this.main = appliedScienceMain;
    }

    @EventHandler
    public void onBlockPlace(PlayerPlaceCustomBlockEvent event){
            if(AppliedScienceMain.isBattery(event.getBlockEntity().getType().getInternalName())){

            }else if(AppliedScienceMain.isWire(event.getBlockEntity().getType().getInternalName())){

            }else if (AppliedScienceMain.isMachine(event.getBlockEntity().getType().getInternalName())){

            }else if (AppliedScienceMain.isPowerGenerator(event.getBlockEntity().getType().getInternalName())){

            }
    }

    @EventHandler
    public void onChunkPopulate(ChunkPopulateEvent event){
        CustomBlock uranium =  CustomItemFramework.getCustomBlock("uranium_ore_block");
        for(int uranium_oreamount = 0 ; uranium_oreamount < 24; uranium_oreamount++){
            int x = ThreadLocalRandom.current().nextInt(16);
            int z = ThreadLocalRandom.current().nextInt(16);
            int y = ThreadLocalRandom.current().nextInt(event.getChunk().getWorld().getHighestBlockYAt(x,z));
            Location location = new Location(event.getWorld(),x,y,z);
            if(location.getBlock().getType()== Material.STONE){
                CustomItemFramework.placeCustomBlockAt(location,uranium);
            }
        }
    }
}
