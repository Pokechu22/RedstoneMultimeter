package narcolepticfrog.rsmm.mixins;

import narcolepticfrog.rsmm.Meterable;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntityComparator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlockRedstoneComparator.class)
public abstract class MixinBlockRedstoneComparatorMeterable implements Meterable {

    @Override
    public boolean isPowered(IBlockState state, IBlockAccess source, BlockPos pos) {
        return ((TileEntityComparator)source.getTileEntity(pos)).getOutputSignal() > 0;
    }

}
