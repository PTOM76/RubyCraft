package ml.pkom.rubycraft.pipeflowitem;

import alexiil.mc.mod.pipes.blocks.PipeFlowItem;
import alexiil.mc.mod.pipes.blocks.TilePipe;

public class RubyPipeFlow extends PipeFlowItem {

    public RubyPipeFlow(TilePipe pipe) {
        super(pipe);  
    }

    @Override
    protected double getSpeedModifier() {
        return 12;
    }
}
