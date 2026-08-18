/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlb0
extends PacketWrapper<IlIlb0> {
    private boolean IlIll;
    private static transient /* synthetic */ String GtCInXsyLS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb0(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlb0(boolean bl) {
        super(IlIlnN.LOCK_DIFFICULTY);
        this.IlIll = bl;
    }

    @Override
    public void IlIle() {
        this.IlIll = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIla(this.IlIll);
    }

    public void IlIlx(IlIlb0 ilIlb0) {
        this.IlIll = ilIlb0.IlIll;
    }

    public boolean IlIlq() {
        return this.IlIll;
    }

    public void IlIli(boolean bl) {
        this.IlIll = bl;
    }
}

