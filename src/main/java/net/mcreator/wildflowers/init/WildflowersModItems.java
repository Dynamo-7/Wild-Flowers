
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wildflowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wildflowers.item.UnfiredPotItem;
import net.mcreator.wildflowers.item.MoonFlowerPetalsItem;
import net.mcreator.wildflowers.item.FireLillyPedalsItem;
import net.mcreator.wildflowers.item.AncientFernSeedsItem;
import net.mcreator.wildflowers.WildflowersMod;

public class WildflowersModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WildflowersMod.MODID);
	public static final RegistryObject<Item> CALLA_LILLY = block(WildflowersModBlocks.CALLA_LILLY, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RED_SHOOT = doubleBlock(WildflowersModBlocks.RED_SHOOT, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TALL_CALLA_LILLY = doubleBlock(WildflowersModBlocks.TALL_CALLA_LILLY, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RAINBOW_LILLY = block(WildflowersModBlocks.RAINBOW_LILLY, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOON_FLOWER = doubleBlock(WildflowersModBlocks.MOON_FLOWER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOON_FLOWER_PETALS = REGISTRY.register("moon_flower_petals", () -> new MoonFlowerPetalsItem());
	public static final RegistryObject<Item> SLIME_LILIE = block(WildflowersModBlocks.SLIME_LILIE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FIRE_LILLY = doubleBlock(WildflowersModBlocks.FIRE_LILLY, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FIRE_LILLY_PEDALS = REGISTRY.register("fire_lilly_pedals", () -> new FireLillyPedalsItem());
	public static final RegistryObject<Item> ANCIENT_FERN_STAGE_0 = block(WildflowersModBlocks.ANCIENT_FERN_STAGE_0, null);
	public static final RegistryObject<Item> ANCIENT_FERN_STAGE_1 = block(WildflowersModBlocks.ANCIENT_FERN_STAGE_1, null);
	public static final RegistryObject<Item> ANCIENT_FERN_STAGE_2 = block(WildflowersModBlocks.ANCIENT_FERN_STAGE_2, null);
	public static final RegistryObject<Item> ANCIENT_FERN_SEEDS = REGISTRY.register("ancient_fern_seeds", () -> new AncientFernSeedsItem());
	public static final RegistryObject<Item> NATURAL_ANCIENT_FERN = doubleBlock(WildflowersModBlocks.NATURAL_ANCIENT_FERN, null);
	public static final RegistryObject<Item> ANCIENT_FERN_STAGE_3 = block(WildflowersModBlocks.ANCIENT_FERN_STAGE_3, null);
	public static final RegistryObject<Item> ANCIENT_FERN = block(WildflowersModBlocks.ANCIENT_FERN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ANCIENT_FERN_TOP = block(WildflowersModBlocks.ANCIENT_FERN_TOP, null);
	public static final RegistryObject<Item> ANCIENT_FERN_TRIMMED = block(WildflowersModBlocks.ANCIENT_FERN_TRIMMED, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ANCIENT_FERN_TRIMMED_TOP = block(WildflowersModBlocks.ANCIENT_FERN_TRIMMED_TOP, null);
	public static final RegistryObject<Item> ANCIENT_FERN_CUT = block(WildflowersModBlocks.ANCIENT_FERN_CUT, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FLOWER_POT = block(WildflowersModBlocks.FLOWER_POT, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> UNFIRED_POT = REGISTRY.register("unfired_pot", () -> new UnfiredPotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
