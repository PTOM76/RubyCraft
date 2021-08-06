package ml.pkom.rubycraft;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ml.pkom.rubycraft.items.Items;
import ml.pkom.rubycraft.register.BlockRegister;
import ml.pkom.rubycraft.register.EntitiesRegister;
import ml.pkom.rubycraft.register.GenerationRegister;
import ml.pkom.rubycraft.register.ItemRegister;
import ml.pkom.rubycraft.register.ScreenHandlerRegister;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RubyCraft implements ModInitializer {

    public static final String MOD_ID = "rubycraft";
    public static final String MOD_NAME = "RubyCraft";
	public static final String VERSION = "1.0.0";
    public static RubyCraft instance;
    private static Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup RUBY_GROUP = FabricItemGroupBuilder.build(
		id("all"),
		() -> new ItemStack(Items.RUBY));

	@Override
	public void onInitialize() {
        log(Level.INFO, "Initializing");
        instance = this;
        ItemRegister.start();
        BlockRegister.start();
        EntitiesRegister.start();
        ScreenHandlerRegister.start();
        GenerationRegister.start();
	}

    public static void log(Level level, String message){
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }

    public static Identifier id(String id, boolean bool) {
        if (bool) return new Identifier(MOD_ID, id);
        return new Identifier(id);
    }
}
