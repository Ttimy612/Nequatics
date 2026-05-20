package com.ttimy.ttimysfirstmod.datagen;

import com.ttimy.ttimysfirstmod.Block.ModBlocks;
import com.ttimy.ttimysfirstmod.item.Moditems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.NEQUATIUM_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.NEQUATIC_MECHINE_CORE);

    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(Moditems.NEQUATIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.RAW_NEQUATIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(Moditems.NEQUATIUM_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModBlocks.NEQUATIC_MECHINE_CORE.asItem(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModBlocks.NEQUATIUM_BLOCK.asItem(), ModelTemplates.FLAT_ITEM);















    }
}
