/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.HashSet;
import java.util.Set;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJ4
extends PacketWrapper<IlIlJ4> {
    private Set<ResourceLocation> IlIla;
    private static transient /* synthetic */ String BmjTuYoBts = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ4(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJ4(Set<ResourceLocation> set) {
        super(IlIlWz.UPDATE_ENABLED_FEATURES);
        this.IlIla = set;
    }

    @Override
    public void IlIle() {
        this.IlIla = this.IlIlq(HashSet::new, PacketWrapper::readIdentifier);
    }

    @Override
    public void IlIlJ() {
        this.IlIll(this.IlIla, PacketWrapper::writeIdentifier);
    }

    public void IlIlJ(IlIlJ4 ilIlJ4) {
        this.IlIla = ilIlJ4.IlIla;
    }

    public Set<ResourceLocation> IlIlC() {
        return this.IlIla;
    }

    public void IlIln(Set<ResourceLocation> set) {
        this.IlIla = set;
    }
}

