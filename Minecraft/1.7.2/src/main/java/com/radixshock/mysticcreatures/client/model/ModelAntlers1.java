package com.radixshock.mysticcreatures.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class ModelAntlers1 extends AbstractSpecial
{
	ModelRenderer r5;
	ModelRenderer r3;
	ModelRenderer r2;
	ModelRenderer r1;
	ModelRenderer r6;
	ModelRenderer r4;
	ModelRenderer refHead;
	ModelRenderer l1;
	ModelRenderer l5;
	ModelRenderer l6;
	ModelRenderer l2;
	ModelRenderer l3;
	ModelRenderer l4;

	public ModelAntlers1()
	{
		textureWidth = 64;
		textureHeight = 32;
		r5 = new ModelRenderer(this, 8, 3);
		r5.addBox(-2.9F, -11F, -2F, 1, 1, 1);
		r5.setRotationPoint(0F, 0F, 0F);
		r5.setTextureSize(64, 32);
		r5.mirror = true;
		setRotation(r5, -0.1858931F, 0.0371786F, -0.0371786F);
		r3 = new ModelRenderer(this, 0, 2);
		r3.addBox(-4.533333F, -11.4F, -2F, 1, 1, 1);
		r3.setRotationPoint(0F, 0F, 0F);
		r3.setTextureSize(64, 32);
		r3.mirror = true;
		setRotation(r3, -0.1858931F, 0.0371786F, -0.0371786F);
		r2 = new ModelRenderer(this, 4, 3);
		r2.addBox(-3.6F, -11F, -2F, 1, 1, 1);
		r2.setRotationPoint(0F, 0F, 0F);
		r2.setTextureSize(64, 32);
		r2.mirror = true;
		setRotation(r2, -0.1858931F, 0.0371786F, -0.0371786F);
		r1 = new ModelRenderer(this, 12, 3);
		r1.addBox(-2.5F, -11.8F, -2F, 1, 4, 1);
		r1.setRotationPoint(0F, 0F, 0F);
		r1.setTextureSize(64, 32);
		r1.mirror = true;
		setRotation(r1, -0.1858931F, 0.0371786F, -0.0371786F);
		r6 = new ModelRenderer(this, 16, 5);
		r6.addBox(-1.8F, -11F, -2F, 1, 1, 1);
		r6.setRotationPoint(0F, 0F, 0F);
		r6.setTextureSize(64, 32);
		r6.mirror = true;
		setRotation(r6, -0.1858931F, 0.0371786F, -0.0371786F);
		r4 = new ModelRenderer(this, 12, 0);
		r4.addBox(-2.9F, -12.7F, -2F, 1, 1, 1);
		r4.setRotationPoint(0F, 0F, 0F);
		r4.setTextureSize(64, 32);
		r4.mirror = true;
		setRotation(r4, -0.1858931F, 0.0371786F, -0.0371786F);
		refHead = new ModelRenderer(this, 30, 0);
		refHead.addBox(-4F, -8F, -4F, 8, 8, 8);
		refHead.setRotationPoint(0F, 0F, 0F);
		refHead.setTextureSize(64, 32);
		refHead.mirror = true;
		setRotation(refHead, 0F, 0F, 0F);
		l1 = new ModelRenderer(this, 12, 3);
		l1.addBox(1.5F, -11.8F, -2F, 1, 4, 1);
		l1.setRotationPoint(0F, 0F, 0F);
		l1.setTextureSize(64, 32);
		l1.mirror = true;
		setRotation(l1, -0.1858931F, 0.0371786F, 0.0371755F);
		l5 = new ModelRenderer(this, 8, 3);
		l5.addBox(1.8F, -11F, -2F, 1, 1, 1);
		l5.setRotationPoint(0F, 0F, 0F);
		l5.setTextureSize(64, 32);
		l5.mirror = true;
		setRotation(l5, -0.1858931F, 0.0371786F, 0.0371755F);
		l6 = new ModelRenderer(this, 16, 5);
		l6.addBox(0.8F, -11F, -2F, 1, 1, 1);
		l6.setRotationPoint(0F, 0F, 0F);
		l6.setTextureSize(64, 32);
		l6.mirror = true;
		setRotation(l6, -0.1858931F, 0.0371786F, 0.0371755F);
		l2 = new ModelRenderer(this, 4, 3);
		l2.addBox(2.6F, -11F, -2F, 1, 1, 1);
		l2.setRotationPoint(0F, 0F, 0F);
		l2.setTextureSize(64, 32);
		l2.mirror = true;
		setRotation(l2, -0.1858931F, 0.0371786F, 0.0371755F);
		l3 = new ModelRenderer(this, 0, 2);
		l3.addBox(3.5F, -11.4F, -2F, 1, 1, 1);
		l3.setRotationPoint(0F, 0F, 0F);
		l3.setTextureSize(64, 32);
		l3.mirror = true;
		setRotation(l3, -0.1858931F, 0.0371786F, 0.0371755F);
		l4 = new ModelRenderer(this, 12, 0);
		l4.addBox(1.9F, -12.7F, -2F, 1, 1, 1);
		l4.setRotationPoint(0F, 0F, 0F);
		l4.setTextureSize(64, 32);
		l4.mirror = true;
		setRotation(l4, -0.1858931F, 0.0371786F, 0.0371755F);

		modelMap = createModelMap(this.getClass());
	}

	@Override
	public void applyRenderCorrections(boolean isLeft)
	{
		GL11.glTranslatef(0.0F, -0.475F, 0.0F);
	}

	@Override
	public void bindTexture()
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("mysticcreatures:textures/Antlers1.png"));
	}
}
