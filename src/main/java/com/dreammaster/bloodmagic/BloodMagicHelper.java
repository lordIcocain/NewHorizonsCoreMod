package com.dreammaster.bloodmagic;

import net.minecraft.item.ItemStack;

import WayofTime.alchemicalWizardry.api.alchemy.AlchemyRecipeRegistry;
import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;
import WayofTime.alchemicalWizardry.api.bindingRegistry.BindingRegistry;
import gregtech.api.util.GTUtility;

public class BloodMagicHelper {

    public static void removeAlchemyRecipe(ItemStack output) {
        AlchemyRecipeRegistry.recipes.removeIf(r -> GTUtility.areStacksEqual(r.getResult(), output, true));
    }

    public static void removeBindingRecipe(ItemStack output) {
        BindingRegistry.bindingRecipes.removeIf(r -> GTUtility.areStacksEqual(r.getResult(), output, true));
    }

    public static void removeAltarRecipe(ItemStack output) {
        AltarRecipeRegistry.altarRecipes.removeIf(r -> GTUtility.areStacksEqual(r.getResult(), output, true));
    }
}
