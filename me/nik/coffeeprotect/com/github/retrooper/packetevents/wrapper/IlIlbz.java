/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbz
extends PacketWrapper<IlIlbz> {
    private int IlIlQ;
    private static transient /* synthetic */ String dFEACxyzNJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbz(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbz(int n) {
        super(IlIlnN.PONG);
        this.IlIlQ = n;
    }

    @Override
    public void IlIle() {
        this.IlIlQ = this.IlIlW();
    }

    @Override
    public void IlIlJ() {
        this.IlIla(this.IlIlQ);
    }

    public void IlIlC(IlIlbz ilIlbz) {
        this.IlIlQ = ilIlbz.IlIlQ;
    }

    public int IlIlk() {
        return this.IlIlQ;
    }

    public void IlIlS(int n) {
        this.IlIlQ = n;
    }
}

