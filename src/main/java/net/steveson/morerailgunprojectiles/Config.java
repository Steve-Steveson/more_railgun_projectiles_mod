package net.steveson.morerailgunprojectiles;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = MoreRailgunProjectiles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();


    private static final ForgeConfigSpec.BooleanValue ENABLE_LEAD = BUILDER
            .comment("Whether the Railgun should be able to fire Lead Rods")
            .define("fireLeadRods", true);
    private static final ForgeConfigSpec.DoubleValue LEAD_DAMAGE = BUILDER
            .comment("Amount of damage a Lead Rod should inflict")
            .defineInRange("leadRodDamage", 20, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.BooleanValue ENABLE_URANIUM = BUILDER
            .comment("Whether the Railgun should be able to fire Uranium Rods")
            .define("fireUraniumRods", true);
    private static final ForgeConfigSpec.DoubleValue URANIUM_DAMAGE = BUILDER
            .comment("Amount of damage a Uranium Rod should inflict")
            .defineInRange("uraniumRodDamage", 30, 0, Double.MAX_VALUE);








    // a list of strings that are treated as resource locations for items
    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS = BUILDER
            .comment("A list of items to log on common setup.")
            .defineListAllowEmpty("items", List.of("minecraft:iron_ingot"), Config::validateItemName);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean fireLeadRods;
    public static double leadDamage;
    public static boolean fireUraniumRods;
    public static double uraniumDamage;



    public static Set<Item> items;

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof final String itemName && ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        fireLeadRods = ENABLE_LEAD.get();
        leadDamage = LEAD_DAMAGE.get();
        fireUraniumRods = ENABLE_URANIUM.get();
        uraniumDamage = URANIUM_DAMAGE.get();


        // convert the list of strings into a set of items
        items = ITEM_STRINGS.get().stream()
                .map(itemName -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)))
                .collect(Collectors.toSet());
    }
}
