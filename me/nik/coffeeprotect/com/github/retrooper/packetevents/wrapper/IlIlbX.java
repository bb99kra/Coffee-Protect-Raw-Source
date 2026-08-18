/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbX
extends PacketWrapper<IlIlbX> {
    private int IlIln;
    private static transient /* synthetic */ String lTLdmbiimp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbX(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbX(int n) {
        super(IlIlnN.SELECT_TRADE);
        this.IlIln = n;
    }

    @Override
    public void IlIle() {
        this.IlIln = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIln);
    }

    public void IlIlK(IlIlbX ilIlbX) {
        this.IlIln = ilIlbX.IlIln;
    }

    public int IlIlv() {
        return this.IlIln;
    }

    public void IlIlY(int n) {
        this.IlIln = n;
    }
}

