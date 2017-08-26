package init;

import com.jaeterno.blocks.BlockBrodometal;

import items.ItemBrodometalingot;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModBlocks {
	
	public static Block brodometalblock;
	
	public static <K extends IForgeRegistryEntry<K>> K register(K object) {
        return (K)GameData.register_impl(object);
	}
	
	public static void init() {
		brodometalblock = new BlockBrodometal();
	}
	
	public static void register() {
		registerBlock(brodometalblock);
	}
	
	private static void registerBlock(Block block) {
		register(brodometalblock);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		register(item);
	}
	
	public static void registerRenders() {
		registerRender(brodometalblock);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}

