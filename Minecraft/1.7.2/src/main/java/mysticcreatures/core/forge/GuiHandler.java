/*******************************************************************************
 * GuiHandler.java
 * Copyright (c) 2014 Radix-Shock Entertainment.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/

package mysticcreatures.core.forge;

import mysticcreatures.client.gui.GuiSpecialsSelect;
import mysticcreatures.core.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

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
