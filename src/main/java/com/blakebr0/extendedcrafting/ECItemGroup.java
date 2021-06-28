package com.blakebr0.extendedcrafting;

import com.blakebr0.extendedcrafting.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ECItemGroup extends ItemGroup {
	public ECItemGroup() {
		super(ExtendedCrafting.MOD_ID);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ModItems.LUMINESSENCE.get());
	}
}
