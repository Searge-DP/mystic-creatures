package com.radixshock.mysticcreatures.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptionSlider;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.radixshock.mysticcreatures.core.EnumModel;
import com.radixshock.mysticcreatures.core.Models;
import com.radixshock.mysticcreatures.core.MysticCreatures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiSpecialsSelect extends GuiScreen
{
	private final EntityPlayer player;
	private float rotation = 0.0F;

	private GuiButton buttonDecreaseRotation;
	private GuiButton buttonIncreaseRotation;

	private GuiButton buttonEnableAntlers;
	private GuiButton buttonEnableHorns;
	private GuiButton buttonEnableEars;
	
	public GuiSpecialsSelect(EntityPlayer player)
	{
		this.player = player;
	}

	@Override
	public void initGui()
	{
		int modY = -30;
		
		buttonList.clear();
		buttonList.add(buttonDecreaseRotation 	= new GuiButton(1, width / 2 + 120, height / 2 + 95, 30, 20, "<<"));
		buttonList.add(buttonIncreaseRotation 	= new GuiButton(2, width / 2 + 150, height / 2 + 95, 30, 20, ">>"));

		buttonList.add(buttonEnableAntlers 		= new GuiButton(3, width / 2 - 210, height / 2 - 65, 80, 20, "Enabled: Yes"));
		for (EnumModel antler : EnumModel.getAntlers())
		{
			final GuiButton button = new GuiButton(antler.getId(), width / 2 - 205, height / 2 + modY, 70, 20, antler.getButtonName());
			
			if (MysticCreatures.getInstance().modelAntlerUse == antler.getModel())
			{
				button.enabled = false;
			}
			
			buttonList.add(button);
			modY += 20;
		}
		modY = -30;
		
		buttonList.add(buttonEnableHorns 		= new GuiButton(6, width / 2 - 90, height / 2 - 65, 80, 20, "Enabled: Yes"));
		for (EnumModel horn : EnumModel.getHorns())
		{
			final GuiButton button = new GuiButton(horn.getId(), width / 2 - 85, height / 2 + modY, 70, 20, horn.getButtonName());
			
			if (MysticCreatures.getInstance().modelHornUse == horn.getModel())
			{
				button.enabled = false;
			}
			
			buttonList.add(button);
			modY += 20;
		}
		modY = -30;

		buttonList.add(buttonEnableEars 		= new GuiButton(8, width / 2 + 30, height / 2 - 65, 80, 20, "Enabled: Yes"));
		for (EnumModel ear : EnumModel.getEars())
		{
			final GuiButton button = new GuiButton(ear.getId(), width / 2 + 35, height / 2 + modY, 70, 20, ear.getButtonName());
			
			if (MysticCreatures.getInstance().modelEarUse == ear.getModel())
			{
				button.enabled = false;
			}
			
			buttonList.add(button);
			modY += 20;
		}
		modY = -30;
	}

	@Override
	public void updateScreen()
	{
		super.updateScreen();
	}

	@Override
	public void onGuiClosed()
	{
		super.onGuiClosed();
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		super.actionPerformed(button);

		if (button == buttonDecreaseRotation)
		{
			rotation -= 20F;
		}

		else if (button == buttonIncreaseRotation)
		{
			rotation += 20F;
		}
		
		for (EnumModel antler : EnumModel.getAntlers())
		{
			if (button.id == antler.getId())
			{
				MysticCreatures.getInstance().modelAntlerUse = antler.getModel();
			}
		}
		
		for (EnumModel horn : EnumModel.getHorns())
		{
			if (button.id == horn.getId())
			{
				MysticCreatures.getInstance().modelHornUse = horn.getModel();
			}
		}
		
		for (EnumModel ear : EnumModel.getEars())
		{
			if (button.id == ear.getId())
			{
				MysticCreatures.getInstance().modelEarUse = ear.getModel();
			}
		}
		
		initGui();
	}

	@Override
	public void drawScreen(int sizeX, int sizeY, float offset)
	{
		drawGradientRect(0, 0, this.width, this.height, -1072689136, -804253680);

		int posX = width / 2 + 150;
		int posY = height / 2 + 85;
		int scale = 80;

		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		GL11.glPushMatrix();
		{
			GL11.glTranslatef(posX, posY, 50.0F);
			GL11.glScalef((-scale), scale, scale);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);

			float yawOffset = player.renderYawOffset;
			float rotationYaw = player.rotationYaw;
			float rotationPitch = player.rotationPitch;

			GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
			RenderHelper.enableStandardItemLighting();
			GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-((float)Math.atan(0F / 40.0F)) * 20.0F, 1.0F, 0.0F, 0.0F);

			player.renderYawOffset = (float)Math.atan(0F / 40.0F) * 20.0F;
			player.rotationYaw = (float)Math.atan(0F / 40.0F) * 40.0F;
			player.rotationPitch = -((float)Math.atan(0F / 40.0F)) * 20.0F;
			player.rotationYawHead = player.rotationYaw;

			GL11.glTranslatef(0.0F, player.yOffset, 0.0F);
			GL11.glRotatef(rotation, 0, 1, 0);

			RenderManager.instance.playerViewY = 180.0F;
			RenderManager.instance.renderEntityWithPosYaw(player, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);

			player.renderYawOffset = yawOffset;
			player.rotationYaw = rotationYaw;
			player.rotationPitch = rotationPitch;
		}
		GL11.glPopMatrix();

		RenderHelper.disableStandardItemLighting();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);

		GL11.glPushMatrix();
		{
			GL11.glScalef(1.3F, 1.3F, 1.3F);
			drawString(fontRendererObj, "Antlers", width / 2 - 205, height / 2 - 90, 0xFFFFFF);
			drawString(fontRendererObj, "Horns", width / 2 - 108, height / 2 - 90, 0xFFFFFF);
			drawString(fontRendererObj, "Ears", width / 2 - 12, height / 2 - 90, 0xFFFFFF);
		}

		GL11.glPopMatrix();

		super.drawScreen(sizeX, sizeY, offset);
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}