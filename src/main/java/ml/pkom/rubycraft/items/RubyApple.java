package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;

public class RubyApple extends Item {
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
        itemSettings.food(new FoodComponent.Builder().hunger(6).saturationModifier(5F).build());
    }

    public RubyApple(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return new RubyApple(getSettings());
    }
}
