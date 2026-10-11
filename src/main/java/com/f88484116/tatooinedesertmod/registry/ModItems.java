package com.f88484116.tatooinedesertmod.registry;

import com.f88484116.tatooinedesertmod.TatooineDesertMod;
import com.f88484116.tatooinedesertmod.items.BlasterItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLASTER = new BlasterItem();

    public static void register() {
        Registry.register(
            Registries.ITEM,
            new Identifier(TatooineDesertMod.MOD_ID, "blaster"),
            BLASTER
        );
    }
}