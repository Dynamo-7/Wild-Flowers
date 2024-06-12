package net.mcreator.wildflowers.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.wildflowers.init.WildflowersModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TrimmingAncientTrimmedFernProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS && !entity.isShiftKeyDown()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildflowersModBlocks.ANCIENT_FERN_TRIMMED_TOP.get() && (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == WildflowersModBlocks.ANCIENT_FERN_TRIMMED.get()) {
				world.setBlock(new BlockPos(x, y - 1, z), WildflowersModBlocks.ANCIENT_FERN_CUT.get().defaultBlockState(), 3);
				world.destroyBlock(new BlockPos(x, y, z), false);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
		}
	}
}
