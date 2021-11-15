package com.voidd.betterminecraftmod.items;

import com.voidd.betterminecraftmod.BetterMinecraftMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
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
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB).food
                    (new FoodProperties.Builder().nutrition(6)
                            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300), 1).saturationMod(2.4f).build())));
    public static final RegistryObject<Item> SAPPHIRE_CRYSTAL = ITEMS.register("sapphire_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_NECKLACE = ITEMS.register("sapphire_necklace",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SHARD = ITEMS.register("sapphire_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_CARROT = ITEMS.register("sapphire_carrot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERMINECRAFT_TAB).food(new FoodProperties.Builder().nutrition(6)
                    .effect(()->new MobEffectInstance(MobEffects.WATER_BREATHING,300),1).saturationMod(2.4f).build())));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
