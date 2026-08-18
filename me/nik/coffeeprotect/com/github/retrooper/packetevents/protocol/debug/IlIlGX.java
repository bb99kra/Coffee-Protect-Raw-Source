/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlC2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlCw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlZt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class IlIlGX<T> {
    private final IlIlC2<T> IlIlU;
    private final T IlIld;
    private static final long a = IlIls.a(7489971849158798752L, -2871423446667178808L, MethodHandles.lookup().lookupClass()).a(12537703043571L);
    private static transient /* synthetic */ String tPRMGnMGGW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlGX(IlIlC2<T> ilIlC2, T t) {
        this.IlIlU = ilIlC2;
        this.IlIld = t;
    }

    public static IlIlGX<?> IlIlt(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x403D5777D68FL;
        IlIlC2<?> ilIlC2 = packetWrapper.IlIlt(IlIlZt.IlIlp());
        int n = IlIlCw.IlIlO();
        Object obj = ilIlC2.read(packetWrapper);
        IlIlGX ilIlGX = new IlIlGX(ilIlC2, obj);
        if (PacketWrapper.IlIlz() == null) {
            IlIlCw.IlIlx(++n);
        }
        return ilIlGX;
    }

    public static <T> void IlIlo(PacketWrapper<?> packetWrapper, IlIlGX<T> ilIlGX) {
        packetWrapper.IlIle(ilIlGX.IlIlU);
        ilIlGX.IlIlU.write(packetWrapper, ilIlGX.IlIld);
    }

    public IlIlC2<T> IlIlc() {
        return this.IlIlU;
    }

    public T IlIlc() {
        return this.IlIld;
    }
}

