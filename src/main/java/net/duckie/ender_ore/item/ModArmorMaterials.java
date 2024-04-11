package net.duckie.ender_ore.item;

import net.duckie.ender_ore.EnderOre;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    ENDER("ender",39, new int[] {4, 9, 7, 4}, 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4f, .2f, () -> Ingredient.ofItems(ModItems.ENDER_INGOT));
    ;
    private final String name;
    private final int durabilitlyMultiplier;
    private final int[] protectionAmount;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float Toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;
    private final static int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilitlyMultiplier, int[] protectionAmountsp, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilitlyMultiplier = durabilitlyMultiplier;
        this.protectionAmount = protectionAmountsp;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        Toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * durabilitlyMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmount[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return EnderOre.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.Toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
