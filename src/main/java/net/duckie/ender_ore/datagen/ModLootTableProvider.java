package net.duckie.ender_ore.datagen;

import net.duckie.ender_ore.block.ModBlocks;
import net.duckie.ender_ore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Blocks
        addDrop(ModBlocks.ENDER_BLOCK);
        //Ores
        addDrop(ModBlocks.ENDER_ORE, oreDrops(ModBlocks.ENDER_ORE, ModItems.RAW_ENDER_ORE));
    }
}