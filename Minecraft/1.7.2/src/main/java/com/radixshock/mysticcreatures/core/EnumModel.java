package com.radixshock.mysticcreatures.core;

import java.util.ArrayList;
import java.util.List;

import com.radixshock.mysticcreatures.client.model.AbstractSpecial;

public enum EnumModel
{
	Antlers1("Antlers 1", 1000, Models.antlers1),
	Antlers2("Antlers 2", 1001, Models.antlers2),
	Ears1("Ears 1", 3000, Models.ears1);

	private String buttonName;
	private int id;
	private AbstractSpecial model;
	
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
		List<EnumModel> returnList = new ArrayList<EnumModel>();
		returnList.add(Ears1);
		
		return returnList;
	}
	
	public static List<EnumModel> getAntlers()
	{
		List<EnumModel> returnList = new ArrayList<EnumModel>();
		returnList.add(Antlers1);
		returnList.add(Antlers2);
		
		return returnList;
	}
	
	public static List<EnumModel> getHorns()
	{
		List<EnumModel> returnList = new ArrayList<EnumModel>();
//		returnList.add(Horns1);
		
		return returnList;
	}
	
	public static EnumModel getModelById(int id)
	{
		for (EnumModel model : EnumModel.values())
		{
			if (model.id == id)
			{
				return model;
			}
		}
		
		return null;
	}
}
