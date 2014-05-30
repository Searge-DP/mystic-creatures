package com.radixshock.mysticcreatures.core;

import com.radixshock.mysticcreatures.core.forge.CommonProxy;
import com.radixshock.mysticcreatures.core.forge.EventHooks;
import com.radixshock.mysticcreatures.entity.EntityAddon;
import com.radixshock.radixcore.core.ModLogger;
import com.radixshock.radixcore.core.RadixCore;
import com.radixshock.radixcore.core.RadixRegistry;
import com.radixshock.radixcore.core.UnenforcedCore;
import com.radixshock.radixcore.enums.EnumNetworkType;
import com.radixshock.radixcore.network.AbstractPacketCodec;
import com.radixshock.radixcore.network.AbstractPacketHandler;
import com.radixshock.radixcore.network.PacketPipeline;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = "mysticcreatures", name = "Mystic Creatures", version = Constants.VERSION, dependencies = "required-after:radixcore")
public class MysticCreatures extends UnenforcedCore
{
	@Instance("mysticcreatures")
	private static MysticCreatures		instance;
	
	@SidedProxy(clientSide = "com.radixshock.mysticcreatures.core.forge.ClientProxy", serverSide = "com.radixshock.mysticcreatures.core.forge.CommonProxy")
	public static CommonProxy		proxy;
	
	private ModLogger logger;
	
	public MysticCreatures()
	{
		RadixCore.registeredMods.add(this);
	}
	
	public MysticCreatures getInstance()
	{
		return instance;
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		logger = new ModLogger(this);
	}

	@Override
	public void initializeProxy()
	{
		proxy.registerRenderers();
	}

	@Override
	public void initializeNetwork()
	{
		
	}

	@Override
	public void initializeEntities()
	{
		RadixRegistry.Entities.registerModEntity(this, EntityAddon.class);
	}
	
	@Override
	public void initializeCommands(FMLServerStartingEvent event)
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
}
