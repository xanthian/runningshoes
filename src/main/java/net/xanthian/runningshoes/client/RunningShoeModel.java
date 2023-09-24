package net.xanthian.runningshoes.client;

import net.minecraft.util.Identifier;

import net.xanthian.Initialise;
import net.xanthian.runningshoes.items.RunningShoeItem;

import software.bernie.geckolib.model.GeoModel;

public class RunningShoeModel extends GeoModel<RunningShoeItem> {

    @Override
    public Identifier getModelResource(RunningShoeItem object) {
        return new Identifier(Initialise.MOD_ID, "geo/running_shoes.geo.json");
    }

    @Override
    public Identifier getTextureResource(RunningShoeItem object) {
        return new Identifier(Initialise.MOD_ID, "textures/armor/running_shoes.png");
    }

    @Override
    public Identifier getAnimationResource(RunningShoeItem animatable) {
        return new Identifier(Initialise.MOD_ID, "animations/running_shoes.animation.json");
    }
}