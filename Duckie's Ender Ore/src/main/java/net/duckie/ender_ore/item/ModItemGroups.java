package net.duckie.ender_ore.item;

import net.duckie.ender_ore.EnderOre;
import net.duckie.ender_ore.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENDER_ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EnderOre.MOD_ID, "ender"),
            FabricItemGroup.builder().displayName(Text.translatable("Ender Ore"))
                    .icon(() -> new ItemStack(ModItems.ENDER_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDER_INGOT);
                        entries.add(ModItems.RAW_ENDER_ORE);
                        entries.add(ModBlocks.ENDER_ORE);
                        entries.add(ModBlocks.ENDER_BLOCK);
                        entries.add(ModItems.ENDER_SWORD);
                        entries.add(ModItems.ENDER_AXE);
                        entries.add(ModItems.ENDER_PICKAXE);
                        entries.add(ModItems.ENDER_SHOVEL);
                        entries.add(ModItems.ENDER_HOE);
                        entries.add(ModItems.ENDER_HELMET);
                        entries.add(ModItems.ENDER_CHESTPLATE);
                        entries.add(ModItems.ENDER_LEGGINGS);
                        entries.add(ModItems.ENDER_BOOTS);
                    }).build());
    public static void registerItemGroups() {
        EnderOre.LOGGER.info("Registering Item Groups for " + EnderOre.MOD_ID);
    }
}
