package net.mcreator.wildflowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import net.mcreator.wildflowers.init.WildflowersModItems;

public class AncientFernExplodedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomNumber = 0;
		ItemStack itemSeed = ItemStack.EMPTY;
		itemSeed = new ItemStack(WildflowersModItems.ANCIENT_FERN_SEEDS.get());
		if (!world.isClientSide()) {
			randomNumber = Math.random();
		}
		if (randomNumber > 0.809 && randomNumber <= 1) {
			for (int index0 = 0; index0 < 3; index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (randomNumber > 0.39 && randomNumber <= 0.809) {
			for (int index1 = 0; index1 < 2; index1++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (randomNumber > 0.076 && randomNumber <= 0.39) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
