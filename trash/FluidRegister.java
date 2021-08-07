package ml.pkom.rubycraft.register;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.fluids.RubyFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.registry.Registry;

public class FluidRegister {
    public static FlowableFluid STILL_RUBY_FLUID;
    public static FlowableFluid FLOWING_RUBY_FLUID;

    public static void start() {
        STILL_RUBY_FLUID = Registry.register(Registry.FLUID, RubyCraft.id("ruby_fluid"), new RubyFluid.Still());
        FLOWING_RUBY_FLUID = Registry.register(Registry.FLUID, RubyCraft.id("flowing_ruby_fluid"), new RubyFluid.Flowing());
    }
}
