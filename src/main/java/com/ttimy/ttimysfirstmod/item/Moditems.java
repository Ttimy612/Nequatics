package com.ttimy.ttimysfirstmod.item;

import com.ttimy.ttimysfirstmod.Ttimymod;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class Moditems {
    public static final Item NEQUATIUM = registerItem( "nequatium", Item::new);
    public static final Item RAW_NEQUATIUM = registerItem( "raw_nequatium", Item::new);
    public static final Item NEQUATIUM_NUGGET = registerItem( "nequatium_nugget", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Ttimymod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Ttimymod.MOD_ID, name)))));

    }




    public static void registerModitems() {
        Ttimymod.LOGGER.info("Registeringr Mod Items for " + Ttimymod.MOD_ID);

        ;
    }
}
