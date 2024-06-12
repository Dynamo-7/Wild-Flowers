package net.mcreator.wildflowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.wildflowers.init.WildflowersModBlocks;

public class AncientFernBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), WildflowersModBlocks.ANCIENT_FERN_TOP.get().defaultBlockState(), 3);
	}
}
