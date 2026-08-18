/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJ9
extends PacketWrapper<IlIlJ9> {
    private int IlIlD;
    private static transient /* synthetic */ String iJbaKJpqjn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ9(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJ9(int n) {
        super(IlIlnN.CLOSE_WINDOW);
        this.IlIlD = n;
    }

    @Override
    public void IlIle() {
        this.IlIlD = this.IlIle();
    }

    @Override
    public void IlIlJ() {
        this.IlIlr(this.IlIlD);
    }

    @Override
    public void IlIlB(IlIlJ9 ilIlJ9) {
        this.IlIlD = ilIlJ9.IlIlD;
    }

    public int IlIlx() {
        return this.IlIlD;
    }

    public void IlIlK(int n) {
        this.IlIlD = n;
    }
}

