package gay.block36.terrestial.forge;

import dev.architectury.platform.forge.EventBuses;
import gay.block36.terrestial.Terrestial;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Terrestial.MOD_ID)
public class TerrestialForge {
    public TerrestialForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Terrestial.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Terrestial.init();
    }
}