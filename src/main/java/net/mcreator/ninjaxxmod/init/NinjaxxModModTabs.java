
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjaxxmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class NinjaxxModModTabs {
	public static CreativeModeTab TAB_NINJAXX_ITEM;

	public static void load() {
		TAB_NINJAXX_ITEM = new CreativeModeTab("tabninjaxx_item") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BLACKSTONE_STAIRS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
