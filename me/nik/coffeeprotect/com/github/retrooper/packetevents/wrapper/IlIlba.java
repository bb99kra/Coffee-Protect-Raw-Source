/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIliP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbE;

public class IlIlba
extends IlIlbE {
    private static transient /* synthetic */ String YyYhOPkPpV = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlba(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlba(IlIlv_ ilIlv_, boolean bl) {
        super(true, false, bl, new IlIliP(ilIlv_, 0.0f, 0.0f));
    }

    public IlIlv_ IlIlw() {
        return this.IlIlP().IlIln();
    }

    public void IlIlm(IlIlv_ ilIlv_) {
        this.IlIlP().IlIlf(ilIlv_);
    }
}

