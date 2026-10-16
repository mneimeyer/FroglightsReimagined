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
                    .icon(() -> new ItemStack(ModBlocks.RED_FROGLIGHT.get())).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.RED_FROGLIGHT.get());
                        entries.add(ModBlocks.ORANGE_FROGLIGHT.get());
                        entries.add(ModBlocks.YELLOW_FROGLIGHT.get());
                        entries.add(ModBlocks.LIME_FROGLIGHT.get());
                        entries.add(ModBlocks.GREEN_FROGLIGHT.get());
                        entries.add(ModBlocks.BLUE_FROGLIGHT.get());
                        entries.add(ModBlocks.CYAN_FROGLIGHT.get());
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT.get());
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT.get());
                        entries.add(ModBlocks.PURPLE_FROGLIGHT.get());
                        entries.add(ModBlocks.PINK_FROGLIGHT.get());
                        entries.add(ModBlocks.WHITE_FROGLIGHT.get());
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT.get());
                        entries.add(ModBlocks.GRAY_FROGLIGHT.get());
                        entries.add(ModBlocks.BLACK_FROGLIGHT.get());
                        entries.add(ModBlocks.BROWN_FROGLIGHT.get());

                        entries.add(ModBlocks.RED_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.ORANGE_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.YELLOW_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.LIME_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.GREEN_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.BLUE_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.CYAN_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.PURPLE_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.PINK_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.WHITE_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.GRAY_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.BLACK_FROGLIGHT_LANTERN.get());
                        entries.add(ModBlocks.BROWN_FROGLIGHT_LANTERN.get());

                        entries.add(ModBlocks.RED_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.ORANGE_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.YELLOW_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.LIME_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.GREEN_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.BLUE_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.CYAN_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.PURPLE_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.PINK_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.WHITE_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.GRAY_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.BLACK_FROGLIGHT_CEILING_LAMP.get());
                        entries.add(ModBlocks.BROWN_FROGLIGHT_CEILING_LAMP.get());

                        entries.add(ModBlocks.RED_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.ORANGE_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.YELLOW_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.LIME_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.GREEN_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.BLUE_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.CYAN_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.PURPLE_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.PINK_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.WHITE_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.GRAY_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.BLACK_FROGLIGHT_FLOOR_LAMP.get());
                        entries.add(ModBlocks.BROWN_FROGLIGHT_FLOOR_LAMP.get());
                    }).build());

    public static void registerItemGroups() {
        FroglightsReimaginedCore.LOGGER.info("Registering Item Groups for" + FroglightsReimaginedCore.MOD_ID);
    }
}
