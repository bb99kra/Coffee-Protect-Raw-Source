/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlZK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbM
extends PacketWrapper<IlIlbM> {
    private IlIlAn IlIll;
    private IlIlZK IlIlJ;
    private String IlIlZ;
    private static transient /* synthetic */ String imiyZySbWK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbM(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbM(IlIlAn ilIlAn, IlIlZK ilIlZK, String string) {
        super(IlIlnN.SET_TEST_BLOCK);
        this.IlIll = ilIlAn;
        this.IlIlJ = ilIlZK;
        this.IlIlZ = string;
    }

    @Override
    public void IlIle() {
        this.IlIll = this.IlIlE();
        this.IlIlJ = this.IlIly(IlIlZK.class);
        this.IlIlZ = this.IlIli();
    }

    @Override
    public void IlIlJ() {
        this.IlIlh(this.IlIll);
        this.IlIlw(this.IlIlJ);
        this.IlIlM(this.IlIlZ);
    }

    public void IlIlk(IlIlbM ilIlbM) {
        this.IlIll = ilIlbM.IlIll;
        this.IlIlJ = ilIlbM.IlIlJ;
        this.IlIlZ = ilIlbM.IlIlZ;
    }

    public IlIlAn IlIlK() {
        return this.IlIll;
    }

    public void IlIly(IlIlAn ilIlAn) {
        this.IlIll = ilIlAn;
    }

    public IlIlZK IlIlo() {
        return this.IlIlJ;
    }

    public void IlIlp(IlIlZK ilIlZK) {
        this.IlIlJ = ilIlZK;
    }

    public String IlIls() {
        return this.IlIlZ;
    }

    public void IlIli(String string) {
        this.IlIlZ = string;
    }
}

