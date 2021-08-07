package ml.pkom.rubycraft;

import alexiil.mc.mod.pipes.blocks.TilePipe;
import alexiil.mc.mod.pipes.client.render.PipeItemTileRenderer;
import ml.pkom.rubycraft.blocks.Blocks;
import ml.pkom.rubycraft.guis.CrushingMachineScreen;
import ml.pkom.rubycraft.guis.RubyStorageScreen;
import ml.pkom.rubycraft.register.EntitiesRegister;
import ml.pkom.rubycraft.register.ScreenHandlerRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class RubyCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ScreenHandlerRegister.RUBY_STORAGE_SCREEN_HANDLER, RubyStorageScreen::new);
        ScreenRegistry.register(ScreenHandlerRegister.CRUSHING_MACHINE_SCREEN_HANDLER, CrushingMachineScreen::new);

        registerItemPipeRender(EntitiesRegister.RUBY_PIPE_ENTITY);
        setCutoutLayer(Blocks.RUBY_PIPE);

        //SetupFluidRendering.start(FluidRegister.STILL_RUBY_FLUID, FluidRegister.FLOWING_RUBY_FLUID, new Identifier("minecraft", "water"), 0xDF2E75);
        //BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), FluidRegister.STILL_RUBY_FLUID, FluidRegister.FLOWING_RUBY_FLUID);
    }

    private static void setCutoutLayer(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }

    private static <T extends TilePipe> void registerItemPipeRender(BlockEntityType<T> type) {
        BlockEntityRendererRegistry.INSTANCE.register(type, PipeItemTileRenderer::new);
    }

}
