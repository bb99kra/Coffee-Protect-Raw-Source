/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlO_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbP
extends PacketWrapper<IlIlbP> {
    private IlIlO_ IlIlc;
    private boolean IlIlZ;
    private IlIlAn IlIlw;
    private int IlIlF;
    private static transient /* synthetic */ String yoYTOCeXfw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbP(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbP(IlIlO_ ilIlO_, boolean bl, IlIlAn ilIlAn, int n) {
        super(IlIlAG.ACKNOWLEDGE_PLAYER_DIGGING);
        this.IlIlc = ilIlO_;
        this.IlIlZ = bl;
        this.IlIlw = ilIlAn;
        this.IlIlF = n;
    }

    @Override
    public void IlIle() {
        this.IlIlw = this.IlIlE();
        this.IlIlF = this.IlIlf();
        this.IlIlc = IlIlO_.IlIlZ(this.IlIlf());
        this.IlIlZ = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIlh(this.IlIlw);
        this.IlIlJ(this.IlIlF);
        this.IlIlJ(this.IlIlc.IlIlr());
        this.IlIla(this.IlIlZ);
    }

    public void IlIlb(IlIlbP ilIlbP) {
        this.IlIlc = ilIlbP.IlIlc;
        this.IlIlZ = ilIlbP.IlIlZ;
        this.IlIlw = ilIlbP.IlIlw;
        this.IlIlF = ilIlbP.IlIlF;
    }

    public IlIlO_ IlIlO() {
        return this.IlIlc;
    }

    public void IlIlx(IlIlO_ ilIlO_) {
        this.IlIlc = ilIlO_;
    }

    public boolean IlIlR() {
        return this.IlIlZ;
    }

    public void IlIlz(boolean bl) {
        this.IlIlZ = bl;
    }

    public IlIlAn IlIlU() {
        return this.IlIlw;
    }

    public void IlIlx(IlIlAn ilIlAn) {
        this.IlIlw = ilIlAn;
    }

    public int IlIlI() {
        return this.IlIlF;
    }

    public void IlIlx(int n) {
        this.IlIlF = n;
    }
}

