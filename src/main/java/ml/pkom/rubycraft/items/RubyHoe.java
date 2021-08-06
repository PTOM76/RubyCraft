package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.material.RubyToolMaterial;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class RubyHoe extends HoeItem {
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
    }

    private static RubyHoe instance = new RubyHoe(RubyToolMaterial.instance, 0, -3.0F, getSettings());

    public RubyHoe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return instance;
    }
}
