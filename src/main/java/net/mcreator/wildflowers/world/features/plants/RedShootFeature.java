
package net.mcreator.wildflowers.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.mcreator.wildflowers.procedures.RedShootAdditionalGenerationConditionProcedure;
import net.mcreator.wildflowers.init.WildflowersModBlocks;

import java.util.Set;
import java.util.List;

public class RedShootFeature extends RandomPatchFeature {
	public static RedShootFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new RedShootFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("wildflowers:red_shoot", FEATURE,
				FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(WildflowersModBlocks.RED_SHOOT.get())), List.of(), 9));
		PLACED_FEATURE = PlacementUtils.register("wildflowers:red_shoot", CONFIGURED_FEATURE, List.of(CountPlacement.of(28), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public RedShootFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!RedShootAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
