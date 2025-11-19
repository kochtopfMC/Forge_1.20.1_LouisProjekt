package net.louis.louis_first.datagen;

import net.louis.louis_first.Louis_First;
import net.louis.louis_first.item.ModItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, Louis_First.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItem.SAPPHIRE);
        simpleItem(ModItem.RAW_SAPPHIRE);
        simpleItem(ModItem.PINE_CONE);
        simpleItem(ModItem.STRAWBERRY);
        simpleItem(ModItem.METAL_DETECTOR);

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Louis_First.MOD_ID,"item/" + item.getId().getPath()));
    }
}