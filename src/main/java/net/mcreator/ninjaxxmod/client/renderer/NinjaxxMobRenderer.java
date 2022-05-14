
package net.mcreator.ninjaxxmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ninjaxxmod.entity.NinjaxxMobEntity;
import net.mcreator.ninjaxxmod.client.model.Modelmodified_alex;

public class NinjaxxMobRenderer extends MobRenderer<NinjaxxMobEntity, Modelmodified_alex<NinjaxxMobEntity>> {
	public NinjaxxMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodified_alex(context.bakeLayer(Modelmodified_alex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NinjaxxMobEntity entity) {
		return new ResourceLocation("ninjaxx_mod:textures/ninjaxx_texture.png");
	}
}
