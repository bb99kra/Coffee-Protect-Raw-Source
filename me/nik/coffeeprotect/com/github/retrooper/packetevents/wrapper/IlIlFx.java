/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFx
extends PacketWrapper<IlIlFx> {
    private int IlIlA;
    private int IlIlx;
    private int IlIlT;
    private IlIlCg IlIlH;
    private static final long b = IlIls.a(8664564702676127284L, 1982466993768082477L, MethodHandles.lookup().lookupClass()).a(109836195210346L);
    private static transient /* synthetic */ String DUqaVEFNri = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFx(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFx(int n, int n2, int n3, IlIlCg ilIlCg) {
        super(IlIlAG.SET_SLOT);
        this.IlIlA = n;
        this.IlIlx = n2;
        this.IlIlT = n3;
        this.IlIlH = ilIlCg;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        var1_1 = IlIlFx.b ^ 68069411485956L;
        var3_2 = IlIlFh.IlIla();
        v0 = this;
        if (var3_2 == null) ** GOTO lbl9
        if (v0.IlIlg.IlIlz(ServerVersion.V_1_21_2)) {
            v1 = this.IlIle();
        } else {
            v0 = this;
lbl9:
            // 2 sources

            v1 = v0.IlIlE();
        }
        this.IlIlA = v1;
        v2 = this;
        if (var3_2 != null) {
            if (v2.IlIlg.IlIlz(ServerVersion.V_1_17_1)) {
                this.IlIlx = this.IlIlf();
            }
            this.IlIlT = this.IlIlG();
            v2 = this;
        }
        v2.IlIlH = this.IlIlk();
    }

    @Override
    public void IlIlJ() {
        long l = b ^ 0x2495D8FE47ACL;
        PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
        this.IlIlr(this.IlIlA);
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        IlIlFx ilIlFx = this;
        if (packetWrapperArray2 != null) {
            if (ilIlFx.IlIlg.IlIlz(ServerVersion.V_1_17_1)) {
                this.IlIlJ(this.IlIlx);
            }
            this.IlIlG(this.IlIlT);
            ilIlFx = this;
        }
        ilIlFx.IlIlj(this.IlIlH);
    }

    public void IlIlE(IlIlFx ilIlFx) {
        this.IlIlA = ilIlFx.IlIlA;
        this.IlIlx = ilIlFx.IlIlx;
        this.IlIlT = ilIlFx.IlIlT;
        this.IlIlH = ilIlFx.IlIlH;
    }

    public int IlIlE() {
        return this.IlIlA;
    }

    public void IlIlD(int n) {
        this.IlIlA = n;
    }

    public int IlIld() {
        return this.IlIlx;
    }

    @Override
    public void IlIlB(int n) {
        this.IlIlx = n;
    }

    public int IlIlQ() {
        return this.IlIlT;
    }

    public void IlIlO(int n) {
        this.IlIlT = n;
    }

    public IlIlCg IlIlw() {
        return this.IlIlH;
    }

    public void IlIlt(IlIlCg ilIlCg) {
        this.IlIlH = ilIlCg;
    }
}

