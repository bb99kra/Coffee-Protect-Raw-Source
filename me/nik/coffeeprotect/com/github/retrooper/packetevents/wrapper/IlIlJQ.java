/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIln0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class IlIlJQ
extends PacketWrapper<IlIlJQ> {
    private Component IlIlr;
    private static transient /* synthetic */ String ZQOOlksrTW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJQ(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJQ(Component component) {
        super(IlIln0.DISCONNECT);
        this.IlIlr = component;
    }

    @Override
    public void IlIle() {
        this.IlIlr = this.IlIlI();
    }

    @Override
    public void IlIlJ() {
        this.IlIlv(this.IlIlr);
    }

    public void IlIlO(IlIlJQ ilIlJQ) {
        this.IlIlr = ilIlJQ.IlIlr;
    }

    public Component IlIlF() {
        return this.IlIlr;
    }

    public void IlIln(Component component) {
        this.IlIlr = component;
    }
}

