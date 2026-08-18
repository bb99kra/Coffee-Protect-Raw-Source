/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlCH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbU
extends PacketWrapper<IlIlbU> {
    private IlIlCH IlIla;
    private float IlIls;
    private static transient /* synthetic */ String HdtHOSXjLG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbU(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbU(int n, float f) {
        super(IlIlAG.CHANGE_GAME_STATE);
        this.IlIla = IlIlCH.IlIlJ()[n];
        this.IlIls = f;
    }

    public IlIlbU(IlIlCH ilIlCH, float f) {
        super(IlIlAG.CHANGE_GAME_STATE);
        this.IlIla = ilIlCH;
        this.IlIls = f;
    }

    @Override
    public void IlIle() {
        this.IlIla = IlIlCH.IlIlL(this.IlIlP());
        this.IlIls = this.IlIlX();
    }

    @Override
    public void IlIlJ() {
        this.IlIlu(this.IlIla.ordinal());
        this.IlIlR(this.IlIls);
    }

    public void IlIlf(IlIlbU ilIlbU) {
        this.IlIla = ilIlbU.IlIla;
        this.IlIls = ilIlbU.IlIls;
    }

    public IlIlCH IlIlc() {
        return this.IlIla;
    }

    public void IlIlF(IlIlCH ilIlCH) {
        this.IlIla = ilIlCH;
    }

    public float IlIlN() {
        return this.IlIls;
    }

    public void IlIlC(float f) {
        this.IlIls = f;
    }
}

