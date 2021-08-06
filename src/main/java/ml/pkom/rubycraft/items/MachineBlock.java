package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.blocks.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class MachineBlock extends Item {
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
    }

    public MachineBlock(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return new BlockItem(Blocks.MACHINE_BLOCK, getSettings());
    }
}
