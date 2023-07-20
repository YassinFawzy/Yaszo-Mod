package net.yassin.yaszomod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yassin.yaszomod.YaszoMod;
import net.yassin.yaszomod.item.ModCreativeModeTab;
import net.yassin.yaszomod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS=
            DeferredRegister.create(ForgeRegistries.BLOCKS, YaszoMod.MOD_ID);

    //NEW BLOCKS ADDED HERE
    public static final RegistryObject<Block> ZIRCON_BLOCK= registerBlock("zircon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.YASZO_TAB);
    public static final RegistryObject<Block> ZIRCON_ORE= registerBlock("zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)),
            ModCreativeModeTab.YASZO_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ZIRCON_ORE= registerBlock("deepslate_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)),
            ModCreativeModeTab.YASZO_TAB);
    public static final RegistryObject<Block> NETHERRACK_ZIRCON_ORE= registerBlock("nether_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)),
            ModCreativeModeTab.YASZO_TAB);
    public static final RegistryObject<Block> ENDSTONE_ZIRCON_ORE= registerBlock("end_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)),
            ModCreativeModeTab.YASZO_TAB);
    public static final RegistryObject<Block> CHISELED_ZIRCON_BLOCK= registerBlock("chiseled_zircon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f)),
            ModCreativeModeTab.YASZO_TAB);
    public static final RegistryObject<Block> ZIRCON_BRICK= registerBlock("zircon_brick",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)),
            ModCreativeModeTab.YASZO_TAB);
    public static final RegistryObject<Block> CHISELED_ZIRCON_BRICK= registerBlock("chiseled_zircon_brick",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)),
            ModCreativeModeTab.YASZO_TAB);


    //HELP REGISTER BLOCK AND THE ITEM FOR THE BLOCK
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn= BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
