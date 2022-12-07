package net.clovis.magicxp;

import com.mojang.logging.LogUtils;
import net.clovis.magicxp.block.Modblocks;
import net.clovis.magicxp.item.Moditems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Magicxp.MOD_ID)
public class Magicxp
{
    public static final String MOD_ID = "magic_xp";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Magicxp() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Moditems.register(modEventBus);
        Modblocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

     @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
