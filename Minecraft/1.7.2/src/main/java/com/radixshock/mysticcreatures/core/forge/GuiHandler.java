package com.radixshock.mysticcreatures.core.forge;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.radixshock.mysticcreatures.client.gui.GuiSpecialsSelect;
import com.radixshock.mysticcreatures.core.Constants;
import com.radixshock.radixcore.logic.LogicHelper;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int posX, int posY, int posZ) 
	{
		return null;
	}

	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int posX, int posY, int posZ) 
	{
		switch (guiId)
		{
		case Constants.ID_GUI_SELECT:
			return new GuiSpecialsSelect(player);
		default:
			throw new IllegalArgumentException("Unknown GUI ID.");
		}
	}
}
