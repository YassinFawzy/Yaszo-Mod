package net.yassin.yaszomod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yassin.yaszomod.YaszoMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, YaszoMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON= ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON= ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)));
    public static final RegistryObject<Item> ZIRCON_PEARL= ITEMS.register("zircon_pearl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB).stacksTo(128)));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
