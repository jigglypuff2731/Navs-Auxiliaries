package net.nav.naux;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Main {
	public static final String MOD_ID = "naux";
	public static final Logger LOGGER = LogManager.getLogger();

	public Main() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		// ItemInit.ITEMS.register(bus);
		// BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		/*
		 * BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block
		 * -> { event.getRegistry().register(new BlockItem(block, new
		 * Item.Properties().tab(FLVGroup.FLVItemGroup))
		 * .setRegistryName(block.getRegistryName())); });
		 */
	}
}
