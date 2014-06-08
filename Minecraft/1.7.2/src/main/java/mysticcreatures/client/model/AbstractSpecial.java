/*******************************************************************************
 * AbstractSpecial.java
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

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public abstract class AbstractSpecial extends ModelBiped
{
	/** Key = Is model for the left side, Value = the model */
	protected Map<ModelRenderer, Boolean>	modelMap;

	public float							renderRotateX;
	public float							renderRotateY;

	public abstract void applyRenderCorrections(boolean isLeft);

	@Override
	public void render(Entity entity, float rotateAngleX, float rotateAngleY, float passNumber, float unused2, float unused3, float interpolation)
	{
		for (final Map.Entry<ModelRenderer, Boolean> entry : modelMap.entrySet())
		{
			entry.getKey().render(interpolation);
		}
	}

	public void setHeadRotationForAllModels(float rotateAngleX, float rotateAngleY)
	{
		for (final ModelRenderer model : modelMap.keySet())
		{
			if (model != null)
			{
				model.rotateAngleX = rotateAngleX / (180F / (float) Math.PI) + renderRotateX;
				model.rotateAngleY = rotateAngleY / (180F / (float) Math.PI) + renderRotateY;
			}
		}
	}

	public abstract void bindTexture();

	protected void setRotation(ModelRenderer model, float x, float y, float z)
	{
		renderRotateX = x;
		renderRotateY = y;
		model.rotateAngleZ = z;
	}

	protected Map<ModelRenderer, Boolean> createModelMap(Class clazz)
	{
		final Map<ModelRenderer, Boolean> returnMap = new HashMap<ModelRenderer, Boolean>();

		try
		{
			for (final Field f : clazz.getDeclaredFields())
			{
				final Object obj = f.get(this);

				if (obj instanceof ModelRenderer)
				{
					final boolean isLeft = f.getName().startsWith("l");

					if (!f.getName().startsWith("ref"))
					{
						returnMap.put((ModelRenderer) obj, isLeft);
					}
				}
			}
		}

		catch (final Throwable e)
		{
			throw new RuntimeException(e);
		}

		return returnMap;
	}
}
