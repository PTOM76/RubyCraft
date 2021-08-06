package ml.pkom.rubycraft.material;

import ml.pkom.rubycraft.items.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyToolMaterial implements ToolMaterial {

    public static RubyToolMaterial instance = new RubyToolMaterial();

    @Override
    public int getDurability() {
        return 1250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.5F;
    }

    @Override
    public float getAttackDamage() {
        return 5F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.RUBY);
    }
    
}
