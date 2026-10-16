package net.cozystudios.froglightsreimagined.item;

import net.cozystudios.froglightsreimagined.FroglightsReimaginedCore;
import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.cozystudios.froglightsreimagined.util.FroglightsId;
//? if fabric {
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.registry.Registry;
//?} else if neoforge {
/*import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
*///?}
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;

public class ModItemGroups {

    //? if neoforge {
    /*public static final DeferredRegister<ItemGroup> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.ITEM_GROUP, FroglightsReimaginedCore.MOD_ID);

    public static final DeferredHolder<ItemGroup, ItemGroup> CORE_GROUP = CREATIVE_MODE_TABS.register("core", () ->
            ItemGroup.builder().displayName(Text.translatable("itemgroup.core"))
    *///?} else {
    public static final ItemGroup CORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            FroglightsId.of("core"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.core"))
    //?}
                    .icon(() -> new ItemStack(ModBlocks.RED_FROGLIGHT)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.RED_FROGLIGHT);
                        entries.add(ModBlocks.ORANGE_FROGLIGHT);
                        entries.add(ModBlocks.YELLOW_FROGLIGHT);
                        entries.add(ModBlocks.LIME_FROGLIGHT);
                        entries.add(ModBlocks.GREEN_FROGLIGHT);
                        entries.add(ModBlocks.BLUE_FROGLIGHT);
                        entries.add(ModBlocks.CYAN_FROGLIGHT);
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT);
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT);
                        entries.add(ModBlocks.PURPLE_FROGLIGHT);
                        entries.add(ModBlocks.PINK_FROGLIGHT);
                        entries.add(ModBlocks.WHITE_FROGLIGHT);
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT);
                        entries.add(ModBlocks.GRAY_FROGLIGHT);
                        entries.add(ModBlocks.BLACK_FROGLIGHT);
                        entries.add(ModBlocks.BROWN_FROGLIGHT);

                        entries.add(ModBlocks.RED_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.ORANGE_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.YELLOW_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.LIME_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.GREEN_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.BLUE_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.CYAN_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.PURPLE_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.PINK_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.WHITE_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.GRAY_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.BLACK_FROGLIGHT_LANTERN);
                        entries.add(ModBlocks.BROWN_FROGLIGHT_LANTERN);

                        entries.add(ModBlocks.RED_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.ORANGE_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.YELLOW_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.LIME_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.GREEN_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.BLUE_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.CYAN_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.PURPLE_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.PINK_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.WHITE_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.GRAY_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.BLACK_FROGLIGHT_CEILING_LAMP);
                        entries.add(ModBlocks.BROWN_FROGLIGHT_CEILING_LAMP);

                        entries.add(ModBlocks.RED_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.ORANGE_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.YELLOW_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.LIME_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.GREEN_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.BLUE_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.CYAN_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.PURPLE_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.PINK_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.WHITE_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.GRAY_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.BLACK_FROGLIGHT_FLOOR_LAMP);
                        entries.add(ModBlocks.BROWN_FROGLIGHT_FLOOR_LAMP);
                    }).build());

    public static void registerItemGroups() {
        FroglightsReimaginedCore.LOGGER.info("Registering Item Groups for" + FroglightsReimaginedCore.MOD_ID);
    }
}
