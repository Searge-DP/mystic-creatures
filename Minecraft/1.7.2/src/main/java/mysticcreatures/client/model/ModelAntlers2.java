/*******************************************************************************
 * ModelAntlers2.java
 * Copyright (c) 2014 Radix-Shock Entertainment.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/

package mysticcreatures.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class ModelAntlers2 extends AbstractSpecial
{
	ModelRenderer refHead;
	ModelRenderer r1;
	ModelRenderer r2;
	ModelRenderer r3;
	ModelRenderer r4;
	ModelRenderer r5;
	ModelRenderer r6;
	ModelRenderer r7;
	ModelRenderer l1;
	ModelRenderer l2;
	ModelRenderer l3;
	ModelRenderer l4;
	ModelRenderer l5;
	ModelRenderer l6;
	ModelRenderer l7;

	public ModelAntlers2()
	{
		textureWidth = 64;
		textureHeight = 32;

		l1 = new ModelRenderer(this, 5, 13);
		l1.addBox(0F, -8F, -4F, 2, 2, 1);
		l1.setRotationPoint(0F, 0F, 0F);
		l1.setTextureSize(64, 32);
		l1.mirror = true;
		setRotation(l1, -0.3346075F, 0F, 0.0462667F);
		l2 = new ModelRenderer(this, 5, 11);
		l2.addBox(0.4F, -9F, -4F, 2, 1, 1);
		l2.setRotationPoint(0F, 0F, 0F);
		l2.setTextureSize(64, 32);
		l2.mirror = true;
		setRotation(l2, -0.3346075F, 0F, 0.0462667F);
		l3 = new ModelRenderer(this, 5, 6);
		l3.addBox(0.4F, -11F, -4F, 2, 2, 1);
		l3.setRotationPoint(0F, 0F, 0F);
		l3.setTextureSize(64, 32);
		l3.mirror = true;
		setRotation(l3, -0.3346075F, 0F, 0.0462667F);
		l4 = new ModelRenderer(this, 5, 9);
		l4.addBox(2F, -10F, -4F, 1, 1, 1);
		l4.setRotationPoint(0F, 0F, 0F);
		l4.setTextureSize(64, 32);
		l4.mirror = true;
		setRotation(l4, -0.3346075F, 0F, 0.0462667F);
		l5 = new ModelRenderer(this, 1, 7);
		l5.addBox(2.866667F, -10.53333F, -4F, 1, 1, 1);
		l5.setRotationPoint(0F, 0F, 0F);
		l5.setTextureSize(64, 32);
		l5.mirror = true;
		setRotation(l5, -0.3346075F, 0F, 0.0462667F);
		l6 = new ModelRenderer(this, 2, 2);
		l6.addBox(1.266667F, -13F, -4F, 2, 1, 1);
		l6.setRotationPoint(0F, 0F, 0F);
		l6.setTextureSize(64, 32);
		l6.mirror = true;
		setRotation(l6, -0.3346075F, 0F, 0.0462667F);
		l7 = new ModelRenderer(this, 4, 4);
		l7.addBox(0.8F, -12F, -4F, 2, 1, 1);
		l7.setRotationPoint(0F, 0F, 0F);
		l7.setTextureSize(64, 32);
		l7.mirror = true;
		setRotation(l7, -0.3346075F, 0F, 0.0462667F);
		refHead = new ModelRenderer(this, -39, 0);
		refHead.addBox(-4F, -8F, -4F, 8, 8, 8);
		refHead.setRotationPoint(0F, 0F, 0F);
		refHead.setTextureSize(64, 32);
		refHead.mirror = true;
		setRotation(refHead, 0F, 0F, 0F);
		r1 = new ModelRenderer(this, 5, 13);
		r1.addBox(-2F, -8F, -4F, 2, 2, 1);
		r1.setRotationPoint(0F, 0F, 0F);
		r1.setTextureSize(64, 32);
		r1.mirror = true;
		setRotation(r1, -0.3346145F, 0F, -0.0462687F);
		r1.mirror = false;
		r2 = new ModelRenderer(this, 5, 11);
		r2.addBox(-2.4F, -9F, -4F, 2, 1, 1);
		r2.setRotationPoint(0F, 0F, 0F);
		r2.setTextureSize(64, 32);
		r2.mirror = true;
		setRotation(r2, -0.3346075F, 0F, -0.0462687F);
		r2.mirror = false;
		r3 = new ModelRenderer(this, 5, 6);
		r3.addBox(-2.4F, -11F, -4F, 2, 2, 1);
		r3.setRotationPoint(0F, 0F, 0F);
		r3.setTextureSize(64, 32);
		r3.mirror = true;
		setRotation(r3, -0.3346075F, 0F, -0.0462687F);
		r3.mirror = false;
		r4 = new ModelRenderer(this, 5, 9);
		r4.addBox(-3F, -10F, -4F, 1, 1, 1);
		r4.setRotationPoint(0F, 0F, 0F);
		r4.setTextureSize(64, 32);
		r4.mirror = true;
		setRotation(r4, -0.3346075F, 0F, -0.0462687F);
		r4.mirror = false;
		r5 = new ModelRenderer(this, 1, 7);
		r5.addBox(-3.9F, -10.53333F, -4F, 1, 1, 1);
		r5.setRotationPoint(0F, 0F, 0F);
		r5.setTextureSize(64, 32);
		r5.mirror = true;
		setRotation(r5, -0.3346075F, 0F, -0.0462687F);
		r5.mirror = false;
		r6 = new ModelRenderer(this, 4, 4);
		r6.addBox(-2.8F, -12F, -4F, 2, 1, 1);
		r6.setRotationPoint(0F, 0F, 0F);
		r6.setTextureSize(64, 32);
		r6.mirror = true;
		setRotation(r6, -0.3346075F, 0F, -0.0462687F);
		r6.mirror = false;
		r7 = new ModelRenderer(this, 2, 2);
		r7.addBox(-3.3F, -13F, -4F, 2, 1, 1);
		r7.setRotationPoint(0F, 0F, 0F);
		r7.setTextureSize(64, 32);
		r7.mirror = true;
		setRotation(r7, -0.3346075F, 0F, -0.0462687F);
		r7.mirror = false;
		
		modelMap = this.createModelMap(getClass());
	}

	@Override
	public void applyRenderCorrections(boolean isLeft)
	{
	}

	@Override
	public void bindTexture()
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("mysticcreatures:textures/Antlers2.png"));
	}
}
