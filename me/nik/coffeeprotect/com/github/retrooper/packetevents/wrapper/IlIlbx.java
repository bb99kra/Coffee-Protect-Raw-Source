/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlrx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbx
extends PacketWrapper<IlIlbx> {
    private IlIlrx IlIlT;
    private boolean IlIlq;
    private boolean IlIlN;
    private static transient /* synthetic */ String tJsWENBysj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbx(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbx(IlIlrx ilIlrx, boolean bl, boolean bl2) {
        super(IlIlnN.SET_RECIPE_BOOK_STATE);
        this.IlIlT = ilIlrx;
        this.IlIlq = bl;
        this.IlIlN = bl2;
    }

    @Override
    public void IlIle() {
        this.IlIlT = IlIlrx.IlIlF(this.IlIlf());
        this.IlIlq = this.IlIlK();
        this.IlIlN = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlT.IlIlT());
        this.IlIla(this.IlIlq);
        this.IlIla(this.IlIlN);
    }

    public void IlIlV(IlIlbx ilIlbx) {
        this.IlIlT = ilIlbx.IlIlT;
        this.IlIlq = ilIlbx.IlIlq;
        this.IlIlN = ilIlbx.IlIlN;
    }

    public IlIlrx IlIln() {
        return this.IlIlT;
    }

    public void IlIlk(IlIlrx ilIlrx) {
        this.IlIlT = ilIlrx;
    }

    public boolean IlIls() {
        return this.IlIlq;
    }

    public void IlIlG(boolean bl) {
        this.IlIlq = bl;
    }

    public boolean IlIli() {
        return this.IlIlN;
    }

    public void IlIl_(boolean bl) {
        this.IlIlN = bl;
    }
}

