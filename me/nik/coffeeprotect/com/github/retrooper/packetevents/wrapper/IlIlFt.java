/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Map;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFt
extends PacketWrapper<IlIlFt> {
    private Map<String, Integer> IlIlp;
    private static transient /* synthetic */ String bVdQzQZwWh = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFt(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFt(Map<String, Integer> map) {
        super(IlIlAG.STATISTICS);
        this.IlIlp = map;
    }

    @Override
    public void IlIle() {
        this.IlIlp = this.IlIlc(PacketWrapper::IlIli, PacketWrapper::IlIlf);
    }

    @Override
    public void IlIlJ() {
        this.IlIla(this.IlIlp, PacketWrapper::IlIlM, PacketWrapper::IlIlJ);
    }

    public void IlIlf(IlIlFt ilIlFt) {
        this.IlIlp = ilIlFt.IlIlp;
    }

    public Map<String, Integer> IlIlJ() {
        return this.IlIlp;
    }

    public void IlIld(Map<String, Integer> map) {
        this.IlIlp = map;
    }
}

