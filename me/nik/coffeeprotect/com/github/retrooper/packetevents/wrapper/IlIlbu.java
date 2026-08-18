/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIliP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbE;

public class IlIlbu
extends IlIlbE {
    private static transient /* synthetic */ String EkXVIktckP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbu(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbu(IlIlv_ ilIlv_, float f, float f2, boolean bl) {
        super(true, true, bl, new IlIliP(ilIlv_, f, f2));
    }

    public IlIlbu(IlIliP ilIliP, boolean bl) {
        super(true, true, bl, ilIliP);
    }

    public IlIlv_ IlIlg() {
        return this.IlIlP().IlIln();
    }

    public void IlIlL(IlIlv_ ilIlv_) {
        this.IlIlP().IlIlf(ilIlv_);
    }

    public float IlIlK() {
        return this.IlIlP().IlIlH();
    }

    public void IlIlt(float f) {
        this.IlIlP().IlIlI(f);
    }

    public float IlIlJ() {
        return this.IlIlP().IlIlP();
    }

    public void IlIls(float f) {
        this.IlIlP().IlIlm(f);
    }
}

