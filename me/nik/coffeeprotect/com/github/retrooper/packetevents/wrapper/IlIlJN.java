/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIljo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class IlIlJN
extends PacketWrapper<IlIlJN> {
    private IlIljo IlIlE;
    private static transient /* synthetic */ String NkvpyfkckN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJN(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJN(IlIljo ilIljo) {
        super(IlIlnN.DEBUG_SAMPLE_SUBSCRIPTION);
        this.IlIlE = ilIljo;
    }

    @Override
    public void IlIle() {
        this.IlIlE = IlIljo.values()[this.IlIlf()];
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlE.ordinal());
    }

    public void IlIlF(IlIlJN ilIlJN) {
        this.IlIlE = ilIlJN.IlIlE;
    }

    public IlIljo IlIlX() {
        return this.IlIlE;
    }

    public void IlIlL(IlIljo ilIljo) {
        this.IlIlE = ilIljo;
    }
}

