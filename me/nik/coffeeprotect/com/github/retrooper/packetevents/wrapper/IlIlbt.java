/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbt
extends PacketWrapper<IlIlbt> {
    private int IlIlv;
    private String IlIlx;
    private boolean IlIlQ;
    private static transient /* synthetic */ String AszdKZANwQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbt(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbt(int n, String string, boolean bl) {
        super(IlIlnN.UPDATE_COMMAND_BLOCK_MINECART);
        this.IlIlv = n;
        this.IlIlx = string;
        this.IlIlQ = bl;
    }

    @Override
    public void IlIle() {
        this.IlIlv = this.IlIlf();
        this.IlIlx = this.IlIli();
        this.IlIlQ = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlv);
        this.IlIlM(this.IlIlx);
        this.IlIla(this.IlIlQ);
    }

    public void IlIlH(IlIlbt ilIlbt) {
        this.IlIlv = ilIlbt.IlIlv;
        this.IlIlx = ilIlbt.IlIlx;
        this.IlIlQ = ilIlbt.IlIlQ;
    }

    public int IlIlp() {
        return this.IlIlv;
    }

    public void IlIlW(int n) {
        this.IlIlv = n;
    }

    public String IlIlM() {
        return this.IlIlx;
    }

    public void IlIlx(String string) {
        this.IlIlx = string;
    }

    public boolean IlIlg() {
        return this.IlIlQ;
    }

    public void IlIlF(boolean bl) {
        this.IlIlQ = bl;
    }
}

