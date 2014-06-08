package com.radixshock.mysticcreatures.core.forge;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;

import org.lwjgl.opengl.GL11;

import com.radixshock.mysticcreatures.client.model.AbstractSpecial;
import com.radixshock.mysticcreatures.core.MysticCreatures;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHooks
{
	@SubscribeEvent
	public void onPlayerRenderSpecials(RenderPlayerEvent.Specials.Post event)
	{
		final AbstractClientPlayer player = (AbstractClientPlayer) event.entityPlayer;
		final float interpolation = event.partialRenderTick;

		float interpolatedYaw = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * interpolation - (player.prevRenderYawOffset + (player.renderYawOffset - player.prevRenderYawOffset) * interpolation);
		float interpolatedPitch = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * interpolation;

		for (int i = 0; i < 2; i++)
		{
			final AbstractSpecial modelUse = i == 0 ? MysticCreatures.getInstance().modelAntlerUse : i == 1 ? MysticCreatures.getInstance().modelEarUse : MysticCreatures.getInstance().modelHornUse;

			if (modelUse != null)
			{
				modelUse.bindTexture();

				GL11.glPushMatrix();
				{
					float interpolatedYawOffset = MysticCreatures.interpolateRotation(player.prevRenderYawOffset, player.renderYawOffset, interpolation);
					float interpolatedYawHead = MysticCreatures.interpolateRotation(player.prevRotationYawHead, player.rotationYawHead, interpolation);
					modelUse.setHeadRotationForAllModels(interpolatedPitch, interpolatedYawHead - interpolatedYawOffset);
					modelUse.render(event.entityPlayer, interpolatedPitch, interpolatedYawHead - interpolatedYawOffset, 0, 0.0F, 0.0F, 0.0625F);
				}
				GL11.glPopMatrix();
			}
		}
	}
}
