package net.louis.louis_first.item;

import net.louis.louis_first.Louis_First;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Louis_First.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_ORES = CREATIVE_MODE_TABS.register("more_ores",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.more_ores"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItem.SAPPHIRE.get());
                        output.accept(ModItem.RAW_SAPPHIRE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
