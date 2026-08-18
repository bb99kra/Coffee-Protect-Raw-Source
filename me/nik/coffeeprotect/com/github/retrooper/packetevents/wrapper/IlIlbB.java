/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.MonotonicNonNull
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlWM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class IlIlbB
extends PacketWrapper<IlIlbB> {
    private @MonotonicNonNull List<IlIlWM> IlIlo;
    private static transient /* synthetic */ String AtYNLpmLdn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbB(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbB(List<IlIlWM> list) {
        super(IlIlnN.SET_GAME_RULE);
        this.IlIlo = list;
    }

    @Override
    public void IlIle() {
        this.IlIlo = this.IlIll(IlIlWM::IlIlM);
    }

    @Override
    public void IlIlJ() {
        this.IlIlQ(this.IlIlo, IlIlWM::IlIln);
    }

    public void IlIlH(IlIlbB ilIlbB) {
        this.IlIlo = ilIlbB.IlIlo;
    }

    public List<IlIlWM> IlIlz() {
        return this.IlIlo;
    }

    public void IlIlf(List<IlIlWM> list) {
        this.IlIlo = list;
    }
}

