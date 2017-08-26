package init;

import com.jaeterno.Reference;

import init.armour.ArmourBrodometal;
import items.ItemBrodometalingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModArmour {
	
	public static final ArmorMaterial brodometal_armour = EnumHelper.addArmorMaterial("brodometal_armour", Reference.MOD_ID + ":brodometal", 120, new int[]{5, 8, 10, 5}, 30, SoundEvents.BLOCK_ENDERCHEST_OPEN, 4);
	
	public static Item brodometal_helmet, brodometal_chestplate, brodometal_leggings, brodometal_boots;
	
	public static <K extends IForgeRegistryEntry<K>> K register(K object) {
        return (K)GameData.register_impl(object);
    }
	
	public static void init() {
		brodometal_helmet = new ArmourBrodometal("brodometal_helmet", brodometal_armour, 1, EntityEquipmentSlot.HEAD);
		brodometal_chestplate = new ArmourBrodometal("brodometal_chestplate", brodometal_armour, 1, EntityEquipmentSlot.CHEST);
		brodometal_leggings = new ArmourBrodometal("brodometal_leggings", brodometal_armour, 2, EntityEquipmentSlot.LEGS);
		brodometal_boots = new ArmourBrodometal("brodometal_boots", brodometal_armour, 1, EntityEquipmentSlot.FEET);
	}
	
	public static void register() {
		register(brodometal_helmet);
		register(brodometal_chestplate);
		register(brodometal_leggings);
		register(brodometal_boots);
	}
	
	public static void registerRenders() {
		registerRender(brodometal_helmet);
		registerRender(brodometal_chestplate);
		registerRender(brodometal_leggings);
		registerRender(brodometal_boots);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
