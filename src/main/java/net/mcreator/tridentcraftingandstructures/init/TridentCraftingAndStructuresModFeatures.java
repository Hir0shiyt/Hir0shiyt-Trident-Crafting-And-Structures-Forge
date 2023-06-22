
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tridentcraftingandstructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.tridentcraftingandstructures.world.features.TridentTempleFeature;
import net.mcreator.tridentcraftingandstructures.world.features.OvertakenSeaFortressFeature;
import net.mcreator.tridentcraftingandstructures.world.features.OvergrownTridentFeature;
import net.mcreator.tridentcraftingandstructures.world.features.ForbiddenTridentTempleFeature;
import net.mcreator.tridentcraftingandstructures.world.features.FlyingPrismBoatFeature;
import net.mcreator.tridentcraftingandstructures.world.features.ElderConduitFeature;
import net.mcreator.tridentcraftingandstructures.world.features.AncientTridentFeature;
import net.mcreator.tridentcraftingandstructures.world.features.AbandonedTridentTempleFeature;
import net.mcreator.tridentcraftingandstructures.TridentCraftingAndStructuresMod;

@Mod.EventBusSubscriber
public class TridentCraftingAndStructuresModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TridentCraftingAndStructuresMod.MODID);
	public static final RegistryObject<Feature<?>> OVERGROWN_TRIDENT = REGISTRY.register("overgrown_trident", OvergrownTridentFeature::new);
	public static final RegistryObject<Feature<?>> ELDER_CONDUIT = REGISTRY.register("elder_conduit", ElderConduitFeature::new);
	public static final RegistryObject<Feature<?>> ANCIENT_TRIDENT = REGISTRY.register("ancient_trident", AncientTridentFeature::new);
	public static final RegistryObject<Feature<?>> ABANDONED_TRIDENT_TEMPLE = REGISTRY.register("abandoned_trident_temple", AbandonedTridentTempleFeature::new);
	public static final RegistryObject<Feature<?>> TRIDENT_TEMPLE = REGISTRY.register("trident_temple", TridentTempleFeature::new);
	public static final RegistryObject<Feature<?>> FLYING_PRISM_BOAT = REGISTRY.register("flying_prism_boat", FlyingPrismBoatFeature::new);
	public static final RegistryObject<Feature<?>> OVERTAKEN_SEA_FORTRESS = REGISTRY.register("overtaken_sea_fortress", OvertakenSeaFortressFeature::new);
	public static final RegistryObject<Feature<?>> FORBIDDEN_TRIDENT_TEMPLE = REGISTRY.register("forbidden_trident_temple", ForbiddenTridentTempleFeature::new);
}
