/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.IlIlif;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

final class BooleanModifier$6
extends IlIlif {
    private static final long b = IlIls.a(-7993744030781236307L, 4151200783488563565L, MethodHandles.lookup().lookupClass()).a(104085631459457L);

    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        long l = b ^ 0x58A52C37AFA8L;
        return bl2 == bl;
    }
}

