/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFs
extends PacketWrapper<IlIlFs> {
    private int IlIlD;
    private int IlIlN;
    private int IlIlA;
    private static transient /* synthetic */ String uthOdbJErp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFs(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFs(int n, int n2, int n3) {
        super(IlIlAG.SET_TITLE_TIMES);
        this.IlIlD = n;
        this.IlIlN = n2;
        this.IlIlA = n3;
    }

    @Override
    public void IlIle() {
        this.IlIlD = this.IlIlW();
        this.IlIlN = this.IlIlW();
        this.IlIlA = this.IlIlW();
    }

    @Override
    public void IlIlJ() {
        this.IlIla(this.IlIlD);
        this.IlIla(this.IlIlN);
        this.IlIla(this.IlIlA);
    }

    @Override
    public void IlIlB(IlIlFs ilIlFs) {
        this.IlIlD = ilIlFs.IlIlD;
        this.IlIlN = ilIlFs.IlIlN;
        this.IlIlA = ilIlFs.IlIlA;
    }

    public int IlIls() {
        return this.IlIlD;
    }

    public void IlIlc(int n) {
        this.IlIlD = n;
    }

    public int IlIlQ() {
        return this.IlIlN;
    }

    public void IlIlg(int n) {
        this.IlIlN = n;
    }

    public int IlIlx() {
        return this.IlIlA;
    }

    public void IlIlW(int n) {
        this.IlIlA = n;
    }
}

