package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.blocks.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class CrushingMachine0 extends Item {
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
    }

    public CrushingMachine0(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return new BlockItem(Blocks.CRUSHING_MACHINE0, getSettings());
    }
}
