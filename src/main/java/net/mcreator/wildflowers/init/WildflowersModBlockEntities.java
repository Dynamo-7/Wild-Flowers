
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wildflowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.wildflowers.block.entity.AncientFernStage3BlockEntity;
import net.mcreator.wildflowers.block.entity.AncientFernStage2BlockEntity;
import net.mcreator.wildflowers.block.entity.AncientFernStage1BlockEntity;
import net.mcreator.wildflowers.block.entity.AncientFernStage0BlockEntity;
import net.mcreator.wildflowers.WildflowersMod;

public class WildflowersModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WildflowersMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ANCIENT_FERN_STAGE_0 = register("ancient_fern_stage_0", WildflowersModBlocks.ANCIENT_FERN_STAGE_0, AncientFernStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ANCIENT_FERN_STAGE_1 = register("ancient_fern_stage_1", WildflowersModBlocks.ANCIENT_FERN_STAGE_1, AncientFernStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ANCIENT_FERN_STAGE_2 = register("ancient_fern_stage_2", WildflowersModBlocks.ANCIENT_FERN_STAGE_2, AncientFernStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ANCIENT_FERN_STAGE_3 = register("ancient_fern_stage_3", WildflowersModBlocks.ANCIENT_FERN_STAGE_3, AncientFernStage3BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
