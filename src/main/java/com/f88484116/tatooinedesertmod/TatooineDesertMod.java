package com.f88484116.tatooinedesertmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TatooineDesertMod implements ModInitializer {
    public static final String MOD_ID = "tatooinedesertmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.register();
        ModBiomes.register();
        ModFeatures.register();
        ModVillagerProfessions.register();
        ModStatusEffects.register();
        ModEntities.register();
        ModQuests.register();
        LOGGER.info("Tatooine Desert Mod has been initialized!");
    }
}