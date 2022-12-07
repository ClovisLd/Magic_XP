package net.clovis.magicxp.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab MAGIC_XP_TAB = new CreativeModeTab("magic_xptab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.XP_TABLET.get());
        }
    };
}
