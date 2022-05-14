
package net.mcreator.ninjaxxmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ninjaxxmod.entity.NinoMobEntity;
import net.mcreator.ninjaxxmod.client.model.Modelmodified_alex;

public class NinoMobRenderer extends MobRenderer<NinoMobEntity, Modelmodified_alex<NinoMobEntity>> {
	public NinoMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodified_alex(context.bakeLayer(Modelmodified_alex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NinoMobEntity entity) {
		return new ResourceLocation("ninjaxx_mod:textures/alex.png");
	}
}
