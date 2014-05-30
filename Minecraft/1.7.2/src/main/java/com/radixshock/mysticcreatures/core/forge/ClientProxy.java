/*******************************************************************************
 * ClientProxy.java
 * Copyright (c) 2014 Radix-Shock Entertainment.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/

package com.radixshock.mysticcreatures.core.forge;

import com.radixshock.mysticcreatures.client.render.RenderAddons;
import com.radixshock.mysticcreatures.entity.EntityAddon;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityAddon.class, new RenderAddons());
	}
}
