package com.f88484116.tatooinedesertmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;

public class ImperialInterceptorEntity extends Boat {
    
    public ImperialInterceptorEntity(EntityType<? extends Boat> entityType, Level level) {
        super(entityType, level);
    }
    
    @Override
    public void tick() {
        super.tick();
        // Custom tick logic for Imperial Interceptor
    }
}