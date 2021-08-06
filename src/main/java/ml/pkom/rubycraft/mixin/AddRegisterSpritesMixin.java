package ml.pkom.rubycraft.mixin;

import alexiil.mc.mod.pipes.SimplePipesClient;
import ml.pkom.rubycraft.RubyCraft;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.texture.SpriteAtlasTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(SimplePipesClient.class)
public class AddRegisterSpritesMixin {
	@Inject(method = "registerSprites", at = @At("TAIL"), remap = false)
	private void registerSprites(SpriteAtlasTexture atlasTexture, ClientSpriteRegistryCallback.Registry registry, CallbackInfo ci) {
		registry.register(RubyCraft.id("ruby_pipe"));
	}
}