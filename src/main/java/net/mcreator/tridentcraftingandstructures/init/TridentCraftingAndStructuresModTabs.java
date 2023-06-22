
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tridentcraftingandstructures.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TridentCraftingAndStructuresModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TridentCraftingAndStructuresModItems.TRIDENT_FORK.get());
			tabData.accept(TridentCraftingAndStructuresModItems.TRIDENT_HANDLE.get());
		}
	}
}
