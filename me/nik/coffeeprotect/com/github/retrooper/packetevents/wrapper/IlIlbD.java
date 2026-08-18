/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbD
extends PacketWrapper<IlIlbD> {
    private int IlIl_;
    private boolean IlIlw;
    private static transient /* synthetic */ String ujEpGuOVcb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbD(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbD(int n, boolean bl) {
        super(IlIlnN.PICK_ITEM_FROM_ENTITY);
        this.IlIl_ = n;
        this.IlIlw = bl;
    }

    @Override
    public void IlIle() {
        this.IlIl_ = this.IlIlf();
        this.IlIlw = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIl_);
        this.IlIla(this.IlIlw);
    }

    public void IlIl_(IlIlbD ilIlbD) {
        this.IlIl_ = ilIlbD.IlIl_;
        this.IlIlw = ilIlbD.IlIlw;
    }

    public int IlIlN() {
        return this.IlIl_;
    }

    public void IlIl_(int n) {
        this.IlIl_ = n;
    }

    public boolean IlIlo() {
        return this.IlIlw;
    }

    public void IlIlz(boolean bl) {
        this.IlIlw = bl;
    }
}

