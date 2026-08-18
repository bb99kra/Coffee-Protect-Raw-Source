/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Set;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlC2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlZt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class IlIlJR
extends PacketWrapper<IlIlJR> {
    private Set<IlIlC2<?>> IlIlE;
    private static transient /* synthetic */ String IkXxxngfDl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJR(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJR(Set<IlIlC2<?>> set) {
        super(IlIlnN.DEBUG_SUBSCRIPTION_REQUEST);
        this.IlIlE = set;
    }

    @Override
    public void IlIle() {
        this.IlIlE = this.IlIlI(packetWrapper -> packetWrapper.IlIlt(IlIlZt.IlIlp()));
    }

    @Override
    public void IlIlJ() {
        this.IlIlZ(this.IlIlE, PacketWrapper::IlIle);
    }

    public void IlIlJ(IlIlJR ilIlJR) {
        this.IlIlE = ilIlJR.IlIlE;
    }

    public Set<IlIlC2<?>> IlIlV() {
        return this.IlIlE;
    }

    public void IlIlX(Set<IlIlC2<?>> set) {
        this.IlIlE = set;
    }
}

