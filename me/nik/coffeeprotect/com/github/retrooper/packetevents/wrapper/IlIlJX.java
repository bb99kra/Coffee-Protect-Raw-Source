/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlr9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJX
extends PacketWrapper<IlIlJX> {
    private List<IlIlr9> IlIlq;
    private static transient /* synthetic */ String flZdSTjtmp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJX(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJX(List<IlIlr9> list) {
        super(IlIlWz.SELECT_KNOWN_PACKS);
        this.IlIlq = list;
    }

    @Override
    public void IlIle() {
        this.IlIlq = this.IlIll(PacketWrapper::IlIlM);
    }

    @Override
    public void IlIlJ() {
        this.IlIlQ(this.IlIlq, PacketWrapper::IlIly);
    }

    public void IlIld(IlIlJX ilIlJX) {
        this.IlIlq = ilIlJX.IlIlq;
    }

    public List<IlIlr9> IlIlR() {
        return this.IlIlq;
    }

    public void IlIli(List<IlIlr9> list) {
        this.IlIlq = list;
    }
}

