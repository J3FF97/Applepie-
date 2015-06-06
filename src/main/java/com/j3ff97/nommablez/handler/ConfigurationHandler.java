package com.j3ff97.nommablez.handler;

import com.j3ff97.nommablez.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static boolean testBool = false;

    public static void init(File config)
    {
        if(configuration == null)
        {
            configuration = new Configuration(config);
            loadConfiguration();
        }
    }

    public static void loadConfiguration()
    {
        String desc;

        desc= "TestBool";
        testBool = getBool("testBool", testBool, desc);
    }

    public static boolean getBool(String propName, boolean default_, String desc)
    {
        Property property = configuration.get(Configuration.CATEGORY_GENERAL, propName, default_);
        property.comment = desc;
        return property.getBoolean(default_);
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.ID))
        {
            loadConfiguration();
        }
    }
}
