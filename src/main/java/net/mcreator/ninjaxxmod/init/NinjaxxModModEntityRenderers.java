
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjaxxmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ninjaxxmod.client.renderer.NinoMobRenderer;
import net.mcreator.ninjaxxmod.client.renderer.NinjaxxMobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NinjaxxModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NinjaxxModModEntities.NINJAXX_MOB.get(), NinjaxxMobRenderer::new);
		event.registerEntityRenderer(NinjaxxModModEntities.NINO_MOB.get(), NinoMobRenderer::new);
	}
}
