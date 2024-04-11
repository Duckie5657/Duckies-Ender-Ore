package net.duckie.ender_ore.datagen;

import net.duckie.ender_ore.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
       getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
               .add(ModBlocks.ENDER_BLOCK)
               .add(ModBlocks.ENDER_ORE);
       getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
               .add(ModBlocks.ENDER_BLOCK)
               .add(ModBlocks.ENDER_ORE);
    }
}
