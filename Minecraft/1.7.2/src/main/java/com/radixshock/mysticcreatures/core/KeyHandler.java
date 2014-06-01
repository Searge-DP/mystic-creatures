package com.radixshock.mysticcreatures.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyHandler
{
	private KeyBinding keybindOpenHeadgearMenu = new KeyBinding("Open Headgear Menu", Keyboard.KEY_F, "Mystic Creatures");
	
	public KeyHandler()
	{
		ClientRegistry.registerKeyBinding(keybindOpenHeadgearMenu);
	}
	
	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event)
	{
		if (keybindOpenHeadgearMenu.getIsKeyPressed() && Minecraft.getMinecraft().currentScreen == null)
		{
			
		}
	}
}
