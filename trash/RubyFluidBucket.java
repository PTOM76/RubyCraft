package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class RubyFluidBucket extends Item {
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
        itemSettings.maxCount(1);
        itemSettings.recipeRemainder(Items.BUCKET);
    }

    public RubyFluidBucket(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return new RubyFluidBucket(getSettings());
    }
}
