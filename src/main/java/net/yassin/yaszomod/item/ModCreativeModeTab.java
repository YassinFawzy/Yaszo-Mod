package net.yassin.yaszomod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorial_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
    public static final CreativeModeTab YASZO_TAB= new CreativeModeTab("yaszo_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_ZIRCON.get());
        }
    };
}
