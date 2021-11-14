package com.voidd.betterminecraftmod.items;

import com.voidd.betterminecraftmod.BetterMinecraftMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterMinecraftMod.MOD_ID);

    public static final RegistryObject<Item> RUBY_CRYSTAL = ITEMS.register("ruby_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB)));
    public static final RegistryObject<Item> RUBY_NECKLACE = ITEMS.register("ruby_necklace",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB)));
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB)));
    public static final RegistryObject<Item> RUBY_CARROT = ITEMS.register("ruby_carrot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
