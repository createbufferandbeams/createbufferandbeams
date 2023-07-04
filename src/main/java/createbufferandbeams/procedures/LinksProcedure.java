package createbufferandbeams.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class LinksProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(
					"Thanks for choosing CB&B Modrinth: https://modrinth.com/mod/cbandb/ Github: https://github.com/createbufferandbeams Curseforge (OLD VER): https://www.curseforge.com/minecraft/mc-mods/create-buffers-beams"),
					(false));
	}
}
