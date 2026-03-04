package net.steveson.morerailgunprojectiles.api;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MRPTags {
//    public static class Blocks{
//
//    }
//
//    public static class Items{
//
//
//    }

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
    public static final TagKey<Item> RODS_BRONZE = commonTag("rods/bronze");



    private static TagKey<Item> commonTag(String name) {

        return ItemTags.create(new ResourceLocation("forge", name));
    }









}
