/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlCl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.IlIlZI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlFc
extends PacketWrapper<IlIlFc> {
    private int IlIlJ;
    private IlIlZI IlIlC;
    private IlIlCl IlIlH;
    @ApiStatus.Obsolete
    private boolean IlIlI = false;
    private static final long b = IlIls.a(-5938412753242375405L, -6979910967326722416L, MethodHandles.lookup().lookupClass()).a(24811817288781L);
    private static transient /* synthetic */ String nkSjKbLSjA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFc(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFc(double d, double d2, double d3, float f, float f2, byte by, int n, boolean bl) {
        this(new IlIlv_(d, d2, d3), f, f2, by, n, bl);
    }

    public IlIlFc(IlIlv_ ilIlv_, float f, float f2, byte by, int n, boolean bl) {
        this(ilIlv_, f, f2, by, n);
        this.IlIlI = bl;
    }

    public IlIlFc(IlIlv_ ilIlv_, float f, float f2, byte by, int n) {
        this(n, ilIlv_, IlIlv_.IlIld(), f, f2, by);
    }

    public IlIlFc(int n, IlIlv_ ilIlv_, IlIlv_ ilIlv_2, float f, float f2, byte by) {
        this(n, ilIlv_, ilIlv_2, f, f2, null);
        this.IlIlH = new IlIlCl(by);
    }

    public IlIlFc(int n, IlIlv_ ilIlv_, IlIlv_ ilIlv_2, float f, float f2, IlIlCl ilIlCl) {
        this(n, new IlIlZI(ilIlv_, ilIlv_2, f, f2), ilIlCl);
    }

    public IlIlFc(int n, IlIlZI ilIlZI, IlIlCl ilIlCl) {
        super(IlIlAG.PLAYER_POSITION_AND_LOOK);
        this.IlIlJ = n;
        this.IlIlC = ilIlZI;
        this.IlIlH = ilIlCl;
    }

    @Override
    public void IlIle() {
        block4: {
            block7: {
                IlIlFc ilIlFc;
                boolean bl;
                block6: {
                    PacketWrapper[] packetWrapperArray;
                    block5: {
                        IlIlFc ilIlFc2;
                        block2: {
                            block3: {
                                long l = b ^ 0x3EEE10CD230FL;
                                packetWrapperArray = IlIlFh.IlIla();
                                ilIlFc2 = this;
                                if (packetWrapperArray == null) break block2;
                                if (!ilIlFc2.IlIlg.IlIlz(ServerVersion.V_1_21_2)) break block3;
                                this.IlIlJ = this.IlIlf();
                                this.IlIlC = IlIlZI.IlIlK(this);
                                this.IlIlH = new IlIlCl(this.IlIlW());
                                if (packetWrapperArray != null) break block4;
                            }
                            ilIlFc2 = this;
                        }
                        IlIlv_ ilIlv_ = IlIlv_.IlIlG(ilIlFc2);
                        float f = this.IlIlX();
                        float f2 = this.IlIlX();
                        this.IlIlC = new IlIlZI(ilIlv_, IlIlv_.IlIld(), f, f2);
                        this.IlIlH = new IlIlCl(this.IlIlP());
                        bl = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                        if (packetWrapperArray == null) break block5;
                        if (!bl) break block4;
                        this.IlIlJ = this.IlIlf();
                        bl = this.IlIlg.IlIlz(ServerVersion.V_1_17);
                    }
                    if (packetWrapperArray == null) break block6;
                    if (!bl) break block4;
                    ilIlFc = this;
                    if (packetWrapperArray == null) break block7;
                    bl = ilIlFc.IlIlg.IlIlS(ServerVersion.V_1_19_3);
                }
                if (!bl) break block4;
                ilIlFc = this;
            }
            ilIlFc.IlIlI = this.IlIlK();
        }
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlFc ilIlFc;
            block7: {
                boolean bl;
                block6: {
                    PacketWrapper[] packetWrapperArray;
                    block5: {
                        block2: {
                            block3: {
                                long l = b ^ 0x27936D241DA7L;
                                packetWrapperArray = IlIlFh.IlIla();
                                bl = this.IlIlg.IlIlz(ServerVersion.V_1_21_2);
                                if (packetWrapperArray == null) break block2;
                                if (!bl) break block3;
                                this.IlIlJ(this.IlIlJ);
                                IlIlZI.IlIlT(this, this.IlIlC);
                                this.IlIla(this.IlIlH.IlIls());
                                if (packetWrapperArray != null) break block4;
                            }
                            IlIlv_.IlIlC(this, this.IlIlC.IlIlu());
                            this.IlIlR(this.IlIlC.IlIld());
                            this.IlIlR(this.IlIlC.IlIlU());
                            this.IlIlu(this.IlIlH.IlIls());
                            bl = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                        }
                        if (packetWrapperArray == null) break block5;
                        if (!bl) break block4;
                        this.IlIlJ(this.IlIlJ);
                        bl = this.IlIlg.IlIlz(ServerVersion.V_1_17);
                    }
                    if (packetWrapperArray == null) break block6;
                    if (!bl) break block4;
                    ilIlFc = this;
                    if (packetWrapperArray == null) break block7;
                    bl = ilIlFc.IlIlg.IlIlS(ServerVersion.V_1_19_3);
                }
                if (!bl) break block4;
                ilIlFc = this;
            }
            ilIlFc.IlIla(this.IlIlI);
        }
    }

    @Override
    public void IlIlB(IlIlFc ilIlFc) {
        this.IlIlJ = ilIlFc.IlIlJ;
        this.IlIlC = ilIlFc.IlIlC;
        this.IlIlH = ilIlFc.IlIlH;
        this.IlIlI = ilIlFc.IlIlI;
    }

    public int IlIlX() {
        return this.IlIlJ;
    }

    public void IlIlt(int n) {
        this.IlIlJ = n;
    }

    public IlIlZI IlIlr() {
        return this.IlIlC;
    }

    public void IlIll(IlIlZI ilIlZI) {
        this.IlIlC = ilIlZI;
    }

    public IlIlv_ IlIlE() {
        return this.IlIlC.IlIlu();
    }

    public void IlIla(IlIlv_ ilIlv_) {
        this.IlIlC.IlIly(ilIlv_);
    }

    public double IlIll() {
        return this.IlIlE().IlIll();
    }

    public void IlIlf(double d) {
        this.IlIla(new IlIlv_(d, this.IlIlK(), this.IlIlS()));
    }

    public double IlIlK() {
        return this.IlIlE().IlIlk();
    }

    public void IlIlw(double d) {
        this.IlIla(new IlIlv_(this.IlIll(), d, this.IlIlS()));
    }

    public double IlIlS() {
        return this.IlIlE().IlIlY();
    }

    public void IlIlL(double d) {
        this.IlIla(new IlIlv_(this.IlIll(), this.IlIlK(), d));
    }

    public IlIlv_ IlIls() {
        return this.IlIlC.IlIlD();
    }

    public void IlIlZ(IlIlv_ ilIlv_) {
        this.IlIlC.IlIlu(ilIlv_);
    }

    public float IlIlo() {
        return this.IlIlC.IlIld();
    }

    public void IlIls(float f) {
        this.IlIlC.IlIlb(f);
    }

    public float IlIll() {
        return this.IlIlC.IlIlU();
    }

    public void IlIlL(float f) {
        this.IlIlC.IlIlU(f);
    }

    @Deprecated
    public byte IlIlS() {
        return this.IlIlH.IlIlS();
    }

    @Deprecated
    public void IlIlx(byte by) {
        this.IlIlH = new IlIlCl(by);
    }

    public boolean IlIlg(IlIlCl ilIlCl) {
        return this.IlIlH.IlIlb(ilIlCl);
    }

    public void IlIlh(IlIlCl ilIlCl, boolean bl) {
        this.IlIlH = this.IlIlH.IlIlH(ilIlCl, bl);
    }

    public IlIlCl IlIlC() {
        return this.IlIlH;
    }

    public void IlIlG(IlIlCl ilIlCl) {
        this.IlIlH = ilIlCl;
    }

    @ApiStatus.Obsolete
    public boolean IlIlN() {
        return this.IlIlI;
    }

    @ApiStatus.Obsolete
    public void IlIlI(boolean bl) {
        this.IlIlI = bl;
    }
}

