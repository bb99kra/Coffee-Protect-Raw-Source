/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbZ
extends PacketWrapper<IlIlbZ> {
    private int IlIlu;
    private static transient /* synthetic */ String PIRfClEyBY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbZ(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbZ(int n) {
        super(IlIlAG.CAMERA);
        this.IlIlu = n;
    }

    @Override
    public void IlIle() {
        this.IlIlu = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlu);
    }

    public void IlIly(IlIlbZ ilIlbZ) {
        this.IlIlu = ilIlbZ.IlIlu;
    }

    public int IlIli() {
        return this.IlIlu;
    }

    public void IlIlC(int n) {
        this.IlIlu = n;
    }
}

