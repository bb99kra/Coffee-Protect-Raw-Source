/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbc
extends PacketWrapper<IlIlbc> {
    private IlIlAn IlIlA;
    private boolean IlIlx;
    private static transient /* synthetic */ String nZjYfbibAD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbc(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbc(IlIlAn ilIlAn, boolean bl) {
        super(IlIlnN.PICK_ITEM_FROM_BLOCK);
        this.IlIlA = ilIlAn;
        this.IlIlx = bl;
    }

    @Override
    public void IlIle() {
        this.IlIlA = this.IlIlE();
        this.IlIlx = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIlh(this.IlIlA);
        this.IlIla(this.IlIlx);
    }

    public void IlIlj(IlIlbc ilIlbc) {
        this.IlIlA = ilIlbc.IlIlA;
        this.IlIlx = ilIlbc.IlIlx;
    }

    public IlIlAn IlIlR() {
        return this.IlIlA;
    }

    public void IlIlH(IlIlAn ilIlAn) {
        this.IlIlA = ilIlAn;
    }

    public boolean IlIlG() {
        return this.IlIlx;
    }

    public void IlIlU(boolean bl) {
        this.IlIlx = bl;
    }
}

