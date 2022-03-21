
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nymphadia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.nymphadia.NymphadiaMod;

public class NymphadiaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NymphadiaMod.MODID);
	public static final RegistryObject<Item> TEST_NYMPH = REGISTRY.register("test_nymph_spawn_egg",
			() -> new ForgeSpawnEggItem(NymphadiaModEntities.TEST_NYMPH, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
