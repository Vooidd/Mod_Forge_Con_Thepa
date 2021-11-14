package com.voidd.betterminecraftmod.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModCreativeModeTab {
    public static final CreativeModeTab BETTERMINECRAFT_TAB = new CreativeModeTab("BetterMinecraftModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY_CRYSTAL.get());
        }
    };
}
