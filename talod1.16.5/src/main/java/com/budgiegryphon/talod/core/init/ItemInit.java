package com.budgiegryphon.talod.core.init;

import com.budgiegryphon.talod.talod;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

		public static final DeferredRegister<Item> ITEMS  = DeferredRegister.create(ForgeRegistries.ITEMS,
				talod.MOD_ID);
		public static final RegistryObject<Item> dragonleather = ITEMS.register("dragonleather", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
		public static final RegistryObject<Item> dragonleatherscrap = ITEMS.register("dragonleatherscrap", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
		//mmm yum. make food init later
		public static final RegistryObject<Item> sweetberrydrgitem = ITEMS.register("sweetberrydrgitem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)
				.food(new Food.Builder().nutrition(6).saturationMod(0.5f).build())));
}
