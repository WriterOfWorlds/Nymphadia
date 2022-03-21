
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nymphadia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.nymphadia.client.renderer.TorchBlockEntityRenderer;
import net.mcreator.nymphadia.client.renderer.TestNymphRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NymphadiaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NymphadiaModEntities.TORCH_BLOCK_ENTITY.get(), TorchBlockEntityRenderer::new);
		event.registerEntityRenderer(NymphadiaModEntities.TEST_NYMPH.get(), TestNymphRenderer::new);
	}
}
