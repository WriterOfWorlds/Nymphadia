package net.mcreator.nymphadia.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TorchBlockEntityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rand = 0;
		double ex = 0;
		double zee = 0;
		rand = Math.round(Math.random() * 1000);
		if (rand == 5) {
			ex = Math.round(Math.random());
			if (world.isEmptyBlock(new BlockPos((int) (x + ex), (int) y, (int) z))
					&& !world.isEmptyBlock(new BlockPos((int) (x + ex), (int) (y - 1), (int) z))) {
				zee = Math.round(Math.random());
				if (world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z + zee)))
						&& !world.isEmptyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + zee)))) {
					world.setBlock(new BlockPos((int) (x + ex), (int) y, (int) (z + zee)), Blocks.FIRE.defaultBlockState(), 3);
				}
			}
		}
	}
}
