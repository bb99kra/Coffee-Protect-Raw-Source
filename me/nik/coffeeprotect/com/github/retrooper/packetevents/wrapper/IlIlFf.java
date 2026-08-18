/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlFf
extends PacketWrapper<IlIlFf> {
    private int IlIlM;
    private static transient /* synthetic */ String fCbSfATJVs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFf(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFf(int n) {
        super(IlIlAG.SET_COMPRESSION);
        this.IlIlM = n;
    }

    @Override
    public void IlIle() {
        this.IlIlM = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlM);
    }

    public void IlIlp(IlIlFf ilIlFf) {
        this.IlIlM = ilIlFf.IlIlM;
    }

    public int IlIlJ() {
        return this.IlIlM;
    }

    public void IlIlM(int n) {
        this.IlIlM = n;
    }
}

