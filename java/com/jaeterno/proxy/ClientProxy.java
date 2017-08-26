package com.jaeterno.proxy;

import init.ModArmour;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModTools.registerRenders();
		ModArmour.registerRenders();
	}
}
