package com.f88484116.tatooinedesertmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

public class BlasterItem extends SwordItem {
    
    public BlasterItem() {
        super(Tiers.DIAMOND, 5, -2.4f, 
            new Item.Properties()
                .stacksTo(1)
                .durability(2000)
        );
    }
    
    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("Blaster fired!");
        }
        return InteractionResult.SUCCESS;
    }
}