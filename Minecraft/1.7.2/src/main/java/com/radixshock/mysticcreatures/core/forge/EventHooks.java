package com.radixshock.mysticcreatures.core.forge;

import net.minecraft.entity.player.EntityPlayer;

import com.radixshock.mysticcreatures.entity.EntityAddon;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventHooks
{
	@SubscribeEvent
	public void playerLoggedInEventHandler(PlayerLoggedInEvent event)
	{
		if (!event.player.worldObj.isRemote)
		{
			final EntityPlayer player = event.player;
			final EntityAddon addon = new EntityAddon(event.player.worldObj);
			
			addon.setPosition(player.posX, player.posY, player.posZ);
			addon.mountEntity(player);
			player.worldObj.spawnEntityInWorld(addon);
		}
	}
}
