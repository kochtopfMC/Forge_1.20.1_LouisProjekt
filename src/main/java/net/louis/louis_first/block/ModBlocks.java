package net.louis.louis_first.block;

import net.louis.louis_first.Louis_First;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Louis_First.MOD_ID);

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
