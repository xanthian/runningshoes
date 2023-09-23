package net.xanthian;

import net.fabricmc.api.ClientModInitializer;

import net.xanthian.runningshoes.client.RunningShoeRenderer;
import net.xanthian.runningshoes.items.ModItems;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class InitialiseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        GeoArmorRenderer.registerArmorRenderer(new RunningShoeRenderer(),
                ModItems.RUNNING_SHOES);
    }
}
