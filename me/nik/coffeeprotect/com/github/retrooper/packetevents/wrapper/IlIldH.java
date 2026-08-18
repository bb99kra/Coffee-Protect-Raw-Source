/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.IlIlum;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class IlIldH {
    private final IlIlum<?> IlIlG;
    private final float IlIlx;
    private final float IlIlo;
    private static transient /* synthetic */ String NLGeflgjzW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIldH(IlIlum<?> ilIlum, float f, float f2) {
        this.IlIlG = ilIlum;
        this.IlIlx = f;
        this.IlIlo = f2;
    }

    public static IlIldH IlIlO(PacketWrapper<?> packetWrapper) {
        IlIlum<?> ilIlum = IlIlum.IlIlg(packetWrapper);
        float f = packetWrapper.IlIlX();
        float f2 = packetWrapper.IlIlX();
        return new IlIldH(ilIlum, f, f2);
    }

    public static void IlIlr(PacketWrapper<?> packetWrapper, IlIldH ilIldH) {
        IlIlum.IlIlu(packetWrapper, ilIldH.IlIlG);
        packetWrapper.IlIlR(ilIldH.IlIlx);
        packetWrapper.IlIlR(ilIldH.IlIlo);
    }

    public IlIlum<?> IlIlI() {
        return this.IlIlG;
    }

    public float IlIls() {
        return this.IlIlx;
    }

    public float IlIlF() {
        return this.IlIlo;
    }
}

