/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIln7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJZ
extends PacketWrapper<IlIlJZ> {
    private int IlIlZ;
    private IlIlCg IlIlC;
    private static final long b = IlIls.a(2574188429297067160L, 3434756886944332348L, MethodHandles.lookup().lookupClass()).a(92037355260350L);
    private static transient /* synthetic */ String dRcUBhvGvK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJZ(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJZ(int n, IlIlCg ilIlCg) {
        super(IlIlnN.CREATIVE_INVENTORY_ACTION);
        this.IlIlZ = n;
        this.IlIlC = ilIlCg;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        var1_1 = IlIlJZ.b ^ 61558977571284L;
        var3_2 = IlIlJH.IlIlw();
        v0 = this;
        if (var3_2 != null) ** GOTO lbl9
        if (v0.IlIlg.IlIlz(ServerVersion.V_1_20_5)) {
            v1 = this.IlIlL();
        } else {
            v0 = this;
lbl9:
            // 2 sources

            v1 = v0.IlIlG();
        }
        this.IlIlZ = v1;
        v2 = this;
        if (var3_2 != null) ** GOTO lbl17
        if (v2.IlIlg.IlIlz(ServerVersion.V_1_21_5)) {
            v3 = IlIln7.IlIlV(this);
        } else {
            v2 = this;
lbl17:
            // 2 sources

            v3 = IlIln7.IlIl_(v2);
        }
        this.IlIlC = v3;
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlJZ ilIlJZ;
            block2: {
                block3: {
                    long l = b ^ 0x2E81AD14977CL;
                    String string = IlIlJH.IlIlw();
                    this.IlIlG(this.IlIlZ);
                    String string2 = string;
                    ilIlJZ = this;
                    if (string2 != null) break block2;
                    if (!ilIlJZ.IlIlg.IlIlz(ServerVersion.V_1_21_5)) break block3;
                    IlIln7.IlIlP(this, this.IlIlC);
                    if (string2 == null) break block4;
                }
                ilIlJZ = this;
            }
            IlIln7.IlIli(ilIlJZ, this.IlIlC);
        }
    }

    public void IlIlQ(IlIlJZ ilIlJZ) {
        this.IlIlZ = ilIlJZ.IlIlZ;
        this.IlIlC = ilIlJZ.IlIlC;
    }

    public int IlIlq() {
        return this.IlIlZ;
    }

    public void IlIlv(int n) {
        this.IlIlZ = n;
    }

    public IlIlCg IlIlM() {
        return this.IlIlC;
    }

    public void IlIld(IlIlCg ilIlCg) {
        this.IlIlC = ilIlCg;
    }
}

