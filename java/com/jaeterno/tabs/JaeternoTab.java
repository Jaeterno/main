package com.jaeterno.tabs;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class JaeternoTab extends CreativeTabs {
	
	public JaeternoTab(String label) { super("jaeternotab"); 
	this.setBackgroundImageName("jaeterno.png"); 
	}
	
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.brodometalingot);
	}
}
