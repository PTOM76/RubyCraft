package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import net.minecraft.item.Item;

public class RubyGear extends Item {
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
    }

    public RubyGear(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return new RubyGear(getSettings());
    }
}
