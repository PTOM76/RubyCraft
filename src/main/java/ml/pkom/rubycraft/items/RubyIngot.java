package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import net.minecraft.item.Item;

public class RubyIngot extends Item {
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
    }

    public RubyIngot(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return new RubyIngot(getSettings());
    }
}
