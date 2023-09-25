package net.xanthian.runningshoes.item.client;

import net.xanthian.runningshoes.item.custom.RunningShoeItem;

import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RunningShoeRenderer extends GeoArmorRenderer<RunningShoeItem> {
    public RunningShoeRenderer() {
        super(new RunningShoeModel());
    }
}