/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJO
extends PacketWrapper<IlIlJO> {
    private float IlIlC;
    private static transient /* synthetic */ String zsJYckvtZn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJO(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJO(float f) {
        super(IlIlnN.CHUNK_BATCH_ACK);
        this.IlIlC = f;
    }

    @Override
    public void IlIle() {
        this.IlIlC = this.IlIlX();
    }

    @Override
    public void IlIlJ() {
        this.IlIlR(this.IlIlC);
    }

    public void IlIlC(IlIlJO ilIlJO) {
        this.IlIlC = ilIlJO.IlIlC;
    }

    public float IlIlg() {
        return this.IlIlC;
    }

    public void IlIlW(float f) {
        this.IlIlC = f;
    }
}

