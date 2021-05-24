package me.zombie_striker.appliedscience;

import me.zombiestriker.customitemframework.CustomBlock;
import me.zombiestriker.customitemframework.CustomEntity;
import me.zombiestriker.customitemframework.CustomItemFramework;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

import java.util.ArrayList;
import java.util.List;

public class ElectricalSystem {

    private static List<ElectricalSystem> electricalSystems = new ArrayList<>();

    private List<CustomEntity> connected = new ArrayList<>();
    private CustomEntity battery;

    public CustomEntity getBattery() {
        return battery;
    }

    public List<CustomEntity> getConnected() {
        return connected;
    }

    public ElectricalSystem(CustomEntity battery) {
        this.battery = battery;
    }

    public void remove() {
        electricalSystems.remove(this);
    }

    public static List<ElectricalSystem> getElectricalSystems() {
        return electricalSystems;
    }

    public static ElectricalSystem getElectricalSystemByBlock(CustomEntity block) {
        for (ElectricalSystem e : electricalSystems) {
            if (e.getConnected().contains(block) || e.getBattery() == block) {
                return e;
            }
        }
        return null;
    }
}
