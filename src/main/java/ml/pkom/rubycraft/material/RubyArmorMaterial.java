package ml.pkom.rubycraft.material;

import ml.pkom.rubycraft.Tags;
import ml.pkom.rubycraft.items.Items;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class RubyArmorMaterial implements ArmorMaterial {

    public static RubyArmorMaterial instance = new RubyArmorMaterial();

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {4, 7, 6, 4};
 
    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 30;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.fromTag(Tags.RUBY_INGOTS);
    }

    @Override
    public String getName() {
        return "ruby";
    }

    @Override
    public float getToughness() {
        return 0.3F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
    
}
