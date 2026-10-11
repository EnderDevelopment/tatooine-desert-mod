package com.f88484116.tatooinedesertmod.statuseffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class WantedLevelEffect extends MobEffect {
    
    public WantedLevelEffect() {
        super(MobEffectCategory.HARMFUL, 0xFF0000);
    }
    
    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (!entity.level().isClientSide) {
            // Logic to trigger Imperial Interceptors
        }
    }
    
    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}