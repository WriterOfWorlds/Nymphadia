
package net.mcreator.nymphadia.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.nymphadia.procedures.TreeBuffProcedure;

public class FreshAirMobEffect extends MobEffect {
	public FreshAirMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -2033673);
	}

	@Override
	public String getDescriptionId() {
		return "effect.nymphadia.fresh_air";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TreeBuffProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
