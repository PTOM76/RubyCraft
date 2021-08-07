package ml.pkom.rubycraft.fluids;

import ml.pkom.rubycraft.blocks.Blocks;
import ml.pkom.rubycraft.items.Items;
import ml.pkom.rubycraft.register.FluidRegister;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public abstract class RubyFluid extends AbstractFluid {
    @Override
    public Fluid getStill() {
        return FluidRegister.STILL_RUBY_FLUID;
    }

    @Override
    public Fluid getFlowing() {
        return FluidRegister.FLOWING_RUBY_FLUID;
    }

    @Override
    public Item getBucketItem() {
        return Items.RUBY_FLUID_BUCKET;
    }

    /*
    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return Blocks.RUBY_FLUID.getDefaultState().with(Properties.LEVEL_15, method_15741(fluidState));
    }
    */

    public static class Flowing extends RubyFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends RubyFluid {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
