package net.xanthian.runningshoes.item.client;

import net.minecraft.resources.ResourceLocation;

import net.xanthian.runningshoes.Initialise;
import net.xanthian.runningshoes.item.custom.RunningShoeItem;

import software.bernie.geckolib.model.GeoModel;


public class RunningShoeModel extends GeoModel<RunningShoeItem> {

    @Override
    public ResourceLocation getModelResource(RunningShoeItem object) {
        return new ResourceLocation(Initialise.MOD_ID, "geo/running_shoes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RunningShoeItem object) {
        return new ResourceLocation(Initialise.MOD_ID, "textures/armor/running_shoes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RunningShoeItem animatable) {
        return new ResourceLocation(Initialise.MOD_ID, "animations/running_shoes.animation.json");
    }
}