package net.duckie.ender_ore.item;

import net.duckie.ender_ore.EnderOre;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Ingredients
    public static final Item ENDER_INGOT = registerItem("ender_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDER_ORE = registerItem("raw_ender_ore", new Item(new FabricItemSettings()));
    //Tools
    public static final Item ENDER_SWORD = registerItem("ender_sword", new SwordItem(ModToolMaterial.ENDER,7, -2.4f, new FabricItemSettings()));
    public static final Item ENDER_AXE = registerItem("ender_axe", new AxeItem(ModToolMaterial.ENDER,8,-2.8f, new FabricItemSettings()));
    public static final Item ENDER_PICKAXE = registerItem("ender_pickaxe", new PickaxeItem(ModToolMaterial.ENDER,3,-3f, new FabricItemSettings()));
    public static final Item ENDER_SHOVEL = registerItem("ender_shovel", new ShovelItem(ModToolMaterial.ENDER,2.5f,-2f, new FabricItemSettings()));
    public static final Item ENDER_HOE = registerItem("ender_hoe", new HoeItem(ModToolMaterial.ENDER,-3,-2f, new FabricItemSettings()));
    //Armor
    public static final Item ENDER_HELMET = registerItem("ender_helmet", new ArmorItem(ModArmorMaterials.ENDER,ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDER_CHESTPLATE = registerItem("ender_chestplate", new ArmorItem(ModArmorMaterials.ENDER,ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDER_LEGGINGS = registerItem("ender_leggings", new ArmorItem(ModArmorMaterials.ENDER,ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDER_BOOTS = registerItem("ender_boots", new ArmorItem(ModArmorMaterials.ENDER,ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //Setup
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EnderOre.MOD_ID, name), item);
    }
    public static void registerModItems(){
        EnderOre.LOGGER.info("Registering Mod Items for " + EnderOre.MOD_ID);
    }
}
