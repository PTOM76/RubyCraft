package ml.pkom.rubycraft.items;

import me.crimsondawn45.fabricshieldlib.lib.object.FabricShield;
import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.Tags;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;

public class RubyShield extends FabricShield {
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
    }

    public RubyShield(Settings settings, int cooldownTicks, int durability, int enchantability, Tag.Identified<Item> repairItemTag) {
        super(settings, cooldownTicks, durability, enchantability, repairItemTag);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return new RubyShield(getSettings(), 8, 2000, 15, (Tag.Identified) Tags.RUBY_INGOTS);
    }
}
