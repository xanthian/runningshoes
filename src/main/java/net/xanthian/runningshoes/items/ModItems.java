package net.xanthian.runningshoes.items;

import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.item.Item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.Initialise;

public class ModItems {

    public static final Item RUNNING_SHOES = new RunningShoeItem();

    public static void registerItems(){
        registerItem("running_shoes", RUNNING_SHOES);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
}