
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjaxxmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.ninjaxxmod.item.GlaceDeNinjaxxItem;
import net.mcreator.ninjaxxmod.NinjaxxModMod;

public class NinjaxxModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NinjaxxModMod.MODID);
	public static final RegistryObject<Item> NINJAXX_MOB = REGISTRY.register("ninjaxx_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(NinjaxxModModEntities.NINJAXX_MOB, -10538496, -17543,
					new Item.Properties().tab(NinjaxxModModTabs.TAB_NINJAXX_ITEM)));
	public static final RegistryObject<Item> NINO_MOB = REGISTRY.register("nino_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(NinjaxxModModEntities.NINO_MOB, -15628014, -11719936,
					new Item.Properties().tab(NinjaxxModModTabs.TAB_NINJAXX_ITEM)));
	public static final RegistryObject<Item> GLACE_DE_NINJAXX = REGISTRY.register("glace_de_ninjaxx", () -> new GlaceDeNinjaxxItem());
}
