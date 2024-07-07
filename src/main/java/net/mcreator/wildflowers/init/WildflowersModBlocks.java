
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wildflowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.wildflowers.block.TallCallaLillyBlock;
import net.mcreator.wildflowers.block.SlimeLilieBlock;
import net.mcreator.wildflowers.block.RedShootBlock;
import net.mcreator.wildflowers.block.RainbowLillyBlock;
import net.mcreator.wildflowers.block.NaturalAncientFernBlock;
import net.mcreator.wildflowers.block.MoonFlowerBlock;
import net.mcreator.wildflowers.block.FlowerPotBlock;
import net.mcreator.wildflowers.block.FireLillyBlock;
import net.mcreator.wildflowers.block.CallaLillyBlock;
import net.mcreator.wildflowers.block.AncientFernTrimmedTopBlock;
import net.mcreator.wildflowers.block.AncientFernTrimmedBlock;
import net.mcreator.wildflowers.block.AncientFernTopBlock;
import net.mcreator.wildflowers.block.AncientFernStage3Block;
import net.mcreator.wildflowers.block.AncientFernStage2Block;
import net.mcreator.wildflowers.block.AncientFernStage1Block;
import net.mcreator.wildflowers.block.AncientFernStage0Block;
import net.mcreator.wildflowers.block.AncientFernCutBlock;
import net.mcreator.wildflowers.block.AncientFernBlock;
import net.mcreator.wildflowers.WildflowersMod;

public class WildflowersModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WildflowersMod.MODID);
	public static final RegistryObject<Block> CALLA_LILLY = REGISTRY.register("calla_lilly", () -> new CallaLillyBlock());
	public static final RegistryObject<Block> RED_SHOOT = REGISTRY.register("red_shoot", () -> new RedShootBlock());
	public static final RegistryObject<Block> TALL_CALLA_LILLY = REGISTRY.register("tall_calla_lilly", () -> new TallCallaLillyBlock());
	public static final RegistryObject<Block> RAINBOW_LILLY = REGISTRY.register("rainbow_lilly", () -> new RainbowLillyBlock());
	public static final RegistryObject<Block> MOON_FLOWER = REGISTRY.register("moon_flower", () -> new MoonFlowerBlock());
	public static final RegistryObject<Block> SLIME_LILIE = REGISTRY.register("slime_lilie", () -> new SlimeLilieBlock());
	public static final RegistryObject<Block> FIRE_LILLY = REGISTRY.register("fire_lilly", () -> new FireLillyBlock());
	public static final RegistryObject<Block> ANCIENT_FERN_STAGE_0 = REGISTRY.register("ancient_fern_stage_0", () -> new AncientFernStage0Block());
	public static final RegistryObject<Block> ANCIENT_FERN_STAGE_1 = REGISTRY.register("ancient_fern_stage_1", () -> new AncientFernStage1Block());
	public static final RegistryObject<Block> ANCIENT_FERN_STAGE_2 = REGISTRY.register("ancient_fern_stage_2", () -> new AncientFernStage2Block());
	public static final RegistryObject<Block> NATURAL_ANCIENT_FERN = REGISTRY.register("natural_ancient_fern", () -> new NaturalAncientFernBlock());
	public static final RegistryObject<Block> ANCIENT_FERN_STAGE_3 = REGISTRY.register("ancient_fern_stage_3", () -> new AncientFernStage3Block());
	public static final RegistryObject<Block> ANCIENT_FERN = REGISTRY.register("ancient_fern", () -> new AncientFernBlock());
	public static final RegistryObject<Block> ANCIENT_FERN_TOP = REGISTRY.register("ancient_fern_top", () -> new AncientFernTopBlock());
	public static final RegistryObject<Block> ANCIENT_FERN_TRIMMED = REGISTRY.register("ancient_fern_trimmed", () -> new AncientFernTrimmedBlock());
	public static final RegistryObject<Block> ANCIENT_FERN_TRIMMED_TOP = REGISTRY.register("ancient_fern_trimmed_top", () -> new AncientFernTrimmedTopBlock());
	public static final RegistryObject<Block> ANCIENT_FERN_CUT = REGISTRY.register("ancient_fern_cut", () -> new AncientFernCutBlock());
	public static final RegistryObject<Block> FLOWER_POT = REGISTRY.register("flower_pot", () -> new FlowerPotBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			SlimeLilieBlock.blockColorLoad(event);
		}
	}
}
