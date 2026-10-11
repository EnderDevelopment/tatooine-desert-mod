package com.f88484116.tatooinedesertmod.villager;

import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ShipOwner {
    public static final VillagerProfession SHIP_OWNER = new VillagerProfession(
        "ship_owner",
        poiType -> poiType == PoiType.HOME,
        poiType -> poiType == PoiType.HOME,
        ImmutableSet.of(Blocks.ENDER_CHEST),
        ImmutableSet.of(),
        net.minecraft.sounds.SoundEvents.VILLAGER_WORK_CLERIC
    );
}