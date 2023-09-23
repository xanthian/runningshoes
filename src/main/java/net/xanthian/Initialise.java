package net.xanthian;

import net.fabricmc.api.ModInitializer;

import net.xanthian.runningshoes.items.ModItems;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "runningshoes";

	@Override
	public void onInitialize() {

		ModItems.registerItems();

	}
}