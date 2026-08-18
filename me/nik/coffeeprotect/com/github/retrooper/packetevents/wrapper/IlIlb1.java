/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlfx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlb1
extends PacketWrapper<IlIlb1> {
    private IlIlfx IlIlv;
    private int IlIlN;
    private float IlIlB;
    private float IlIlb;
    private static final long b = IlIls.a(-4901644525861478614L, 2716664732543471233L, MethodHandles.lookup().lookupClass()).a(105643356671812L);
    private static transient /* synthetic */ String XOInQhFImC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb1(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlb1(IlIlfx ilIlfx) {
        this(ilIlfx, 0);
    }

    public IlIlb1(IlIlfx ilIlfx, int n) {
        this(ilIlfx, n, 0.0f, 0.0f);
    }

    public IlIlb1(IlIlfx ilIlfx, int n, float f, float f2) {
        super(IlIlnN.USE_ITEM);
        this.IlIlv = ilIlfx;
        this.IlIlN = n;
        this.IlIlB = f;
        this.IlIlb = f2;
    }

    @Override
    public void IlIle() {
        block3: {
            block4: {
                IlIlb1 ilIlb1;
                boolean bl;
                block2: {
                    long l = b ^ 0x37CC5D5320D0L;
                    this.IlIlv = IlIlfx.IlIlH(this.IlIlf());
                    String string = IlIlJH.IlIlw();
                    bl = this.IlIlg.IlIlz(ServerVersion.V_1_19);
                    if (string != null) break block2;
                    if (!bl) break block3;
                    this.IlIlN = this.IlIlf();
                    ilIlb1 = this;
                    if (string != null) break block4;
                    bl = ilIlb1.IlIlg.IlIlz(ServerVersion.V_1_21);
                }
                if (!bl) break block3;
                this.IlIlB = this.IlIlX();
                ilIlb1 = this;
            }
            ilIlb1.IlIlb = this.IlIlX();
        }
    }

    @Override
    public void IlIlJ() {
        block3: {
            IlIlb1 ilIlb1;
            block4: {
                boolean bl;
                block2: {
                    long l = b ^ 0x2EB120BA1E78L;
                    String string = IlIlJH.IlIlw();
                    this.IlIlJ(this.IlIlv.IlIlr());
                    String string2 = string;
                    bl = this.IlIlg.IlIlz(ServerVersion.V_1_19);
                    if (string2 != null) break block2;
                    if (!bl) break block3;
                    this.IlIlJ(this.IlIlN);
                    ilIlb1 = this;
                    if (string2 != null) break block4;
                    bl = ilIlb1.IlIlg.IlIlz(ServerVersion.V_1_21);
                }
                if (!bl) break block3;
                this.IlIlR(this.IlIlB);
                ilIlb1 = this;
            }
            ilIlb1.IlIlR(this.IlIlb);
        }
    }

    public void IlIlM(IlIlb1 ilIlb1) {
        this.IlIlv = ilIlb1.IlIlv;
        this.IlIlN = ilIlb1.IlIlN;
        this.IlIlB = ilIlb1.IlIlB;
        this.IlIlb = ilIlb1.IlIlb;
    }

    public IlIlfx IlIlH() {
        return this.IlIlv;
    }

    public void IlIlP(IlIlfx ilIlfx) {
        this.IlIlv = ilIlfx;
    }

    public int IlIlp() {
        return this.IlIlN;
    }

    public void IlIlY(int n) {
        this.IlIlN = n;
    }

    public float IlIlA() {
        return this.IlIlB;
    }

    public void IlIls(float f) {
        this.IlIlB = f;
    }

    public float IlIlU() {
        return this.IlIlb;
    }

    public void IlIll(float f) {
        this.IlIlb = f;
    }
}

