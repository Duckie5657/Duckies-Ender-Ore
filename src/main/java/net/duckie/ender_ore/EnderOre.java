package net.duckie.ender_ore;

import net.duckie.ender_ore.block.ModBlocks;
import net.duckie.ender_ore.item.ModItemGroups;
import net.duckie.ender_ore.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class EnderOre implements ModInitializer {
	public static final String MOD_ID = "ender_ore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}