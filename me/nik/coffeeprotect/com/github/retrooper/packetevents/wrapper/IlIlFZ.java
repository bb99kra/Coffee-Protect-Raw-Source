/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFZ
extends PacketWrapper<IlIlFZ> {
    private int IlIlz;
    private NBTCompound IlIlr;
    private static transient /* synthetic */ String xFupiSBCSJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFZ(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFZ(int n, NBTCompound nBTCompound) {
        super(IlIlAG.UPDATE_ENTITY_NBT);
        this.IlIlz = n;
        this.IlIlr = nBTCompound;
    }

    @Override
    public void IlIle() {
        this.IlIlz = this.IlIlf();
        this.IlIlr = this.IlIlS();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlz);
        this.IlIlc(this.IlIlr);
    }

    public void IlIln(IlIlFZ ilIlFZ) {
        this.IlIlz = ilIlFZ.IlIlz;
        this.IlIlr = ilIlFZ.IlIlr;
    }

    public int IlIlH() {
        return this.IlIlz;
    }

    public void IlIlX(int n) {
        this.IlIlz = n;
    }

    public NBTCompound IlIly() {
        return this.IlIlr;
    }

    public void IlIls(NBTCompound nBTCompound) {
        this.IlIlr = nBTCompound;
    }
}

