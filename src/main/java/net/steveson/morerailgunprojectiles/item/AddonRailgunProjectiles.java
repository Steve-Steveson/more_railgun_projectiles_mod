package net.steveson.morerailgunprojectiles.item;

import blusunrize.immersiveengineering.api.IETags;
import blusunrize.immersiveengineering.api.tool.RailgunHandler;
import net.minecraftforge.common.Tags;
import net.steveson.morerailgunprojectiles.Config;
import net.steveson.morerailgunprojectiles.api.MRPTags;

public class AddonRailgunProjectiles {

    private static final boolean B_LEAD = Config.fireLeadRods;
    private static final double D_LEAD = Config.leadDamage;
    private static final boolean B_URANIUM = Config.fireUraniumRods;
    private static final double D_URANIUM = Config.uraniumDamage;
    private static final boolean B_CONSTANTAN = Config.fireConstantanRods;
    private static final double D_CONSTANTAN = Config.constantanDamage;
    private static final boolean B_ELECTRUM = Config.fireConstantanRods;
    private static final double D_ELECTRUM = Config.electrumDamage;

    public static void register(){


        // Lead
        if(B_LEAD){
            RailgunHandler.registerStandardProjectile(MRPTags.RODS_LEAD, D_LEAD, 60).setColorMap(
                    new RailgunHandler.RailgunRenderColors(0x5a6074, 0x5a6074, 0x5a6074, 0x424656, 0x2a2e37, 0x2a2e37)
            );
        }
        // Uranium
        if(B_URANIUM) {
            RailgunHandler.registerStandardProjectile(MRPTags.RODS_URANIUM, D_URANIUM, 150).setColorMap(
                    new RailgunHandler.RailgunRenderColors(0x6e7f64, 0x6e7f64, 0x6e7f64, 0x515d4a, 0x343c2f, 0x343c2f)
            );
        }
        // Constantan
        if(true) {
            RailgunHandler.registerStandardProjectile(MRPTags.RODS_CONSTANTAN, 22, 1.25).setColorMap(
                    new RailgunHandler.RailgunRenderColors(0xdc856a, 0xdc856a, 0xdc856a, 0xa3624e, 0x7a4a3b, 0x7a4a3b)
            );
        }
        // Electrum
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_ELECTRUM, D_ELECTRUM, 1.25).setColorMap(
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


        // Iron
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_WROUGHT_IRON, 16, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xd8d8d8, 0xd8d8d8, 0xd8d8d8, 0xa8a8a8, 0x686868, 0x686868)
        );



        // Bronze
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BRONZE, 13, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xcfbcaa, 0xcfbcaa, 0xcfbcaa, 0xaf8e6f, 0x7f9247, 0x7f9247)
        );

        // Bismuth Bronze
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BISMUTH_BRONZE, 12, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xc4dfce, 0xc4dfce, 0xc4dfce, 0x639074, 0x346544, 0x346544)
        );

        // Black Bronze
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BLACK_BRONZE, 14, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xb28db2, 0xb28db2, 0xb28db2, 0x614262, 0x25142a, 0x25142a)
        );

        // Cast Iron
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_CAST_IRON, 18, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0x503d32, 0x503d32, 0x503d32, 0x322827, 0x211a19, 0x211a19)
        );

        // Black Steel
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BLACK_STEEL, 32, 30).setColorMap(
                new RailgunHandler.RailgunRenderColors(0x878787, 0x878787, 0x878787, 0x505050, 0x0f0f0f, 0x0f0f0f)
        );

        // Red Steel
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_RED_STEEL, 40, 60).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xc8575d, 0xc8575d, 0xc8575d, 0x902127, 0x560307, 0x560307)
        );

        // Blue Steel
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BLUE_STEEL, 40, 60).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xd0e1f0, 0xd0e1f0, 0xd0e1f0, 0x7a87b7, 0x586a9e, 0x586a9e)
        );


        // Rose Gold
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_ROSE_GOLD, 10, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xffbd54, 0xffbd54, 0xea6500, 0xea6500, 0xea6500, 0x770e04)
        );

        // Sterling Silver
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_STERLING_SILVER, 9, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xf2e4da, 0xf2e4da, 0xf2e4da, 0xbdaa9b, 0x9e8574, 0x9e8574)
        );


        // Bismuth
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BISMUTH, 5, 30).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xb1c1c4, 0xb1c1c4, 0xb1c1c4, 0x7d959b, 0x445b60, 0x445b60)
        );

        // Zinc
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_ZINC, 7, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xffffff, 0xffffff, 0xffffff, 0xeaecec, 0xc6c4cf, 0xc6c4cf)
        );

        // Tin
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_TIN, 6, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xf3efef, 0xf3efef, 0xf3efef, 0xd7e0ea, 0xbbc6d4, 0xbbc6d4)
        );
    }
}
