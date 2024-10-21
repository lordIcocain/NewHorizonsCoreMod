package com.dreammaster.gthandler.nameRemover;

import static net.minecraft.util.EnumChatFormatting.*;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.dreammaster.gthandler.gui.CoreMod_UITextures;
import com.gtnewhorizons.modularui.api.drawable.FallbackableUITexture;

import gregtech.api.enums.Textures;
import gregtech.api.gui.modularui.GTUITextures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.MTEBasicMachine;
import gregtech.api.objects.GTRenderedTexture;
import gregtech.api.recipe.BasicUIProperties;
import gregtech.common.items.ItemIntegratedCircuit;

/**
 * Created by Tec on 28.03.2017.
 */
public class NameRemover extends MTEBasicMachine {

    public NameRemover(int aID, String aName, String aNameRegional, int aTier) {
        super(
                aID,
                aName,
                aNameRegional,
                aTier,
                1,
                "Can fix GT items with broken NBT data, will erase everything!",
                2,
                1,
                new GTRenderedTexture(Textures.BlockIcons.OVERLAY_SIDE_DISASSEMBLER_ACTIVE),
                new GTRenderedTexture(Textures.BlockIcons.OVERLAY_SIDE_DISASSEMBLER),
                new GTRenderedTexture(Textures.BlockIcons.OVERLAY_FRONT_DISASSEMBLER_ACTIVE),
                new GTRenderedTexture(Textures.BlockIcons.OVERLAY_FRONT_DISASSEMBLER),
                new GTRenderedTexture(Textures.BlockIcons.OVERLAY_TOP_DISASSEMBLER_ACTIVE),
                new GTRenderedTexture(Textures.BlockIcons.OVERLAY_TOP_DISASSEMBLER),
                new GTRenderedTexture(Textures.BlockIcons.OVERLAY_BOTTOM_DISASSEMBLER_ACTIVE),
                new GTRenderedTexture(Textures.BlockIcons.OVERLAY_BOTTOM_DISASSEMBLER));
    }

    public NameRemover(String aName, int aTier, String[] aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, 1, aDescription, aTextures, 2, 1);
    }

    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new NameRemover(mName, mTier, mDescriptionArray, mTextures);
    }

    @Override
    public int checkRecipe() {
        if (getInputAt(0) == null) return 0;

        ItemStack output = getInputAt(0).copy();
        NBTTagCompound nbt = output.getTagCompound();
        boolean removeName = false, removeDye = false, removeDisassembly = false, removeColor = false,
                removeRepair = false, removeSpray = false;

        if (nbt != null) {
            ItemStack circuit = getInputAt(1);
            int circuitSetting = 0;
            if (circuit != null && circuit.getItem() instanceof ItemIntegratedCircuit)
                circuitSetting = circuit.getItemDamage();

            switch (circuitSetting) {
                case 1:
                    removeName = true;
                    break;
                case 2:
                    removeDisassembly = true;
                    break;
                case 3:
                    removeColor = true;
                    break;
                case 4:
                    removeRepair = true;
                    break;
                case 5:
                    removeDye = true;
                    break;
                case 6:
                    removeSpray = true;
                    break;
                default:
                    removeName = true;
                    removeDisassembly = true;
                    removeColor = true;
                    removeRepair = true;
                    removeDye = true;
                    removeSpray = true;
            }
            if (removeName && nbt.hasKey("display")) {
                nbt.getCompoundTag("display").removeTag("Name");
                if (nbt.getCompoundTag("display").hasNoTags()) {
                    nbt.removeTag("display");
                }
            }
            if (removeDisassembly && nbt.hasKey("GT.CraftingComponents")) {
                nbt.removeTag("GT.CraftingComponents");
            }
            if (removeColor && nbt.hasKey("color")) {
                nbt.removeTag("color");
            }
            if (removeRepair && nbt.hasKey("RepairCost")) {
                nbt.removeTag("RepairCost");
            }
            if (removeDye && nbt.hasKey("display")) {
                nbt.getCompoundTag("display").removeTag("color");
                if (nbt.getCompoundTag("display").hasNoTags()) {
                    nbt.removeTag("display");
                }
            }
            if (removeSpray && nbt.hasKey("mColor")) {
                nbt.removeTag("mColor");
            }
            if (nbt.hasNoTags()) {
                output.setTagCompound(null);
            }
        }
        if (canOutput(output)) {
            getInputAt(0).stackSize = 0;
            mEUt = 0;
            mMaxProgresstime = 20;
            mOutputItems[0] = output;
            return 2;
        }
        return 0;
    }

    @Override
    public String[] getDescription() {
        List<String> description = new ArrayList<>();
        description.add("Removes various NBT tags.");
        description.add(" ");
        description.add(UNDERLINE + "First Slot" + RESET);
        description.add("The item you want to strip of NBT");
        description.add(" ");
        description.add(UNDERLINE + "Second Slot" + RESET);
        description.add("One of the following circuits:");
        description.add(BOLD + "Circuit 1:" + RESET + "  Attempt to fix broken ores by removing the Display Name tag");
        description.add(BOLD + "Circuit 3:" + RESET + "  Remove Railcraft stacking tag");
        description.add(BOLD + "Circuit 4:" + RESET + "  Remove Anvil repair tag");
        description.add(BOLD + "Circuit 5:" + RESET + "  Remove Dye from Leather armor");
        description.add(BOLD + "Circuit 6:" + RESET + "  Remove Spray color from GT items");
        description.add(" ");
        description.add(BOLD + "No Circuit:" + RESET + " Remove all of the above");

        return description.toArray(new String[0]);
    }

    @Override
    public boolean isElectric() {
        return false;
    }

    @Override
    public long maxEUStore() {
        return 0;
    }

    @Override
    public long getMinimumStoredEU() {
        return 0;
    }

    @Override
    public long maxAmperesIn() {
        return 0;
    }

    @Override
    public long maxAmperesOut() {
        return 0;
    }

    private static final FallbackableUITexture progressBarTexture = GTUITextures
            .fallbackableProgressbar("name_remover", CoreMod_UITextures.PROGRESSBAR_NAME_REMOVER);

    @Override
    protected BasicUIProperties getUIProperties() {
        return super.getUIProperties().toBuilder().progressBarTexture(progressBarTexture).build();
    }
}
