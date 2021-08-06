package ml.pkom.rubycraft.items;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.material.RubyArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class RubyBoots extends ArmorItem{
    public static Settings itemSettings = new Settings();

    static {
        itemSettings.group(RubyCraft.RUBY_GROUP);
    }

    private static RubyBoots instance = new RubyBoots(RubyArmorMaterial.instance, EquipmentSlot.FEET, getSettings());

    public RubyBoots(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    public static Settings getSettings() {
        return itemSettings;
    }

    public static Item newItem() {
        return instance;
    }
}
