package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.material.RubyToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RubySword extends SwordItem {
    public static Settings itemSettings = new Settings();
    
    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
    }

    private static RubySword instance = new RubySword(RubyToolMaterial.instance, 3, -1.0F, getSettings());

    public RubySword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return instance;
    }
}
