package com.dontouchat.followalong.item;

import com.dontouchat.followalong.FollowAlongMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup FOLLOW_ALONG_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FollowAlongMod.MOD_ID,"follow_along"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.follow_along"))
                            .icon(() -> new ItemStack(ModItems.BROKEN_SHEARS)).entries((displayContext, entries) -> {
                                entries.add(ModItems.PURE_MUSCLE);
                                entries.add(ModItems.BROKEN_SHEARS);
                            }).build());

    public static void registerItemGroups()
    {
        FollowAlongMod.LOGGER.info("Registering Item Groups for " + FollowAlongMod.MOD_ID);
    }
}
