package net.mcreator.wildflowers.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.wildflowers.init.WildflowersModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AncientFernTrimmedTopDestroyedProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == WildflowersModBlocks.ANCIENT_FERN_TRIMMED.get()) {
			world.destroyBlock(new BlockPos(x, y - 1, z), false);
		}
	}
}
