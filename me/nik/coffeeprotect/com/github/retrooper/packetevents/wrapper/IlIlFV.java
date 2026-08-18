/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlGZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFV
extends PacketWrapper<IlIlFV> {
    private List<IlIlGZ> IlIlH;
    private boolean IlIlt;
    private static transient /* synthetic */ String hjNOCfcRgX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFV(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFV(List<IlIlGZ> list, boolean bl) {
        super(IlIlAG.RECIPE_BOOK_ADD);
        this.IlIlH = list;
        this.IlIlt = bl;
    }

    @Override
    public void IlIle() {
        this.IlIlH = this.IlIll(IlIlGZ::IlIlt);
        this.IlIlt = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIlQ(this.IlIlH, IlIlGZ::IlIlz);
        this.IlIla(this.IlIlt);
    }

    public void IlIlt(IlIlFV ilIlFV) {
        this.IlIlH = ilIlFV.IlIlH;
        this.IlIlt = ilIlFV.IlIlt;
    }

    public List<IlIlGZ> IlIlM() {
        return this.IlIlH;
    }

    public void IlIlE(List<IlIlGZ> list) {
        this.IlIlH = list;
    }

    public boolean IlIlH() {
        return this.IlIlt;
    }

    public void IlIlW(boolean bl) {
        this.IlIlt = bl;
    }
}

