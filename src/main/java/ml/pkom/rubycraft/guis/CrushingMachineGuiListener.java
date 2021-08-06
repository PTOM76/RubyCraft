package ml.pkom.rubycraft.guis;

import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerListener;
import net.minecraft.util.collection.DefaultedList;

public class CrushingMachineGuiListener implements ScreenHandlerListener {

    @Override
    public void onHandlerRegistered(ScreenHandler handler, DefaultedList<ItemStack> stacks) {

    }

    @Override
    public void onSlotUpdate(ScreenHandler handler, int slotId, ItemStack stack) {
        if (slotId == 1) {
            if (CrushingMachineScreenHandler.isFuel(stack)) {
                CrushingMachineScreenHandler.insertedFuel = true;
            } else {
                CrushingMachineScreenHandler.insertedFuel = false;

            }
        }
        if (slotId == 0) {
            if (CrushingMachineScreenHandler.isCrushable(stack)) {
                CrushingMachineScreenHandler.insertedItem = true;
            } else {
                CrushingMachineScreenHandler.insertedItem = false;
            }
        }
        if (CrushingMachineScreenHandler.insertedFuel == true && CrushingMachineScreenHandler.insertedItem) {
            if (handler.getSlot(2).getStack() == ItemStack.EMPTY) {
                handler.setStackInSlot(2, CrushingMachineScreenHandler.crushableItems.get(handler.getSlot(0).getStack().getItem()).crushedItemStack);
                handler.setStackInSlot(0, new ItemStack(handler.getSlot(0).getStack().getItem(), handler.getSlot(0).getStack().getCount() - 1));
                handler.setStackInSlot(1, new ItemStack(handler.getSlot(1).getStack().getItem(), handler.getSlot(1).getStack().getCount() - 1));
                return;
            }
            if (handler.getSlot(2).getStack().getItem() == CrushingMachineScreenHandler.crushableItems.get(handler.getSlot(0).getStack().getItem()).crushedItemStack.getItem()) {
                handler.setStackInSlot(2, new ItemStack(CrushingMachineScreenHandler.crushableItems.get(handler.getSlot(0).getStack().getItem()).crushedItemStack.getItem(), CrushingMachineScreenHandler.crushableItems.get(handler.getSlot(0).getStack().getItem()).crushedItemStack.getCount() + handler.getSlot(2).getStack().getCount()));
                handler.setStackInSlot(0, new ItemStack(handler.getSlot(0).getStack().getItem(), handler.getSlot(0).getStack().getCount() - 1));
                handler.setStackInSlot(1, new ItemStack(handler.getSlot(1).getStack().getItem(), handler.getSlot(1).getStack().getCount() - 1));
                return;
            }

        }
    }

    @Override
    public void onPropertyUpdate(ScreenHandler handler, int property, int value) {

    }

}
