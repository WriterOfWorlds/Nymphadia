package net.mcreator.nymphadia.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.nymphadia.init.NymphadiaModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ActivateBuffProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.canSeeSkyFromBelowWater(new BlockPos((int) x, (int) y, (int) z))) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(NymphadiaModMobEffects.FRESH_AIR.get(), 10000000, 0, (true), (false)));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(NymphadiaModMobEffects.FRESH_AIR.get());
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						(("attribute " + entity.getDisplayName().getString()) + " minecraft:generic.movement_speed base set .1"));
		}
	}
}
