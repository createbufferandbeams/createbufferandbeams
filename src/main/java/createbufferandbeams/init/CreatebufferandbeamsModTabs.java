
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package createbufferandbeams.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreatebufferandbeamsModTabs {
	public static CreativeModeTab TAB_CREATE_BUFFER_AND_BEAMS;

	public static void load() {
		TAB_CREATE_BUFFER_AND_BEAMS = new CreativeModeTab("tabcreate_buffer_and_beams") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreatebufferandbeamsModBlocks.BUFFER_BEAM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
