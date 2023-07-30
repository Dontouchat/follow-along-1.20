package com.dontouchat.followalong.block;

import com.dontouchat.followalong.FollowAlongMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CONDENSED_WOOL = registerBlock("condensed_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FollowAlongMod.MOD_ID, name),
                block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(FollowAlongMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        FollowAlongMod.LOGGER.info("Registering ModBlocks for " + FollowAlongMod.MOD_ID);
    }
}
