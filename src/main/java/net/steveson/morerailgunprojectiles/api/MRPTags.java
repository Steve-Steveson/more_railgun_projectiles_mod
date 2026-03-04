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
    public static final TagKey<Item> RODS_BRONZE = commonTag("rods/bronze");

    public static final TagKey<Item> RODS_GOLD = commonTag("rods/gold");


    private static TagKey<Item> commonTag(String name) {

        return ItemTags.create(new ResourceLocation("forge", name));
    }









}
