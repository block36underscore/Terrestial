package gay.block36.terrestrial.forge;

import dev.architectury.platform.forge.EventBuses;
import gay.block36.terrestrial.Terrestrial;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Terrestrial.MOD_ID)
public class TerrestrialForge {
    public TerrestrialForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Terrestrial.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Terrestrial.init();
    }
}