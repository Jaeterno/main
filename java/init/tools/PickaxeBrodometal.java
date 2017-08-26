package init.tools;

import com.jaeterno.Main;
import com.jaeterno.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class PickaxeBrodometal extends ItemPickaxe {

	public PickaxeBrodometal(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.jaeternotab);
	}
}
