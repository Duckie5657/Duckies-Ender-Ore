package net.duckie.ender_ore.datagen;

import net.duckie.ender_ore.block.ModBlocks;
import net.duckie.ender_ore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ENDER_SMELTTABLES = List.of(ModItems.RAW_ENDER_ORE, ModBlocks.ENDER_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //Smelting or Blasting
        offerSmelting(exporter, ENDER_SMELTTABLES, RecipeCategory.MISC, ModItems.ENDER_INGOT, 0.7f, 200, "ender");
        offerBlasting(exporter, ENDER_SMELTTABLES, RecipeCategory.MISC, ModItems.ENDER_INGOT, 0.7f, 100, "ender");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDER_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ENDER_BLOCK);
        //Shaped Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDER_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("S")
                .input('X', ModItems.ENDER_INGOT) .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDER_SHOVEL)
                .pattern("X")
                .pattern("S")
                .pattern("S")
                .input('X', ModItems.ENDER_INGOT) .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDER_AXE)
                .pattern("XX")
                .pattern("XS")
                .pattern(" S")
                .input('X', ModItems.ENDER_INGOT) .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDER_HOE)
                .pattern("XX")
                .pattern(" S")
                .pattern(" S")
                .input('X', ModItems.ENDER_INGOT) .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDER_PICKAXE)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .input('X', ModItems.ENDER_INGOT) .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDER_HELMET)
                .pattern("XXX")
                .pattern("X X")
                .input('X', ModItems.ENDER_INGOT)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDER_CHESTPLATE)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.ENDER_INGOT)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDER_LEGGINGS)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.ENDER_INGOT)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDER_BOOTS)
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.ENDER_INGOT)
                .criterion(hasItem(ModItems.ENDER_INGOT), conditionsFromItem(ModItems.ENDER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_BOOTS)));
    }
}