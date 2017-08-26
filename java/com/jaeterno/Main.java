package com.jaeterno;

import com.jaeterno.proxy.CommonProxy;
import com.jaeterno.tabs.JaeternoTab;

import init.ModArmour;
import init.ModBlocks;
import init.ModCrafting;
import init.ModItems;
import init.ModTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class Main {
	
	@Instance
	public static Main  instance;
	
	public static final CreativeTabs jaeternotab = new JaeternoTab("jaeternotab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModArmour.init();
		ModArmour.register();
		
		ModTools.init();
		ModTools.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) 
	{
		proxy.init();
		
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}
