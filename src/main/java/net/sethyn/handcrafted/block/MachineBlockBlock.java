package net.sethyn.handcrafted.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MachineBlockBlock extends Block {
	public MachineBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6f, 40f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}