/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFq
extends PacketWrapper<IlIlFq> {
    private String IlIlr;
    private int IlIlo;
    private static transient /* synthetic */ String uutZhFMHKE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFq(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFq(String string, int n) {
        super(IlIlAG.TRANSFER);
        this.IlIlr = string;
        this.IlIlo = n;
    }

    @Override
    public void IlIle() {
        this.IlIlr = this.IlIli();
        this.IlIlo = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlM(this.IlIlr);
        this.IlIlJ(this.IlIlo);
    }

    public void IlIlN(IlIlFq ilIlFq) {
        this.IlIlr = ilIlFq.IlIlr;
        this.IlIlo = ilIlFq.IlIlo;
    }

    public String IlIlL() {
        return this.IlIlr;
    }

    public void IlIlm(String string) {
        this.IlIlr = string;
    }

    public int IlIlC() {
        return this.IlIlo;
    }

    public void IlIlK(int n) {
        this.IlIlo = n;
    }
}

