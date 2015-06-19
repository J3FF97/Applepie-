package com.j3ff97.nommablez.reference;

import com.j3ff97.nommablez.utility.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public final class Textures
{
    public static final String PREFIX = Reference.ID.toLowerCase() + ":";

    public static final class GUI
    {
        protected static final String           GUI_TEXTURE_LOCATION = "textures/gui/";
        public static final    ResourceLocation OVEN                 = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "oven.png");
    }
}
