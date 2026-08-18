/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIliP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbE;

public class IlIlbk
extends IlIlbE {
    private static transient /* synthetic */ String oQiexhFjjW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbk(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbk(float f, float f2, boolean bl) {
        super(false, true, bl, new IlIliP(new IlIlv_(), f, f2));
    }

    public float IlIlq() {
        return this.IlIlP().IlIlH();
    }

    public void IlIlV(float f) {
        this.IlIlP().IlIlI(f);
    }

    public float IlIlE() {
        return this.IlIlP().IlIlP();
    }

    public void IlIlL(float f) {
        this.IlIlP().IlIlm(f);
    }
}

