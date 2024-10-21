package com.dreammaster.gthandler;

import static com.gtnewhorizon.gtnhlib.util.AnimatedTooltipHandler.addItemTooltip;
import static gregtech.client.GTTooltipHandler.Tier.*;
import static gregtech.client.GTTooltipHandler.registerTieredTooltip;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import com.dreammaster.item.ItemList;

import gregtech.api.enums.SubTag;
import gregtech.common.items.MetaGeneratedItem01;

public class GT_Loader_Items {

    public void run() {
        GT = MetaGeneratedItem01.INSTANCE;
        registerItems();
        registerTooltips();
    }

    private MetaGeneratedItem01 GT;

    private void registerItems() {
        // ID Range: 600 - 699
        // Ingame offset: 32000

        // 600 - 609 Motors
        // 610 - 619 Pumps
        // 620 - 629 Rotors (Unused now, but don't re-use these IDs. Might cause world corruption)
        // 630 - 639 Conveyors
        // 640 - 649 Pistons
        // 650 - 659 Robot Arms
        // 660 - 664 Fluid Regulators
        // 670 - 679 Field Generators
        // 680 - 689 Emitters
        // 690 - 699 Sensors

        // CoreMod Items
        CustomItemList.EtchedLowVoltageWiring.set(ItemList.EtchedLowVoltageWiring.getIS());
        CustomItemList.EtchedInsaneVoltageWiring.set(ItemList.EtchedInsaneVoltageWiring.getIS());
        CustomItemList.EtchedLudicrousVoltageWiring.set(ItemList.EtchedLudicrousVoltageWiring.getIS());
        CustomItemList.SteelBars.set(ItemList.SteelBars.getIS());
        CustomItemList.AluminiumBars.set(ItemList.AluminiumBars.getIS());
        CustomItemList.StainlessSteelBars.set(ItemList.StainlessSteelBars.getIS());
        CustomItemList.TungstenBars.set(ItemList.TungstenBars.getIS());
        CustomItemList.TungstenSteelBars.set(ItemList.TungstenSteelBars.getIS());
        CustomItemList.IridiumBars.set(ItemList.IridiumBars.getIS());
        CustomItemList.OsmiumBars.set(ItemList.OsmiumBars.getIS());
        CustomItemList.ChromeBars.set(ItemList.ChromeBars.getIS());
        CustomItemList.TitaniumBars.set(ItemList.TitaniumBars.getIS());
        CustomItemList.NeutroniumBars.set(ItemList.NeutroniumBars.getIS());
        CustomItemList.RedstoneAlloyBars.set(ItemList.RedstoneAlloyBars.getIS());
        CustomItemList.ElectricalSteelBars.set(ItemList.ElectricalSteelBars.getIS());
        CustomItemList.ConductiveIronBars.set(ItemList.ConductiveIronBars.getIS());
        CustomItemList.EnergeticAlloyBars.set(ItemList.EnergeticAlloyBars.getIS());
        CustomItemList.VibrantAlloyBars.set(ItemList.VibrantAlloyBars.getIS());
        CustomItemList.PulsatingIronBars.set(ItemList.PulsatingIronBars.getIS());
        CustomItemList.SoulariumBars.set(ItemList.SoulariumBars.getIS());
        CustomItemList.EnderiumBaseBars.set(ItemList.EnderiumBaseBars.getIS());
        CustomItemList.EnderiumBars.set(ItemList.EnderiumBars.getIS());
        CustomItemList.NagaScaleChip.set(ItemList.NagaScaleChip.getIS());
        CustomItemList.NagaScaleFragment.set(ItemList.NagaScaleFragment.getIS());
        CustomItemList.LichBoneChip.set(ItemList.LichBoneChip.getIS());
        CustomItemList.LichBoneFragment.set(ItemList.LichBoneFragment.getIS());
        CustomItemList.LichBone.set(ItemList.LichBone.getIS());
        CustomItemList.FieryBloodDrop.set(ItemList.FieryBloodDrop.getIS());
        CustomItemList.CarminiteChip.set(ItemList.CarminiteChip.getIS());
        CustomItemList.CarminiteFragment.set(ItemList.CarminiteFragment.getIS());
        CustomItemList.SnowQueenBloodDrop.set(ItemList.SnowQueenBloodDrop.getIS());
        CustomItemList.SnowQueenBlood.set(ItemList.SnowQueenBlood.getIS());
        CustomItemList.AdvancedBoard.set(ItemList.AdvancedBoard.getIS());
        CustomItemList.AdvancedProcessorBoard.set(ItemList.AdvancedProcessorBoard.getIS());
        CustomItemList.HighEnergyFlowCircuit.set(ItemList.HighEnergyFlowCircuit.getIS());
        CustomItemList.NanoCircuit.set(ItemList.NanoCircuit.getIS());
        CustomItemList.PikoCircuit.set(ItemList.PikoCircuit.getIS());
        CustomItemList.QuantumCircuit.set(ItemList.QuantumCircuit.getIS());
        CustomItemList.CarbonPartBoots.set(ItemList.CarbonPartBoots.getIS());
        CustomItemList.CarbonPartChestplate.set(ItemList.CarbonPartChestplate.getIS());
        CustomItemList.CarbonPartHelmet.set(ItemList.CarbonPartHelmet.getIS());
        CustomItemList.CarbonPartHelmetNightVision.set(ItemList.CarbonPartHelmetNightVision.getIS());
        CustomItemList.CarbonPartLeggings.set(ItemList.CarbonPartLeggings.getIS());
        CustomItemList.NanoRubberBoots.set(ItemList.NanoRubberBoots.getIS());
        CustomItemList.NanoChestJetPack.set(ItemList.NanoChestJetPack.getIS());
        CustomItemList.NanoPlatedLeggings.set(ItemList.NanoPlatedLeggings.getIS());
        CustomItemList.NanoScubaHelmet.set(ItemList.NanoScubaHelmet.getIS());
        CustomItemList.QuantumPartBoots.set(ItemList.QuantumPartBoots.getIS());
        CustomItemList.QuantumPartChestplate.set(ItemList.QuantumPartChestplate.getIS());
        CustomItemList.QuantumPartHelmetEmpty.set(ItemList.QuantumPartHelmetEmpty.getIS());
        CustomItemList.QuantumPartHelmet.set(ItemList.QuantumPartHelmet.getIS());
        CustomItemList.QuantumPartLeggings.set(ItemList.QuantumPartLeggings.getIS());
        CustomItemList.HeavyDutyAlloyIngotT4.set(ItemList.HeavyDutyAlloyIngotT4.getIS());
        CustomItemList.HeavyDutyAlloyIngotT5.set(ItemList.HeavyDutyAlloyIngotT5.getIS());
        CustomItemList.HeavyDutyAlloyIngotT6.set(ItemList.HeavyDutyAlloyIngotT6.getIS());
        CustomItemList.HeavyDutyAlloyIngotT7.set(ItemList.HeavyDutyAlloyIngotT7.getIS());
        CustomItemList.HeavyDutyAlloyIngotT8.set(ItemList.HeavyDutyAlloyIngotT8.getIS());
        CustomItemList.HeavyDutyAlloyIngotT9.set(ItemList.HeavyDutyAlloyIngotT9.getIS());
        CustomItemList.HighEnergyCircuitParts.set(ItemList.HighEnergyCircuitParts.getIS());
        CustomItemList.EngravedDiamondCrystalChip.set(ItemList.EngravedDiamondCrystalChip.getIS());
        CustomItemList.EngravedEnergyChip.set(ItemList.EngravedEnergyChip.getIS());
        CustomItemList.NanoBoard.set(ItemList.NanoBoard.getIS());
        CustomItemList.NanoCrystal.set(ItemList.NanoCrystal.getIS());
        CustomItemList.NanoProcessorBoard.set(ItemList.NanoProcessorBoard.getIS());
        CustomItemList.QuantumBoard.set(ItemList.QuantumBoard.getIS());
        CustomItemList.QuantumProcessorBoard.set(ItemList.QuantumProcessorBoard.getIS());
        CustomItemList.EngravedQuantumChip.set(ItemList.EngravedQuantumChip.getIS());
        CustomItemList.IridiumAlloyItemCasing.set(ItemList.IridiumAlloyItemCasing.getIS());
        CustomItemList.ReinforcedGlassPLate.set(ItemList.ReinforcedGlassPlate.getIS());
        CustomItemList.ReinforcedGlassLense.set(ItemList.ReinforcedGlassLense.getIS());
        CustomItemList.MarshmallowForm.set(ItemList.MarshmallowForm.getIS());
        CustomItemList.MarshmallowFormMold.set(ItemList.MarshmallowFormMold.getIS());
        CustomItemList.UncookedSlush.set(ItemList.UncookedSlush.getIS());
        CustomItemList.MalformedSlush.set(ItemList.MalformedSlush.getIS());
        CustomItemList.GlowingMarshmallow.set(ItemList.GlowingMarshmallow.getIS());
        CustomItemList.Marshmallow.set(ItemList.Marshmallow.getIS());
        CustomItemList.MoldHelmet.set(ItemList.MoldHelmet.getIS());
        CustomItemList.MoldChestplate.set(ItemList.MoldChestplate.getIS());
        CustomItemList.MoldLeggings.set(ItemList.MoldLeggings.getIS());
        CustomItemList.MoldBoots.set(ItemList.MoldBoots.getIS());
        CustomItemList.IchoriumCap.set(ItemList.IchoriumCap.getIS());
        CustomItemList.CoinDarkWizard.set(ItemList.CoinDarkWizard.getIS());
        CustomItemList.CoinDarkWizardI.set(ItemList.CoinDarkWizardI.getIS());
        CustomItemList.CoinDarkWizardII.set(ItemList.CoinDarkWizardII.getIS());
        CustomItemList.CoinDarkWizardIII.set(ItemList.CoinDarkWizardIII.getIS());
        CustomItemList.CoinDarkWizardIV.set(ItemList.CoinDarkWizardIV.getIS());
        CustomItemList.CoinTechnician.set(ItemList.CoinTechnician.getIS());
        CustomItemList.CoinTechnicianI.set(ItemList.CoinTechnicianI.getIS());
        CustomItemList.CoinTechnicianII.set(ItemList.CoinTechnicianII.getIS());
        CustomItemList.CoinTechnicianIII.set(ItemList.CoinTechnicianIII.getIS());
        CustomItemList.CoinTechnicianIV.set(ItemList.CoinTechnicianIV.getIS());
        CustomItemList.CoinAdventure.set(ItemList.CoinAdventure.getIS());
        CustomItemList.CoinAdventureI.set(ItemList.CoinAdventureI.getIS());
        CustomItemList.CoinAdventureII.set(ItemList.CoinAdventureII.getIS());
        CustomItemList.CoinAdventureIII.set(ItemList.CoinAdventureIII.getIS());
        CustomItemList.CoinAdventureIV.set(ItemList.CoinAdventureIV.getIS());
        CustomItemList.CoinBees.set(ItemList.CoinBees.getIS());
        CustomItemList.CoinBeesI.set(ItemList.CoinBeesI.getIS());
        CustomItemList.CoinBeesII.set(ItemList.CoinBeesII.getIS());
        CustomItemList.CoinBeesIII.set(ItemList.CoinBeesIII.getIS());
        CustomItemList.CoinBeesIV.set(ItemList.CoinBeesIV.getIS());
        CustomItemList.CoinBlood.set(ItemList.CoinBlood.getIS());
        CustomItemList.CoinBloodI.set(ItemList.CoinBloodI.getIS());
        CustomItemList.CoinBloodII.set(ItemList.CoinBloodII.getIS());
        CustomItemList.CoinBloodIII.set(ItemList.CoinBloodIII.getIS());
        CustomItemList.CoinBloodIV.set(ItemList.CoinBloodIV.getIS());
        CustomItemList.CoinFarmer.set(ItemList.CoinFarmer.getIS());
        CustomItemList.CoinFarmerI.set(ItemList.CoinFarmerI.getIS());
        CustomItemList.CoinFarmerII.set(ItemList.CoinFarmerII.getIS());
        CustomItemList.CoinFarmerIII.set(ItemList.CoinFarmerIII.getIS());
        CustomItemList.CoinFarmerIV.set(ItemList.CoinFarmerIV.getIS());
        CustomItemList.CoinForestry.set(ItemList.CoinForestry.getIS());
        CustomItemList.CoinForestryI.set(ItemList.CoinForestryI.getIS());
        CustomItemList.CoinForestryII.set(ItemList.CoinForestryII.getIS());
        CustomItemList.CoinForestryIII.set(ItemList.CoinForestryIII.getIS());
        CustomItemList.CoinForestryIV.set(ItemList.CoinForestryIV.getIS());
        CustomItemList.CoinSurvivor.set(ItemList.CoinSurvivor.getIS());
        CustomItemList.CoinSurvivorI.set(ItemList.CoinSurvivorI.getIS());
        CustomItemList.CoinSurvivorII.set(ItemList.CoinSurvivorII.getIS());
        CustomItemList.CoinSurvivorIII.set(ItemList.CoinSurvivorIII.getIS());
        CustomItemList.CoinSurvivorIV.set(ItemList.CoinSurvivorIV.getIS());
        CustomItemList.CoinSpace.set(ItemList.CoinSpace.getIS());
        CustomItemList.CoinSpaceI.set(ItemList.CoinSpaceI.getIS());
        CustomItemList.CoinSpaceII.set(ItemList.CoinSpaceII.getIS());
        CustomItemList.CoinSpaceIII.set(ItemList.CoinSpaceIII.getIS());
        CustomItemList.CoinSpaceIV.set(ItemList.CoinSpaceIV.getIS());
        CustomItemList.CoinChunkloaderTierI.set(ItemList.CoinChunkloaderTierI.getIS());
        CustomItemList.CoinChunkloaderTierI.getItem().setMaxStackSize(4);
        CustomItemList.CoinChunkloaderTierII.set(ItemList.CoinChunkloaderTierII.getIS());
        CustomItemList.CoinChunkloaderTierII.getItem().setMaxStackSize(4);
        CustomItemList.CoinChunkloaderTierIII.set(ItemList.CoinChunkloaderTierIII.getIS());
        CustomItemList.CoinChunkloaderTierIII.getItem().setMaxStackSize(4);
        CustomItemList.CoinChunkloaderTierIV.set(ItemList.CoinChunkloaderTierIV.getIS());
        CustomItemList.CoinChunkloaderTierIV.getItem().setMaxStackSize(4);
        CustomItemList.CoinChunkloaderTierV.set(ItemList.CoinChunkloaderTierV.getIS());
        CustomItemList.CoinChunkloaderTierV.getItem().setMaxStackSize(4);
        CustomItemList.CoinChemist.set(ItemList.CoinChemist.getIS());
        CustomItemList.CoinChemistI.set(ItemList.CoinChemistI.getIS());
        CustomItemList.CoinChemistII.set(ItemList.CoinChemistII.getIS());
        CustomItemList.CoinChemistIII.set(ItemList.CoinChemistIII.getIS());
        CustomItemList.CoinChemistIV.set(ItemList.CoinChemistIV.getIS());
        CustomItemList.CoinCook.set(ItemList.CoinCook.getIS());
        CustomItemList.CoinCookI.set(ItemList.CoinCookI.getIS());
        CustomItemList.CoinCookII.set(ItemList.CoinCookII.getIS());
        CustomItemList.CoinCookIII.set(ItemList.CoinCookIII.getIS());
        CustomItemList.CoinCookIV.set(ItemList.CoinCookIV.getIS());
        CustomItemList.CoinBlank.set(ItemList.CoinBlank.getIS());
        CustomItemList.CoinBlankI.set(ItemList.CoinBlankI.getIS());
        CustomItemList.CoinBlankII.set(ItemList.CoinBlankII.getIS());
        CustomItemList.CoinBlankIII.set(ItemList.CoinBlankIII.getIS());
        CustomItemList.CoinBlankIV.set(ItemList.CoinBlankIV.getIS());
        CustomItemList.CoinSmith.set(ItemList.CoinSmith.getIS());
        CustomItemList.CoinSmithI.set(ItemList.CoinSmithI.getIS());
        CustomItemList.CoinSmithII.set(ItemList.CoinSmithII.getIS());
        CustomItemList.CoinSmithIII.set(ItemList.CoinSmithIII.getIS());
        CustomItemList.CoinSmithIV.set(ItemList.CoinSmithIV.getIS());
        CustomItemList.CoinWitch.set(ItemList.CoinWitch.getIS());
        CustomItemList.CoinWitchI.set(ItemList.CoinWitchI.getIS());
        CustomItemList.CoinWitchII.set(ItemList.CoinWitchII.getIS());
        CustomItemList.CoinWitchIII.set(ItemList.CoinWitchIII.getIS());
        CustomItemList.CoinWitchIV.set(ItemList.CoinWitchIV.getIS());
        CustomItemList.CoinFlower.set(ItemList.CoinFlower.getIS());
        CustomItemList.CoinFlowerI.set(ItemList.CoinFlowerI.getIS());
        CustomItemList.CoinFlowerII.set(ItemList.CoinFlowerII.getIS());
        CustomItemList.CoinFlowerIII.set(ItemList.CoinFlowerIII.getIS());
        CustomItemList.CoinFlowerIV.set(ItemList.CoinFlowerIV.getIS());
        CustomItemList.CoinDonation.set(ItemList.CoinDonation.getIS());
        CustomItemList.WetTofu.set(ItemList.WetTofu.getIS());
        CustomItemList.NetherStarFragment.set(ItemList.NetherStarFragment.getIS());
        CustomItemList.WeakOrb.set(ItemList.WeakOrb.getIS());
        CustomItemList.ApprenticeOrb.set(ItemList.ApprenticeOrb.getIS());
        CustomItemList.MasterOrb.set(ItemList.MasterOrb.getIS());
        CustomItemList.MagicianOrb.set(ItemList.MagicianOrb.getIS());
        CustomItemList.ArchmageOrb.set(ItemList.ArchmageOrb.getIS());
        CustomItemList.TranscendentOrb.set(ItemList.TranscendentOrb.getIS());
        CustomItemList.ArcaneSlate.set(ItemList.ArcaneSlate.getIS());
        CustomItemList.RawOrbTier1.set(ItemList.RawOrbTier1.getIS());
        CustomItemList.RawOrbTier2.set(ItemList.RawOrbTier2.getIS());
        CustomItemList.RawOrbTier3.set(ItemList.RawOrbTier3.getIS());
        CustomItemList.RawOrbTier4.set(ItemList.RawOrbTier4.getIS());
        CustomItemList.RawOrbTier5.set(ItemList.RawOrbTier5.getIS());
        CustomItemList.RawOrbTier6.set(ItemList.RawOrbTier6.getIS());
        CustomItemList.TeleposerFrame.set(ItemList.TeleposerFrame.getIS());
        CustomItemList.MysteriousCrystal.set(ItemList.MysteriousCrystal.getIS());
        CustomItemList.WoodenCasing.set(ItemList.WoodenCasing.getIS());
        CustomItemList.EssentiaCircuit.set(ItemList.EssentiaCircuit.getIS());
        CustomItemList.EngineeringProcessorEssentiaPulsatingCore
                .set(ItemList.EngineeringProcessorEssentiaPulsatingCore.getIS());
        CustomItemList.ManyullynCrystal.set(ItemList.ManyullynCrystal.getIS());
        CustomItemList.SchematicsAstroMiner.set(ItemList.SchematicsAstroMiner.getIS());
        CustomItemList.SchematicsCargoRocket.set(ItemList.SchematicsCargoRocket.getIS());
        CustomItemList.SchematicsMoonBuggy.set(ItemList.SchematicsMoonBuggy.getIS());
        CustomItemList.SchematicsTier1.set(ItemList.SchematicsTier1.getIS());
        CustomItemList.SchematicsTier2.set(ItemList.SchematicsTier2.getIS());
        CustomItemList.SchematicsTier3.set(ItemList.SchematicsTier3.getIS());
        CustomItemList.SchematicsTier4.set(ItemList.SchematicsTier4.getIS());
        CustomItemList.SchematicsTier5.set(ItemList.SchematicsTier5.getIS());
        CustomItemList.SchematicsTier6.set(ItemList.SchematicsTier6.getIS());
        CustomItemList.SchematicsTier7.set(ItemList.SchematicsTier7.getIS());
        CustomItemList.SchematicsTier8.set(ItemList.SchematicsTier8.getIS());
        CustomItemList.RawSDHCAlloy.set(ItemList.RawSDHCAlloy.getIS());
        CustomItemList.TungstenString.set(ItemList.TungstenString.getIS());
        CustomItemList.MeteoricIronString.set(ItemList.MeteoricIronString.getIS());
        CustomItemList.BlackPlutoniumCompressedPlate.set(ItemList.BlackPlutoniumCompressedPlate.getIS());
        CustomItemList.DeshDualCompressedPlates.set(ItemList.DeshDualCompressedPlates.getIS());
        CustomItemList.TitaniumDualCompressedPlates.set(ItemList.TitaniumDualCompressedPlates.getIS());
        CustomItemList.IceCompressedPlate.set(ItemList.IceCompressedPlate.getIS());
        CustomItemList.LedoxCompressedPlate.set(ItemList.LedoxCompressedPlate.getIS());
        CustomItemList.IceDualCompressedPlates.set(ItemList.IceDualCompressedPlates.getIS());
        CustomItemList.QuantinumCompressedPlate.set(ItemList.QuantinumCompressedPlate.getIS());
        CustomItemList.QuantinumDualCompressedPlates.set(ItemList.QuantinumDualCompressedPlates.getIS());
        CustomItemList.MytrylCompressedPlate.set(ItemList.MytrylCompressedPlate.getIS());
        CustomItemList.MytrylDualCompressedPlates.set(ItemList.MytrylDualCompressedPlates.getIS());
        CustomItemList.MysteriousCrystalCompressedPlate.set(ItemList.MysteriousCrystalCompressedPlate.getIS());
        CustomItemList.MysteriousCrystalDualCompressedPlates
                .set(ItemList.MysteriousCrystalDualCompressedPlates.getIS());
        CustomItemList.SteelDualCompressedPlates.set(ItemList.SteelDualCompressedPlates.getIS());
        CustomItemList.TinDualCompressedPlates.set(ItemList.TinDualCompressedPlates.getIS());
        CustomItemList.CopperDualCompressedPlates.set(ItemList.CopperDualCompressedPlates.getIS());
        CustomItemList.IronDualCompressedPlates.set(ItemList.IronDualCompressedPlates.getIS());
        CustomItemList.MeteoricIronDualCompressedPlates.set(ItemList.MeteoricIronDualCompressedPlates.getIS());
        CustomItemList.MediumFuelCanister.set(ItemList.MediumFuelCanister.getIS());
        CustomItemList.LargeFuelCanister.set(ItemList.LargeFuelCanister.getIS());
        CustomItemList.ExtraLargeFuelCanister.set(ItemList.ExtraLargeFuelCanister.getIS());
        CustomItemList.MytrylCrystal.set(ItemList.MytrylCrystal.getIS());
        CustomItemList.CallistoIceCompressedPlate.set(ItemList.CallistoIceCompressedPlate.getIS());
        CustomItemList.HeavyDutyRocketEngineTier3.set(ItemList.HeavyDutyRocketEngineTier3.getIS());
        CustomItemList.HeavyDutyRocketEngineTier4.set(ItemList.HeavyDutyRocketEngineTier4.getIS());
        CustomItemList.HeavyDutyNoseConeTier3.set(ItemList.HeavyDutyNoseConeTier3.getIS());
        CustomItemList.HeavyDutyNoseConeTier4.set(ItemList.HeavyDutyNoseConeTier4.getIS());
        CustomItemList.HeavyDutyRocketFinsTier3.set(ItemList.HeavyDutyRocketFinsTier3.getIS());
        CustomItemList.HeavyDutyRocketFinsTier4.set(ItemList.HeavyDutyRocketFinsTier4.getIS());
        CustomItemList.Tier2Booster.set(ItemList.Tier2Booster.getIS());
        CustomItemList.Tier3Booster.set(ItemList.Tier3Booster.getIS());
        CustomItemList.Tier4Booster.set(ItemList.Tier4Booster.getIS());
        CustomItemList.HeavyDutyPlateTier4.set(ItemList.HeavyDutyPlateTier4.getIS());
        CustomItemList.HeavyDutyPlateTier5.set(ItemList.HeavyDutyPlateTier5.getIS());
        CustomItemList.HeavyDutyPlateTier6.set(ItemList.HeavyDutyPlateTier6.getIS());
        CustomItemList.HeavyDutyPlateTier7.set(ItemList.HeavyDutyPlateTier7.getIS());
        CustomItemList.HeavyDutyPlateTier8.set(ItemList.HeavyDutyPlateTier8.getIS());
        CustomItemList.LeadNickelPlate.set(ItemList.LeadNickelPlate.getIS());
        CustomItemList.LeadOriharukonPlate.set(ItemList.LeadOriharukonPlate.getIS());
        CustomItemList.MoonStoneDust.set(ItemList.MoonStoneDust.getIS());
        CustomItemList.MarsStoneDust.set(ItemList.MarsStoneDust.getIS());
        CustomItemList.AsteroidsStoneDust.set(ItemList.AsteroidsStoneDust.getIS());
        CustomItemList.PhobosStoneDust.set(ItemList.PhobosStoneDust.getIS());
        CustomItemList.DeimosStoneDust.set(ItemList.DeimosStoneDust.getIS());
        CustomItemList.CeresStoneDust.set(ItemList.CeresStoneDust.getIS());
        CustomItemList.EuropaIceDust.set(ItemList.EuropaIceDust.getIS());
        CustomItemList.EuropaStoneDust.set(ItemList.EuropaStoneDust.getIS());
        CustomItemList.GanymedeStoneDust.set(ItemList.GanymedeStoneDust.getIS());
        CustomItemList.CallistoStoneDust.set(ItemList.CallistoStoneDust.getIS());
        CustomItemList.IoStoneDust.set(ItemList.IoStoneDust.getIS());
        CustomItemList.VenusStoneDust.set(ItemList.VenusStoneDust.getIS());
        CustomItemList.MercuryStoneDust.set(ItemList.MercuryStoneDust.getIS());
        CustomItemList.EnceladusIceDust.set(ItemList.EnceladusIceDust.getIS());
        CustomItemList.EnceladusStoneDust.set(ItemList.EnceladusStoneDust.getIS());
        CustomItemList.TitanStoneDust.set(ItemList.TitanStoneDust.getIS());
        CustomItemList.OberonStoneDust.set(ItemList.OberonStoneDust.getIS());
        CustomItemList.ProteusStoneDust.set(ItemList.ProteusStoneDust.getIS());
        CustomItemList.TritonStoneDust.set(ItemList.TritonStoneDust.getIS());
        CustomItemList.PlutoIceDust.set(ItemList.PlutoIceDust.getIS());
        CustomItemList.PlutoStoneDust.set(ItemList.PlutoStoneDust.getIS());
        CustomItemList.HaumeaStoneDust.set(ItemList.HaumeaStoneDust.getIS());
        CustomItemList.MakeMakeStoneDust.set(ItemList.MakeMakeStoneDust.getIS());
        CustomItemList.MercuryCoreDust.set(ItemList.MercuryCoreDust.getIS());
        CustomItemList.CentauriAStoneDust.set(ItemList.CentauriAStoneDust.getIS());
        CustomItemList.CentauriASurfaceDust.set(ItemList.CentauriASurfaceDust.getIS());
        CustomItemList.VegaBStoneDust.set(ItemList.VegaBStoneDust.getIS());
        CustomItemList.BarnardaEStoneDust.set(ItemList.BarnardaEStoneDust.getIS());
        CustomItemList.BarnardaFStoneDust.set(ItemList.BarnardaFStoneDust.getIS());
        CustomItemList.IndustryFrame.set(ItemList.IndustryFrame.getIS());
        CustomItemList.TCetiEStoneDust.set(ItemList.TCetiEStoneDust.getIS());
        CustomItemList.AdsorptionFilterCasing.set(ItemList.AdsorptionFilterCasing.getIS());
        CustomItemList.AdsorptionFilter.set(ItemList.AdsorptionFilter.getIS());
        CustomItemList.AdsorptionFilterDirty.set(ItemList.AdsorptionFilterDirty.getIS());
        CustomItemList.VoidSeed.set(ItemList.VoidSeed.getIS());
        CustomItemList.WaferTier3.set(ItemList.WaferTier3.getIS());
        CustomItemList.MirandaStoneDust.set(ItemList.MirandaStoneDust.getIS());
        CustomItemList.MicaBasedPulp.set(ItemList.MicaBasedPulp.getIS());
        CustomItemList.MicaBasedSheet.set(ItemList.MicaBasedSheet.getIS());
        CustomItemList.MicaInsulatorSheet.set(ItemList.MicaInsulatorSheet.getIS());
        CustomItemList.MicaInsulatorFoil.set(ItemList.MicaInsulatorFoil.getIS());
        CustomItemList.HotNetherrackBrick.set(ItemList.HotNetherrackBrick.getIS());
        CustomItemList.InfernalBrick.set(ItemList.InfernalBrick.getIS());
        CustomItemList.AdvancedCokeOvenBrick.set(ItemList.AdvancedCokeOvenBrick.getIS());
        CustomItemList.AdvancedCokeOvenBrickDust.set(ItemList.AdvancedCokeOvenBrickDust.getIS());
        CustomItemList.CokeOvenBrick.set(ItemList.CokeOvenBrick.getIS());
        CustomItemList.CokeOvenBrickDust.set(ItemList.CokeOvenBrickDust.getIS());
        CustomItemList.MedalDerp.set(ItemList.MedalDerp.getIS());
        CustomItemList.MedalDerp.getItem().setMaxStackSize(1);
        CustomItemList.MedalGTExplosion.set(ItemList.MedalGTExplosion.getIS());
        CustomItemList.MedalGTExplosion.getItem().setMaxStackSize(1);
        CustomItemList.MedalBuilder.set(ItemList.MedalBuilder.getIS());
        CustomItemList.MedalBuilder.getItem().setMaxStackSize(1);
        CustomItemList.MedalEngineer.set(ItemList.MedalEngineer.getIS());
        CustomItemList.MedalEngineer.getItem().setMaxStackSize(1);
        CustomItemList.MedalWarp.set(ItemList.MedalWarp.getIS());
        CustomItemList.MedalWarp.getItem().setMaxStackSize(1);
        CustomItemList.AluminoSilicateWool.set(ItemList.AluminoSilicateWool.getIS());
        CustomItemList.MaceratedPlantmass.set(ItemList.MaceratedPlantmass.getIS());
        CustomItemList.EngineCore.set(ItemList.EngineCore.getIS());
        CustomItemList.TwilightCrystal.set(ItemList.TwilightCrystal.getIS());
        CustomItemList.UnfiredClayBrick.set(ItemList.UnfiredClayBrick.getIS());
        CustomItemList.UnfiredSearedBrick.set(ItemList.UnfiredSearedBrick.getIS());
        CustomItemList.UnfiredCokeOvenBrick.set(ItemList.UnfiredCokeOvenBrick.getIS());
        CustomItemList.UnfiredSlimeSoulBrick.set(ItemList.UnfiredSlimeSoulBrick.getIS());
        CustomItemList.RawLapotronCrystal.set(ItemList.RawLapotronCrystal.getIS());
        CustomItemList.LapotronDust.set(ItemList.LapotronDust.getIS());
        CustomItemList.AluminiumIronPlate.set(ItemList.AluminiumIronPlate.getIS());
        CustomItemList.ReinforcedAluminiumIronPlate.set(ItemList.ReinforcedAluminiumIronPlate.getIS());
        CustomItemList.IrradiantReinforcedAluminiumPlate.set(ItemList.IrradiantReinforcedAluminiumPlate.getIS());
        CustomItemList.IrradiantReinforcedTitaniumPlate.set(ItemList.IrradiantReinforcedTitaniumPlate.getIS());
        CustomItemList.IrradiantReinforcedTungstenPlate.set(ItemList.IrradiantReinforcedTungstenPlate.getIS());
        CustomItemList.IrradiantReinforcedTungstenSteelPlate
                .set(ItemList.IrradiantReinforcedTungstenSteelPlate.getIS());
        CustomItemList.IrradiantReinforcedChromePlate.set(ItemList.IrradiantReinforcedChromePlate.getIS());
        CustomItemList.IrradiantReinforcedNaquadriaPlate.set(ItemList.IrradiantReinforcedNaquadriaPlate.getIS());
        CustomItemList.IrradiantReinforcedNeutroniumPlate.set(ItemList.IrradiantReinforcedNeutroniumPlate.getIS());
        CustomItemList.IrradiantReinforcedBedrockiumPlate.set(ItemList.IrradiantReinforcedBedrockiumPlate.getIS());
        CustomItemList.QuantumCrystal.set(ItemList.QuantumCrystal.getIS());
        CustomItemList.MysteriousCrystalLens.set(ItemList.MysteriousCrystalLens.getIS());
        CustomItemList.MysteriousCrystalGemFlawless.set(ItemList.MysteriousCrystalGemFlawless.getIS());
        CustomItemList.MysteriousCrystalGemExquisite.set(ItemList.MysteriousCrystalGemExquisite.getIS());
        CustomItemList.PrimordialPearlFragment.set(ItemList.PrimordialPearlFragment.getIS());
        CustomItemList.SandStoneRod.set(ItemList.SandStoneRod.getIS());
        CustomItemList.TheBigEgg.set(ItemList.TheBigEgg.getIS());
        CustomItemList.MutatedEgg.set(ItemList.MutatedEgg.getIS());
        CustomItemList.DraconiumEgg.set(ItemList.DraconiumEgg.getIS());
        CustomItemList.EnderEgg.set(ItemList.EnderEgg.getIS());
        CustomItemList.ChargedCertusQuartzDust.set(ItemList.ChargedCertusQuartzDust.getIS());
        CustomItemList.RawPicoWafer.set(ItemList.RawPicoWafer.getIS());
        CustomItemList.PicoWafer.set(ItemList.PicoWafer.getIS());
        CustomItemList.StargateFramePart.set(ItemList.StargateFramePart.getIS());
        CustomItemList.StargateChevron.set(ItemList.StargateChevron.getIS());
        CustomItemList.StargateShieldingFoil.set(ItemList.StargateShieldingFoil.getIS());
        CustomItemList.StargateCrystalDust.set(ItemList.StargateCrystalDust.getIS());
        CustomItemList.TCetiESeaweedExtract.set(ItemList.TCetiESeaweedExtract.getIS());
        CustomItemList.RawNeutronium.set(ItemList.RawNeutronium.getIS());
        CustomItemList.NeutronReflectorSmallParts.set(ItemList.NeutronReflectorSmallParts.getIS());
        CustomItemList.NeutronReflectorParts.set(ItemList.NeutronReflectorParts.getIS());
        CustomItemList.Empty180SpCell.set(ItemList.Empty180SpCell.getIS());
        CustomItemList.Empty360SpCell.set(ItemList.Empty360SpCell.getIS());
        CustomItemList.Empty540SpCell.set(ItemList.Empty540SpCell.getIS());
        CustomItemList.Empty1080SpCell.set(ItemList.Empty1080SpCell.getIS());
        CustomItemList.TenKCell.set(ItemList.TenKCell.getIS());
        CustomItemList.ThirtyKCell.set(ItemList.ThirtyKCell.getIS());
        CustomItemList.SixtyKCell.set(ItemList.SixtyKCell.getIS());
        CustomItemList.ArtificialLeather.set(ItemList.ArtificialLeather.getIS());
        CustomItemList.EctoplasmaChip.set(ItemList.EctoplasmaChip.getIS());
        CustomItemList.EctoplasmaFragment.set(ItemList.EctoplasmaFragment.getIS());
        CustomItemList.ArcaneShardChip.set(ItemList.ArcaneShardChip.getIS());
        CustomItemList.ArcaneShardFragment.set(ItemList.ArcaneShardFragment.getIS());
        CustomItemList.RuneOfPowerFragment.set(ItemList.RuneOfPowerFragment.getIS());
        CustomItemList.RuneOfAgilityFragment.set(ItemList.RuneOfAgilityFragment.getIS());
        CustomItemList.RuneOfVigorFragment.set(ItemList.RuneOfVigorFragment.getIS());
        CustomItemList.RuneOfDefenseFragment.set(ItemList.RuneOfDefenseFragment.getIS());
        CustomItemList.RuneOfMagicFragment.set(ItemList.RuneOfMagicFragment.getIS());
        CustomItemList.RuneOfVoidFragment.set(ItemList.RuneOfVoidFragment.getIS());
        CustomItemList.NandChipBoard.set(
                GT.addItem(81, "NAND Chip Array", "Chips on Board", "circuitPrimitiveArray", SubTag.NO_UNIFICATION));
        CustomItemList.LogicProcessorItemGoldCore.set(ItemList.LogicProcessorItemGoldCore.getIS());
        CustomItemList.EngineeringProcessorItemDiamondCore.set(ItemList.EngineeringProcessorItemDiamondCore.getIS());
        CustomItemList.EngineeringProcessorItemEmeraldCore.set(ItemList.EngineeringProcessorItemEmeraldCore.getIS());
        CustomItemList.EngineeringProcessorItemAdvEmeraldCore
                .set(ItemList.EngineeringProcessorItemAdvEmeraldCore.getIS());
        CustomItemList.Display.set(ItemList.Display.getIS());
        CustomItemList.TitaniumIronPlate.set(ItemList.TitaniumIronPlate.getIS());
        CustomItemList.ReinforcedTitaniumIronPlate.set(ItemList.ReinforcedTitaniumIronPlate.getIS());
        CustomItemList.TungstenIronPlate.set(ItemList.TungstenIronPlate.getIS());
        CustomItemList.ReinforcedTungstenIronPlate.set(ItemList.ReinforcedTungstenIronPlate.getIS());
        CustomItemList.TungstenSteelIronPlate.set(ItemList.TungstenSteeLIronPlate.getIS());
        CustomItemList.ReinforcedTungstenSteelIronPlate.set(ItemList.ReinforcedTungstenSteelIronPlate.getIS());
        CustomItemList.ChromeIronPlate.set(ItemList.ChromeIronPlate.getIS());
        CustomItemList.ReinforcedChromeIronPlate.set(ItemList.ReinforcedChromeIronPlate.getIS());
        CustomItemList.NaquadriaIronPlate.set(ItemList.NaquadriaIronPlate.getIS());
        CustomItemList.ReinforcedNaquadriaIronPlate.set(ItemList.ReinforcedNaquadriaIronPlate.getIS());
        CustomItemList.NeutroniumIronPlate.set(ItemList.NeutroniumIronPlate.getIS());
        CustomItemList.ReinforcedNeutroniumIronPlate.set(ItemList.ReinforcedNeutroniumIronPlate.getIS());
        CustomItemList.BedrockiumIronPlate.set(ItemList.BedrockiumIronPlate.getIS());
        CustomItemList.ReinforcedBedrockiumIronPlate.set(ItemList.ReinforcedBedrockiumIronPlate.getIS());
        CustomItemList.BioBall.set(ItemList.BioBall.getIS());
        CustomItemList.PotassiumHydroxideDust.set(ItemList.PotassiumHydroxideDust.getIS());
        CustomItemList.RadoxPolymerLens.set(ItemList.RadoxPolymerLens.getIS());
        CustomItemList.ChromaticLens.set(ItemList.ChromaticLens.getIS());
        CustomItemList.NanoCircuitOrigin.set(ItemList.NanoCircuitOrigin.getIS());
        CustomItemList.ChevronOrigin.set(ItemList.ChevronOrigin.getIS());
        CustomItemList.FramePartOrigin.set(ItemList.FramePartOrigin.getIS());
        CustomItemList.GatePlateOrigin.set(ItemList.GatePlateOrigin.getIS());
        CustomItemList.PikoCircuitPolychrome.set(ItemList.PikoCircuitPolychrome.getIS());
        CustomItemList.QuantumCircuitPolychrome.set(ItemList.QuantumCircuitPolychrome.getIS());
        CustomItemList.GatePlatePolychrome.set(ItemList.GatePlatePolychrome.getIS());
        CustomItemList.ChevronPolychrome.set(ItemList.ChevronPolychrome.getIS());
        CustomItemList.FramePartPolychrome.set(ItemList.FramePartPolychrome.getIS());
        CustomItemList.PikoCircuitDimensional.set(ItemList.PikoCircuitDimensional.getIS());
        CustomItemList.QuantumCircuitDimensional.set(ItemList.QuantumCircuitDimensional.getIS());
        CustomItemList.GatePlateDimensional.set(ItemList.GatePlateDimensional.getIS());
        CustomItemList.ChevronDimensional.set(ItemList.ChevronDimensional.getIS());
        CustomItemList.FramePartDimensional.set(ItemList.FramePartDimensional.getIS());
        CustomItemList.GatePlateHarmonic.set(ItemList.GatePlateHarmonic.getIS());
        CustomItemList.ChevronHarmonic.set(ItemList.ChevronHarmonic.getIS());
        CustomItemList.FramePartHarmonic.set(ItemList.FramePartHarmonic.getIS());
        CustomItemList.StargateDustAncients.set(ItemList.StargateDustAncients.getIS());
        CustomItemList.StargateCrystalAncients.set(ItemList.StargateCrystalAncients.getIS());
    }

    private void registerTooltips() {
        registerTieredTooltip(CustomItemList.PikoCircuit.get(1), UMV);
        registerTieredTooltip(CustomItemList.QuantumCircuit.get(1), UXV);
        List<ItemStack> origin = Arrays.asList(
                ItemList.ChevronOrigin.getIS(),
                ItemList.FramePartOrigin.getIS(),
                ItemList.GatePlateOrigin.getIS(),
                ItemList.NanoCircuitOrigin.getIS(),
                ItemList.StargateDustAncients.getIS(),
                ItemList.StargateCrystalAncients.getIS());
        List<ItemStack> polychrome = Arrays.asList(
                ItemList.PikoCircuitPolychrome.getIS(),
                ItemList.QuantumCircuitPolychrome.getIS(),
                ItemList.GatePlatePolychrome.getIS(),
                ItemList.ChevronPolychrome.getIS(),
                ItemList.FramePartPolychrome.getIS());
        List<ItemStack> dimensional = Arrays.asList(
                ItemList.PikoCircuitDimensional.getIS(),
                ItemList.QuantumCircuitDimensional.getIS(),
                ItemList.GatePlateDimensional.getIS(),
                ItemList.ChevronDimensional.getIS(),
                ItemList.FramePartDimensional.getIS());
        List<ItemStack> harmonic = Arrays.asList(
                ItemList.GatePlateHarmonic.getIS(),
                ItemList.ChevronHarmonic.getIS(),
                ItemList.FramePartHarmonic.getIS());
        for (ItemStack itemStack : origin) {
            addItemTooltip(
                    itemStack,
                    () -> EnumChatFormatting.YELLOW + StatCollector.translateToLocal("item.Origin.tooltip")
                            + EnumChatFormatting.RESET
                            + EnumChatFormatting.BLUE
                            + " "
                            + StatCollector.translateToLocal("item.Origin.version"));
        }

        for (ItemStack itemStack : polychrome) {
            addItemTooltip(
                    itemStack,
                    () -> EnumChatFormatting.AQUA + StatCollector.translateToLocal("item.Polychrome.tooltip")
                            + EnumChatFormatting.RESET
                            + EnumChatFormatting.BLUE
                            + " "
                            + StatCollector.translateToLocal("item.Polychrome.version"));
        }

        for (ItemStack itemStack : dimensional) {
            addItemTooltip(
                    itemStack,
                    () -> EnumChatFormatting.LIGHT_PURPLE + StatCollector.translateToLocal("item.Dimensional.tooltip")
                            + EnumChatFormatting.RESET
                            + EnumChatFormatting.BLUE
                            + " "
                            + StatCollector.translateToLocal("item.Dimensional.version"));
        }

        for (ItemStack itemStack : harmonic) {
            addItemTooltip(
                    itemStack,
                    () -> EnumChatFormatting.DARK_PURPLE + StatCollector.translateToLocal("item.Harmonic.tooltip")
                            + EnumChatFormatting.RESET
                            + EnumChatFormatting.BLUE
                            + " "
                            + StatCollector.translateToLocal("item.Harmonic.version"));
        }
    }
}
