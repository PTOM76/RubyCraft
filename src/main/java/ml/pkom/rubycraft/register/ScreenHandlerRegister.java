package ml.pkom.rubycraft.register;

import ml.pkom.rubycraft.RubyCraft;
import ml.pkom.rubycraft.guis.CrushingMachineScreenHandler;
import ml.pkom.rubycraft.guis.RubyStorageScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;

public class ScreenHandlerRegister {
    public static ScreenHandlerType<RubyStorageScreenHandler> RUBY_STORAGE_SCREEN_HANDLER;
    public static ScreenHandlerType<CrushingMachineScreenHandler> CRUSHING_MACHINE_SCREEN_HANDLER;
    
    public static void start() {
        RUBY_STORAGE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(RubyCraft.id("ruby_storage"), RubyStorageScreenHandler::new);
        CRUSHING_MACHINE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(RubyCraft.id("crushing_machine"), CrushingMachineScreenHandler::new);
    }
}
