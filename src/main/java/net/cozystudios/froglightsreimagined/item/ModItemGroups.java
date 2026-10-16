package net.cozystudios.froglightsreimagined.item;

import net.cozystudios.froglightsreimagined.FroglightsReimaginedCore;
import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.cozystudios.froglightsreimagined.util.FroglightsId;
//? if fabric {
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.registry.Registry;
//?} else if neoforge {
/*import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
*///?}
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;

//? if neoforge {
/*@EventBusSubscriber(modid = FroglightsReimaginedCore.MOD_ID)
*///?}
public class ModItemGroups {

    //? if neoforge {
    /*public static final DeferredRegister<ItemGroup> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.ITEM_GROUP, FroglightsReimaginedCore.MOD_ID);

    public static final DeferredHolder<ItemGroup, ItemGroup> CORE_GROUP = CREATIVE_MODE_TABS.register("core", () ->
            ItemGroup.builder().displayName(Text.translatable("itemgroup.core"))
                    .icon(() -> new ItemStack(ModBlocks.RED_FROGLIGHT.get()))
                    .build());

    // NeoForge only: entries are added via BuildCreativeModeTabContentsEvent, the
    // loader's own recommended idiom for populating a tab (rather than the
    // builder's .entries(...) DisplayItemsGenerator, which is the Fabric pattern).
    @SubscribeEvent
    public static void onBuildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() != CORE_GROUP.get()) {
            return;
        }

        event.add(ModBlocks.RED_FROGLIGHT.get());
        event.add(ModBlocks.ORANGE_FROGLIGHT.get());
        event.add(ModBlocks.YELLOW_FROGLIGHT.get());
        event.add(ModBlocks.LIME_FROGLIGHT.get());
        event.add(ModBlocks.GREEN_FROGLIGHT.get());
        event.add(ModBlocks.BLUE_FROGLIGHT.get());
        event.add(ModBlocks.CYAN_FROGLIGHT.get());
        event.add(ModBlocks.LIGHT_BLUE_FROGLIGHT.get());
        event.add(ModBlocks.MAGENTA_FROGLIGHT.get());
        event.add(ModBlocks.PURPLE_FROGLIGHT.get());
        event.add(ModBlocks.PINK_FROGLIGHT.get());
        event.add(ModBlocks.WHITE_FROGLIGHT.get());
        event.add(ModBlocks.LIGHT_GRAY_FROGLIGHT.get());
        event.add(ModBlocks.GRAY_FROGLIGHT.get());
        event.add(ModBlocks.BLACK_FROGLIGHT.get());
        event.add(ModBlocks.BROWN_FROGLIGHT.get());

        event.add(ModBlocks.RED_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.ORANGE_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.YELLOW_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.LIME_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.GREEN_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.BLUE_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.CYAN_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.MAGENTA_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.PURPLE_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.PINK_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.WHITE_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.GRAY_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.BLACK_FROGLIGHT_LANTERN.get());
        event.add(ModBlocks.BROWN_FROGLIGHT_LANTERN.get());

        event.add(ModBlocks.RED_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.ORANGE_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.YELLOW_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.LIME_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.GREEN_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.BLUE_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.CYAN_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.MAGENTA_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.PURPLE_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.PINK_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.WHITE_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.GRAY_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.BLACK_FROGLIGHT_CEILING_LAMP.get());
        event.add(ModBlocks.BROWN_FROGLIGHT_CEILING_LAMP.get());

        event.add(ModBlocks.RED_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.ORANGE_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.YELLOW_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.LIME_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.GREEN_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.BLUE_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.CYAN_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.LIGHT_BLUE_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.MAGENTA_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.PURPLE_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.PINK_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.WHITE_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.LIGHT_GRAY_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.GRAY_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.BLACK_FROGLIGHT_FLOOR_LAMP.get());
        event.add(ModBlocks.BROWN_FROGLIGHT_FLOOR_LAMP.get());
    }
    *///?} else {
    public static final ItemGroup CORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            FroglightsId.of("core"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.core"))
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
    //?}

    public static void registerItemGroups() {
        FroglightsReimaginedCore.LOGGER.info("Registering Item Groups for" + FroglightsReimaginedCore.MOD_ID);
    }
}
