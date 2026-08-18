/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlJf
extends PacketWrapper<IlIlJf> {
    @Nullable
    private UUID IlIln;
    private static transient /* synthetic */ String kTppGJNLHZ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJf(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJf(@Nullable UUID uUID) {
        super(IlIlWz.RESOURCE_PACK_REMOVE);
        this.IlIln = uUID;
    }

    @Override
    public void IlIle() {
        this.IlIln = (UUID)this.IlIlN(PacketWrapper::IlIlv);
    }

    @Override
    public void IlIlJ() {
        this.IlIlI(this.IlIln, PacketWrapper::IlIlc);
    }

    public void IlIld(IlIlJf ilIlJf) {
        this.IlIln = ilIlJf.IlIln;
    }

    @Nullable
    public UUID IlIlO() {
        return this.IlIln;
    }

    @Override
    public void IlIlB(@Nullable UUID uUID) {
        this.IlIln = uUID;
    }
}

