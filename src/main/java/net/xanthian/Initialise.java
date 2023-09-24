package net.xanthian;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

import net.xanthian.runningshoes.items.ModItems;

import software.bernie.geckolib.GeckoLib;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "runningshoes";

	@Override
	public void onInitialize() {

		ModItems.registerItems();

		GeckoLib.initialize();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.addAfter(Items.LEATHER_BOOTS, ModItems.RUNNING_SHOES);
		});

	}
}