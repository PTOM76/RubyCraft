package ml.pkom.rubycraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class RubyBlock extends Block {
    public static FabricBlockSettings blockSettings = FabricBlockSettings.of(Material.METAL);

    static {
        blockSettings.strength(5.0F, 6.0F);
        blockSettings.breakByTool(FabricToolTags.PICKAXES, 2);
        blockSettings.requiresTool();
        blockSettings.sounds(BlockSoundGroup.METAL);
    }

    public RubyBlock(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return blockSettings;
    }

    public static Block newBlock() {
        return new RubyBlock(getSettings());
    }
}
