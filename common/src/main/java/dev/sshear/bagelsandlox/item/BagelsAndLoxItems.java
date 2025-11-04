package dev.sshear.bagelsandlox.item;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.sshear.bagelsandlox.BagelsAndLox;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class BagelsAndLoxItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BagelsAndLox.MOD_ID, Registries.ITEM);
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BagelsAndLox.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static RegistrySupplier<Item> BAGEL;
    public static RegistrySupplier<Item> BAGEL_WITH_SCHMEAR;
    public static RegistrySupplier<Item> BAGEL_WITH_LOX;
    public static RegistrySupplier<Item> LOX;
    public static RegistrySupplier<Item> SCHMEAR;

    public static RegistrySupplier<CreativeModeTab> BAGELS_AND_LOX_TAB =
            TABS.register(ResourceLocation.fromNamespaceAndPath(BagelsAndLox.MOD_ID, "bagels_and_lox_tab"), () ->
                    CreativeTabRegistry.create(Component.translatable("category.bagelsandlox_tab"), () ->
                            new ItemStack(BagelsAndLoxItems.BAGEL.get())));

    public static void registerItems() {
        BAGEL = registerItem("bagel", () -> new Item(new Item.Properties()
                .food(new FoodProperties.Builder().nutrition(6).saturationModifier(.5f).build()).arch$tab(BAGELS_AND_LOX_TAB)));
        BAGEL_WITH_SCHMEAR = registerItem("bagel_with_schmear", () -> new Item(new Item.Properties()
                .food(new FoodProperties.Builder().nutrition(12).saturationModifier(.5f).build()).arch$tab(BAGELS_AND_LOX_TAB)));
        BAGEL_WITH_LOX = registerItem("bagel_with_lox", () -> new Item(new Item.Properties()
                .food(new FoodProperties.Builder().nutrition(16).saturationModifier(.5f).build()).arch$tab(BAGELS_AND_LOX_TAB)));
        LOX = registerItem("lox", () -> new Item(new Item.Properties()
                .food(new FoodProperties.Builder().nutrition(3).saturationModifier(.25f).build()).arch$tab(BAGELS_AND_LOX_TAB)));
        SCHMEAR = registerItem("schmear", () -> new Item(new Item.Properties().arch$tab(BAGELS_AND_LOX_TAB)));
        ITEMS.register();
        TABS.register();
    }

    private static RegistrySupplier<Item> registerItem(String name, Supplier<Item> item){
        return ITEMS.register(ResourceLocation.fromNamespaceAndPath(BagelsAndLox.MOD_ID, name), item);
    }
}
