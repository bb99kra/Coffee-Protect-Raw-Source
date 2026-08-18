/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.IlIlA1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.IlIlif;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

final class BooleanModifier$3
extends IlIlif {
    private static final long b = IlIls.a(-4301598203261252432L, -5038041742597991920L, MethodHandles.lookup().lookupClass()).a(273873595770243L);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        long l = b ^ 0x56E5516DC0EL;
        int[] nArray = IlIlA1.IlIlN();
        boolean bl3 = bl2;
        if (nArray != null) return bl3;
        if (!bl3) {
            bl3 = bl;
            if (nArray != null) return bl3;
            if (!bl3) {
                bl3 = false;
                return bl3;
            }
        }
        bl3 = true;
        return bl3;
    }
}

