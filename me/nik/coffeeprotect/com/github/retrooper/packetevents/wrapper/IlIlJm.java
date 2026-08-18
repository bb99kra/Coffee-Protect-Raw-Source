/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIln0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJm
extends PacketWrapper<IlIlJm> {
    private int IlIlG;
    private static transient /* synthetic */ String lJqomredFP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJm(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJm(int n) {
        super(IlIln0.SET_COMPRESSION);
        this.IlIlG = n;
    }

    @Override
    public void IlIle() {
        this.IlIlG = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlG);
    }

    public void IlIlR(IlIlJm ilIlJm) {
        this.IlIlG = ilIlJm.IlIlG;
    }

    public int IlIlO() {
        return this.IlIlG;
    }

    public void IlIlw(int n) {
        this.IlIlG = n;
    }
}

