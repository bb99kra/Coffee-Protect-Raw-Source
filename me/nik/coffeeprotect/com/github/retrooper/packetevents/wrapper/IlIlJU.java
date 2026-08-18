/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJU
extends PacketWrapper<IlIlJU> {
    private long IlIl_;
    private static transient /* synthetic */ String FqoUjTjcuJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJU(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJU(long l) {
        super(IlIlnN.DEBUG_PING);
        this.IlIl_ = l;
    }

    @Override
    public void IlIle() {
        this.IlIl_ = this.IlIli();
    }

    @Override
    public void IlIlJ() {
        this.IlIlP(this.IlIl_);
    }

    public void IlIlo(IlIlJU ilIlJU) {
        this.IlIl_ = ilIlJU.IlIl_;
    }

    public long IlIlv() {
        return this.IlIl_;
    }

    public void IlIlW(long l) {
        this.IlIl_ = l;
    }
}

