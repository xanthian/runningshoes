package net.xanthian.runningshoes.client;

import net.xanthian.runningshoes.items.RunningShoeItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RunningShoeRenderer extends GeoArmorRenderer<RunningShoeItem> {
    public RunningShoeRenderer() {
        super(new RunningShoeModel());
    }
}