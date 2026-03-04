package net.steveson.morerailgunprojectiles.api;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MRPTags {

    private MRPTags() {

    }

    public static final TagKey<Item> RODS_CONSTANTAN = commonTag("rods/constantan");
    public static final TagKey<Item> RODS_URANIUM = commonTag("rods/uranium");
    public static final TagKey<Item> RODS_LEAD = commonTag("rods/lead");
    public static final TagKey<Item> RODS_ELECTRUM = commonTag("rods/electrum");

    public static final TagKey<Item> RODS_NICKEL = commonTag("rods/nickel");
    public static final TagKey<Item> RODS_COPPER = commonTag("rods/copper");
    public static final TagKey<Item> RODS_GOLD = commonTag("rods/gold");
    public static final TagKey<Item> RODS_SILVER = commonTag("rods/silver");

    public static final TagKey<Item> RODS_BRASS = commonTag("rods/brass");

    public static final TagKey<Item> RODS_WROUGHT_IRON = commonTag("rods/wrought_iron");

    public static final TagKey<Item> RODS_BRONZE = commonTag("rods/bronze");
    public static final TagKey<Item> RODS_BISMUTH_BRONZE = commonTag("rods/bismuth_bronze");
    public static final TagKey<Item> RODS_BLACK_BRONZE = commonTag("rods/black_bronze");
    public static final TagKey<Item> RODS_CAST_IRON = commonTag("rods/cast_iron");
    public static final TagKey<Item> RODS_BLACK_STEEL = commonTag("rods/black_steel");
    public static final TagKey<Item> RODS_RED_STEEL = commonTag("rods/red_steel");
    public static final TagKey<Item> RODS_BLUE_STEEL = commonTag("rods/blue_steel");

    public static final TagKey<Item> RODS_ROSE_GOLD = commonTag("rods/rose_gold");
    public static final TagKey<Item> RODS_STERLING_SILVER = commonTag("rods/sterling_silver");

    public static final TagKey<Item> RODS_BISMUTH = commonTag("rods/bismuth");
    public static final TagKey<Item> RODS_ZINC = commonTag("rods/zinc");
    public static final TagKey<Item> RODS_TIN = commonTag("rods/tin");

    private static TagKey<Item> commonTag(String name) {

        return ItemTags.create(new ResourceLocation("forge", name));
    }
}
