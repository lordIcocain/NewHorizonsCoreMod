package com.dreammaster.oredict;

import static gregtech.api.enums.Mods.ExtraTrees;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GalacticraftCore;
import static gregtech.api.enums.Mods.GalacticraftMars;
import static gregtech.api.enums.Mods.GalaxySpace;
import static gregtech.api.enums.Mods.Natura;
import static gregtech.api.enums.Mods.PamsHarvestTheNether;
import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.dreammaster.item.ItemList;

import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.util.GTModHandler;

public class OreDictHandler {

    /*
     * Made by bartimaeusnek, cleaned up by glowredman
     */

    public static void register_space_dust() {

        reg_dust(OreDictTypes.Asteroids.name(), ItemList.AsteroidsStoneDust.getIS());
        reg_dust(OreDictTypes.BarnardaE.name(), ItemList.BarnardaEStoneDust.getIS());
        reg_dust(OreDictTypes.BarnardaF.name(), ItemList.BarnardaFStoneDust.getIS());
        reg_dust(OreDictTypes.Callisto.name(), ItemList.CallistoStoneDust.getIS());
        reg_dust(OreDictTypes.CentauriA.name(), ItemList.CentauriAStoneDust.getIS());
        reg_dust(OreDictTypes.CentauriA.name(), ItemList.CentauriASurfaceDust.getIS());
        reg_dust(OreDictTypes.Ceres.name(), ItemList.CeresStoneDust.getIS());
        reg_dust(OreDictTypes.Deimos.name(), ItemList.DeimosStoneDust.getIS());
        reg_dust(OreDictTypes.Enceladus.name(), ItemList.EnceladusStoneDust.getIS());
        reg_dust(OreDictTypes.Enceladus.name(), ItemList.EnceladusIceDust.getIS());
        reg_dust(OreDictTypes.Europa.name(), ItemList.EuropaIceDust.getIS());
        reg_dust(OreDictTypes.Europa.name(), ItemList.EuropaStoneDust.getIS());
        reg_dust(OreDictTypes.Ganymede.name(), ItemList.GanymedeStoneDust.getIS());
        reg_dust(OreDictTypes.Haumea.name(), ItemList.HaumeaStoneDust.getIS());
        reg_dust(OreDictTypes.Io.name(), ItemList.IoStoneDust.getIS());
        reg_dust(OreDictTypes.MakeMake.name(), ItemList.MakeMakeStoneDust.getIS());
        reg_dust(OreDictTypes.Mars.name(), ItemList.MarsStoneDust.getIS());
        reg_dust(OreDictTypes.PlanetMercury.name(), ItemList.MercuryStoneDust.getIS());
        reg_dust(OreDictTypes.PlanetMercury.name(), ItemList.MercuryCoreDust.getIS());
        reg_dust(OreDictTypes.Miranda.name(), ItemList.MirandaStoneDust.getIS());
        reg_dust(OreDictTypes.Moon.name(), ItemList.MoonStoneDust.getIS());
        reg_dust(OreDictTypes.Oberon.name(), ItemList.OberonStoneDust.getIS());
        reg_dust(OreDictTypes.Phobos.name(), ItemList.PhobosStoneDust.getIS());
        reg_dust(OreDictTypes.Pluto.name(), ItemList.PlutoIceDust.getIS());
        reg_dust(OreDictTypes.Pluto.name(), ItemList.PlutoStoneDust.getIS());
        reg_dust(OreDictTypes.Proteus.name(), ItemList.ProteusStoneDust.getIS());
        reg_dust(OreDictTypes.TcetiE.name(), ItemList.TCetiEStoneDust.getIS());
        reg_dust(OreDictTypes.Titan.name(), ItemList.TitanStoneDust.getIS());
        reg_dust(OreDictTypes.Triton.name(), ItemList.TritonStoneDust.getIS());
        reg_dust(OreDictTypes.VegaB.name(), ItemList.VegaBStoneDust.getIS());
        reg_dust(OreDictTypes.Venus.name(), ItemList.VenusStoneDust.getIS());

        if (GalaxySpace.isModLoaded()) {
            Item glowstoneDusts = GameRegistry.findItem(GalaxySpace.ID, "item.GlowstoneDusts");
            reg_dust(OreDictTypes.Ceres.name(), new ItemStack(glowstoneDusts, 1, 0));
            reg_dust(OreDictTypes.Io.name(), new ItemStack(glowstoneDusts, 1, 1));
            reg_dust(OreDictTypes.Enceladus.name(), new ItemStack(glowstoneDusts, 1, 2));
            reg_dust(OreDictTypes.Proteus.name(), new ItemStack(glowstoneDusts, 1, 3));
            reg_dust(OreDictTypes.Pluto.name(), new ItemStack(glowstoneDusts, 1, 4));
        }
    }

    public static void register_space_rocks() {
        if (GalacticraftCore.isModLoaded()) {
            Block moonBlocks = GameRegistry.findBlock(GalacticraftCore.ID, "tile.moonBlock");
            for (int i = 3; i < 6; i++) {
                reg_rock(OreDictTypes.Moon.name(), new ItemStack(moonBlocks, 1, i));
            }
        }

        if (GalacticraftMars.isModLoaded()) {
            Block marsBlocks = GameRegistry.findBlock(GalacticraftMars.ID, "tile.mars");
            Block asteroidsBlocks = GameRegistry.findBlock(GalacticraftMars.ID, "tile.asteroidsBlock");
            for (int i = 0; i < 3; i++) {
                reg_rock(OreDictTypes.Mars.name(), new ItemStack(marsBlocks, 1, i + 4));
                reg_rock(OreDictTypes.Asteroids.name(), new ItemStack(asteroidsBlocks, 1, i));
            }
            reg_rock(OreDictTypes.Mars.name(), new ItemStack(marsBlocks, 1, 9));
        }

        if (GalaxySpace.isModLoaded()) {
            Block phobosBlocks = GameRegistry.findBlock(GalaxySpace.ID, "phobosblocks");
            Block ioBlocks = GameRegistry.findBlock(GalaxySpace.ID, "ioblocks");
            Block mercuryBlocks = GameRegistry.findBlock(GalaxySpace.ID, "mercuryblocks");
            Block titanBlocks = GameRegistry.findBlock(GalaxySpace.ID, "titanblocks");
            Block oberonBlocks = GameRegistry.findBlock(GalaxySpace.ID, "oberonblocks");
            Block mirandaBlocks = GameRegistry.findBlock(GalaxySpace.ID, "mirandablocks");
            Block proteusBlocks = GameRegistry.findBlock(GalaxySpace.ID, "proteusblocks");
            Block tritonBlocks = GameRegistry.findBlock(GalaxySpace.ID, "tritonblocks");
            Block plutoBlocks = GameRegistry.findBlock(GalaxySpace.ID, "plutoblocks");
            Block tCetiEBlocks = GameRegistry.findBlock(GalaxySpace.ID, "tcetieblocks");
            Block deimosBlocks = GameRegistry.findBlock(GalaxySpace.ID, "deimosblocks");
            Block venusBlocks = GameRegistry.findBlock(GalaxySpace.ID, "venusblocks");
            Block ceresBlocks = GameRegistry.findBlock(GalaxySpace.ID, "ceresblocks");
            Block europaGrunt = GameRegistry.findBlock(GalaxySpace.ID, "europagrunt");
            Block ganymedeBlocks = GameRegistry.findBlock(GalaxySpace.ID, "ganymedeblocks");
            Block callistoBlocks = GameRegistry.findBlock(GalaxySpace.ID, "callistoblocks");
            Block enceladusBlocks = GameRegistry.findBlock(GalaxySpace.ID, "enceladusblocks");
            Block makemakeGrunt = GameRegistry.findBlock(GalaxySpace.ID, "makemakegrunt");
            for (int i = 0; i < 3; i++) {
                reg_rock(OreDictTypes.Phobos.name(), new ItemStack(phobosBlocks, 1, i));
                reg_rock(OreDictTypes.Io.name(), new ItemStack(ioBlocks, 1, i));
                reg_rock(OreDictTypes.PlanetMercury.name(), new ItemStack(mercuryBlocks, 1, i));
                reg_rock(OreDictTypes.Titan.name(), new ItemStack(titanBlocks, 1, i));
                reg_rock(OreDictTypes.Oberon.name(), new ItemStack(oberonBlocks, 1, i));
                reg_rock(OreDictTypes.Miranda.name(), new ItemStack(mirandaBlocks, 1, i));
                reg_rock(OreDictTypes.Proteus.name(), new ItemStack(proteusBlocks, 1, i));
                reg_rock(OreDictTypes.Triton.name(), new ItemStack(tritonBlocks, 1, i));
                reg_rock(OreDictTypes.Pluto.name(), new ItemStack(plutoBlocks, 1, i));
                reg_rock(OreDictTypes.Pluto.name(), new ItemStack(plutoBlocks, 1, i + 3));
                reg_rock(OreDictTypes.TcetiE.name(), new ItemStack(tCetiEBlocks, 1, i));
            }
            for (int i = 0; i < 2; i++) {
                reg_rock(OreDictTypes.Deimos.name(), new ItemStack(deimosBlocks, 1, i));
                reg_rock(OreDictTypes.Venus.name(), new ItemStack(venusBlocks, 1, i));
                reg_rock(OreDictTypes.Ceres.name(), new ItemStack(ceresBlocks, 1, i));
                reg_rock(OreDictTypes.Europa.name(), new ItemStack(europaGrunt, 1, i));
                reg_rock(OreDictTypes.Ganymede.name(), new ItemStack(ganymedeBlocks, 1, i));
                reg_rock(OreDictTypes.Callisto.name(), new ItemStack(callistoBlocks, 1, i));
                reg_rock(OreDictTypes.Enceladus.name(), new ItemStack(enceladusBlocks, 1, i));
                reg_rock(OreDictTypes.MakeMake.name(), new ItemStack(makemakeGrunt, 1, i));
            }
            reg_rock(
                    OreDictTypes.Europa.name(),
                    GTModHandler.getModItem(GalaxySpace.ID, "europaunderwatergeyser", 1L, 0));
            reg_rock(OreDictTypes.Europa.name(), GTModHandler.getModItem(GalaxySpace.ID, "europageyser", 1L, 0));
            reg_rock(OreDictTypes.Haumea.name(), GTModHandler.getModItem(GalaxySpace.ID, "haumeablocks", 1L, 0));
            reg_rock(OreDictTypes.CentauriA.name(), GTModHandler.getModItem(GalaxySpace.ID, "acentauribbgrunt", 1L, 0));
            reg_rock(
                    OreDictTypes.CentauriA.name(),
                    GTModHandler.getModItem(GalaxySpace.ID, "acentauribbsubgrunt", 1L, 0));
            reg_rock(OreDictTypes.VegaB.name(), GTModHandler.getModItem(GalaxySpace.ID, "vegabsubgrunt", 1L, 0));
            reg_rock(OreDictTypes.VegaB.name(), GTModHandler.getModItem(GalaxySpace.ID, "vegabgrunt", 1L, 0));
            reg_rock(OreDictTypes.BarnardaE.name(), GTModHandler.getModItem(GalaxySpace.ID, "barnardaEgrunt", 1L, 0));
            reg_rock(
                    OreDictTypes.BarnardaE.name(),
                    GTModHandler.getModItem(GalaxySpace.ID, "barnardaEsubgrunt", 1L, 0));
            reg_rock(
                    OreDictTypes.BarnardaF.name(),
                    GTModHandler.getModItem(GalaxySpace.ID, "barnardaFsubgrunt", 1L, 0));
            reg_rock(OreDictTypes.BarnardaF.name(), GTModHandler.getModItem(GalaxySpace.ID, "barnardaFgrunt", 1L, 0));
            reg_rock(OreDictTypes.Io.name(), GTModHandler.getModItem(GalaxySpace.ID, "ioglowstone", 1L, 0));
            reg_rock(
                    OreDictTypes.Enceladus.name(),
                    GTModHandler.getModItem(GalaxySpace.ID, "enceladusglowstone", 1L, 0));
            reg_rock(OreDictTypes.Pluto.name(), GTModHandler.getModItem(GalaxySpace.ID, "plutoglowstone", 1L, 0));
            reg_rock(OreDictTypes.Proteus.name(), GTModHandler.getModItem(GalaxySpace.ID, "proteusglowstone", 1L, 0));
            reg_rock(OreDictTypes.Ceres.name(), GTModHandler.getModItem(GalaxySpace.ID, "ceresglowstone", 1L, 0));
            reg_rock(OreDictTypes.Enceladus.name(), GTModHandler.getModItem(GalaxySpace.ID, "enceladusblocks", 1L, 3));
        }
    }

    public static void reg_additional() {
        if (GalaxySpace.isModLoaded()) {
            Item tCetiEDandelionsItem = GameRegistry.findItem(GalaxySpace.ID, "tcetiedandelions");
            for (int i = 0; i < 6; i++) {
                ItemStack tCetiEDandelionsStack = new ItemStack(tCetiEDandelionsItem, 1, i);
                OreDictionary.registerOre("cropSpace", tCetiEDandelionsStack);
                OreDictionary.registerOre("cropTcetiESeaweed", tCetiEDandelionsStack);
            }
        }

        if (PamsHarvestTheNether.isModLoaded()) {
            OreDictionary.registerOre("logWood", GameRegistry.findBlock(PamsHarvestTheNether.ID, "netherLog"));
        }

        OreDictionary.registerOre("foodSalt", ItemList.EdibleSalt.getIS());

        OreDictionary.registerOre("ingotHotBrickNether", ItemList.HotNetherrackBrick.getIS());

        // Olivine = Peridot
        for (ItemStack stack : OreDictionary.getOres("blockOlivine")) {
            OreDictionary.registerOre("blockPeridot", stack);
        }
    }

    public static void register_all() {
        reg_woodItems();
        reg_additional();
        register_space_rocks();
        register_space_dust();
    }

    private static void reg_fenceWood() {
        for (ItemStack itemStack : new ItemStack[] { new ItemStack(Blocks.fence),
                GTModHandler.getModItem(ExtraTrees.ID, "fence", 1, WILDCARD_VALUE),
                GTModHandler.getModItem(Forestry.ID, "fences", 1, WILDCARD_VALUE),
                GTModHandler.getModItem(Forestry.ID, "fencesFireproof", 1, WILDCARD_VALUE),
                GTModHandler.getModItem(Natura.ID, "Natura.fence", 1, WILDCARD_VALUE) }) {
            if (itemStack != null) {
                OreDictionary.registerOre("fenceWood", itemStack);
            }
        }
    }

    private static void reg_woodItems() {
        reg_fenceWood(); // Register fenceWood
    }

    private static void reg_dust(String S, ItemStack I) {
        if (I != null) {
            String p = I.getUnlocalizedName().replaceAll("item\\.", "").replaceAll("Dust", "").replaceAll(" ", "")
                    .trim();
            OreDictionary.registerOre(OreDictTypes.dust.name() + p, I);
            OreDictionary.registerOre(OreDictTypes.dust.name() + S, I);
            OreDictionary.registerOre(OreDictTypes.dust.name() + OreDictTypes.Space.name(), I);
        }
    }

    private static void reg_rock(String S, ItemStack I) {
        if (I != null) {
            OreDictionary.registerOre(OreDictTypes.rock.name() + S, I);
            OreDictionary.registerOre(OreDictTypes.rock.name() + OreDictTypes.Space.name(), I);
        }
    }
}
