/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class IlIlJr
extends PacketWrapper<IlIlJr> {
    private Component IlIlp;
    private static transient /* synthetic */ String OZyskCcRWd = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJr(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJr(Component component) {
        super(IlIlWz.DISCONNECT);
        this.IlIlp = component;
    }

    @Override
    public void IlIle() {
        this.IlIlp = this.IlIlJ();
    }

    @Override
    public void IlIlJ() {
        this.IlIlz(this.IlIlp);
    }

    public void IlIlC(IlIlJr ilIlJr) {
        this.IlIlp = ilIlJr.IlIlp;
    }

    public Component IlIlQ() {
        return this.IlIlp;
    }

    public void IlIlo(Component component) {
        this.IlIlp = component;
    }
}

