
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nymphadia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.nymphadia.potion.FreshAirMobEffect;
import net.mcreator.nymphadia.NymphadiaMod;

public class NymphadiaModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NymphadiaMod.MODID);
	public static final RegistryObject<MobEffect> FRESH_AIR = REGISTRY.register("fresh_air", () -> new FreshAirMobEffect());
}
