package com.dontouchat.followalong;

import com.dontouchat.followalong.item.ModItemGroups;
import com.dontouchat.followalong.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FollowAlongMod implements ModInitializer {
	public static final String MOD_ID = "follow-along";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}