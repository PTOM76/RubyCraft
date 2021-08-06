package ml.pkom.rubycraft.register;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class BlockRegister {
    public static void start() {
        register(Blocks.RUBY_BLOCK, "ruby_block");
        register(Blocks.RUBY_ORE, "ruby_ore");
        register(Blocks.RUBY_BLOCK_V2, "polished_ruby_block");
        register(Blocks.CRUSHING_MACHINE, "crushing_machine");
        register(Blocks.CRUSHING_MACHINE0, "crushing_machine0");
        register(Blocks.MACHINE_BLOCK, "machine_block");
        register(Blocks.RUBY_STORAGE, "ruby_storage");
        register(Blocks.RUBY_PIPE, "ruby_pipe");
    }

    public static void register(Block block, String id) {
        Registry.register(Registry.BLOCK, RubyCraft.id(id), block);
    }
}
