package ml.pkom.rubycraft.rei;

import me.shedaniel.rei.api.plugins.REIPluginV0;
import ml.pkom.rubycraft.RubyCraft;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class REIPlugin implements REIPluginV0 {
    public static Identifier PLUGIN = RubyCraft.id("rubycraft_plugin");

    @Override
    public Identifier getPluginIdentifier() {
        return PLUGIN;
    }
}
