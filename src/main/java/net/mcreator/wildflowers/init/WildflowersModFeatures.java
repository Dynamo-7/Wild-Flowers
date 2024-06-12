
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wildflowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.wildflowers.world.features.plants.TallCallaLillyFeature;
import net.mcreator.wildflowers.world.features.plants.SlimeLilieFeature;
import net.mcreator.wildflowers.world.features.plants.RedShootFeature;
import net.mcreator.wildflowers.world.features.plants.RainbowLillyFeature;
import net.mcreator.wildflowers.world.features.plants.NaturalAncientFernFeature;
import net.mcreator.wildflowers.world.features.plants.MoonFlowerFeature;
import net.mcreator.wildflowers.world.features.plants.FireLillyFeature;
import net.mcreator.wildflowers.world.features.plants.CallaLillyFeature;
import net.mcreator.wildflowers.WildflowersMod;

@Mod.EventBusSubscriber
public class WildflowersModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WildflowersMod.MODID);
	public static final RegistryObject<Feature<?>> CALLA_LILLY = REGISTRY.register("calla_lilly", CallaLillyFeature::feature);
	public static final RegistryObject<Feature<?>> RED_SHOOT = REGISTRY.register("red_shoot", RedShootFeature::feature);
	public static final RegistryObject<Feature<?>> TALL_CALLA_LILLY = REGISTRY.register("tall_calla_lilly", TallCallaLillyFeature::feature);
	public static final RegistryObject<Feature<?>> RAINBOW_LILLY = REGISTRY.register("rainbow_lilly", RainbowLillyFeature::feature);
	public static final RegistryObject<Feature<?>> MOON_FLOWER = REGISTRY.register("moon_flower", MoonFlowerFeature::feature);
	public static final RegistryObject<Feature<?>> SLIME_LILIE = REGISTRY.register("slime_lilie", SlimeLilieFeature::feature);
	public static final RegistryObject<Feature<?>> FIRE_LILLY = REGISTRY.register("fire_lilly", FireLillyFeature::feature);
	public static final RegistryObject<Feature<?>> NATURAL_ANCIENT_FERN = REGISTRY.register("natural_ancient_fern", NaturalAncientFernFeature::feature);
}
