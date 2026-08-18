/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbl
extends PacketWrapper<IlIlbl> {
    private boolean IlIlt;
    private boolean IlIl_;
    private static transient /* synthetic */ String qUbLgDHnld = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbl(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbl(boolean bl, boolean bl2) {
        super(IlIlnN.STEER_BOAT);
        this.IlIlt = bl;
        this.IlIl_ = bl2;
    }

    @Override
    public void IlIle() {
        this.IlIlt = this.IlIlK();
        this.IlIl_ = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIla(this.IlIlt);
        this.IlIla(this.IlIl_);
    }

    public void IlIlJ(IlIlbl ilIlbl) {
        this.IlIlt = ilIlbl.IlIlt;
        this.IlIl_ = ilIlbl.IlIl_;
    }

    public boolean IlIll() {
        return this.IlIlt;
    }

    public void IlIln(boolean bl) {
        this.IlIlt = bl;
    }

    public boolean IlIlx() {
        return this.IlIl_;
    }

    public void IlIlr(boolean bl) {
        this.IlIl_ = bl;
    }
}

