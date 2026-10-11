package com.f88484116.tatooinedesertmod.registry;

import com.f88484116.tatooinedesertmod.TatooineDesertMod;
import com.f88484116.tatooinedesertmod.statuseffect.WantedLevelEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.effect.MobEffect;

public class ModStatusEffects {
    public static final MobEffect WANTED_LEVEL = new WantedLevelEffect();

    public static void register() {
        Registry.register(
            Registries.MOB_EFFECT,
            new Identifier(TatooineDesertMod.MOD_ID, "wanted_level"),
            WANTED_LEVEL
        );
    }
}