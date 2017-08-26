package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalblockIN"), new ResourceLocation("brodometalblockOUT"),
				new ItemStack(ModBlocks.brodometalblock), "BBB","BBB", "BBB", 'B', ModItems.brodometalingot);
		GameRegistry.addShapelessRecipe(new ResourceLocation("brodometalingotIN"), new ResourceLocation("brodometalingotOUT"),
				new ItemStack(ModItems.brodometalingot), CraftingHelper.getIngredient(Items.REDSTONE), CraftingHelper.getIngredient(Items.IRON_INGOT), CraftingHelper.getIngredient(Blocks.OBSIDIAN), CraftingHelper.getIngredient(Items.DIAMOND));
		GameRegistry.addShapelessRecipe(new ResourceLocation("brodometalingotfromblockIN"), new ResourceLocation("brodometalingotfromblockOUT"),
				new ItemStack(ModItems.brodometalingot, 9), CraftingHelper.getIngredient(ModBlocks.brodometalblock));
		
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalpickaxeIN"), new ResourceLocation("brodometalpickaxeOUT"),
				new ItemStack(ModTools.brodometal_pickaxe), "BBB", " S ", " S ", 'B', ModItems.brodometalingot, 'S', CraftingHelper.getIngredient(Items.STICK));
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalswordIN"), new ResourceLocation("brodometalswordOUT"),
				new ItemStack(ModTools.brodometal_sword), " B ", " B ", " S ", 'B', ModItems.brodometalingot, 'S', CraftingHelper.getIngredient(Items.STICK));
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalaxeIN"), new ResourceLocation("brodometalaxeOUT"),
				new ItemStack(ModTools.brodometal_axe), " BB", " SB", " S ", 'B', ModItems.brodometalingot, 'S', CraftingHelper.getIngredient(Items.STICK));
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalshovelIN"), new ResourceLocation("brodometalshovelOUT"),
				new ItemStack(ModTools.brodometal_shovel), " B ", " S ", " S ", 'B', ModItems.brodometalingot, 'S', CraftingHelper.getIngredient(Items.STICK));
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalhoeIN"), new ResourceLocation("brodometalhoeOUT"),
				new ItemStack(ModTools.brodometal_hoe), " BB", " S ", " S ", 'B', ModItems.brodometalingot, 'S', CraftingHelper.getIngredient(Items.STICK));
		
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalhelmetIN"), new ResourceLocation("brodometalhelmetOUT"),
				new ItemStack(ModArmour.brodometal_helmet), "BBB", "B B", 'B', ModItems.brodometalingot);
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalchestplateIN"), new ResourceLocation("brodometalchestplateOUT"),
				new ItemStack(ModArmour.brodometal_chestplate), "B B", "BBB", "BBB", 'B', ModItems.brodometalingot);
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalleggingsIN"), new ResourceLocation("brodometalleggingsOUT"),
				new ItemStack(ModArmour.brodometal_leggings), "BBB", "B B", "B B", 'B', ModItems.brodometalingot);
		GameRegistry.addShapedRecipe(new ResourceLocation("brodometalbootsIN"), new ResourceLocation("brodometalbootsOUT"),
				new ItemStack(ModArmour.brodometal_boots), "B B", "B B", 'B', ModItems.brodometalingot);
	}
}
