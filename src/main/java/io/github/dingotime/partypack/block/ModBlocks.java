package io.github.dingotime.partypack.block;

import io.github.dingotime.partypack.PartyPack;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.LoggerFactory;

public class ModBlocks {

	public static final Block CARDBOARD_BOX = registerBlock("cardboardbox", new Block
		(QuiltBlockSettings.copyOf(Blocks.BARREL)));

	private static Block registerBlock(String name, Block block){
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(PartyPack.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block){
		return Registry.register(Registries.ITEM, new Identifier(PartyPack.MOD_ID, name),
			new BlockItem(block, new QuiltItemSettings()));
	}

	public static void registerModBlocks(){
		PartyPack.LOGGER.info("Registering ModBlocks for " + LoggerFactory.getLogger(PartyPack.MOD_ID));
	}
}
