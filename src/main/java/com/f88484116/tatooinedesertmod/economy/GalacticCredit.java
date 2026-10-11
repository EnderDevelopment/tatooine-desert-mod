package com.f88484116.tatooinedesertmod.economy;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;

public class GalacticCredit {
    private int credits;

    public GalacticCredit() {
        this.credits = 0;
    }

    public int getCredits() {
        return credits;
    }

    public void addCredits(int amount) {
        this.credits += amount;
    }

    public boolean removeCredits(int amount) {
        if (this.credits >= amount) {
            this.credits -= amount;
            return true;
        }
        return false;
    }

    public void save(CompoundTag tag) {
        tag.putInt("credits", credits);
    }

    public void load(CompoundTag tag) {
        this.credits = tag.getInt("credits");
    }
}