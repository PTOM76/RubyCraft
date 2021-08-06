package ml.pkom.rubycraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class MachineBlock extends Block {
    public static FabricBlockSettings blockSettings = FabricBlockSettings.of(Material.METAL);

    static {
        blockSettings.strength(3.5F, 6.0F);
        blockSettings.breakByTool(FabricToolTags.PICKAXES, 2);
        blockSettings.requiresTool();
        blockSettings.sounds(BlockSoundGroup.METAL);
    }

    public MachineBlock(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return blockSettings;
    }

    public static Block newBlock() {
        return new MachineBlock(getSettings());
    }
}
