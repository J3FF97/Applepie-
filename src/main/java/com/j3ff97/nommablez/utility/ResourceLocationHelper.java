package com.j3ff97.nommablez.utility;

import com.j3ff97.nommablez.reference.Reference;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String id, String path)
    {
        return new ResourceLocation(id, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.ID.toLowerCase(), path);
    }
}
