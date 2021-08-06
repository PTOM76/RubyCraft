package ml.pkom.rubycraft.entities;

import alexiil.mc.mod.pipes.blocks.TilePipe;
import ml.pkom.rubycraft.blocks.Blocks;
import ml.pkom.rubycraft.pipeflowitem.RubyPipeFlow;
import ml.pkom.rubycraft.register.EntitiesRegister;

public class RubyPipeEntity extends TilePipe {
    public RubyPipeEntity() {
        super(EntitiesRegister.RUBY_PIPE_ENTITY, Blocks.RUBY_PIPE, RubyPipeFlow::new);
    }
    
}
