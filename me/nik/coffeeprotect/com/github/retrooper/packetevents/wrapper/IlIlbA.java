/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.IlIld_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbA
extends PacketWrapper<IlIlbA> {
    private IlIlAn IlIlf;
    private int IlIlr;
    private int IlIl_;
    private int IlIlC;
    private static final long b = IlIls.a(5233087665860935704L, -5871482829409981539L, MethodHandles.lookup().lookupClass()).a(193315183713768L);
    private static transient /* synthetic */ String KNhOqwsfGi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbA(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbA(IlIlAn ilIlAn, int n, int n2, int n3) {
        super(IlIlAG.BLOCK_ACTION);
        this.IlIlf = ilIlAn;
        this.IlIlr = n;
        this.IlIl_ = n2;
        this.IlIlC = n3;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlbA ilIlbA;
                block3: {
                    long l = b ^ 0x7564565CDD68L;
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlbA = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlbA.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block3;
                    int n = this.IlIlW();
                    short s = this.IlIlG();
                    int n2 = this.IlIlW();
                    this.IlIlf = new IlIlAn(n, s, n2);
                    if (packetWrapperArray != null) break block4;
                }
                ilIlbA = this;
            }
            ilIlbA.IlIlf = this.IlIlE();
        }
        this.IlIlr = this.IlIlP();
        this.IlIl_ = this.IlIlP();
        this.IlIlC = this.IlIlf();
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlbA ilIlbA;
            block2: {
                block3: {
                    long l = b ^ 0x6C192BB5E3C0L;
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlbA = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlbA.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block3;
                    this.IlIla(this.IlIlf.IlIlj);
                    this.IlIlG(this.IlIlf.IlIlw);
                    this.IlIla(this.IlIlf.IlIlk);
                    if (packetWrapperArray != null) break block4;
                }
                ilIlbA = this;
            }
            ilIlbA.IlIlh(this.IlIlf);
        }
        this.IlIlu(this.IlIlr);
        this.IlIlu(this.IlIl_);
        this.IlIlJ(this.IlIlC);
    }

    public void IlIld(IlIlbA ilIlbA) {
        this.IlIlf = ilIlbA.IlIlf;
        this.IlIlr = ilIlbA.IlIlr;
        this.IlIl_ = ilIlbA.IlIl_;
        this.IlIlC = ilIlbA.IlIlC;
    }

    public IlIlAn IlIlG() {
        return this.IlIlf;
    }

    public void IlIlR(IlIlAn ilIlAn) {
        this.IlIlf = ilIlAn;
    }

    public int IlIlC() {
        return this.IlIlr;
    }

    public void IlIlf(int n) {
        this.IlIlr = n;
    }

    public int IlIlq() {
        return this.IlIl_;
    }

    public void IlIlh(int n) {
        this.IlIl_ = n;
    }

    public int IlIlM() {
        return this.IlIlC;
    }

    public void IlIlZ(int n) {
        this.IlIlC = n;
    }

    public IlIld_ IlIly() {
        return IlIld_.IlIlW(this.IlIlg.IlIlE(), this.IlIlC);
    }

    public void IlIlY(IlIld_ ilIld_) {
        this.IlIlC = ilIld_.IlIls();
    }
}

