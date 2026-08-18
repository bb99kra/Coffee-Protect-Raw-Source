/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class IlIlbY
extends PacketWrapper<IlIlbY> {
    private int IlIld;
    private static transient /* synthetic */ String mYrXSrnxLQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbY(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbY(int n) {
        super(IlIlnN.PICK_ITEM);
        this.IlIld = n;
    }

    @Override
    public void IlIle() {
        this.IlIld = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIld);
    }

    public void IlIlm(IlIlbY ilIlbY) {
        this.IlIld = ilIlbY.IlIld;
    }

    public int IlIlj() {
        return this.IlIld;
    }

    public void IlIlL(int n) {
        this.IlIld = n;
    }
}

