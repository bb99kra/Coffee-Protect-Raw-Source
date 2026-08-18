/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.IlIlA1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.IlIlif;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

final class BooleanModifier$2
extends IlIlif {
    private static final long b = IlIls.a(7505350585041321100L, -1180039936845639027L, MethodHandles.lookup().lookupClass()).a(160962158057471L);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        long l = b ^ 0x70F0213E7A90L;
        int[] nArray = IlIlA1.IlIlN();
        boolean bl3 = bl2;
        if (nArray != null) return bl3;
        if (bl3) {
            bl3 = bl;
            if (nArray != null) return bl3;
            if (bl3) {
                bl3 = false;
                return bl3;
            }
        }
        bl3 = true;
        return bl3;
    }
}

