/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJ7
extends PacketWrapper<IlIlJ7> {
    private String IlIlA;
    private int IlIlz;
    private static transient /* synthetic */ String AnXObbEwSQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ7(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJ7(String string, int n) {
        super(IlIlWz.TRANSFER);
        this.IlIlA = string;
        this.IlIlz = n;
    }

    @Override
    public void IlIle() {
        this.IlIlA = this.IlIli();
        this.IlIlz = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlM(this.IlIlA);
        this.IlIlJ(this.IlIlz);
    }

    public void IlIlG(IlIlJ7 ilIlJ7) {
        this.IlIlA = ilIlJ7.IlIlA;
        this.IlIlz = ilIlJ7.IlIlz;
    }

    public String IlIln() {
        return this.IlIlA;
    }

    public void IlIll(String string) {
        this.IlIlA = string;
    }

    public int IlIlP() {
        return this.IlIlz;
    }

    public void IlIlS(int n) {
        this.IlIlz = n;
    }
}

