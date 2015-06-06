package com.j3ff97.nommablez;

import com.j3ff97.nommablez.proxy.CommonProxy;
import com.j3ff97.nommablez.reference.Reference;
import com.j3ff97.nommablez.utility.LogHelper;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.ID, name= Reference.NAME,  version = Reference.VERSION, guiFactory = Reference.GUIFACTORY)
public class Nommablez
{
    @Mod.Instance(Reference.ID)
    public static Nommablez instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Nommablez! Starting PreInit");
        LogHelper.info("Made By: " + Reference.AUTHOR);

        proxy.preInit(event);

        LogHelper.info("Nommablez! PreInit Complete!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Nommablez! Starting Init");

        proxy.init(event);

        LogHelper.info("Nommablez! Init complete!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Nommablez! Starting PostInit");

        proxy.postInit(event);

        LogHelper.info("Nommablez! PostInit complete");
        LogHelper.info("Nommablez! Loading Complete! Bon Appetit!");
    }
}
