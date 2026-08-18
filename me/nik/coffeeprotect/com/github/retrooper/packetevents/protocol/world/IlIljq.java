/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIljq {
    private final int IlIlX;
    private final int IlIlz;
    private final int IlIlx;
    private final int IlIlP;
    private final int IlIll;
    private final int IlIlO;
    private static transient /* synthetic */ String rAjGhysqpR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIljq(int n, int n2, int n3, int n4, int n5, int n6) {
        this.IlIlX = Math.min(n, n4);
        this.IlIlz = Math.min(n2, n5);
        this.IlIlx = Math.min(n3, n6);
        this.IlIlP = Math.max(n4, n);
        this.IlIll = Math.max(n5, n2);
        this.IlIlO = Math.max(n6, n3);
    }

    public static IlIljq IlIlA(PacketWrapper<?> packetWrapper) {
        IlIlAn ilIlAn = packetWrapper.IlIlE();
        IlIlAn ilIlAn2 = packetWrapper.IlIlE();
        return new IlIljq(ilIlAn.IlIlj, ilIlAn.IlIlw, ilIlAn.IlIlk, ilIlAn2.IlIlj, ilIlAn2.IlIlw, ilIlAn2.IlIlk);
    }

    public static void IlIld(PacketWrapper<?> packetWrapper, IlIljq ilIljq) {
        packetWrapper.IlIlh(new IlIlAn(ilIljq.IlIlX, ilIljq.IlIlz, ilIljq.IlIlx));
        packetWrapper.IlIlh(new IlIlAn(ilIljq.IlIlP, ilIljq.IlIll, ilIljq.IlIlO));
    }

    public int IlIll() {
        return this.IlIlX;
    }

    public int IlIlj() {
        return this.IlIlz;
    }

    public int IlIlr() {
        return this.IlIlx;
    }

    public int IlIlD() {
        return this.IlIlP;
    }

    public int IlIlV() {
        return this.IlIll;
    }

    public int IlIle() {
        return this.IlIlO;
    }
}

