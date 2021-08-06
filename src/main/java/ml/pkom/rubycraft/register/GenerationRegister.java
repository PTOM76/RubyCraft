package ml.pkom.rubycraft.register;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.generation.RubyOre;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class GenerationRegister {
    public static void start() {
        register(RubyOre.GENERATE_RUBY_ORE, "ruby_ore_generation");
    }
    
    public static void register(ConfiguredFeature<?, ?> feature, String id) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, RubyCraft.id(id), feature);
    }
}
