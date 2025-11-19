package net.louis.louis_first.item;

import net.louis.louis_first.Louis_First;
import net.louis.louis_first.item.custom.FuelItem;
import net.louis.louis_first.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Louis_First.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = Items.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = Items.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = Items.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> STRAWBERRY = Items.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> PINE_CONE = Items.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 200));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
