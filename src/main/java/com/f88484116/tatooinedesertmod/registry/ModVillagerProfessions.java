package com.f88484116.tatooinedesertmod.registry;

import com.f88484116.tatooinedesertmod.TatooineDesertMod;
import com.f88484116.tatooinedesertmod.villager.VillageGuard;
import com.f88484116.tatooinedesertmod.villager.Scrapper;
import com.f88484116.tatooinedesertmod.villager.ShipOwner;
import net.minecraft.core.registries.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.entity.npc.VillagerProfession;

public class ModVillagerProfessions {
    public static final VillagerProfession VILLAGE_GUARD = VillageGuard.VILLAGE_GUARD;
    public static final VillagerProfession SCRAPPER = Scrapper.SCRAPPER;
    public static final VillagerProfession SHIP_OWNER = ShipOwner.SHIP_OWNER;

    public static void register() {
        Registry.register(
            Registries.VILLAGER_PROFESSION,
            new Identifier(TatooineDesertMod.MOD_ID, "village_guard"),
            VILLAGE_GUARD
        );
        Registry.register(
            Registries.VILLAGER_PROFESSION,
            new Identifier(TatooineDesertMod.MOD_ID, "scrapper"),
            SCRAPPER
        );
        Registry.register(
            Registries.VILLAGER_PROFESSION,
            new Identifier(TatooineDesertMod.MOD_ID, "ship_owner"),
            SHIP_OWNER
        );
    }
}