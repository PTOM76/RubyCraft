package ml.pkom.rubycraft.guis;

import java.util.Map;

import com.google.common.collect.Maps;

import ml.pkom.rubycraft.classes.CrushableInfo;
import ml.pkom.rubycraft.items.Items;
import ml.pkom.rubycraft.register.ScreenHandlerRegister;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class CrushingMachineScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    public static Map<Item, CrushableInfo> crushableItems = Maps.newLinkedHashMap();
    public static boolean insertedFuel = false;
    public static boolean insertedItem = false;

    static {
        crushableItems.put(Items.RUBY, CrushableInfo.create(250, new ItemStack(Items.RUBY_DUST, 1)));
        crushableItems.put(Items.RUBY_INGOT, CrushableInfo.create(250, new ItemStack(Items.RUBY_DUST, 1)));
        crushableItems.put(Items.RUBY_ORE, CrushableInfo.create(250, new ItemStack(Items.RUBY_DUST, 3)));
    }

    public CrushingMachineScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(3));
    }

    public CrushingMachineScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(ScreenHandlerRegister.CRUSHING_MACHINE_SCREEN_HANDLER, syncId);
        checkSize(inventory, 3);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);
        this.addSlot(new Slot(inventory, 0, 56, 17));
        this.addSlot(new Slot(inventory, 1, 56 ,53));
        this.addSlot(new Slot(inventory, 2, 116, 35));
        int m;
        int l;
        for (m = 0; m < 3; ++m) {
            for (l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + m * 9 + 9, 8 + l * 18, 84 + m * 18));
            }
        }
        for (m = 0; m < 9; ++m) {
            this.addSlot(new Slot(playerInventory, m, 8 + m * 18, 142));
        }
        //addListener(new CrushingMachineGuiListener());
    }
 
    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    public static boolean isFuel(ItemStack itemStack) {
        return AbstractFurnaceBlockEntity.canUseAsFuel(itemStack);
    }

    public static boolean isCrushable(ItemStack itemStack) {
        return crushableItems.containsKey(itemStack.getItem());
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = slots.get(index);
        if (slot != null && slot.hasStack()) {
           ItemStack itemStack2 = slot.getStack();
           itemStack = itemStack2.copy();
           if (index == 2) {
              if (!this.insertItem(itemStack2, 3, 39, true)) {
                 return ItemStack.EMPTY;
              }
              slot.onStackChanged(itemStack2, itemStack);
           } else if (index != 1 && index != 0) {
              if (isCrushable(itemStack2)) {
                 if (!this.insertItem(itemStack2, 0, 1, false)) {
                    return ItemStack.EMPTY;
                 }
              } else if (isFuel(itemStack2)) {
                 if (!this.insertItem(itemStack2, 1, 2, false)) {
                    return ItemStack.EMPTY;
                 }
              } else if (index >= 3 && index < 30) {
                 if (!this.insertItem(itemStack2, 30, 39, false)) {
                    return ItemStack.EMPTY;
                 }
              } else if (index >= 30 && index < 39 && !this.insertItem(itemStack2, 3, 30, false)) {
                 return ItemStack.EMPTY;
              }
           } else if (!this.insertItem(itemStack2, 3, 39, false)) {
              return ItemStack.EMPTY;
           }
  
           if (itemStack2.isEmpty()) {
              slot.setStack(ItemStack.EMPTY);
           } else {
              slot.markDirty();
           }
  
           if (itemStack2.getCount() == itemStack.getCount()) {
              return ItemStack.EMPTY;
           }
  
           slot.onTakeItem(player, itemStack2);
        }
  
        return itemStack;
     }
}