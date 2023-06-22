
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tridentcraftingandstructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.tridentcraftingandstructures.item.TridentHandleItem;
import net.mcreator.tridentcraftingandstructures.item.TridentForkItem;
import net.mcreator.tridentcraftingandstructures.TridentCraftingAndStructuresMod;

public class TridentCraftingAndStructuresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TridentCraftingAndStructuresMod.MODID);
	public static final RegistryObject<Item> TRIDENT_FORK = REGISTRY.register("trident_fork", () -> new TridentForkItem());
	public static final RegistryObject<Item> TRIDENT_HANDLE = REGISTRY.register("trident_handle", () -> new TridentHandleItem());
}
