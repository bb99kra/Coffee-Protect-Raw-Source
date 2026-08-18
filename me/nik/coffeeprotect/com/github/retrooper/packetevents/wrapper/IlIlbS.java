/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbS
extends PacketWrapper<IlIlbS> {
    private int IlIlI;
    private IlIlAn IlIlM;
    private static transient /* synthetic */ String PqNaTUGUKt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbS(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbS(int n, IlIlAn ilIlAn) {
        super(IlIlnN.QUERY_BLOCK_NBT);
        this.IlIlI = n;
        this.IlIlM = ilIlAn;
    }

    @Override
    public void IlIle() {
        this.IlIlI = this.IlIlf();
        this.IlIlM = this.IlIlE();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlI);
        this.IlIlh(this.IlIlM);
    }

    public void IlIlC(IlIlbS ilIlbS) {
        this.IlIlI = ilIlbS.IlIlI;
        this.IlIlM = ilIlbS.IlIlM;
    }

    public int IlIlX() {
        return this.IlIlI;
    }

    public void IlIlW(int n) {
        this.IlIlI = n;
    }

    public IlIlAn IlIlc() {
        return this.IlIlM;
    }

    public void IlIly(IlIlAn ilIlAn) {
        this.IlIlM = ilIlAn;
    }
}

