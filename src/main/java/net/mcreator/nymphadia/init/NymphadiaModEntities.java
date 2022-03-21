
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nymphadia.init;

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

import net.mcreator.nymphadia.entity.TorchBlockEntityEntity;
import net.mcreator.nymphadia.NymphadiaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NymphadiaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, NymphadiaMod.MODID);
	public static final RegistryObject<EntityType<TorchBlockEntityEntity>> TORCH_BLOCK_ENTITY = register("torch_block_entity",
			EntityType.Builder.<TorchBlockEntityEntity>of(TorchBlockEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(TorchBlockEntityEntity::new).fireImmune().sized(0.4f, 0.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TorchBlockEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TORCH_BLOCK_ENTITY.get(), TorchBlockEntityEntity.createAttributes().build());
	}
}
