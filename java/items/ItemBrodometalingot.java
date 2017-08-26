package items;

import com.jaeterno.Main;
import com.jaeterno.Reference;

import net.minecraft.item.Item;

public class ItemBrodometalingot extends Item {

	public ItemBrodometalingot() {
		setUnlocalizedName(Reference.TutorialItems.BRODOMETALINGOT.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.BRODOMETALINGOT.getRegistryName());
		setCreativeTab(Main.jaeternotab);
	}
}
