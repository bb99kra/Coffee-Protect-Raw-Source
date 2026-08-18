/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJi
extends PacketWrapper<IlIlJi> {
    private int IlIlL;
    private static transient /* synthetic */ String TTDcezrGGB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJi(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJi(int n) {
        super(IlIlnN.HELD_ITEM_CHANGE);
        this.IlIlL = n;
    }

    @Override
    public void IlIle() {
        this.IlIlL = this.IlIlG();
    }

    @Override
    public void IlIlJ() {
        this.IlIlG(this.IlIlL);
    }

    public void IlIlb(IlIlJi ilIlJi) {
        this.IlIlL = ilIlJi.IlIlL;
    }

    public int IlIlz() {
        return this.IlIlL;
    }

    public void IlIlx(int n) {
        this.IlIlL = n;
    }
}

