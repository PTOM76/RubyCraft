package ml.pkom.rubycraft.register;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Supplier;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.blocks.Blocks;
import ml.pkom.rubycraft.entities.CrushingMachineEntity;
import ml.pkom.rubycraft.entities.RubyPipeEntity;
import ml.pkom.rubycraft.entities.RubyStorageEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public class EntitiesRegister {
    public static BlockEntityType<RubyStorageEntity> RUBY_STORAGE_ENTITY;
    public static BlockEntityType<CrushingMachineEntity> CRUSHING_MACHINE;
    public static BlockEntityType<RubyPipeEntity> RUBY_PIPE_ENTITY;

    public static void start() {
        RUBY_STORAGE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, RubyCraft.id("ruby_storage"),
                BlockEntityType.Builder.create(RubyStorageEntity::new, Blocks.RUBY_STORAGE).build(null));
        CRUSHING_MACHINE = Registry.register(Registry.BLOCK_ENTITY_TYPE, RubyCraft.id("crushing_machine"),
                BlockEntityType.Builder.create(CrushingMachineEntity::new, Blocks.CRUSHING_MACHINE).build(null));
        RUBY_PIPE_ENTITY = createTile(RubyPipeEntity::new, Blocks.RUBY_PIPE);
        registerTile(RUBY_PIPE_ENTITY, "ruby_pipe");
    }

    private static <T extends BlockEntity> BlockEntityType<T> createTile(Supplier<T> supplier, Block blocks) {
        return new BlockEntityType<>(supplier, new HashSet<>(Arrays.asList(blocks)), null);
    }

    private static void registerTile(BlockEntityType<?> type, String name) {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, RubyCraft.id(name), type);
    }
}
