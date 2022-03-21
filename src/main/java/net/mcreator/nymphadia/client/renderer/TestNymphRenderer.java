package net.mcreator.nymphadia.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.nymphadia.entity.TestNymphEntity;
import net.mcreator.nymphadia.client.model.Modelnymph;

public class TestNymphRenderer extends MobRenderer<TestNymphEntity, Modelnymph<TestNymphEntity>> {
	public TestNymphRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnymph(context.bakeLayer(Modelnymph.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TestNymphEntity entity) {
		return new ResourceLocation("nymphadia:textures/nymphtexture.png");
	}
}
