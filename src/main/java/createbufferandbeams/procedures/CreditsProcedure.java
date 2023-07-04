package createbufferandbeams.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class CreditsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(
					"Create Buffer & Beams. Credits: Main Designers: Railraider & KhaiIsCool11 Developer: Nate Modeler: j20number2008 Discord Admin: Ensomniac"),
					(false));
	}
}
