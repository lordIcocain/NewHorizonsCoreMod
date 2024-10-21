package com.dreammaster.scripts;

import static gregtech.api.enums.Mods.Backpack;
import static gregtech.api.enums.Mods.ExtraUtilities;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import tconstruct.library.crafting.DryingRackRecipes;

public class ScriptBackpack implements IScriptLoader {

    @Override
    public String getScriptName() {
        return "Backpack";
    }

    @Override
    public List<String> getDependencies() {
        return Arrays.asList(Backpack.ID, ExtraUtilities.ID, PamsHarvestCraft.ID, TinkerConstruct.ID);
    }

    @Override
    public void loadRecipes() {

        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 0, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 1, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 2, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 3, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 4, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 5, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 6, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 7, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 8, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 9, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 10, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 11, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 12, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 13, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 14, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 15, missing));
        OreDictionary.registerOre("SmallBackpacks", getModItem(Backpack.ID, "backpack", 1, 16, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 100, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 101, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 102, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 103, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 104, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 105, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 106, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 107, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 108, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 109, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 110, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 111, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 112, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 113, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 114, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 115, missing));
        OreDictionary.registerOre("MediumBackpacks", getModItem(Backpack.ID, "backpack", 1, 116, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 200, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 201, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 202, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 203, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 204, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 205, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 206, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 207, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 208, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 209, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 210, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 211, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 212, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 213, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 214, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 215, missing));
        OreDictionary.registerOre("BigBackpacks", getModItem(Backpack.ID, "backpack", 1, 216, missing));

        addShapedRecipe(
                getModItem(Backpack.ID, "boundLeather", 1, 0, missing),
                getModItem(Minecraft.ID, "string", 1, 0, missing),
                "itemLeather",
                getModItem(Minecraft.ID, "string", 1, 0, missing),
                "itemLeather",
                "materialCloth",
                "itemLeather",
                getModItem(Minecraft.ID, "string", 1, 0, missing),
                "itemLeather",
                getModItem(Minecraft.ID, "string", 1, 0, missing));
        addShapedRecipe(
                getModItem(Backpack.ID, "backpack", 1, 0, missing),
                "materialCloth",
                "ringSteel",
                "materialCloth",
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing),
                "materialCloth",
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing),
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing),
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing),
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing));

        HashMap<Integer, String> IDOffsetToDyeMap = new HashMap<>();
        IDOffsetToDyeMap.put(1, "dyeBlack");
        IDOffsetToDyeMap.put(2, "dyeRed");
        IDOffsetToDyeMap.put(3, "dyeGreen");
        IDOffsetToDyeMap.put(4, "dyeBrown");
        IDOffsetToDyeMap.put(5, "dyeBlue");
        IDOffsetToDyeMap.put(6, "dyePurple");
        IDOffsetToDyeMap.put(7, "dyeCyan");
        IDOffsetToDyeMap.put(8, "dyeLightGray");
        IDOffsetToDyeMap.put(9, "dyeGray");
        IDOffsetToDyeMap.put(10, "dyePink");
        IDOffsetToDyeMap.put(11, "dyeLime");
        IDOffsetToDyeMap.put(12, "dyeYellow");
        IDOffsetToDyeMap.put(13, "dyeLightBlue");
        IDOffsetToDyeMap.put(14, "dyeMagenta");
        IDOffsetToDyeMap.put(15, "dyeOrange");
        IDOffsetToDyeMap.put(16, "dyeWhite");

        for (Map.Entry<Integer, String> entry : IDOffsetToDyeMap.entrySet()) {
            GameRegistry.addRecipe(
                    new ColoredBackpackRecipe(
                            getModItem(Backpack.ID, "backpack", 1, entry.getKey(), missing),
                            "SmallBackpacks",
                            entry.getValue()));
            GameRegistry.addRecipe(
                    new ColoredBackpackRecipe(
                            getModItem(Backpack.ID, "backpack", 1, 100 + entry.getKey(), missing),
                            "MediumBackpacks",
                            entry.getValue()));
            GameRegistry.addRecipe(
                    new ColoredBackpackRecipe(
                            getModItem(Backpack.ID, "backpack", 1, 200 + entry.getKey(), missing),
                            "BigBackpacks",
                            entry.getValue()));
        }

        for (Integer offset : IntStream.rangeClosed(0, 16).toArray()) {
            GameRegistry.addRecipe(
                    new UpgradeBackpackRecipe(
                            getModItem(Backpack.ID, "backpack", 1, 100 + offset, missing),
                            "aba",
                            "bcb",
                            "aba",
                            'a',
                            "ringStainlessSteel",
                            'b',
                            getModItem(Backpack.ID, "tannedLeather", 1, 0, missing),
                            'c',
                            getModItem(Backpack.ID, "backpack", 1, offset, missing)));
            GameRegistry.addRecipe(
                    new UpgradeBackpackRecipe(
                            getModItem(Backpack.ID, "backpack", 1, 200 + offset, missing),
                            "aba",
                            "bcb",
                            "aba",
                            'a',
                            "ringTitanium",
                            'b',
                            getModItem(PamsHarvestCraft.ID, "hardenedleatherItem", 1, 0, missing),
                            'c',
                            getModItem(Backpack.ID, "backpack", 1, 100 + offset, missing)));
        }
        addShapedRecipe(
                getModItem(Backpack.ID, "workbenchbackpack", 1, 17, missing),
                "materialCloth",
                "ringSteel",
                "materialCloth",
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing),
                "materialCloth",
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing),
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing),
                getModItem(TinkerConstruct.ID, "CraftingSlab", 1, 0, missing),
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing));
        addShapedRecipe(
                getModItem(Backpack.ID, "workbenchbackpack", 1, 217, missing),
                "ringTitanium",
                getModItem(PamsHarvestCraft.ID, "hardenedleatherItem", 1, 0, missing),
                "ringTitanium",
                getModItem(PamsHarvestCraft.ID, "hardenedleatherItem", 1, 0, missing),
                getModItem(Backpack.ID, "backpack", 1, 100, missing),
                getModItem(PamsHarvestCraft.ID, "hardenedleatherItem", 1, 0, missing),
                "ringTitanium",
                getModItem(TinkerConstruct.ID, "CraftingSlab", 1, 0, missing),
                "ringTitanium");

        DryingRackRecipes.addDryingRecipe(
                getModItem(Backpack.ID, "boundLeather", 1, 0, missing),
                12000,
                getModItem(Backpack.ID, "tannedLeather", 1, 0, missing));

    }

    private static class ColoredBackpackRecipe extends ShapelessOreRecipe {

        private final int backpackMatch;

        public ColoredBackpackRecipe(ItemStack result, String backpack, String dye) {
            super(result, backpack, dye, getModItem(ExtraUtilities.ID, "paintbrush", 1, 0, missing));
            backpackMatch = OreDictionary.getOreID(backpack);
        }

        @Override
        public ItemStack getCraftingResult(InventoryCrafting crafting) {
            ItemStack result = super.getCraftingResult(crafting);
            for (int i = 0, imax = crafting.getSizeInventory(); i < imax; i++) {
                ItemStack stack = crafting.getStackInSlot(i);
                if (Arrays.stream(OreDictionary.getOreIDs(stack)).anyMatch(j -> j == backpackMatch)) {
                    result.stackTagCompound = stack.stackTagCompound;
                    break;
                }
            }
            return result;
        }
    }

    private static class UpgradeBackpackRecipe extends ShapedOreRecipe {

        public UpgradeBackpackRecipe(ItemStack result, Object... recipe) {
            super(result, recipe);
        }

        @Override
        public ItemStack getCraftingResult(InventoryCrafting crafting) {
            ItemStack result = super.getCraftingResult(crafting);
            Item resultItem = result.getItem();
            for (int i = 0, imax = crafting.getSizeInventory(); i < imax; i++) {
                ItemStack stack = crafting.getStackInSlot(i);
                if (stack != null && stack.getItem() == resultItem) {
                    result.stackTagCompound = stack.stackTagCompound;
                    break;
                }
            }
            return result;
        }
    }
}
