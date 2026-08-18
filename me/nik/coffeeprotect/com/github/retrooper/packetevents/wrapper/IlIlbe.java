/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbe
extends PacketWrapper<IlIlbe> {
    private int IlIlF;
    private static transient /* synthetic */ String PcoUYYsGhC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbe(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbe(int n) {
        super(IlIlAG.ACKNOWLEDGE_BLOCK_CHANGES);
        this.IlIlF = n;
    }

    @Override
    public void IlIle() {
        this.IlIlF = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlF);
    }

    public void IlIlC(IlIlbe ilIlbe) {
        this.IlIlF = ilIlbe.IlIlF;
    }

    public int IlIlv() {
        return this.IlIlF;
    }

    public void IlIlF(int n) {
        this.IlIlF = n;
    }
}

