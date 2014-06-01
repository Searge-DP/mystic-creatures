package com.radixshock.mysticcreatures.client.model;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntlers1 extends ModelBiped
{
	/** Key = Is model for the left side, Value = the model */
	private final Map<ModelRenderer, Boolean> modelMap;

	ModelRenderer lPointOut1;
	ModelRenderer lPointOutEnd;
	ModelRenderer lPointOut2;
	ModelRenderer lShaft;
	ModelRenderer lPointIn;
	ModelRenderer lTop;
	ModelRenderer rPointOut1;
	ModelRenderer rPointOutEnd;
	ModelRenderer rPointOut2;
	ModelRenderer rShaft;
	ModelRenderer rPointIn;
	ModelRenderer rTop;

	public ModelAntlers1()
	{
		textureWidth = 64;
		textureHeight = 32;

		lPointOut1 = new ModelRenderer(this, 0, 0);
		lPointOut1.addBox(-0.9F, -3F, -0.5F, 1, 1, 1);
		lPointOut1.setRotationPoint(2F, -8F, 0F);
		lPointOut1.setTextureSize(64, 32);
		lPointOut1.mirror = true;
		setRotation(lPointOut1, 0.1858931F, -3.141593F, -0.0371786F);
		lPointOutEnd = new ModelRenderer(this, 0, 0);
		lPointOutEnd.addBox(-2.533333F, -3.4F, -0.4F, 1, 1, 1);
		lPointOutEnd.setRotationPoint(2F, -8F, 0F);
		lPointOutEnd.setTextureSize(64, 32);
		lPointOutEnd.mirror = true;
		setRotation(lPointOutEnd, 0.1858931F, -3.141593F, -0.0371786F);
		lPointOut2 = new ModelRenderer(this, 0, 0);
		lPointOut2.addBox(-1.8F, -3F, -0.5333334F, 1, 1, 1);
		lPointOut2.setRotationPoint(2F, -8F, 0F);
		lPointOut2.setTextureSize(64, 32);
		lPointOut2.mirror = true;
		setRotation(lPointOut2, 0.1858931F, -3.141593F, -0.0371786F);
		lShaft = new ModelRenderer(this, 0, 0);
		lShaft.addBox(-0.5F, -4F, -0.4666667F, 1, 4, 1);
		lShaft.setRotationPoint(2F, -8F, 0F);
		lShaft.setTextureSize(64, 32);
		lShaft.mirror = true;
		setRotation(lShaft, 0.1858931F, -3.141593F, -0.0371786F);
		lPointIn = new ModelRenderer(this, 0, 0);
		lPointIn.addBox(0.2F, -3F, -0.2666667F, 1, 1, 1);
		lPointIn.setRotationPoint(2F, -8F, 0F);
		lPointIn.setTextureSize(64, 32);
		lPointIn.mirror = true;
		setRotation(lPointIn, 0.1858931F, -3.141593F, -0.0371786F);
		lTop = new ModelRenderer(this, 0, 0);
		lTop.addBox(-0.8F, -4.933333F, -0.4F, 1, 1, 1);
		lTop.setRotationPoint(2F, -8F, 0F);
		lTop.setTextureSize(64, 32);
		lTop.mirror = true;
		setRotation(lTop, 0.1858931F, -3.141593F, -0.0371786F);
		rPointOut1 = new ModelRenderer(this, 0, 0);
		rPointOut1.addBox(-0.9F, -3F, -0.5F, 1, 1, 1);
		rPointOut1.setRotationPoint(-2F, -8F, 0F);
		rPointOut1.setTextureSize(64, 32);
		rPointOut1.mirror = true;
		setRotation(rPointOut1, -0.1858931F, 0.0371786F, -0.0371786F);
		rPointOutEnd = new ModelRenderer(this, 0, 0);
		rPointOutEnd.addBox(-2.533333F, -3.4F, -0.4F, 1, 1, 1);
		rPointOutEnd.setRotationPoint(-2F, -8F, 0F);
		rPointOutEnd.setTextureSize(64, 32);
		rPointOutEnd.mirror = true;
		setRotation(rPointOutEnd, -0.1858931F, 0.0371786F, -0.0371786F);
		rPointOut2 = new ModelRenderer(this, 0, 0);
		rPointOut2.addBox(-1.8F, -3F, -0.5333334F, 1, 1, 1);
		rPointOut2.setRotationPoint(-2F, -8F, 0F);
		rPointOut2.setTextureSize(64, 32);
		rPointOut2.mirror = true;
		setRotation(rPointOut2, -0.1858931F, 0.0371786F, -0.0371786F);
		rShaft = new ModelRenderer(this, 0, 0);
		rShaft.addBox(-0.5F, -4F, -0.4666667F, 1, 4, 1);
		rShaft.setRotationPoint(-2F, -8F, 0F);
		rShaft.setTextureSize(64, 32);
		rShaft.mirror = true;
		setRotation(rShaft, -0.1858931F, 0.0371786F, -0.0371786F);
		rPointIn = new ModelRenderer(this, 0, 0);
		rPointIn.addBox(0.2F, -3F, -0.2666667F, 1, 1, 1);
		rPointIn.setRotationPoint(-2F, -8F, 0F);
		rPointIn.setTextureSize(64, 32);
		rPointIn.mirror = true;
		setRotation(rPointIn, -0.1858931F, 0.0371786F, -0.0371786F);
		rTop = new ModelRenderer(this, 0, 0);
		rTop.addBox(-0.8F, -4.933333F, -0.4F, 1, 1, 1);
		rTop.setRotationPoint(-2F, -8F, 0F);
		rTop.setTextureSize(64, 32);
		rTop.mirror = true;
		setRotation(rTop, -0.1858931F, 0.0371786F, -0.0371786F);

		modelMap = createModelMap();
	}


	@Override
	public void render(Entity entity, float rotateAngleX, float rotateAngleY, float passNumber, float unused2, float unused3, float interpolation)
	{
		for (Map.Entry<ModelRenderer, Boolean> entry : modelMap.entrySet())
		{
			final boolean isLeft = entry.getValue();

			if ((passNumber == 0 && isLeft) || (passNumber == 1 && !isLeft))
			{
				entry.getKey().render(interpolation);
			}
		}
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setHeadRotationForAllModels(float rotateAngleX, float rotateAngleY)
	{
		for (ModelRenderer model : modelMap.keySet())
		{
			if (model != null)
			{
				model.rotateAngleX = rotateAngleX / (180F / (float)Math.PI);
				model.rotateAngleY = rotateAngleY / (180F / (float)Math.PI);
				model.rotationPointX = 0.0F;
				model.rotationPointY = 0.0F;
			}
		}
	}

	private Map<ModelRenderer, Boolean> createModelMap()
	{
		final Map<ModelRenderer, Boolean> returnMap = new HashMap<ModelRenderer, Boolean>();

		try
		{
			for (Field f : this.getClass().getDeclaredFields())
			{
				final Object obj = f.get(this);

				if (obj instanceof ModelRenderer)
				{
					final boolean isLeft = f.getName().startsWith("l");
					returnMap.put((ModelRenderer)obj, isLeft);
				}
			}
		}

		catch (Throwable e)
		{
			throw new RuntimeException(e);
		}

		return returnMap;
	}
}
