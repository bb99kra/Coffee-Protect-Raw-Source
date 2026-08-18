/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbj
extends PacketWrapper<IlIlbj> {
    private String IlIlo;
    private static transient /* synthetic */ String BMhREkKoIa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbj(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbj(String string) {
        super(IlIlnN.NAME_ITEM);
        this.IlIlo = string;
    }

    @Override
    public void IlIle() {
        this.IlIlo = this.IlIli();
    }

    @Override
    public void IlIlJ() {
        this.IlIlM(this.IlIlo);
    }

    public void IlIlw(IlIlbj ilIlbj) {
        this.IlIlo = ilIlbj.IlIlo;
    }

    public String IlIlp() {
        return this.IlIlo;
    }

    public void IlIly(String string) {
        this.IlIlo = string;
    }
}

