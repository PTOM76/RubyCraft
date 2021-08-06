package ml.pkom.rubycraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class RubyOre extends Block {
    public static FabricBlockSettings blockSettings = FabricBlockSettings.of(Material.STONE);

    static {
        blockSettings.strength(3.0F);
        blockSettings.breakByTool(FabricToolTags.PICKAXES, 2);
        blockSettings.requiresTool();
    }

    public RubyOre(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return blockSettings;
    }

    public static Block newBlock() {
        return new RubyOre(getSettings());
    }
}
