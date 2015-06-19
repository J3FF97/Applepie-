package com.j3ff97.nommablez.block;

import com.j3ff97.nommablez.tab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNom extends Block
{

    public BlockNom()
    {
        this(Material.rock);
    }

    public BlockNom(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTab.NOM_TAB);
    }
}
