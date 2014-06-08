package com.radixshock.mysticcreatures.core;

import com.radixshock.mysticcreatures.client.model.AbstractSpecial;
import com.radixshock.mysticcreatures.core.forge.EventHooks;
import com.radixshock.mysticcreatures.core.forge.GuiHandler;
import com.radixshock.radixcore.core.ModLogger;
import com.radixshock.radixcore.core.RadixCore;
import com.radixshock.radixcore.core.UnenforcedCore;
import com.radixshock.radixcore.enums.EnumNetworkType;
import com.radixshock.radixcore.network.AbstractPacketCodec;
import com.radixshock.radixcore.network.AbstractPacketHandler;
import com.radixshock.radixcore.network.PacketPipeline;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "mysticcreatures", name = "Mystic Creatures", version = Constants.VERSION, dependencies = "required-after:radixcore")
public class MysticCreatures extends UnenforcedCore
{
	@Instance("mysticcreatures")
	private static MysticCreatures	instance;
	
	private ModLogger logger;
	
	@SideOnly(Side.CLIENT)
	public AbstractSpecial modelEarUse;
	@SideOnly(Side.CLIENT)
	public AbstractSpecial modelAntlerUse;
	@SideOnly(Side.CLIENT)
	public AbstractSpecial modelHornUse;
	
	public MysticCreatures()
	{
		RadixCore.registeredMods.add(this);
	}
	
	public static MysticCreatures getInstance()
	{
		return instance;
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		logger = new ModLogger(this);
		
		FMLCommonHandler.instance().bus().register(new KeyHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	}

	@Override
	public void initializeNetwork()
	{
		
	}

	@Override
	public String getShortModName()
	{
		return "MysticCreatures";
	}

	@Override
	public String getLongModName()
	{
		return "Mystic Creatures";
	}

	@Override
	public String getVersion()
	{
		return Constants.VERSION;
	}

	@Override
	public boolean getChecksForUpdates()
	{
		return true;
	}

	@Override
	public String getUpdateURL()
	{
		return "http://pastebin.com/raw.php?i=292YD1HW";
	}

	@Override
	public String getRedirectURL()
	{
		return "http://radix-shock.com/update-page.html?userMysticCreatures=" + getVersion() + 
				"&currentMysticCreatures=%" + "&userMC=" + Loader.instance().getMCVersionString().substring(10) + "&currentMC=%";
	}

	@Override
	public ModLogger getLogger()
	{
		return logger;
	}

	@Override
	public EnumNetworkType getNetworkSystemType()
	{
		return EnumNetworkType.None;
	}

	@Override
	public AbstractPacketCodec getPacketCodec()
	{
		return null;
	}

	@Override
	public AbstractPacketHandler getPacketHandler()
	{
		return null;
	}

	@Override
	public PacketPipeline getPacketPipeline()
	{
		return null;
	}

	@Override
	public Class getPacketTypeClass()
	{
		return null;
	}

	@Override
	public Class getEventHookClass()
	{
		return EventHooks.class;
	}
	
	public static float interpolateRotation(float rotationA, float rotationB, float interpolation)
	{
		float difference;

		for (difference = rotationB - rotationA; difference < -180.0F; difference += 360.0F)
		{
			;
		}

		while (difference >= 180.0F)
		{
			difference -= 360.0F;
		}

		return rotationA + difference * interpolation;
	}
}
