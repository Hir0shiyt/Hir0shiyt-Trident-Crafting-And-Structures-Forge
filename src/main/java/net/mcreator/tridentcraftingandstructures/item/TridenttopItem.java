
package net.mcreator.tridentcraftingandstructures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.tridentcraftingandstructures.TridentCraftingAndStructuresModElements;

@TridentCraftingAndStructuresModElements.ModElement.Tag
public class TridenttopItem extends TridentCraftingAndStructuresModElements.ModElement {
	@ObjectHolder("trident_crafting_and_structures:tridenttop")
	public static final Item block = null;

	public TridenttopItem(TridentCraftingAndStructuresModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(1).rarity(Rarity.UNCOMMON));
			setRegistryName("tridenttop");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}
	}
}
