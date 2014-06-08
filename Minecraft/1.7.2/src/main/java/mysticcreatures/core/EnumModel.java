/*******************************************************************************
 * EnumModel.java
 * Copyright (c) 2014 Radix-Shock Entertainment.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/

package mysticcreatures.core;

import java.util.ArrayList;
import java.util.List;

import mysticcreatures.client.model.AbstractSpecial;

public enum EnumModel
{
	Antlers1("Antlers 1", 1000, Models.antlers1), 
	Antlers2("Antlers 2", 1001, Models.antlers2), 
	Ears1("Ears 1", 3000, Models.ears1);

	private String			buttonName;
	private int				id;
	private AbstractSpecial	model;

	EnumModel(String buttonName, int id, AbstractSpecial model)
	{
		this.buttonName = buttonName;
		this.id = id;
		this.model = model;
	}

	public String getButtonName()
	{
		return buttonName;
	}

	public int getId()
	{
		return id;
	}

	public AbstractSpecial getModel()
	{
		return model;
	}

	public static List<EnumModel> getEars()
	{
		final List<EnumModel> returnList = new ArrayList<EnumModel>();
		returnList.add(Ears1);

		return returnList;
	}

	public static List<EnumModel> getAntlers()
	{
		final List<EnumModel> returnList = new ArrayList<EnumModel>();
		returnList.add(Antlers1);
		returnList.add(Antlers2);

		return returnList;
	}

	public static List<EnumModel> getHorns()
	{
		final List<EnumModel> returnList = new ArrayList<EnumModel>();
		// returnList.add(Horns1);

		return returnList;
	}

	public static EnumModel getModelById(int id)
	{
		for (final EnumModel model : EnumModel.values())
		{
			if (model.id == id) { return model; }
		}

		return null;
	}
}
