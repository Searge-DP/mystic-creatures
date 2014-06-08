/*******************************************************************************
 * KeyHandler.java
 * Copyright (c) 2014 Radix-Shock Entertainment.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/

package mysticcreatures.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyHandler
{
	private final KeyBinding	keybindOpenHeadgearMenu	= new KeyBinding("Open Headgear Menu", Keyboard.KEY_F, "Mystic Creatures");

	public KeyHandler()
	{
		ClientRegistry.registerKeyBinding(keybindOpenHeadgearMenu);
	}

	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event)
	{
		if (keybindOpenHeadgearMenu.getIsKeyPressed() && Minecraft.getMinecraft().currentScreen == null)
		{
			final EntityPlayer player = Minecraft.getMinecraft().thePlayer;
			player.openGui(MysticCreatures.getInstance(), Constants.ID_GUI_SELECT, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
		}
	}
}
