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

        // Constantan
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_CONSTANTAN, 8, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff0000, 0xff0000, 0xff0000, 0xffff00, 0xffff00, 0xff0000)
        );

        // Graphite ingot test
        RailgunHandler.registerStandardProjectile(IETags.hopGraphiteIngot, 8, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff0000, 0xff0000, 0xff0000, 0xffff00, 0xffff00, 0xff0000)
        );

        // Gold
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_GOLD, 4, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xffff00, 0xffff00, 0xffff00, 0xffff00, 0xffff00, 0xffff00)
        );

        // Bronze
        RailgunHandler.registerStandardProjectile(MRPTags.RODS_BRONZE, 8, 1.25).setColorMap(
                new RailgunHandler.RailgunRenderColors(0xff0000, 0x00ff00, 0x0000ff, 0xffff00, 0xff00ff, 0x00ffff)
        );


    }
}
