package com.radixshock.mysticcreatures.core.forge;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;

import org.lwjgl.opengl.GL11;

import com.radixshock.mysticcreatures.client.model.ModelAntlers1;
import com.radixshock.mysticcreatures.core.MysticCreatures;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventHooks
{
	final ModelAntlers1 modelAddons = new ModelAntlers1();

	@SubscribeEvent
	public void onPlayerRenderSpecials(RenderPlayerEvent.Specials.Post event)
	{
		final AbstractClientPlayer player = (AbstractClientPlayer) event.entityPlayer;
		final float interpolation = event.partialRenderTick;

		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("H"));

		float interpolatedYaw = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * interpolation - (player.prevRenderYawOffset + (player.renderYawOffset - player.prevRenderYawOffset) * interpolation);
		float interpolatedPitch = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * interpolation;

		for (int i = 0; i < 2; i ++)
		{
			GL11.glPushMatrix();
			{
				if (i == 1)
				{
					GL11.glRotatef(interpolatedYaw, 0.0F, 1.0F, 0.0F);
					GL11.glRotatef(interpolatedPitch, 1.0F, 0.0F, 0.0F);
					GL11.glTranslatef(0.135F * (float)(i * 2 - 1), 0.0F, 0.0F);
					GL11.glTranslatef(0.0F, -0.475F, 0.0F);
					GL11.glRotatef(180, 0, 1, 0);
					GL11.glRotatef(-interpolatedPitch, 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(-interpolatedYaw, 0.0F, 1.0F, 0.0F);
				}

				else
				{
					GL11.glRotatef(interpolatedYaw, 0.0F, 1.0F, 0.0F);
					GL11.glRotatef(interpolatedPitch, 1.0F, 0.0F, 0.0F);
					GL11.glTranslatef(0.135F * (float)(i * 2 - 1), 0.0F, 0.0F);
					GL11.glTranslatef(0.0F, -0.475F, 0.0F);
					GL11.glRotatef(-interpolatedPitch, 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(-interpolatedYaw, 0.0F, 1.0F, 0.0F);
				}

				float interpolatedYawOffset = MysticCreatures.interpolateRotation(player.prevRenderYawOffset, player.renderYawOffset, interpolation);
				float interpolatedYawHead = MysticCreatures.interpolateRotation(player.prevRotationYawHead, player.rotationYawHead, interpolation);
				modelAddons.setHeadRotationForAllModels(interpolatedPitch, interpolatedYawHead - interpolatedYawOffset);
				modelAddons.render(event.entityPlayer, interpolatedPitch, interpolatedYawHead - interpolatedYawOffset, i, 0.0F, 0.0F, 0.0625F);
			}
			GL11.glPopMatrix();
		}
	}
}
