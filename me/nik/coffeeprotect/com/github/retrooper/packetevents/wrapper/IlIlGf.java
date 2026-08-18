/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlGf {
    @Nullable
    private IlIloL IlIlQ;
    private int IlIlT;
    private static int[] IlIl_;
    private static transient /* synthetic */ String dIKoaGnypX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlGf(@Nullable IlIloL ilIloL, int n) {
        this.IlIlQ = ilIloL;
        this.IlIlT = n;
    }

    @Nullable
    public IlIloL IlIln() {
        return this.IlIlQ;
    }

    public int IlIlQ() {
        return this.IlIlT;
    }

    public void IlIlc(@Nullable IlIloL ilIloL) {
        this.IlIlQ = ilIloL;
    }

    public void IlIlB(int n) {
        this.IlIlT = n;
    }

    public static void IlIlM(int[] nArray) {
        IlIl_ = nArray;
    }

    public static int[] IlIly() {
        return IlIl_;
    }

    static {
        if (IlIlGf.IlIly() == null) {
            IlIlGf.IlIlM(new int[5]);
        }
    }
}

