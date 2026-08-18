/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJA
extends PacketWrapper<IlIlJA> {
    private int IlIlu;
    private int IlIlZ;
    private static final long b = IlIls.a(-8719790058172779212L, 4590644045328368376L, MethodHandles.lookup().lookupClass()).a(96742724020887L);
    private static transient /* synthetic */ String LKASlnfzqN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJA(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJA(int n, int n2) {
        super(IlIlnN.CLICK_WINDOW_BUTTON);
        this.IlIlu = n;
        this.IlIlZ = n2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        var1_1 = IlIlJA.b ^ 114968915296193L;
        var3_2 = IlIlJH.IlIlw();
        v0 = this;
        if (var3_2 != null) ** GOTO lbl9
        if (v0.IlIlg.IlIlz(ServerVersion.V_1_21_2)) {
            v1 = this.IlIle();
        } else {
            v0 = this;
lbl9:
            // 2 sources

            v1 = v0.IlIlf();
        }
        this.IlIlu = v1;
        this.IlIlZ = this.IlIlE();
    }

    @Override
    public void IlIlJ() {
        this.IlIlr(this.IlIlu);
        this.IlIlu(this.IlIlZ);
    }

    public void IlIlu(IlIlJA ilIlJA) {
        this.IlIlu = ilIlJA.IlIlu;
        this.IlIlZ = ilIlJA.IlIlZ;
    }

    public int IlIlg() {
        return this.IlIlu;
    }

    public void IlIlk(int n) {
        this.IlIlu = n;
    }

    public int IlIls() {
        return this.IlIlZ;
    }

    public void IlIls(int n) {
        this.IlIlZ = n;
    }
}

