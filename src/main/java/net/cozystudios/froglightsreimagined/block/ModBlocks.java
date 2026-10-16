package net.cozystudios.froglightsreimagined.block;

import net.cozystudios.froglightsreimagined.FroglightsReimaginedCore;
import net.cozystudios.froglightsreimagined.util.FroglightsId;
//? if neoforge {
/*import net.neoforged.neoforge.registries.DeferredRegister;
*///?}
//? if <1.21 {
/*import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
*///?}
//? if >=1.21 {
import net.minecraft.block.AbstractBlock;
//?}
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.PillarBlock;
//? if >=1.21.4 {
/*import net.minecraft.item.Items;
*///?} else {
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
//?}
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
//? if >=1.21.4 {
/*import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
*///?}

import java.util.function.Supplier;

public class ModBlocks {

    //? if neoforge {
    /*public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FroglightsReimaginedCore.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FroglightsReimaginedCore.MOD_ID);
    *///?}

    public static final Supplier<Block> RED_FROGLIGHT = registerFroglight("red_froglight");
    public static final Supplier<Block> ORANGE_FROGLIGHT = registerFroglight("orange_froglight");
    public static final Supplier<Block> YELLOW_FROGLIGHT = registerFroglight("yellow_froglight");
    public static final Supplier<Block> LIME_FROGLIGHT = registerFroglight("lime_froglight");
    public static final Supplier<Block> GREEN_FROGLIGHT = registerFroglight("green_froglight");
    public static final Supplier<Block> BLUE_FROGLIGHT = registerFroglight("blue_froglight");
    public static final Supplier<Block> CYAN_FROGLIGHT = registerFroglight("cyan_froglight");
    public static final Supplier<Block> LIGHT_BLUE_FROGLIGHT = registerFroglight("light_blue_froglight");
    public static final Supplier<Block> MAGENTA_FROGLIGHT = registerFroglight("magenta_froglight");
    public static final Supplier<Block> PURPLE_FROGLIGHT = registerFroglight("purple_froglight");
    public static final Supplier<Block> PINK_FROGLIGHT = registerFroglight("pink_froglight");
    public static final Supplier<Block> WHITE_FROGLIGHT = registerFroglight("white_froglight");
    public static final Supplier<Block> LIGHT_GRAY_FROGLIGHT = registerFroglight("light_gray_froglight");
    public static final Supplier<Block> GRAY_FROGLIGHT = registerFroglight("gray_froglight");
    public static final Supplier<Block> BLACK_FROGLIGHT = registerFroglight("black_froglight");
    public static final Supplier<Block> BROWN_FROGLIGHT = registerFroglight("brown_froglight");

    public static final Supplier<Block> RED_FROGLIGHT_LANTERN = registerFroglightLantern("red_froglight_lantern");
    public static final Supplier<Block> ORANGE_FROGLIGHT_LANTERN = registerFroglightLantern("orange_froglight_lantern");
    public static final Supplier<Block> YELLOW_FROGLIGHT_LANTERN = registerFroglightLantern("yellow_froglight_lantern");
    public static final Supplier<Block> LIME_FROGLIGHT_LANTERN = registerFroglightLantern("lime_froglight_lantern");
    public static final Supplier<Block> GREEN_FROGLIGHT_LANTERN = registerFroglightLantern("green_froglight_lantern");
    public static final Supplier<Block> BLUE_FROGLIGHT_LANTERN = registerFroglightLantern("blue_froglight_lantern");
    public static final Supplier<Block> CYAN_FROGLIGHT_LANTERN = registerFroglightLantern("cyan_froglight_lantern");
    public static final Supplier<Block> LIGHT_BLUE_FROGLIGHT_LANTERN = registerFroglightLantern("light_blue_froglight_lantern");
    public static final Supplier<Block> MAGENTA_FROGLIGHT_LANTERN = registerFroglightLantern("magenta_froglight_lantern");
    public static final Supplier<Block> PURPLE_FROGLIGHT_LANTERN = registerFroglightLantern("purple_froglight_lantern");
    public static final Supplier<Block> PINK_FROGLIGHT_LANTERN = registerFroglightLantern("pink_froglight_lantern");
    public static final Supplier<Block> WHITE_FROGLIGHT_LANTERN = registerFroglightLantern("white_froglight_lantern");
    public static final Supplier<Block> LIGHT_GRAY_FROGLIGHT_LANTERN = registerFroglightLantern("light_gray_froglight_lantern");
    public static final Supplier<Block> GRAY_FROGLIGHT_LANTERN = registerFroglightLantern("gray_froglight_lantern");
    public static final Supplier<Block> BLACK_FROGLIGHT_LANTERN = registerFroglightLantern("black_froglight_lantern");
    public static final Supplier<Block> BROWN_FROGLIGHT_LANTERN = registerFroglightLantern("brown_froglight_lantern");

    public static final Supplier<Block> RED_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("red_froglight_ceiling_lamp");
    public static final Supplier<Block> ORANGE_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("orange_froglight_ceiling_lamp");
    public static final Supplier<Block> YELLOW_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("yellow_froglight_ceiling_lamp");
    public static final Supplier<Block> LIME_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("lime_froglight_ceiling_lamp");
    public static final Supplier<Block> GREEN_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("green_froglight_ceiling_lamp");
    public static final Supplier<Block> BLUE_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("blue_froglight_ceiling_lamp");
    public static final Supplier<Block> CYAN_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("cyan_froglight_ceiling_lamp");
    public static final Supplier<Block> LIGHT_BLUE_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("light_blue_froglight_ceiling_lamp");
    public static final Supplier<Block> MAGENTA_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("magenta_froglight_ceiling_lamp");
    public static final Supplier<Block> PURPLE_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("purple_froglight_ceiling_lamp");
    public static final Supplier<Block> PINK_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("pink_froglight_ceiling_lamp");
    public static final Supplier<Block> WHITE_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("white_froglight_ceiling_lamp");
    public static final Supplier<Block> LIGHT_GRAY_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("light_gray_froglight_ceiling_lamp");
    public static final Supplier<Block> GRAY_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("gray_froglight_ceiling_lamp");
    public static final Supplier<Block> BLACK_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("black_froglight_ceiling_lamp");
    public static final Supplier<Block> BROWN_FROGLIGHT_CEILING_LAMP = registerFroglightLamp("brown_froglight_ceiling_lamp");

    public static final Supplier<Block> RED_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("red_froglight_floor_lamp");
    public static final Supplier<Block> ORANGE_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("orange_froglight_floor_lamp");
    public static final Supplier<Block> YELLOW_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("yellow_froglight_floor_lamp");
    public static final Supplier<Block> LIME_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("lime_froglight_floor_lamp");
    public static final Supplier<Block> GREEN_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("green_froglight_floor_lamp");
    public static final Supplier<Block> BLUE_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("blue_froglight_floor_lamp");
    public static final Supplier<Block> CYAN_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("cyan_froglight_floor_lamp");
    public static final Supplier<Block> LIGHT_BLUE_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("light_blue_froglight_floor_lamp");
    public static final Supplier<Block> MAGENTA_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("magenta_froglight_floor_lamp");
    public static final Supplier<Block> PURPLE_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("purple_froglight_floor_lamp");
    public static final Supplier<Block> PINK_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("pink_froglight_floor_lamp");
    public static final Supplier<Block> WHITE_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("white_froglight_floor_lamp");
    public static final Supplier<Block> LIGHT_GRAY_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("light_gray_froglight_floor_lamp");
    public static final Supplier<Block> GRAY_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("gray_froglight_floor_lamp");
    public static final Supplier<Block> BLACK_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("black_froglight_floor_lamp");
    public static final Supplier<Block> BROWN_FROGLIGHT_FLOOR_LAMP = registerFroglightLamp("brown_froglight_floor_lamp");


    private static Supplier<Block> registerFroglightLamp(String name) {
        //? if neoforge {
        /*return BLOCKS.<Block>registerBlock(name, props -> new FroglightLampBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)
                .luminance(state -> state.get(FroglightLampBlock.LIT) ? 15 : 0)
                .requiresTool()));
        *///?} elif >=1.21.4 {
        /*Identifier id = FroglightsId.of(name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = new FroglightLampBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)
                .registryKey(key)
                .luminance(state -> state.get(FroglightLampBlock.LIT) ? 15 : 0)
                .requiresTool());
        Registry.register(Registries.BLOCK, key, block);
        Items.register(block);
        return () -> block;
        *///?} elif >=1.21 {
        return registerBlock(name,
                new FroglightLampBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)
                        .luminance(state -> state.get(FroglightLampBlock.LIT) ? 15 : 0)
                        .requiresTool()
                )
        );
        //?} else {
        /*return registerBlock(name,
                new FroglightLampBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)
                        .luminance(state -> state.get(FroglightLampBlock.LIT) ? 15 : 0)
                        .requiresTool()
                )
        );
        *///?}
    }

    private static Supplier<Block> registerFroglightLantern(String name) {
        //? if neoforge {
        /*return BLOCKS.<Block>registerBlock(name, props -> new LanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)
                .requiresTool()));
        *///?} elif >=1.21.4 {
        /*Identifier id = FroglightsId.of(name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = new LanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)
                .registryKey(key)
                .requiresTool());
        Registry.register(Registries.BLOCK, key, block);
        Items.register(block);
        return () -> block;
        *///?} elif >=1.21 {
        return registerBlock(name,
                new LanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)
                        .requiresTool()
                )
        );
        //?} else {
        /*return registerBlock(name,
                new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)
                        .requiresTool()
                )
        );
        *///?}
    }

    private static Supplier<Block> registerFroglight(String name) {
        //? if neoforge {
        /*return BLOCKS.<Block>registerBlock(name, props -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)
                .luminance(state -> 15)
                .requiresTool()));
        *///?} elif >=1.21.4 {
        /*Identifier id = FroglightsId.of(name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = new PillarBlock(AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)
                .registryKey(key)
                .luminance(state -> 15)
                .requiresTool());
        Registry.register(Registries.BLOCK, key, block);
        Items.register(block);
        return () -> block;
        *///?} elif >=1.21 {
        return registerBlock(name,
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)
                        .luminance(state -> 15)
                        .requiresTool()
                )
        );
        //?} else {
        /*return registerBlock(name,
                new PillarBlock(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)
                        .luminance(15)
                        .requiresTool()
                )
        );
        *///?}
    }

    //? if <1.21.4 {
    @SuppressWarnings("SameParameterValue")
    private static Supplier<Block> registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        Block registered = Registry.register(Registries.BLOCK, FroglightsId.of(name), block);
        return () -> registered;
    }

    @SuppressWarnings("UnusedReturnValue")
    private static Item registerBlockItem(String name, Block block) {
        //? if >=1.21 {
        return Registry.register(Registries.ITEM, FroglightsId.of(name),
                new BlockItem(block, new Item.Settings()));
        //?} else {
        /*return Registry.register(Registries.ITEM, FroglightsId.of(name),
                new BlockItem(block, new FabricItemSettings()));
        *///?}
    }
    //?}

    public static void registerModBlocks() {
        FroglightsReimaginedCore.LOGGER.info("Registering ModBlocks for " + FroglightsReimaginedCore.MOD_ID);
    }
}
