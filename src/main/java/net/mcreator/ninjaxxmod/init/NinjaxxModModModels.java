
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjaxxmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ninjaxxmod.client.model.Modelmodified_alex;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NinjaxxModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmodified_alex.LAYER_LOCATION, Modelmodified_alex::createBodyLayer);
	}
}
