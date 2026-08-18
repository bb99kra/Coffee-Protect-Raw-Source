/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJK
extends PacketWrapper<IlIlJK> {
    private long IlIlE;
    private static transient /* synthetic */ String GbmhBkfDGt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJK(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJK(long l) {
        super(IlIlWz.KEEP_ALIVE);
        this.IlIlE = l;
    }

    @Override
    public void IlIle() {
        this.IlIlE = this.IlIli();
    }

    @Override
    public void IlIlJ() {
        this.IlIlP(this.IlIlE);
    }

    public void IlIlR(IlIlJK ilIlJK) {
        this.IlIlE = ilIlJK.IlIlE;
    }

    public long IlIlF() {
        return this.IlIlE;
    }

    public void IlIlj(long l) {
        this.IlIlE = l;
    }
}

