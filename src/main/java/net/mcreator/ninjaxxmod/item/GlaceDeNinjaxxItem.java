
package net.mcreator.ninjaxxmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.ninjaxxmod.init.NinjaxxModModTabs;

public class GlaceDeNinjaxxItem extends Item {
	public GlaceDeNinjaxxItem() {
		super(new Item.Properties().tab(NinjaxxModModTabs.TAB_NINJAXX_ITEM).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.3f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 120;
	}
}
