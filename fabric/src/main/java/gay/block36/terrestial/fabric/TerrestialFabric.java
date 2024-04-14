package gay.block36.terrestial.fabric;

import gay.block36.terrestial.Terrestial;
import net.fabricmc.api.ModInitializer;

public class TerrestialFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Terrestial.init();
    }
}