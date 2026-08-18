/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.IlIlTm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJ0;

public class IlIlJj
extends IlIlJ0<IlIlJj> {
    private static transient /* synthetic */ String zCuWzoATWF = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJj(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJj(IlIlTm ilIlTm) {
        super(IlIlWz.SHOW_DIALOG, ilIlTm);
    }

    @Override
    public void IlIle() {
        this.IlIlC = IlIlTm.IlIlD(this);
    }

    @Override
    public void IlIlJ() {
        IlIlTm.IlIlw(this, this.IlIlC);
    }
}

