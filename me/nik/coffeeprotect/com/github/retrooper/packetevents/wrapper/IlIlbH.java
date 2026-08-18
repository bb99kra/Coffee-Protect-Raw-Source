/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbH
extends PacketWrapper<IlIlbH> {
    private int IlIlJ;
    private static transient /* synthetic */ String dbZPspJPgc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbH(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbH(int n) {
        super(IlIlAG.CHUNK_BATCH_END);
        this.IlIlJ = n;
    }

    @Override
    public void IlIle() {
        this.IlIlJ = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlJ);
    }

    public void IlIlA(IlIlbH ilIlbH) {
        this.IlIlJ = ilIlbH.IlIlJ;
    }

    public int IlIlx() {
        return this.IlIlJ;
    }

    public void IlIls(int n) {
        this.IlIlJ = n;
    }
}

