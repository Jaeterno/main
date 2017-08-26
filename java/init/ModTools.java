package init;

import init.tools.AxeBrodometal;
import init.tools.HoeBrodometal;
import init.tools.PickaxeBrodometal;
import init.tools.ShovelBrodometal;
import init.tools.SwordBrodometal;
import items.ItemBrodometalingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModTools {
	public static final ToolMaterial brodometal = EnumHelper.addToolMaterial("brodometal", 4, 2500, 20.0F, 7.0F, 42);
	
	public static Item brodometal_pickaxe, brodometal_axe, brodometal_sword, brodometal_hoe, brodometal_shovel;
	
	public static <K extends IForgeRegistryEntry<K>> K register(K object) {
        return (K)GameData.register_impl(object);
    }
	
	public static void init() {
		brodometal_sword = new SwordBrodometal("brodometal_sword", brodometal);
		brodometal_pickaxe = new PickaxeBrodometal("brodometal_pickaxe", brodometal);
		brodometal_axe = new AxeBrodometal("brodometal_axe", brodometal);
		brodometal_shovel = new ShovelBrodometal("brodometal_shovel", brodometal);
		brodometal_hoe = new HoeBrodometal("brodometal_hoe", brodometal);
	}
	
	public static void register() {
		register(brodometal_sword);
		register(brodometal_pickaxe);
		register(brodometal_axe);
		register(brodometal_shovel);
		register(brodometal_hoe);
	}
	
	public static void registerRenders() {
		registerRender(brodometal_sword);
		registerRender(brodometal_pickaxe);
		registerRender(brodometal_axe);
		registerRender(brodometal_shovel);
		registerRender(brodometal_hoe);

	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
