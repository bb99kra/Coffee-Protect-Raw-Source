/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJV
extends PacketWrapper<IlIlJV> {
    private int IlIlM;
    private static transient /* synthetic */ String dAwnSUAJQT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJV(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJV(int n) {
        super(IlIlqy.PONG);
        this.IlIlM = n;
    }

    @Override
    public void IlIle() {
        this.IlIlM = this.IlIlW();
    }

    @Override
    public void IlIlJ() {
        this.IlIla(this.IlIlM);
    }

    public void IlIlf(IlIlJV ilIlJV) {
        this.IlIlM = ilIlJV.IlIlM;
    }

    public int IlIls() {
        return this.IlIlM;
    }

    public void IlIln(int n) {
        this.IlIlM = n;
    }
}

