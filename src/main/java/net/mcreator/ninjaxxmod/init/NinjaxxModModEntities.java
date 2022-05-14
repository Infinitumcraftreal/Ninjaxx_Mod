
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjaxxmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ninjaxxmod.entity.NinoMobEntity;
import net.mcreator.ninjaxxmod.entity.NinjaxxMobEntity;
import net.mcreator.ninjaxxmod.NinjaxxModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NinjaxxModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, NinjaxxModMod.MODID);
	public static final RegistryObject<EntityType<NinjaxxMobEntity>> NINJAXX_MOB = register("ninjaxx_mob",
			EntityType.Builder.<NinjaxxMobEntity>of(NinjaxxMobEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(30).setUpdateInterval(3).setCustomClientFactory(NinjaxxMobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NinoMobEntity>> NINO_MOB = register("nino_mob",
			EntityType.Builder.<NinoMobEntity>of(NinoMobEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(30)
					.setUpdateInterval(3).setCustomClientFactory(NinoMobEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NinjaxxMobEntity.init();
			NinoMobEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NINJAXX_MOB.get(), NinjaxxMobEntity.createAttributes().build());
		event.put(NINO_MOB.get(), NinoMobEntity.createAttributes().build());
	}
}
