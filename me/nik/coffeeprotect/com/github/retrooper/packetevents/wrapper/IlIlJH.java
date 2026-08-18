/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlXk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJH
extends PacketWrapper<IlIlJH> {
    private int IlIlp;
    private IlIlXk IlIlA;
    private int IlIlO;
    private static String IlIlE;
    private static final long b;
    private static transient /* synthetic */ String qnwvyNyJqP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJH(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJH(int n, IlIlXk ilIlXk, int n2) {
        super(IlIlnN.ENTITY_ACTION);
        this.IlIlp = n;
        this.IlIlA = ilIlXk;
        this.IlIlO = n2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        var1_1 = IlIlJH.b ^ 58182322080675L;
        var4_2 = this.IlIlg.IlIlz(ServerVersion.V_1_8);
        var3_3 = IlIlJH.IlIlw();
        v0 = var4_2;
        if (var3_3 == null) {
            v0 = v0 != 0 ? this.IlIlf() : this.IlIlW();
        }
        this.IlIlp = v0;
        v1 = var4_2;
        if (var3_3 == null) {
            v1 = v1 != 0 ? this.IlIlf() : (int)this.IlIlE();
        }
        var5_4 = v1;
        v2 = this;
        v3 = this;
        if (var3_3 != null) ** GOTO lbl21
        v2.IlIlA = IlIlXk.IlIlT(v3.IlIlg, var5_4);
        v2 = this;
        if (var4_2 != 0) {
            v4 = this.IlIlf();
        } else {
            v3 = this;
lbl21:
            // 2 sources

            v4 = v3.IlIlW();
        }
        v2.IlIlO = v4;
    }

    @Override
    public void IlIlJ() {
        block4: {
            int n;
            int n2;
            block2: {
                block3: {
                    long l = b ^ 0x2D97DD4AF50BL;
                    int n3 = this.IlIlg.IlIlz(ServerVersion.V_1_8);
                    String string = IlIlJH.IlIlw();
                    n2 = n3;
                    if (string != null) break block2;
                    if (n2 == 0) break block3;
                    this.IlIlJ(this.IlIlp);
                    n = this.IlIlA.IlIlZ(this.IlIlg);
                    this.IlIlJ(n);
                    this.IlIlJ(this.IlIlO);
                    if (string == null) break block4;
                }
                this.IlIla(this.IlIlp);
                n2 = this.IlIlA.IlIlZ(this.IlIlg);
            }
            n = n2;
            this.IlIlu(n);
            this.IlIla(this.IlIlO);
        }
    }

    public void IlIlm(IlIlJH ilIlJH) {
        this.IlIlp = ilIlJH.IlIlp;
        this.IlIlA = ilIlJH.IlIlA;
        this.IlIlO = ilIlJH.IlIlO;
    }

    public int IlIld() {
        return this.IlIlp;
    }

    public void IlIlL(int n) {
        this.IlIlp = n;
    }

    public IlIlXk IlIll() {
        return this.IlIlA;
    }

    public void IlIlL(IlIlXk ilIlXk) {
        this.IlIlA = ilIlXk;
    }

    public int IlIlU() {
        return this.IlIlO;
    }

    public void IlIlC(int n) {
        this.IlIlO = n;
    }

    public static void IlIlq(String string) {
        IlIlE = string;
    }

    public static String IlIlw() {
        return IlIlE;
    }

    static {
        b = IlIls.a(3804528840327419277L, -4688949629939202323L, MethodHandles.lookup().lookupClass()).a(1210681928763L);
        if (IlIlJH.IlIlw() != null) {
            IlIlJH.IlIlq("sMt2R");
        }
    }
}

