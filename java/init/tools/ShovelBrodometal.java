package init.tools;

import com.jaeterno.Main;
import com.jaeterno.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ShovelBrodometal extends ItemSpade {

	public ShovelBrodometal(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.jaeternotab);
	}
}
