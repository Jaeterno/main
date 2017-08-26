package init.tools;

import com.jaeterno.Main;
import com.jaeterno.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class SwordBrodometal extends ItemSword {

	public SwordBrodometal(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.jaeternotab);
	}
}
