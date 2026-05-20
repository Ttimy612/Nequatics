package com.ttimy.ttimysfirstmod;

import com.ttimy.ttimysfirstmod.Block.ModBlocks;
import com.ttimy.ttimysfirstmod.CreativeModeTab.CreativeModeTabs;
import com.ttimy.ttimysfirstmod.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ttimymod implements ModInitializer {
	public static final String MOD_ID = "ttimys-mod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CreativeModeTabs.registerModCreativeModeTabs();

		Moditems.registerModitems();
		ModBlocks.registerModBlocks();

















	}
}