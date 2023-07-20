package net.yassin.yaszomod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yassin.yaszomod.YaszoMod;
import org.jetbrains.annotations.Nullable;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, YaszoMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON= ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON= ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)));
    public static final RegistryObject<Item> ZIRCON_PEARL= ITEMS.register("zircon_pearl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB).stacksTo(16)));
    public static  final RegistryObject<Item> ZIRCON_NUGGET= ITEMS.register("zircon_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)));
    public static final RegistryObject<Item> CHARGED_COAL= ITEMS.register("charged_coal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)){
                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 3200;
                }
            });

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
