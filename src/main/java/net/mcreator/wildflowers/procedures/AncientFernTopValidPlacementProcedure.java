package net.mcreator.wildflowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.wildflowers.init.WildflowersModBlocks;

public class AncientFernTopValidPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == WildflowersModBlocks.ANCIENT_FERN.get();
	}
}
