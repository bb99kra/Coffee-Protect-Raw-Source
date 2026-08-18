/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbh
extends PacketWrapper<IlIlbh> {
    private int IlIln;
    private short IlIlX;
    private boolean IlIlz;
    private static transient /* synthetic */ String GvRscBDQfe = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbh(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbh(int n, short s, boolean bl) {
        super(IlIlnN.WINDOW_CONFIRMATION);
        this.IlIln = n;
        this.IlIlX = s;
        this.IlIlz = bl;
    }

    @Override
    public void IlIle() {
        this.IlIln = this.IlIlP();
        this.IlIlX = this.IlIlG();
        this.IlIlz = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIlu(this.IlIln);
        this.IlIlG(this.IlIlX);
        this.IlIla(this.IlIlz);
    }

    public void IlIlw(IlIlbh ilIlbh) {
        this.IlIln = ilIlbh.IlIln;
        this.IlIlX = ilIlbh.IlIlX;
        this.IlIlz = ilIlbh.IlIlz;
    }

    public int IlIlh() {
        return this.IlIln;
    }

    public void IlIlN(int n) {
        this.IlIln = n;
    }

    public short IlIlB() {
        return this.IlIlX;
    }

    public void IlIls(short s) {
        this.IlIlX = s;
    }

    public boolean IlIlC() {
        return this.IlIlz;
    }

    public void IlIlv(boolean bl) {
        this.IlIlz = bl;
    }
}

