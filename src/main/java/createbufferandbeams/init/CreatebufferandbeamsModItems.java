
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package createbufferandbeams.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import createbufferandbeams.CreatebufferandbeamsMod;

public class CreatebufferandbeamsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreatebufferandbeamsMod.MODID);
	public static final RegistryObject<Item> WHISTLE = block(CreatebufferandbeamsModBlocks.WHISTLE,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> HANDBRAKE = block(CreatebufferandbeamsModBlocks.HANDBRAKE,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> BRITISH_LAMP = block(CreatebufferandbeamsModBlocks.BRITISH_LAMP,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> BRITISH_TAILAMP = block(CreatebufferandbeamsModBlocks.BRITISH_TAILAMP,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> RED_BUFFER = block(CreatebufferandbeamsModBlocks.RED_BUFFER,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> HEAD_LAMP = block(CreatebufferandbeamsModBlocks.HEAD_LAMP,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> BOILER = block(CreatebufferandbeamsModBlocks.BOILER,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> MIDDLE_BOARD = block(CreatebufferandbeamsModBlocks.MIDDLE_BOARD,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> RUNNING_BOARD = block(CreatebufferandbeamsModBlocks.RUNNING_BOARD,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> GOLD_FUNNEL = block(CreatebufferandbeamsModBlocks.GOLD_FUNNEL,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> MERICAN_HEAD_LAMP = block(CreatebufferandbeamsModBlocks.MERICAN_HEAD_LAMP,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> FUNNEL = block(CreatebufferandbeamsModBlocks.FUNNEL,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> HEADLAMP_BROWN = block(CreatebufferandbeamsModBlocks.HEADLAMP_BROWN,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> GWR_SIGN = block(CreatebufferandbeamsModBlocks.GWR_SIGN,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> LMS_SIGN = block(CreatebufferandbeamsModBlocks.LMS_SIGN,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> LNER_SIGN = block(CreatebufferandbeamsModBlocks.LNER_SIGN,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> BUFFER_BEAM = block(CreatebufferandbeamsModBlocks.BUFFER_BEAM,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> THROTTLE = block(CreatebufferandbeamsModBlocks.THROTTLE,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> LOCOMOTIVE_HEAD_LAMP = block(CreatebufferandbeamsModBlocks.LOCOMOTIVE_HEAD_LAMP,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> VALVE = block(CreatebufferandbeamsModBlocks.VALVE,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> DOME = block(CreatebufferandbeamsModBlocks.DOME,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> GWR_CHIMNEY = block(CreatebufferandbeamsModBlocks.GWR_CHIMNEY,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);
	public static final RegistryObject<Item> CAB_PLATE = block(CreatebufferandbeamsModBlocks.CAB_PLATE,
			CreatebufferandbeamsModTabs.TAB_CREATE_BUFFER_AND_BEAMS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
