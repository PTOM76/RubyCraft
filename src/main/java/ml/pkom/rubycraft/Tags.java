package ml.pkom.rubycraft;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class Tags {
    public static Tag RUBY_INGOTS = getRegistryItemTags("c:ruby_ingots");

    public static Tag getRegistryItemTags(String id) {
        return TagRegistry.item(new Identifier(id));
    }

    public static Tag getRegistryBlockTags(String id) {
        return TagRegistry.block(new Identifier(id));
    }
}
