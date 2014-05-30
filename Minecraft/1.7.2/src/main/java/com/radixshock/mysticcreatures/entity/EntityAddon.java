package com.radixshock.mysticcreatures.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.radixshock.radixcore.logic.NBTHelper;

public class EntityAddon extends Entity
{
	public EntityAddon(World world)
	{
		super(world);
	}


	@Override
	public void onUpdate()
	{
		super.onUpdate();

		if (this.ridingEntity != null)
		{
			this.rotationPitch = this.ridingEntity.rotationPitch;
			this.rotationYaw = this.ridingEntity.rotationYaw;
		}
		
		else if (ridingEntity == null && ticksExisted > 10)
		{
			setDead();
		}
	}

	@Override
	protected void entityInit()
	{

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbt)
	{
		NBTHelper.autoReadClassFieldsFromNBT(getClass(), this, nbt);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbt)
	{
		NBTHelper.autoWriteClassFieldsToNBT(getClass(), this, nbt);
	}
}
