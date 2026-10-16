package net.cozystudios.froglightsreimagined;

import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.minecraft.block.Block;
//? if fabric {
import net.fabricmc.api.ClientModInitializer;
//? if <1.21.6 {
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
//?} else {
/*import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
*///?}
//?} else if neoforge {
/*import net.minecraft.client.render.RenderLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
*///?}

//? if fabric {
public class FroglightsReimaginedCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
//?} else if neoforge {
/*@EventBusSubscriber(modid = FroglightsReimaginedCore.MOD_ID, value = Dist.CLIENT)
public class FroglightsReimaginedCoreClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
*///?}
        setCutout(ModBlocks.RED_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.ORANGE_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.YELLOW_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.LIME_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.GREEN_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.BLUE_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.LIGHT_BLUE_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.CYAN_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.MAGENTA_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.PURPLE_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.PINK_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.WHITE_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.BROWN_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.BLACK_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.LIGHT_GRAY_FROGLIGHT_CEILING_LAMP);
        setCutout(ModBlocks.GRAY_FROGLIGHT_CEILING_LAMP);

        setCutout(ModBlocks.RED_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.ORANGE_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.YELLOW_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.LIME_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.GREEN_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.BLUE_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.LIGHT_BLUE_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.CYAN_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.MAGENTA_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.PURPLE_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.PINK_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.WHITE_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.BROWN_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.BLACK_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.LIGHT_GRAY_FROGLIGHT_FLOOR_LAMP);
        setCutout(ModBlocks.GRAY_FROGLIGHT_FLOOR_LAMP);

        setCutout(ModBlocks.RED_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.ORANGE_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.YELLOW_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.LIME_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.GREEN_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.BLUE_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.LIGHT_BLUE_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.CYAN_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.MAGENTA_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.PURPLE_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.PINK_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.WHITE_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.BROWN_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.BLACK_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.LIGHT_GRAY_FROGLIGHT_LANTERN);
        setCutout(ModBlocks.GRAY_FROGLIGHT_LANTERN);
    }

    private static void setCutout(Block block) {
        //? if fabric {
        //? if <1.21.6 {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        //?} else {
        /*BlockRenderLayerMap.putBlock(block, BlockRenderLayer.CUTOUT);
        *///?}
        //?} else if neoforge {
        /*net.minecraft.client.render.RenderLayers.setRenderLayer(block, RenderLayer.getCutout());
        *///?}
    }
}
