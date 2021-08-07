package ml.pkom.rubycraft.blocks;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.register.FluidRegister;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.util.registry.Registry;

public class RubyFluidBlock {
    public static Block newBlock() {
        return Registry.register(Registry.BLOCK, RubyCraft.id("ruby_fluid"), new FluidBlock(FluidRegister.STILL_RUBY_FLUID, FabricBlockSettings.copy(Blocks.WATER)){});
        // return new RubyFluidBlock(FluidRegister.STILL_RUBY_FLUID, getSettings());
    }
}
