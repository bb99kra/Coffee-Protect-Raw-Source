/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbL
extends PacketWrapper<IlIlbL> {
    private int IlIlX;
    private int IlIlF;
    private static transient /* synthetic */ String oiaoyCgMai = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbL(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbL(int n, int n2) {
        super(IlIlnN.QUERY_ENTITY_NBT);
        this.IlIlX = n;
        this.IlIlF = n2;
    }

    @Override
    public void IlIle() {
        this.IlIlX = this.IlIlf();
        this.IlIlF = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlX);
        this.IlIlJ(this.IlIlF);
    }

    public void IlIlV(IlIlbL ilIlbL) {
        this.IlIlX = ilIlbL.IlIlX;
        this.IlIlF = ilIlbL.IlIlF;
    }

    public int IlIlR() {
        return this.IlIlX;
    }

    public void IlIlC(int n) {
        this.IlIlX = n;
    }

    public int IlIlB() {
        return this.IlIlF;
    }

    public void IlIlL(int n) {
        this.IlIlF = n;
    }
}

