package com.ttimy.ttimysfirstmod.datagen;

import com.ttimy.ttimysfirstmod.Block.ModBlocks;
import com.ttimy.ttimysfirstmod.item.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> NEQUATICS_SMELTABLES = List.of(Moditems.RAW_NEQUATIUM);

                // 1. Blasting recipe for Nequatium
                oreBlasting(NEQUATICS_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, Moditems.NEQUATIUM, 0.25f, 200, "nequatiumcooking");

                shaped(RecipeCategory.MISC, Moditems.RAW_NEQUATIUM)
                        .pattern("PP")
                        .pattern("SI")
                        .define('P', Items.PRISMARINE_SHARD)
                        .define('S', Items.SOUL_SAND)
                        .define('I', Items.IRON_NUGGET)
                        .unlockedBy(getHasName(Items.PRISMARINE_SHARD), has(Items.PRISMARINE_SHARD))
                        .unlockedBy(getHasName(Items.SOUL_SAND), has(Items.SOUL_SAND))
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output, "raw_nequatium_from_shards");

                shaped(RecipeCategory.MISC, Items.PRISMARINE_SHARD)
                        .pattern("PP")
                        .pattern("PP")
                        .define('P', Items.PRISMARINE_CRYSTALS)
                        .unlockedBy(getHasName(Items.PRISMARINE_SHARD), has(Items.PRISMARINE_SHARD))
                        .save(output, "shards"); // Custom ID to prevent conflicts

                shaped(RecipeCategory.MISC, Moditems.NEQUATIUM)
                        .pattern("NNN")
                        .pattern("NNN")
                        .pattern("NNN")
                        .define('N', Moditems.NEQUATIUM_NUGGET)
                        .unlockedBy(getHasName(Items.PRISMARINE_SHARD), has(Items.PRISMARINE_SHARD))
                        .unlockedBy(getHasName(Moditems.NEQUATIUM_NUGGET), has(Moditems.NEQUATIUM_NUGGET))
                        .save(output, "nequatium_from_nuggets");

                shaped(RecipeCategory.MISC, ModBlocks.NEQUATIUM_BLOCK)
                        .pattern("NNN")
                        .pattern("NNN")
                        .pattern("NNN")
                        .define('N', Moditems.NEQUATIUM)
                        .unlockedBy(getHasName(Moditems.NEQUATIUM), has(Moditems.NEQUATIUM))
                        .save(output, "block_nequatium");

                shaped(RecipeCategory.MISC, ModBlocks.NEQUATIC_MECHINE_CORE )
                        .pattern("SQS")
                        .pattern("RBR")
                        .pattern("CPC")
                        .define('S', Items.PRISMARINE_SHARD)
                        .define('Q', Items.QUARTZ)
                        .define('R', Moditems.NEQUATIUM)
                        .define('B', Items.HEART_OF_THE_SEA)
                        .define('C', Items.PRISMARINE_CRYSTALS)
                        .define('P', Items.PISTON)
                        .unlockedBy(getHasName(Moditems.NEQUATIUM), has(Moditems.NEQUATIUM))
                        .save(output, "mechinecore"); // Custom ID to prevent conflicts


                shapeless(RecipeCategory.MISC, Moditems.NEQUATIUM_NUGGET, 9)
                        .requires(Moditems.NEQUATIUM)
                        .unlockedBy(getHasName(Moditems.NEQUATIUM), has(Moditems.NEQUATIUM))
                        .save(output);

                shapeless(RecipeCategory.MISC, Moditems.NEQUATIUM, 9)
                        .requires(ModBlocks.NEQUATIUM_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.NEQUATIUM_BLOCK), has(ModBlocks.NEQUATIUM_BLOCK))
                        .group("nequaticblock")
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Ttimymod recipes";
    }
}
