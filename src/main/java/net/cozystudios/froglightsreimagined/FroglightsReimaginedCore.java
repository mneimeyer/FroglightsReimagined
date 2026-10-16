package net.cozystudios.froglightsreimagined;

import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.cozystudios.froglightsreimagined.item.ModItemGroups;
//? if fabric {
import net.fabricmc.api.ModInitializer;
//?} else if neoforge {
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
*///?}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//? if fabric {
public class FroglightsReimaginedCore implements ModInitializer {
//?} else if neoforge {
/*@Mod(FroglightsReimaginedCore.MOD_ID)
public class FroglightsReimaginedCore {
*///?}
	public static final String MOD_ID = "froglightsreimagined";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//? if fabric {
	@Override
	public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();

		LOGGER.info("FroglightsReimagined initialized!");
	}
	//?} else if neoforge {
	/*public FroglightsReimaginedCore(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.ITEMS.register(modEventBus);
        ModBlocks.registerModBlocks();
        ModItemGroups.CREATIVE_MODE_TABS.register(modEventBus);
        ModItemGroups.registerItemGroups();

		LOGGER.info("FroglightsReimagined initialized!");
	}
	*///?}
}
