package com.j3ff97.nommablez.tab;

import com.j3ff97.nommablez.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab
{
    public static final CreativeTabs NOM_TAB = new CreativeTabs(Reference.ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.apple;
        }
    };
}
