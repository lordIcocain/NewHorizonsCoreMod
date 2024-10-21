package com.dreammaster.bartworksHandler;

import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.IndustrialCraft2;

import bartworks.API.BorosilicateGlass;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class BWGlassAdder {

    private static final byte EV = 4;
    private static final byte IV = 5;

    private BWGlassAdder() {}

    public static void registerGlasses() {
        doRegister(IndustrialCraft2.ID, "blockAlloyGlass", 0, EV);
        doRegister(Botania.ID, "manaGlass", 0, EV);
        doRegister(Botania.ID, "elfGlass", 0, IV);
    }

    private static void doRegister(String modid, String blockName, int meta, byte tier) {
        if (Loader.isModLoaded(modid))
            BorosilicateGlass.registerGlass(GameRegistry.findBlock(modid, blockName), meta, tier);
    }
}
