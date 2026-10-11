package com.f88484116.tatooinedesertmod.registry;

import com.f88484116.tatooinedesertmod.TatooineDesertMod;
import com.f88484116.tatooinedesertmod.entity.ImperialInterceptorEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntities {
    public static final EntityType<ImperialInterceptorEntity> IMPERIAL_INTERCEPTOR = EntityType.Builder.of(ImperialInterceptorEntity::new, MobCategory.MISC)
        .sized(1.5f, 0.6f)
        .build("imperial_interceptor");

    public static void register() {
        Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(TatooineDesertMod.MOD_ID, "imperial_interceptor"),
            IMPERIAL_INTERCEPTOR
        );
    }
}