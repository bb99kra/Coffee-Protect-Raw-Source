/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.IlIlTm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJ0<T extends IlIlJ0<T>>
extends PacketWrapper<T> {
    protected IlIlTm IlIlC;
    private static transient /* synthetic */ String oISZLsMQwo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ0(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJ0(IlIloL ilIloL, IlIlTm ilIlTm) {
        super(ilIloL);
        this.IlIlC = ilIlTm;
    }

    @Override
    public void IlIle() {
        this.IlIlC = IlIlTm.IlIlx(this);
    }

    @Override
    public void IlIlJ() {
        IlIlTm.IlIlu(this, this.IlIlC);
    }

    public void IlIlb(T t) {
        this.IlIlC = ((IlIlJ0)t).IlIlA();
    }

    public IlIlTm IlIlA() {
        return this.IlIlC;
    }

    public void IlIlS(IlIlTm ilIlTm) {
        this.IlIlC = ilIlTm;
    }
}

