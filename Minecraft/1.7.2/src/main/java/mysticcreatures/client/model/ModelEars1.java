/*******************************************************************************
 * ModelEars1.java
 * Copyright (c) 2014 Radix-Shock Entertainment.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/

package mysticcreatures.client.model;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelEars1 extends AbstractSpecial
{
	ModelRenderer refHead;
	ModelRenderer r1;
	ModelRenderer r2;
	ModelRenderer r3;
	ModelRenderer r4;
	ModelRenderer r5;
	ModelRenderer l5;
	ModelRenderer l4;
	ModelRenderer l3;
	ModelRenderer l2;
	ModelRenderer l1;

	public ModelEars1()
	{
		textureWidth = 64;
		textureHeight = 32;

		refHead = new ModelRenderer(this, -6, -4);
		refHead.addBox(-4F, -8F, -4F, 8, 8, 8);
		refHead.setRotationPoint(0F, 0F, 0F);
		refHead.setTextureSize(64, 32);
		refHead.mirror = true;
		setRotation(refHead, 0F, 0F, 0F);
		r1 = new ModelRenderer(this, 4, 12);
		r1.addBox(-4F, -2F, -2F, 1, 1, 1);
		r1.setRotationPoint(0F, 0F, 0F);
		r1.setTextureSize(64, 32);
		r1.mirror = true;
		setRotation(r1, -0.2974289F, 0.0743572F, -0.2602503F);
		r2 = new ModelRenderer(this, 3, 9);
		r2.addBox(-4F, -3F, -2.5F, 1, 1, 2);
		r2.setRotationPoint(0F, 0F, 0F);
		r2.setTextureSize(64, 32);
		r2.mirror = true;
		setRotation(r2, -0.2974289F, 0.0743572F, -0.2602503F);
		r3 = new ModelRenderer(this, 2, 5);
		r3.addBox(-4F, -4F, -3F, 1, 1, 3);
		r3.setRotationPoint(0F, 0F, 0F);
		r3.setTextureSize(64, 32);
		r3.mirror = true;
		setRotation(r3, -0.2974289F, 0.0743572F, -0.2602503F);
		r4 = new ModelRenderer(this, 3, 2);
		r4.addBox(-4F, -5F, -2.5F, 1, 1, 2);
		r4.setRotationPoint(0F, 0F, 0F);
		r4.setTextureSize(64, 32);
		r4.mirror = true;
		setRotation(r4, -0.2974289F, 0.0743572F, -0.2602503F);
		r5 = new ModelRenderer(this, 4, 0);
		r5.addBox(-4F, -6F, -2F, 1, 1, 1);
		r5.setRotationPoint(0F, 0F, 0F);
		r5.setTextureSize(64, 32);
		r5.mirror = true;
		setRotation(r5, -0.2974289F, 0.0743572F, -0.2602503F);
		l5 = new ModelRenderer(this, 4, 0);
		l5.addBox(3F, -6F, -2F, 1, 1, 1);
		l5.setRotationPoint(0F, 0F, 0F);
		l5.setTextureSize(64, 32);
		l5.mirror = true;
		setRotation(l5, -0.2974289F, 0.0743572F, 0.260246F);
		l4 = new ModelRenderer(this, 3, 2);
		l4.addBox(3F, -5F, -2.5F, 1, 1, 2);
		l4.setRotationPoint(0F, 0F, 0F);
		l4.setTextureSize(64, 32);
		l4.mirror = true;
		setRotation(l4, -0.2974289F, 0.0743572F, 0.260246F);
		l3 = new ModelRenderer(this, 2, 5);
		l3.addBox(3F, -4F, -3F, 1, 1, 3);
		l3.setRotationPoint(0F, 0F, 0F);
		l3.setTextureSize(64, 32);
		l3.mirror = true;
		setRotation(l3, -0.2974289F, 0.0743572F, 0.260246F);
		l2 = new ModelRenderer(this, 3, 9);
		l2.addBox(3F, -3F, -2.5F, 1, 1, 2);
		l2.setRotationPoint(0F, 0F, 0F);
		l2.setTextureSize(64, 32);
		l2.mirror = true;
		setRotation(l2, -0.2974289F, 0.0743572F, 0.260246F);
		l1 = new ModelRenderer(this, 4, 12);
		l1.addBox(3F, -2F, -2F, 1, 1, 1);
		l1.setRotationPoint(0F, 0F, 0F);
		l1.setTextureSize(64, 32);
		l1.mirror = true;
		setRotation(l1, -0.2974289F, 0.0743572F, 0.260246F);

		this.modelMap = this.createModelMap(this.getClass());
	}

	@Override
	public void applyRenderCorrections(boolean isLeft)
	{
	}

	@Override
	public void bindTexture()
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("mysticcreatures:textures/Ears1.png"));
	}
}
