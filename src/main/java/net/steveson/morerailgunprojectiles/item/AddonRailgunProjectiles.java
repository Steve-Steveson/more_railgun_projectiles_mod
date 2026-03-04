package net.steveson.morerailgunprojectiles.item;

import blusunrize.immersiveengineering.api.IETags;
import blusunrize.immersiveengineering.api.tool.RailgunHandler;
import net.minecraftforge.common.Tags;
import net.steveson.morerailgunprojectiles.api.MRPTags;

public class AddonRailgunProjectiles {

    public static void register(){

//        // Stick
//        RailgunHandler.registerStandardProjectile(Tags.Items.RODS_WOODEN, 8, 1.25).setColorMap(
//                new RailgunHandler.RailgunRenderColors(0xff0000, 0x00ff00, 0x0000ff, 0xffff00, 0xff00ff, 0x00ffff)
//        );

        // Lead
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_LEAD, 20, 3.0).setColorMap(
                new RailgunHandler.RailgunRenderColors(0x5a6074, 0x5a6074, 0x5a6074, 0x424656, 0x2a2e37, 0x2a2e37)
        );

        // Uranium
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_URANIUM, 30, 10).setColorMap(
                new RailgunHandler.RailgunRenderColors(0x6e7f64, 0x6e7f64, 0x6e7f64, 0x515d4a, 0x343c2f, 0x343c2f)
        );

        // Constantan
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_CONSTANTAN, 22, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xdc856a, 0xdc856a, 0xdc856a, 0xa3624e, 0x7a4a3b, 0x7a4a3b)
        );

        // Electrum
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_ELECTRUM, 10, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xffd051, 0xffd051, 0xffd051, 0xdcb446, 0xa38434, 0xa38434)
        );


        // Gold
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_GOLD, 4, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xfdf55f, 0xfdf55f, 0xfdf55f, 0xe9b115, 0xb26411, 0xb26411)
        );

        // Copper
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_COPPER, 8, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xcb8360, 0xcb8360, 0xcb8360, 0xaf7152, 0x81533d, 0x81533d)
        );

        // Nickel
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_NICKEL, 20, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xbabfb0, 0xbabfb0, 0xbabfb0, 0x898d82, 0x676a62, 0x676a62)
        );

        // Silver
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_SILVER, 3, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xeaf7ff, 0xeaf7ff, 0xeaf7ff, 0xcad5dc, 0xa4adb2, 0xa4adb2)
        );


        // Brass
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BRASS, 9, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xfff4a3, 0xfff4a3, 0xfff4a3, 0xe4c66a, 0xe4c66a, 0xc9974c)
        );

        // Bronze
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BRONZE, 13, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xcfbcaa, 0xcfbcaa, 0xcfbcaa, 0xaf8e6f, 0x7f9247, 0x7f9247)
        );


    }
}
