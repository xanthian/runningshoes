package net.xanthian.runningshoes.client;

import net.xanthian.runningshoes.items.RunningShoeItem;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RunningShoeRenderer extends GeoArmorRenderer<RunningShoeItem> {
    public RunningShoeRenderer() {
        super(new RunningShoeModel());

        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}