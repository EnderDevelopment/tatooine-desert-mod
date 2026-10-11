package com.f88484116.tatooinedesertmod.registry;

import com.f88484116.tatooinedesertmod.TatooineDesertMod;
import com.f88484116.tatooinedesertmod.world.feature.TatooineVillageFeature;
import net.minecraft.core.registries.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class ModFeatures {
    public static final Feature<NoneFeatureConfiguration> TATOOINE_VILLAGE = new TatooineVillageFeature();

    public static void register() {
        Registry.register(
            Registries.FEATURE,
            new Identifier(TatooineDesertMod.MOD_ID, "tatooine_village"),
            TATOOINE_VILLAGE
        );
    }
}