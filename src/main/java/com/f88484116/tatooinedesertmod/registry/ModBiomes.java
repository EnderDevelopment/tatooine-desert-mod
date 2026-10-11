package com.f88484116.tatooinedesertmod.registry;

import com.f88484116.tatooinedesertmod.TatooineDesertMod;
import com.f88484116.tatooinedesertmod.world.biome.TatooineDesertBiome;
import net.minecraft.core.registries.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.level.biome.Biome;

public class ModBiomes {
    public static final Biome TATOOINE_DESERT = TatooineDesertBiome.create();

    public static void register() {
        Registry.register(
            Registries.BIOME,
            new Identifier(TatooineDesertMod.MOD_ID, "tatooine_desert"),
            TATOOINE_DESERT
        );
    }
}