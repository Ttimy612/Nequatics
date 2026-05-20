package com.ttimy.ttimysfirstmod;

import com.ttimy.ttimysfirstmod.datagen.ModBlockLootTableProvider;
import com.ttimy.ttimysfirstmod.datagen.ModBlockTagsProvider;
import com.ttimy.ttimysfirstmod.datagen.ModModelProvider;
import com.ttimy.ttimysfirstmod.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TtimyModDataGen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);

	}
}
