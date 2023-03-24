
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package createbufferandbeams.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import createbufferandbeams.world.inventory.GUIMenu;

import createbufferandbeams.CreatebufferandbeamsMod;

public class CreatebufferandbeamsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreatebufferandbeamsMod.MODID);
	public static final RegistryObject<MenuType<GUIMenu>> GUI = REGISTRY.register("gui", () -> IForgeMenuType.create(GUIMenu::new));
}
