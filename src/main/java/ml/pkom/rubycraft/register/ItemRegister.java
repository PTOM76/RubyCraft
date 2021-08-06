package ml.pkom.rubycraft.register;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.items.Items;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemRegister {
    public static void start() {
        register(Items.RUBY, "ruby");
        register(Items.RUBY_BLOCK, "ruby_block");
        register(Items.RUBY_BLOCK_V2, "polished_ruby_block");
        register(Items.RUBY_ORE, "ruby_ore");
        register(Items.RUBY_DUST, "ruby_dust");
        register(Items.RUBY_INGOT, "ruby_ingot");
        register(Items.RUBY_NUGGET, "ruby_nugget");
        register(Items.RUBY_PEARL, "ruby_pearl");
        register(Items.RUBY_CANE, "ruby_cane");
        register(Items.RUBY_SWORD, "ruby_sword");
        register(Items.RUBY_AXE, "ruby_axe");
        register(Items.RUBY_PICKAXE, "ruby_pickaxe");
        register(Items.RUBY_SHOVEL, "ruby_shovel");
        register(Items.RUBY_HOE, "ruby_hoe");
        register(Items.RUBY_HELMET, "ruby_helmet");
        register(Items.RUBY_CHESTPLATE, "ruby_chestplate");
        register(Items.RUBY_LEGGINGS, "ruby_leggings");
        register(Items.RUBY_BOOTS, "ruby_boots");
        register(Items.RUBY_STORAGE, "ruby_storage");
        register(Items.RUBY_GEAR, "ruby_gear");
        register(Items.MACHINE_BLOCK, "machine_block");
        register(Items.CRUSHING_MACHINE0, "crushing_machine0");
        register(Items.CRUSHING_MACHINE, "crushing_machine");
        register(Items.RUBY_PIPE, "ruby_pipe");
    }

    public static void register(Item item, String id) {
        Registry.register(Registry.ITEM, RubyCraft.id(id), item);
    }
}
