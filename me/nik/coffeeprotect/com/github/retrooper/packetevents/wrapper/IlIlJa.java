/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlr9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJa
extends PacketWrapper<IlIlJa> {
    private List<IlIlr9> IlIln;
    private static transient /* synthetic */ String lZIFlsAuhS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJa(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJa(List<IlIlr9> list) {
        super(IlIlqy.SELECT_KNOWN_PACKS);
        this.IlIln = list;
    }

    @Override
    public void IlIle() {
        this.IlIln = this.IlIll(PacketWrapper::IlIlM);
    }

    @Override
    public void IlIlJ() {
        this.IlIlQ(this.IlIln, PacketWrapper::IlIly);
    }

    public void IlIlc(IlIlJa ilIlJa) {
        this.IlIln = ilIlJa.IlIln;
    }

    public List<IlIlr9> IlIlr() {
        return this.IlIln;
    }

    public void IlIll(List<IlIlr9> list) {
        this.IlIln = list;
    }
}

