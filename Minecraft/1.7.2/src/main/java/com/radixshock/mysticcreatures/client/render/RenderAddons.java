/*******************************************************************************
 * RenderAddons.java
 * Copyright (c) 2014 Radix-Shock Entertainment.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/

package com.radixshock.mysticcreatures.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.radixshock.mysticcreatures.client.model.ModelAddons;
import com.radixshock.mysticcreatures.entity.EntityAddon;

public class RenderAddons extends Render
{
	private static final ResourceLocation	TEXTURE	= new ResourceLocation("mysticcreatures");
	private final ModelBase					modelAddons;
	
	public RenderAddons()
	{
		shadowSize = 0.0F;
		modelAddons = new ModelAddons();
	}
	
	public void render(EntityAddon entityAddon, double posX, double posY, double posZ, float rotationYaw, float rotationPitch)
	{
		GL11.glPushMatrix();
		{
			final double delta = rotationYaw - entityAddon.rotationYaw;				//Rotation yaw seems very sporadic. Calculate a delta.
			float rotation = delta > 2.0F ? entityAddon.rotationYaw : rotationYaw;  //Use provided if delta is less than 2.0. This smoothes turning.
			
			GL11.glTranslatef(0.0F, -0.1F, 0.0F);				//Translate down to correct model.
			GL11.glRotatef(180, 1, 0, 0);						//Rotate 180 since model is rendered upside down.
			GL11.glRotatef(rotation, 0, 1, 0);					//Rotate Y for the calculated rotation above.
			GL11.glRotatef(entityAddon.rotationPitch, 1, 0, 0);	//Rotate X for the player's rotation pitch.
			GL11.glTranslatef(0.03F, 0.0F, 0.0F);				//Move inward to attach model to head.
			
			bindTexture(getEntityTexture(entityAddon));
			modelAddons.render(entityAddon, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		GL11.glPopMatrix();
	}
	
	@Override
	public void doRender(Entity entity, double posX, double posY, double posZ, float rotationYaw, float rotationPitch)
	{
		render((EntityAddon) entity, posX, posY, posZ, rotationYaw, rotationPitch);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return TEXTURE;
	}
}
