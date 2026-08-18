/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlnC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlfe;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlb_
extends PacketWrapper<IlIlb_> {
    private IlIlAn IlIlo;
    private IlIlfe IlIlm;
    private IlIlnC IlIlu;
    private static transient /* synthetic */ String OYuHsvWUAA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb_(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlb_(IlIlAn ilIlAn, IlIlfe ilIlfe, IlIlnC ilIlnC) {
        super(IlIlnN.TEST_INSTANCE_BLOCK_ACTION);
        this.IlIlo = ilIlAn;
        this.IlIlm = ilIlfe;
        this.IlIlu = ilIlnC;
    }

    @Override
    public void IlIle() {
        this.IlIlo = this.IlIlE();
        this.IlIlm = this.IlIly(IlIlfe.class);
        this.IlIlu = IlIlnC.IlIlB(this);
    }

    @Override
    public void IlIlJ() {
        this.IlIlh(this.IlIlo);
        this.IlIlw(this.IlIlm);
        IlIlnC.IlIlU(this, this.IlIlu);
    }

    public void IlIlX(IlIlb_ ilIlb_) {
        this.IlIlo = ilIlb_.IlIlo;
        this.IlIlm = ilIlb_.IlIlm;
        this.IlIlu = ilIlb_.IlIlu;
    }

    @Override
    public IlIlAn IlIlb() {
        return this.IlIlo;
    }

    public void IlIlv(IlIlAn ilIlAn) {
        this.IlIlo = ilIlAn;
    }

    public IlIlfe IlIlG() {
        return this.IlIlm;
    }

    public void IlIlO(IlIlfe ilIlfe) {
        this.IlIlm = ilIlfe;
    }

    public IlIlnC IlIld() {
        return this.IlIlu;
    }

    public void IlIlk(IlIlnC ilIlnC) {
        this.IlIlu = ilIlnC;
    }
}

