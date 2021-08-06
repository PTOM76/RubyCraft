package ml.pkom.rubycraft.blocks;

import ml.pkom.rubycraft.items.Items;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CrushingMachine0 extends Block {
    public static FabricBlockSettings blockSettings = FabricBlockSettings.of(Material.METAL);

    static {
        blockSettings.strength(3.0F);
        blockSettings.breakByTool(FabricToolTags.PICKAXES, 2);
        blockSettings.requiresTool();
    }

    public CrushingMachine0(Settings settings) {
        super(settings);
    }

    public static Settings getSettings() {
        return blockSettings;
    }

    public static Block newBlock() {
        return new CrushingMachine0(getSettings());
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {
        ItemStack handStack = player.getMainHandStack();
        if (handStack.getItem() == Items.RUBY) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(Items.RUBY_DUST, 1));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == Items.RUBY_INGOT) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(Items.RUBY_DUST, 1));
            return ActionResult.SUCCESS;
        }
        if (handStack.getItem() == Items.RUBY_ORE) {
            handStack.setCount(handStack.getCount() - 1);
            player.giveItemStack(new ItemStack(Items.RUBY_DUST, 3));
            return ActionResult.SUCCESS;
        }
        player.sendMessage(new TranslatableText("msg.rubycraft.crushing_machine_error"), false);;
        return ActionResult.FAIL;
        
    }
}
