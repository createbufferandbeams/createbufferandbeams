
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package createbufferandbeams.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import createbufferandbeams.block.WhistleBlock;
import createbufferandbeams.block.ValveBlock;
import createbufferandbeams.block.ThrottleBlock;
import createbufferandbeams.block.RunningBoardBlock;
import createbufferandbeams.block.RedBufferBlock;
import createbufferandbeams.block.MiddleBoardBlock;
import createbufferandbeams.block.MericanHeadLampBlock;
import createbufferandbeams.block.LocomotiveHeadLampBlock;
import createbufferandbeams.block.LNERSignBlock;
import createbufferandbeams.block.LMSSignBlock;
import createbufferandbeams.block.HeadlampBrownBlock;
import createbufferandbeams.block.HeadLampBlock;
import createbufferandbeams.block.HandbrakeBlock;
import createbufferandbeams.block.GoldFunnelBlock;
import createbufferandbeams.block.GWRSignBlock;
import createbufferandbeams.block.GWRChimneyBlock;
import createbufferandbeams.block.FunnelBlock;
import createbufferandbeams.block.DomeBlock;
import createbufferandbeams.block.CabPlateBlock;
import createbufferandbeams.block.BufferBeamBlock;
import createbufferandbeams.block.BritishTailampBlock;
import createbufferandbeams.block.BritishLampBlock;
import createbufferandbeams.block.BoilerBlock;

import createbufferandbeams.CreatebufferandbeamsMod;

public class CreatebufferandbeamsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreatebufferandbeamsMod.MODID);
	public static final RegistryObject<Block> WHISTLE = REGISTRY.register("whistle", () -> new WhistleBlock());
	public static final RegistryObject<Block> HANDBRAKE = REGISTRY.register("handbrake", () -> new HandbrakeBlock());
	public static final RegistryObject<Block> BRITISH_LAMP = REGISTRY.register("british_lamp", () -> new BritishLampBlock());
	public static final RegistryObject<Block> BRITISH_TAILAMP = REGISTRY.register("british_tailamp", () -> new BritishTailampBlock());
	public static final RegistryObject<Block> RED_BUFFER = REGISTRY.register("red_buffer", () -> new RedBufferBlock());
	public static final RegistryObject<Block> HEAD_LAMP = REGISTRY.register("head_lamp", () -> new HeadLampBlock());
	public static final RegistryObject<Block> BOILER = REGISTRY.register("boiler", () -> new BoilerBlock());
	public static final RegistryObject<Block> MIDDLE_BOARD = REGISTRY.register("middle_board", () -> new MiddleBoardBlock());
	public static final RegistryObject<Block> RUNNING_BOARD = REGISTRY.register("running_board", () -> new RunningBoardBlock());
	public static final RegistryObject<Block> GOLD_FUNNEL = REGISTRY.register("gold_funnel", () -> new GoldFunnelBlock());
	public static final RegistryObject<Block> MERICAN_HEAD_LAMP = REGISTRY.register("merican_head_lamp", () -> new MericanHeadLampBlock());
	public static final RegistryObject<Block> FUNNEL = REGISTRY.register("funnel", () -> new FunnelBlock());
	public static final RegistryObject<Block> HEADLAMP_BROWN = REGISTRY.register("headlamp_brown", () -> new HeadlampBrownBlock());
	public static final RegistryObject<Block> GWR_SIGN = REGISTRY.register("gwr_sign", () -> new GWRSignBlock());
	public static final RegistryObject<Block> LMS_SIGN = REGISTRY.register("lms_sign", () -> new LMSSignBlock());
	public static final RegistryObject<Block> LNER_SIGN = REGISTRY.register("lner_sign", () -> new LNERSignBlock());
	public static final RegistryObject<Block> BUFFER_BEAM = REGISTRY.register("buffer_beam", () -> new BufferBeamBlock());
	public static final RegistryObject<Block> THROTTLE = REGISTRY.register("throttle", () -> new ThrottleBlock());
	public static final RegistryObject<Block> LOCOMOTIVE_HEAD_LAMP = REGISTRY.register("locomotive_head_lamp", () -> new LocomotiveHeadLampBlock());
	public static final RegistryObject<Block> VALVE = REGISTRY.register("valve", () -> new ValveBlock());
	public static final RegistryObject<Block> DOME = REGISTRY.register("dome", () -> new DomeBlock());
	public static final RegistryObject<Block> GWR_CHIMNEY = REGISTRY.register("gwr_chimney", () -> new GWRChimneyBlock());
	public static final RegistryObject<Block> CAB_PLATE = REGISTRY.register("cab_plate", () -> new CabPlateBlock());
}
