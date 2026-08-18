/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbm
extends PacketWrapper<IlIlbm> {
    private int IlIlB;
    private static transient /* synthetic */ String gYCePnzPiq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbm(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbm(int n) {
        super(IlIlnN.TELEPORT_CONFIRM);
        this.IlIlB = n;
    }

    @Override
    public void IlIle() {
        this.IlIlB = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlB);
    }

    public void IlIln(IlIlbm ilIlbm) {
        this.IlIlB = ilIlbm.IlIlB;
    }

    public int IlIlC() {
        return this.IlIlB;
    }

    public void IlIlZ(int n) {
        this.IlIlB = n;
    }
}

