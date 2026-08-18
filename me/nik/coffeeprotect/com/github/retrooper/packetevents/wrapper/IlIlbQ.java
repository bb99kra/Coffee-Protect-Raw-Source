/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class IlIlbQ
extends PacketWrapper<IlIlbQ> {
    private int IlIlq;
    private static transient /* synthetic */ String emRhiKjAHQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbQ(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbQ(int n) {
        super(IlIlnN.SPECTATE_ENTITY);
        this.IlIlq = n;
    }

    @Override
    public void IlIle() {
        this.IlIlq = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlq);
    }

    public void IlIlo(IlIlbQ ilIlbQ) {
        this.IlIlq = ilIlbQ.IlIlq;
    }

    public int IlIls() {
        return this.IlIlq;
    }

    public void IlIlA(int n) {
        this.IlIlq = n;
    }
}

