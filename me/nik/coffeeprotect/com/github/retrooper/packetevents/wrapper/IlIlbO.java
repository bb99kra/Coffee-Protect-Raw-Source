/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class IlIlbO
extends PacketWrapper<IlIlbO> {
    private Component IlIlL;
    private static transient /* synthetic */ String RlWiIzfAiR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbO(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbO(Component component) {
        super(IlIlAG.ACTION_BAR);
        this.IlIlL = component;
    }

    @Override
    public void IlIle() {
        this.IlIlL = this.IlIlJ();
    }

    @Override
    public void IlIlJ() {
        this.IlIlz(this.IlIlL);
    }

    public void IlIlo(IlIlbO ilIlbO) {
        this.IlIlL = ilIlbO.IlIlL;
    }

    public Component IlIlH() {
        return this.IlIlL;
    }

    public void IlIlq(Component component) {
        this.IlIlL = component;
    }
}

