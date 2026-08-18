/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlO_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlAV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlbV
extends PacketWrapper<IlIlbV> {
    private IlIlO_ IlIlB;
    private IlIlAn IlIlA;
    private IlIlAV IlIlu;
    private int IlIlF;
    private int IlIlv;
    private static final long b = IlIls.a(7220779705509819929L, -7651038957283747183L, MethodHandles.lookup().lookupClass()).a(77897926356548L);
    private static transient /* synthetic */ String XCVuBkmEmJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbV(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbV(IlIlO_ ilIlO_, IlIlAn ilIlAn, IlIlAV ilIlAV, int n) {
        super(IlIlnN.PLAYER_DIGGING);
        this.IlIlB = ilIlO_;
        this.IlIlA = ilIlAn;
        this.IlIlu = ilIlAV;
        this.IlIlF = ilIlAV.IlIlK();
        this.IlIlv = n;
    }

    public IlIlbV(IlIlO_ ilIlO_, IlIlAn ilIlAn, int n, int n2) {
        super(IlIlnN.PLAYER_DIGGING);
        this.IlIlB = ilIlO_;
        this.IlIlA = ilIlAn;
        this.IlIlu = IlIlAV.IlIlf(n);
        this.IlIlF = n;
        this.IlIlv = n2;
    }

    @Override
    public void IlIle() {
        block13: {
            block12: {
                String string;
                block11: {
                    int n;
                    block9: {
                        block10: {
                            block8: {
                                block6: {
                                    IlIlbV ilIlbV;
                                    block7: {
                                        long l = b ^ 0x7EA7F1D540C9L;
                                        string = IlIlJH.IlIlw();
                                        ilIlbV = this;
                                        if (string != null) break block6;
                                        if (!ilIlbV.IlIlg.IlIlz(ServerVersion.V_1_9)) break block7;
                                        this.IlIlB = IlIlO_.IlIlZ(this.IlIlf());
                                        if (string == null) break block8;
                                    }
                                    ilIlbV = this;
                                }
                                ilIlbV.IlIlB = IlIlO_.IlIlZ(this.IlIlE());
                            }
                            n = this.IlIlg.IlIlz(ServerVersion.V_1_8);
                            if (string != null) break block9;
                            if (n == 0) break block10;
                            this.IlIlA = this.IlIlE();
                            if (string == null) break block11;
                        }
                        n = this.IlIlW();
                    }
                    int n2 = n;
                    short s = this.IlIlP();
                    int n3 = this.IlIlW();
                    this.IlIlA = new IlIlAn(n2, s, n3);
                }
                this.IlIlF = this.IlIlP();
                this.IlIlu = IlIlAV.IlIlf(this.IlIlF);
                IlIlbV ilIlbV = this;
                if (string != null) break block12;
                if (!ilIlbV.IlIlg.IlIlz(ServerVersion.V_1_19)) break block13;
                ilIlbV = this;
            }
            ilIlbV.IlIlv = this.IlIlf();
        }
    }

    @Override
    public void IlIlJ() {
        block8: {
            IlIlbV ilIlbV;
            block7: {
                String string;
                block6: {
                    IlIlbV ilIlbV2;
                    block4: {
                        block5: {
                            long l = b ^ 0x67DA8C3C7E61L;
                            string = IlIlJH.IlIlw();
                            ilIlbV2 = this;
                            if (string != null) break block4;
                            if (!ilIlbV2.IlIlg.IlIlz(ServerVersion.V_1_8)) break block5;
                            this.IlIlJ(this.IlIlB.IlIlr());
                            this.IlIlh(this.IlIlA);
                            if (string == null) break block6;
                        }
                        this.IlIlu(this.IlIlB.IlIlr());
                        this.IlIla(this.IlIlA.IlIlj);
                        this.IlIlu(this.IlIlA.IlIlw);
                        ilIlbV2 = this;
                    }
                    ilIlbV2.IlIla(this.IlIlA.IlIlk);
                }
                this.IlIlu(this.IlIlF);
                ilIlbV = this;
                if (string != null) break block7;
                if (!ilIlbV.IlIlg.IlIlz(ServerVersion.V_1_19)) break block8;
                ilIlbV = this;
            }
            ilIlbV.IlIlJ(this.IlIlv);
        }
    }

    public void IlIlk(IlIlbV ilIlbV) {
        this.IlIlB = ilIlbV.IlIlB;
        this.IlIlA = ilIlbV.IlIlA;
        this.IlIlu = ilIlbV.IlIlu;
        this.IlIlF = ilIlbV.IlIlF;
        this.IlIlv = ilIlbV.IlIlv;
    }

    public IlIlO_ IlIlg() {
        return this.IlIlB;
    }

    public void IlIlL(IlIlO_ ilIlO_) {
        this.IlIlB = ilIlO_;
    }

    public IlIlAn IlIlT() {
        return this.IlIlA;
    }

    public void IlIll(IlIlAn ilIlAn) {
        this.IlIlA = ilIlAn;
    }

    public IlIlAV IlIlg() {
        return this.IlIlu;
    }

    public void IlIlb(IlIlAV ilIlAV) {
        this.IlIlu = ilIlAV;
        this.IlIlF = ilIlAV.IlIlK();
    }

    public int IlIlS() {
        return this.IlIlF;
    }

    public void IlIlb(int n) {
        this.IlIlu = IlIlAV.IlIlf(n);
        this.IlIlF = n;
    }

    public int IlIln() {
        return this.IlIlv;
    }

    public void IlIll(int n) {
        this.IlIlv = n;
    }
}

