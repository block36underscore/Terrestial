package gay.block36.terrestrial.fabric;

import gay.block36.terrestrial.Terrestrial;
import net.fabricmc.api.ModInitializer;

public class TerrestrialFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Terrestrial.init();
    }
}