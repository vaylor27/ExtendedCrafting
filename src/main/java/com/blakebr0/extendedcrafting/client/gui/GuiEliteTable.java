package com.blakebr0.extendedcrafting.client.gui;

import com.blakebr0.extendedcrafting.ExtendedCrafting;
import com.blakebr0.extendedcrafting.client.container.ContainerEliteTable;
import com.blakebr0.extendedcrafting.tile.TileEliteCraftingTable;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiEliteTable extends GuiContainer {

	private static final ResourceLocation GUI = new ResourceLocation(ExtendedCrafting.MOD_ID, "textures/gui/elite_table.png");

	public GuiEliteTable(TileEliteCraftingTable tileEntity, ContainerEliteTable container) {
		super(container);
		this.xSize = 212;
		this.ySize = 237;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(GUI);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, this.ySize, this.ySize);
	}
}