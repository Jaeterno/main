package init.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.jaeterno.Main;
import com.jaeterno.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class AxeBrodometal extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    public AxeBrodometal(String name, Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.damageVsEntity = 12.0F;
        this.attackSpeed = -3.0F;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.jaeternotab);
    }
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
}
