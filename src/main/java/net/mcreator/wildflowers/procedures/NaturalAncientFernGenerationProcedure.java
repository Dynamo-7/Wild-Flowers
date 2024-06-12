package net.mcreator.wildflowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class NaturalAncientFernGenerationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && y <= 15 && ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.CLAY
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.MOSS);
	}
}
