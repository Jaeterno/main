package init;

import com.jaeterno.Reference;

import items.ItemBrodometalingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModItems {
	
	public static Item brodometalingot;
	
	public static <K extends IForgeRegistryEntry<K>> K register(K object) {
        return (K)GameData.register_impl(object);
    }
	
	public static void init() {
		brodometalingot = new ItemBrodometalingot();
	}
	
	public static void register() {
		register(brodometalingot);
	}
	
	public static void registerRenders() {
		registerRender(brodometalingot);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
