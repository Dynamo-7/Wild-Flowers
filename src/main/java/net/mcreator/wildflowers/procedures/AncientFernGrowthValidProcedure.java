package net.mcreator.wildflowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AncientFernGrowthValidProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getMaxLocalRawBrightness(new BlockPos(x, y + 0.5, z)) >= 5 && world.getMaxLocalRawBrightness(new BlockPos(x, y + 0.5, z)) <= 8 && !world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))
				&& (world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("wild:farmland")))
				&& ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.WATER
						|| (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.WATER
						|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.WATER
						|| (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.WATER
						|| (world.getBlockState(new BlockPos(x, y - 2, z))).getMaterial() == net.minecraft.world.level.material.Material.WATER);
	}
}
