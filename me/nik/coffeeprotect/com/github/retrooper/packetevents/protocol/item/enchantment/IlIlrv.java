/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.IlIlZC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.IlIlQY;

public class IlIlrv {
    private IlIlQY IlIlp;
    private int IlIlS;
    private static transient /* synthetic */ String LciAQmEtkq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlrv IlIll(IlIlQY ilIlQY) {
        this.IlIlp = ilIlQY;
        return this;
    }

    public IlIlrv IlIlM(int n) {
        this.IlIlS = n;
        return this;
    }

    public IlIlZC IlIlX() {
        return new IlIlZC(this.IlIlp, this.IlIlS);
    }
}

