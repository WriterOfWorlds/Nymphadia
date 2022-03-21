package net.mcreator.nymphadia.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.nymphadia.entity.TorchBlockEntityEntity;

public class TorchBlockEntityRenderer extends MobRenderer<TorchBlockEntityEntity, ChickenModel<TorchBlockEntityEntity>> {
	public TorchBlockEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TorchBlockEntityEntity entity) {
		return new ResourceLocation("nymphadia:textures/steve.png");
	}
}
