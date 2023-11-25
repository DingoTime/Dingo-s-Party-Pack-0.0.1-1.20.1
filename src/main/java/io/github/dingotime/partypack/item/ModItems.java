package io.github.dingotime.partypack.item;

import io.github.dingotime.partypack.PartyPack;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	public static Item PAPER_CROWN = registerItem("papercrown", new Item(new QuiltItemSettings()));
	public static Item BLACK_PAPER_CROWN = registerItem("blackpapercrown", new Item(new QuiltItemSettings()));
	public static Item BLUE_PAPER_CROWN = registerItem("bluepapercrown", new Item(new QuiltItemSettings()));
	public static Item BROWN_PAPER_CROWN = registerItem("brownpapercrown", new Item(new QuiltItemSettings()));
	public static Item CYAN_PAPER_CROWN = registerItem("cyanpapercrown", new Item(new QuiltItemSettings()));
	public static Item GREEN_PAPER_CROWN = registerItem("greenpapercrown", new Item(new QuiltItemSettings()));
	public static Item GREY_PAPER_CROWN = registerItem("greypapercrown", new Item(new QuiltItemSettings()));
	public static Item LIGHT_BLUE_PAPER_CROWN = registerItem("lightbluepapercrown", new Item(new QuiltItemSettings()));
	public static Item LIGHT_GREY_PAPER_CROWN = registerItem("lightgreypapercrown", new Item(new QuiltItemSettings()));
	public static Item LIME_GREEN_PAPER_CROWN = registerItem("limegreenpapercrown", new Item(new QuiltItemSettings()));
	public static Item MAGENTA_PAPER_CROWN = registerItem("magentapapercrown", new Item(new QuiltItemSettings()));
	public static Item ORANGE_PAPER_CROWN = registerItem("orangepapercrown", new Item(new QuiltItemSettings()));
	public static Item PINK_PAPER_CROWN = registerItem("pinkpapercrown", new Item(new QuiltItemSettings()));
	public static Item PURPLE_PAPER_CROWN = registerItem("purplepapercrown", new Item(new QuiltItemSettings()));
	public static Item RED_PAPER_CROWN = registerItem("redpapercrown", new Item(new QuiltItemSettings()));
	public static Item YELLOW_PAPER_CROWN = registerItem("yellowpapercrown", new Item(new QuiltItemSettings()));

	private static Item registerItem(String name, Item item){
		return Registry.register(Registries.ITEM, new Identifier(PartyPack.MOD_ID, name), item);
	}

	public static void registerModItems(){
		PartyPack.LOGGER.info("Registering Mod Items for " + PartyPack.MOD_ID);
	}
}
