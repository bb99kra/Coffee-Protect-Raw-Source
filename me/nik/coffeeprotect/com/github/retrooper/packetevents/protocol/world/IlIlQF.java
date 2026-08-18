/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlXH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlh7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlnq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlQF
implements IlIlXH {
    private static final long a = IlIls.a(4504168402860348053L, -9150263788789232279L, MethodHandles.lookup().lookupClass()).a(160616214581364L);
    private static transient /* synthetic */ String iYYWhLlXzz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public IlIlCV[] IlIlZ(IlIlnq ilIlnq, BitSet bitSet, BitSet bitSet2, boolean bl, boolean bl2, boolean bl3, int n, int n2, PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x496140DD4094L;
        IlIlCV[] ilIlCVArray = new IlIlCV[n];
        boolean bl4 = IlIlCR.IlIlf();
        for (int i = 0; i < ilIlCVArray.length; ++i) {
            if (!bitSet.get(i)) continue;
            ilIlCVArray[i] = IlIlh7.IlIlH(packetWrapper, bl2, bl3);
            if (!bl4) continue;
        }
        return ilIlCVArray;
    }
}

