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
public class IlIlJt
extends PacketWrapper<IlIlJt> {
    private int IlIlH;
    private static transient /* synthetic */ String QxbltNpHBN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJt(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJt(int n) {
        super(IlIlnN.ATTACK);
        this.IlIlH = n;
    }

    @Override
    public void IlIle() {
        this.IlIlH = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlH);
    }

    public void IlIlj(IlIlJt ilIlJt) {
        this.IlIlH = ilIlJt.IlIlH;
    }

    public int IlIlE() {
        return this.IlIlH;
    }

    public void IlIlK(int n) {
        this.IlIlH = n;
    }
}

