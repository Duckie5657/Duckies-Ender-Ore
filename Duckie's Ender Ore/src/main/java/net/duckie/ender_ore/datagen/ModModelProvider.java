package net.duckie.ender_ore.datagen;

import net.duckie.ender_ore.block.ModBlocks;
import net.duckie.ender_ore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDER_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ENDER_ORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_BOOTS, Models.GENERATED);
    }
}
