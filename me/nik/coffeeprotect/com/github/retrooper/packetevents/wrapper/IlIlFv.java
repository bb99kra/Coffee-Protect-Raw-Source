/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFv
extends PacketWrapper<IlIlFv> {
    private int IlIlO;
    private static transient /* synthetic */ String IFWPDzcDKi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFv(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFv(int n) {
        super(IlIlAG.UPDATE_SIMULATION_DISTANCE);
        this.IlIlO = n;
    }

    @Override
    public void IlIle() {
        this.IlIlO = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlO);
    }

    public void IlIlO(IlIlFv ilIlFv) {
        this.IlIlO = ilIlFv.IlIlO;
    }

    public int IlIlx() {
        return this.IlIlO;
    }

    public void IlIlC(int n) {
        this.IlIlO = n;
    }
}

