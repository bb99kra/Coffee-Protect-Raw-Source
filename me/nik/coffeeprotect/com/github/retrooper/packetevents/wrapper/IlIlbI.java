/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Map;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlC0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIliA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbI
extends PacketWrapper<IlIlbI> {
    private Map<IlIlC0, IlIliA> IlIlu;
    private static transient /* synthetic */ String vBpMQQjncW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbI(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbI(Map<IlIlC0, IlIliA> map) {
        super(IlIlAG.CHUNK_BIOMES);
        this.IlIlu = map;
    }

    @Override
    public void IlIle() {
        this.IlIlu = this.IlIlc(IlIlC0::IlIlv, IlIliA::IlIlp);
    }

    @Override
    public void IlIlJ() {
        this.IlIla(this.IlIlu, IlIlC0::IlIlj, IlIliA::IlIlX);
    }

    public void IlIlI(IlIlbI ilIlbI) {
        this.IlIlu = ilIlbI.IlIlu;
    }

    public Map<IlIlC0, IlIliA> IlIlg() {
        return this.IlIlu;
    }

    public IlIliA IlIlw(IlIlC0 ilIlC0) {
        return this.IlIlu.get(ilIlC0);
    }
}

