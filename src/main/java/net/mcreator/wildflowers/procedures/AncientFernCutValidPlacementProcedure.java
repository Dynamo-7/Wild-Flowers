package net.mcreator.wildflowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.wildflowers.init.WildflowersModBlocks;

public class AncientFernCutValidPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.CLAY || (world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.MOSS
				|| WildflowersModBlocks.RED_SHOOT.get().defaultBlockState().canSurvive(world, new BlockPos(x, y - 1, z));
	}
}
