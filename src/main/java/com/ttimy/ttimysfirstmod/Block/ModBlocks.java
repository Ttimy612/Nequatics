package com.ttimy.ttimysfirstmod.Block;

import com.ttimy.ttimysfirstmod.Ttimymod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.Properties;
import java.util.function.Function;

public class ModBlocks {
    public static final Block NEQUATIUM_BLOCK = registerBlock("nequatium_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.TRIAL_SPAWNER)));

    public static final Block NEQUATIC_MECHINE_CORE = registerBlock("nequatic_mechine_core",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Ttimymod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return  Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Ttimymod.MOD_ID, name),toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Ttimymod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Ttimymod.MOD_ID, name)))));
    }


    public static void registerModBlocks() {
        Ttimymod.LOGGER.info("Registering Mod Blocks for " + Ttimymod.MOD_ID);


    }
}
