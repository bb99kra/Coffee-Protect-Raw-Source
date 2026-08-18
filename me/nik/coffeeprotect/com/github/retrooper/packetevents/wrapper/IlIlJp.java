/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJp
extends PacketWrapper<IlIlJp> {
    private long IlIlm;
    private static transient /* synthetic */ String OstmulqAZI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJp(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJp(long l) {
        super(IlIlqy.KEEP_ALIVE);
        this.IlIlm = l;
    }

    @Override
    public void IlIle() {
        this.IlIlm = this.IlIli();
    }

    @Override
    public void IlIlJ() {
        this.IlIlP(this.IlIlm);
    }

    public void IlIls(IlIlJp ilIlJp) {
        this.IlIlm = ilIlJp.IlIlm;
    }

    public long IlIla() {
        return this.IlIlm;
    }

    public void IlIlt(long l) {
        this.IlIlm = l;
    }
}

