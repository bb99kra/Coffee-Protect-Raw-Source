/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbw
extends PacketWrapper<IlIlbw> {
    private UUID IlIlA;
    private static transient /* synthetic */ String FgNntTblxp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbw(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbw(UUID uUID) {
        super(IlIlnN.SPECTATE);
        this.IlIlA = uUID;
    }

    @Override
    public void IlIle() {
        this.IlIlA = this.IlIlv();
    }

    @Override
    public void IlIlJ() {
        this.IlIlc(this.IlIlA);
    }

    public void IlIlu(IlIlbw ilIlbw) {
        this.IlIlA = ilIlbw.IlIlA;
    }

    public UUID IlIlq() {
        return this.IlIlA;
    }

    public void IlIlD(UUID uUID) {
        this.IlIlA = uUID;
    }
}

