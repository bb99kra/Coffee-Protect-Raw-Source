/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlZM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJP
extends PacketWrapper<IlIlJP> {
    private IlIlZM IlIlX;
    private static transient /* synthetic */ String yxwhDztDTo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJP(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJP(IlIlZM ilIlZM) {
        super(IlIlnN.CHAT_SESSION_UPDATE);
        this.IlIlX = ilIlZM;
    }

    @Override
    public void IlIle() {
        this.IlIlX = this.IlIlc();
    }

    @Override
    public void IlIlJ() {
        this.IlIlq(this.IlIlX);
    }

    public void IlIlP(IlIlJP ilIlJP) {
        this.IlIlX = ilIlJP.IlIlX;
    }

    public IlIlZM IlIlW() {
        return this.IlIlX;
    }

    public void IlIlM(IlIlZM ilIlZM) {
        this.IlIlX = ilIlZM;
    }
}

