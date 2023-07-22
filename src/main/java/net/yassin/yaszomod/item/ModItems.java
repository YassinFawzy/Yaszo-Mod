package net.yassin.yaszomod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yassin.yaszomod.YaszoMod;
import net.yassin.yaszomod.item.custom.EightBallItem;
import org.jetbrains.annotations.Nullable;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, YaszoMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON= ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON= ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EIGHT_BALL= ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));
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
    public static final RegistryObject<Item> ZIRCON_PICKAXE= ITEMS.register("zircon_pickaxe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)
                    .stacksTo(1)));
    public static final RegistryObject<Item> ZIRCON_HELMET= ITEMS.register("zircon_helmet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)
                    .stacksTo(1)));
    public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)
                    .stacksTo(1)));
    public static final RegistryObject<Item> ZIRCON_LEGGINGS= ITEMS.register("zircon_leggings",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)
                    .stacksTo(1)));
    public static final RegistryObject<Item> ZIRCON_BOOTS= ITEMS.register("zircon_boots",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.YASZO_TAB)
                    .stacksTo(1)));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
