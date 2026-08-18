/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbG
extends PacketWrapper<IlIlbG> {
    private IlIlv_ IlIls;
    private float IlIly;
    private float IlIlr;
    private boolean IlIlo;
    private static final long b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(7340531647947353699L, 4346010646402317436L, MethodHandles.lookup().lookupClass()).a(125416301281632L);
    private static transient /* synthetic */ String HOAwnKvggp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbG(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbG(IlIlv_ ilIlv_, float f, float f2) {
        this(ilIlv_, f, f2, false);
    }

    public IlIlbG(IlIlv_ ilIlv_, float f, float f2, boolean bl) {
        super(IlIlnN.VEHICLE_MOVE);
        this.IlIls = ilIlv_;
        this.IlIly = f;
        this.IlIlr = f2;
        this.IlIlo = bl;
    }

    @Override
    public void IlIle() {
        block3: {
            block2: {
                long l = b ^ 0x63DDE377DB2DL;
                this.IlIls = IlIlv_.IlIlG(this);
                this.IlIly = this.IlIlX();
                this.IlIlr = this.IlIlX();
                String string = IlIlJH.IlIlw();
                IlIlbG ilIlbG = this;
                if (string != null) break block2;
                if (!ilIlbG.IlIlg.IlIlz(ServerVersion.V_1_21_4)) break block3;
                ilIlbG = this;
            }
            ilIlbG.IlIlo = this.IlIlK();
        }
    }

    @Override
    public void IlIlJ() {
        block3: {
            IlIlbG ilIlbG;
            block2: {
                long l = b ^ 0x7AA09E9EE585L;
                String string = IlIlJH.IlIlw();
                IlIlv_.IlIlC(this, this.IlIls);
                this.IlIlR(this.IlIly);
                this.IlIlR(this.IlIlr);
                String string2 = string;
                ilIlbG = this;
                if (string2 != null) break block2;
                if (!ilIlbG.IlIlg.IlIlz(ServerVersion.V_1_21_4)) break block3;
                ilIlbG = this;
            }
            ilIlbG.IlIla(this.IlIlo);
        }
    }

    public void IlIlC(IlIlbG ilIlbG) {
        this.IlIls = ilIlbG.IlIls;
        this.IlIly = ilIlbG.IlIly;
        this.IlIlr = ilIlbG.IlIlr;
        this.IlIlo = ilIlbG.IlIlo;
    }

    public IlIlv_ IlIlt() {
        return this.IlIls;
    }

    public void IlIlm(IlIlv_ ilIlv_) {
        this.IlIls = ilIlv_;
    }

    public float IlIlS() {
        return this.IlIly;
    }

    public void IlIlN(float f) {
        this.IlIly = f;
    }

    public float IlIlD() {
        return this.IlIlr;
    }

    public void IlIlt(float f) {
        this.IlIlr = f;
    }

    public boolean IlIln() {
        return this.IlIlo;
    }

    public void IlIld(boolean bl) {
        this.IlIlo = bl;
    }
}

