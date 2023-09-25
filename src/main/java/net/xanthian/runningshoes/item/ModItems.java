package net.xanthian.runningshoes.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraftforge.registries.RegistryObject;
import net.xanthian.runningshoes.Initialise;
import net.xanthian.runningshoes.item.custom.RunningShoeItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> RUNNING_SHOES = ITEMS.register("running_shoes",
            RunningShoeItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}