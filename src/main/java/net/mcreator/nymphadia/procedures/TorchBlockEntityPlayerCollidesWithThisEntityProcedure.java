package net.mcreator.nymphadia.procedures;

import net.minecraft.world.entity.Entity;

public class TorchBlockEntityPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.setSecondsOnFire(15);
	}
}
