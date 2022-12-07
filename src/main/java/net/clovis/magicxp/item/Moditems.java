package net.clovis.magicxp.item;

import net.clovis.magicxp.Magicxp;
import net.clovis.magicxp.item.custom.XptabletItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Magicxp.MOD_ID);

    public static final RegistryObject<Item> XP_TABLET = ITEMS.register("xp_tablet",
            () -> new XptabletItem(new Item.Properties().tab(CreativeTab.MAGIC_XP_TAB).stacksTo(1)));

    public static final RegistryObject<Item> EMPTY_XP_TABLET = ITEMS.register("empty_xp_tablet",
            () -> new Item(new Item.Properties().tab(CreativeTab.MAGIC_XP_TAB).stacksTo(1)
                    .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> MAGIC_WAND = ITEMS.register("magic_wand",
            () -> new Item(new Item.Properties().tab(CreativeTab.MAGIC_XP_TAB).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
