package io.github.dingotime.partypack;

import io.github.dingotime.partypack.block.ModBlocks;
import io.github.dingotime.partypack.item.ModItemGroup;
import io.github.dingotime.partypack.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PartyPack implements ModInitializer {

//	Gives an autofill phrase to the mod id and calls it in the logger
	public static final String MOD_ID = "partypack";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(ModContainer partypack){

		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
