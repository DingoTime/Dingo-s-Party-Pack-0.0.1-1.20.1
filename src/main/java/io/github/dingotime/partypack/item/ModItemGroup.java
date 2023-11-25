package io.github.dingotime.partypack.item;


import io.github.dingotime.partypack.PartyPack;
import io.github.dingotime.partypack.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

	public static final ItemGroup PARTY_GROUP = Registry.register(Registries.ITEM_GROUP,
		new Identifier(PartyPack.MOD_ID, "party_group"),
		FabricItemGroup.builder().name(Text.translatable("itemgroup.party_pack_item_group"))
			.icon(() -> new ItemStack(ModItems.RED_PAPER_CROWN))
			.entries((displayContext, entries) -> {

				entries.addItem(ModItems.PAPER_CROWN);
				entries.addItem(ModItems.BLACK_PAPER_CROWN);
				entries.addItem(ModItems.BLUE_PAPER_CROWN);
				entries.addItem(ModItems.BROWN_PAPER_CROWN);
				entries.addItem(ModItems.CYAN_PAPER_CROWN);
				entries.addItem(ModItems.GREEN_PAPER_CROWN);
				entries.addItem(ModItems.GREY_PAPER_CROWN);
				entries.addItem(ModItems.LIGHT_BLUE_PAPER_CROWN);
				entries.addItem(ModItems.LIGHT_GREY_PAPER_CROWN);
				entries.addItem(ModItems.LIME_GREEN_PAPER_CROWN);
				entries.addItem(ModItems.MAGENTA_PAPER_CROWN);
				entries.addItem(ModItems.ORANGE_PAPER_CROWN);
				entries.addItem(ModItems.PINK_PAPER_CROWN);
				entries.addItem(ModItems.PURPLE_PAPER_CROWN);
				entries.addItem(ModItems.RED_PAPER_CROWN);
				entries.addItem(ModItems.YELLOW_PAPER_CROWN);

				entries.addItem(ModItems.CARDBOARD);
				entries.addItem(ModBlocks.CARDBOARD_BOX);

				entries.addItem(ModItems.ICECREAM);

			}).build());

	public static void registerItemGroups(){

	}
}
