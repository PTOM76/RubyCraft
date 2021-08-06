package ml.pkom.rubycraft.generation;

import ml.pkom.rubycraft.blocks.Blocks;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class RubyOre {
	public static ConfiguredFeature<?, ?> GENERATE_RUBY_ORE = Feature.ORE
    .configure(new OreFeatureConfig(
      OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
      Blocks.RUBY_ORE.getDefaultState(),
      10))
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
      0, 
      4,
      35)))
    .spreadHorizontally()
    .repeat(4);
}
