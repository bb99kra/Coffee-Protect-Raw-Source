/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIljY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJn
extends PacketWrapper<IlIlJn> {
    private IlIljY IlIlw;
    private static transient /* synthetic */ String MEATicYOrY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJn(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJn(IlIljY ilIljY) {
        super(IlIlnN.CHANGE_GAME_MODE);
        this.IlIlw = ilIljY;
    }

    @Override
    public void IlIle() {
        this.IlIlw = IlIljY.IlIlE(this.IlIlf());
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlw.IlIli());
    }

    public void IlIlW(IlIlJn ilIlJn) {
        this.IlIlw = ilIlJn.IlIlw;
    }

    public IlIljY IlIlH() {
        return this.IlIlw;
    }

    public void IlIlE(IlIljY ilIljY) {
        this.IlIlw = ilIljY;
    }
}

