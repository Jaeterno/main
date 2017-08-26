package com.jaeterno.blocks;

import com.jaeterno.Main;
import com.jaeterno.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBrodometal extends Block {

	public BlockBrodometal() {
		super(Material.IRON);
		setUnlocalizedName(Reference.TutorialBlocks.BRODOMETALBLOCK.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.BRODOMETALBLOCK.getRegistryName());
		setHardness(50.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 4);
		setCreativeTab(Main.jaeternotab);
	}
}
