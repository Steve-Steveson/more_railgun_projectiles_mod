package net.steveson.morerailgunprojectiles.item;

import blusunrize.immersiveengineering.api.IETags;
import blusunrize.immersiveengineering.api.tool.RailgunHandler;
import net.minecraftforge.common.Tags;
import net.steveson.morerailgunprojectiles.api.MRPTags;

public class AddonRailgunProjectiles {

    public static void register(){

        // Stick
        RailgunHandler.registerStandardProjectile(Tags.Items.RODS_WOODEN, 8, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff0000, 0x00ff00, 0x0000ff, 0xffff00, 0xff00ff, 0x00ffff)
        );

        // Nickel
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_NICKEL, 20, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff0000, 0xff00ff, 0xff0000, 0xff00ff, 0xff0000, 0xff00ff)
        );

        // Constantan
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_CONSTANTAN, 22, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff0000, 0xff0000, 0xff0000, 0xffff00, 0xffff00, 0xff0000)
        );

        // Copper
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_COPPER, 8, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff8800, 0xff8800, 0xff8800, 0xffff00, 0xff8800, 0xff8800)
        );


        // Lead
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_LEAD, 20, 2).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff8800, 0xff8800, 0xff8800, 0xffff00, 0xff8800, 0xff8800)
        );

        // Uranium
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_URANIUM, 30, 3).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff8800, 0xff8800, 0xff8800, 0xffff00, 0xff8800, 0xff8800)
        );



        // Graphite ingot test
//        RailgunHandler.registerStandardProjectile(IETags.hopGraphiteIngot, 8, 1.25).setColorMap(
//                new RailgunHandler.RailgunRenderColors(0xff0000, 0xff0000, 0xff0000, 0xffff00, 0xffff00, 0xff0000)
//        );

        // Electrum
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_ELECTRUM, 10, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xaaaaaa, 0xaaaaaa, 0xaaaaaa, 0xffff00, 0xffff00, 0xffff00)
        );

        // Gold
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_GOLD, 4, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xffff00, 0xffff00, 0xffff00, 0xffff00, 0xffff00, 0xffff00)
        );

        // Gold
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_SILVER, 3, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xaaaaaa, 0xaaaaaa, 0xaaaaaa, 0xaaaaaa, 0xaaaaaa, 0xaaaaaa)
        );

        // Bronze
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BRONZE, 13, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff0000, 0x00ff00, 0x0000ff, 0xffff00, 0xff00ff, 0x00ffff)
        );


    }
}
