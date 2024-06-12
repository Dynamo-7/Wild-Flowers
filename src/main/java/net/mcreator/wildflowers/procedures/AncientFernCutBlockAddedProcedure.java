package net.mcreator.wildflowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.wildflowers.init.WildflowersModBlocks;

public class AncientFernCutBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (WildflowersModBlocks.ANCIENT_FERN_TRIMMED_TOP.get().defaultBlockState().canSurvive(world, new BlockPos(x, y + 1, z))) {
			world.setBlock(new BlockPos(x, y + 1, z), WildflowersModBlocks.ANCIENT_FERN_TRIMMED_TOP.get().defaultBlockState(), 3);
		}
	}
}
