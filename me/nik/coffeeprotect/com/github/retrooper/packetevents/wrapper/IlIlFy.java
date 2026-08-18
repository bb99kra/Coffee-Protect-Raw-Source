/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlFy
extends PacketWrapper<IlIlFy> {
    @Nullable
    private UUID IlIlA;
    private static transient /* synthetic */ String WfBIBsXkfg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFy(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFy(@Nullable UUID uUID) {
        super(IlIlAG.RESOURCE_PACK_REMOVE);
        this.IlIlA = uUID;
    }

    @Override
    public void IlIle() {
        this.IlIlA = (UUID)this.IlIlN(PacketWrapper::IlIlv);
    }

    @Override
    public void IlIlJ() {
        this.IlIlI(this.IlIlA, PacketWrapper::IlIlc);
    }

    public void IlIle(IlIlFy ilIlFy) {
        this.IlIlA = ilIlFy.IlIlA;
    }

    @Nullable
    public UUID IlIln() {
        return this.IlIlA;
    }

    public void IlIlo(@Nullable UUID uUID) {
        this.IlIlA = uUID;
    }
}

