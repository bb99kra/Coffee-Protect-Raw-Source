/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlO8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIld2 {
    public static final IlIld2 IlIlc;
    public static final IlIld2 IlIlt;
    private final BitSet IlIlV;
    private final IlIlO8 IlIlO;
    private static final long a;
    private static transient /* synthetic */ String SPhfaiThKP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIld2(BitSet bitSet, IlIlO8 ilIlO8) {
        this.IlIlO = ilIlO8;
        this.IlIlV = bitSet;
    }

    public IlIld2(BitSet bitSet) {
        long l = a ^ 0x752560025E94L;
        boolean bl = IlIlO8.IlIlT();
        boolean bl2 = bl;
        this.IlIlO = IlIlO8.PARTIALLY_FILTERED;
        this.IlIlV = bitSet;
        if (bl2) {
            PacketWrapper.IlIle(new int[1]);
        }
    }

    public BitSet IlIlB() {
        return this.IlIlV;
    }

    public IlIlO8 IlIlG() {
        return this.IlIlO;
    }

    static {
        a = IlIls.a(-7941790534498726964L, 1999305549351198440L, MethodHandles.lookup().lookupClass()).a(96204285528688L);
        IlIlc = new IlIld2(new BitSet(0), IlIlO8.FULLY_FILTERED);
        IlIlt = new IlIld2(new BitSet(0), IlIlO8.PASS_THROUGH);
    }
}

