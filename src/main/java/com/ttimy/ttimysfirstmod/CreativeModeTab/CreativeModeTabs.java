package com.ttimy.ttimysfirstmod.CreativeModeTab;

import com.ttimy.ttimysfirstmod.Block.ModBlocks;
import com.ttimy.ttimysfirstmod.Ttimymod;
import com.ttimy.ttimysfirstmod.item.Moditems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeModeTabs {
    public static final CreativeModeTab NEQUATICS_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Ttimymod.MOD_ID, "nequatics_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(Moditems.NEQUATIUM))
                    .title(Component.translatable("creativemodetab.main.nequatics'_items"))
                    .displayItems(((parameters, output) -> {
                        output.accept(Moditems.NEQUATIUM);
                        output.accept(Moditems.RAW_NEQUATIUM);
                        output.accept(Moditems.NEQUATIUM_NUGGET);

                    })).build());
    public static final CreativeModeTab NEQUATICS_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Ttimymod.MOD_ID, "nequatics_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.NEQUATIUM_BLOCK))
                    .title(Component.translatable("creativemodetab.main.nequatics'_blocks"))
                    .displayItems(((parameters, output) -> {
                        output.accept(ModBlocks.NEQUATIUM_BLOCK);

                    })).build());







    public static void registerModCreativeModeTabs() {
        Ttimymod.LOGGER.info("Registering Creative Mode Tabs for " + Ttimymod.MOD_ID);
    }
}




















