package com.f88484116.tatooinedesertmod.villager;

import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class Scrapper {
    public static final VillagerProfession SCRAPPER = new VillagerProfession(
        "scrapper",
        poiType -> poiType == PoiType.HOME,
        poiType -> poiType == PoiType.HOME,
        ImmutableSet.of(Blocks.IRON_BLOCK),
        ImmutableSet.of(),
        net.minecraft.sounds.SoundEvents.VILLAGER_WORK_TOOLSMITH
    );
}