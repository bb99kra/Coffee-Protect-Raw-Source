/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlfx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlAV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlb5
extends PacketWrapper<IlIlb5> {
    private IlIlfx IlIly;
    private IlIlAn IlIlA;
    private int IlIlm;
    private IlIlAV IlIlH;
    private IlIlQG IlIlw;
    private Optional<IlIlCg> IlIlJ;
    private Optional<Boolean> IlIlb;
    private Optional<Boolean> IlIlu;
    private int IlIln;
    private static final long b = IlIls.a(-8193144901611122526L, -5482908511664327224L, MethodHandles.lookup().lookupClass()).a(82652576211662L);
    private static transient /* synthetic */ String EtvGKOaRRQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb5(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlb5(IlIlfx ilIlfx, IlIlAn ilIlAn, IlIlAV ilIlAV, IlIlQG ilIlQG, IlIlCg ilIlCg, Boolean bl, int n) {
        this(ilIlfx, ilIlAn, ilIlAV, ilIlQG, ilIlCg, bl, null, n);
    }

    public IlIlb5(IlIlfx ilIlfx, IlIlAn ilIlAn, IlIlAV ilIlAV, IlIlQG ilIlQG, IlIlCg ilIlCg, Boolean bl, Boolean bl2, int n) {
        super(IlIlnN.PLAYER_BLOCK_PLACEMENT);
        this.IlIly = ilIlfx;
        this.IlIlA = ilIlAn;
        this.IlIlH = ilIlAV;
        this.IlIlm = ilIlAV.IlIlK();
        this.IlIlw = ilIlQG;
        this.IlIlJ = Optional.ofNullable(ilIlCg);
        this.IlIlb = Optional.ofNullable(bl);
        this.IlIlu = Optional.ofNullable(bl2);
        this.IlIln = n;
    }

    @Override
    public void IlIle() {
        block16: {
            block24: {
                IlIlb5 ilIlb5;
                block25: {
                    String string;
                    block23: {
                        block21: {
                            IlIlb5 ilIlb52;
                            block22: {
                                block20: {
                                    block18: {
                                        IlIlb5 ilIlb53;
                                        block19: {
                                            boolean bl;
                                            block13: {
                                                block14: {
                                                    block17: {
                                                        IlIlb5 ilIlb54;
                                                        boolean bl2;
                                                        block15: {
                                                            long l = b ^ 0x53CE264F8D73L;
                                                            this.IlIlJ = Optional.empty();
                                                            this.IlIlb = Optional.empty();
                                                            string = IlIlJH.IlIlw();
                                                            bl = this.IlIlg.IlIlz(ServerVersion.V_1_14);
                                                            if (string != null) break block13;
                                                            if (!bl) break block14;
                                                            this.IlIly = IlIlfx.IlIlH(this.IlIlf());
                                                            this.IlIlA = this.IlIlE();
                                                            this.IlIlm = this.IlIlf();
                                                            this.IlIlH = IlIlAV.IlIlf(this.IlIlm);
                                                            this.IlIlw = new IlIlQG(this.IlIlX(), this.IlIlX(), this.IlIlX());
                                                            this.IlIlb = Optional.of(this.IlIlK());
                                                            bl2 = this.IlIlg.IlIlz(ServerVersion.V_1_19);
                                                            if (string != null) break block15;
                                                            if (!bl2) break block16;
                                                            ilIlb54 = this;
                                                            if (string != null) break block17;
                                                            bl2 = ilIlb54.IlIlg.IlIlz(ServerVersion.V_1_21_2);
                                                        }
                                                        if (bl2) {
                                                            this.IlIlu = Optional.of(this.IlIlK());
                                                        }
                                                        ilIlb54 = this;
                                                    }
                                                    ilIlb54.IlIln = this.IlIlf();
                                                    if (string == null) break block16;
                                                }
                                                ilIlb53 = this;
                                                if (string != null) break block18;
                                                bl = ilIlb53.IlIlg.IlIlS(ServerVersion.V_1_7_10);
                                            }
                                            if (!bl) break block19;
                                            this.IlIlA = new IlIlAn(this.IlIlW(), this.IlIlP(), this.IlIlW());
                                            if (string == null) break block20;
                                        }
                                        ilIlb53 = this;
                                    }
                                    ilIlb53.IlIlA = this.IlIlE();
                                }
                                ilIlb52 = this;
                                if (string != null) break block21;
                                if (!ilIlb52.IlIlg.IlIlz(ServerVersion.V_1_9)) break block22;
                                this.IlIlm = this.IlIlf();
                                this.IlIlH = IlIlAV.IlIlf(this.IlIlm);
                                this.IlIly = IlIlfx.IlIlH(this.IlIlf());
                                if (string == null) break block23;
                            }
                            this.IlIlm = this.IlIlP();
                            this.IlIlH = IlIlAV.IlIlA(this.IlIlm);
                            this.IlIlJ = Optional.of(this.IlIlk());
                            ilIlb52 = this;
                        }
                        ilIlb52.IlIly = IlIlfx.MAIN_HAND;
                    }
                    ilIlb5 = this;
                    if (string != null) break block24;
                    if (!ilIlb5.IlIlg.IlIlz(ServerVersion.V_1_11)) break block25;
                    this.IlIlw = new IlIlQG(this.IlIlX(), this.IlIlX(), this.IlIlX());
                    if (string == null) break block16;
                }
                ilIlb5 = this;
            }
            ilIlb5.IlIlw = new IlIlQG((float)this.IlIlP() / 16.0f, (float)this.IlIlP() / 16.0f, (float)this.IlIlP() / 16.0f);
        }
    }

    @Override
    public void IlIlJ() {
        block16: {
            IlIlb5 ilIlb5;
            block24: {
                block25: {
                    String string;
                    block23: {
                        IlIlb5 ilIlb52;
                        block21: {
                            block22: {
                                block20: {
                                    IlIlb5 ilIlb53;
                                    block18: {
                                        block19: {
                                            boolean bl;
                                            block13: {
                                                block14: {
                                                    IlIlb5 ilIlb54;
                                                    block17: {
                                                        boolean bl2;
                                                        block15: {
                                                            long l = b ^ 0x4AB35BA6B3DBL;
                                                            string = IlIlJH.IlIlw();
                                                            bl = this.IlIlg.IlIlz(ServerVersion.V_1_14);
                                                            if (string != null) break block13;
                                                            if (!bl) break block14;
                                                            this.IlIlJ(this.IlIly.IlIlr());
                                                            this.IlIlh(this.IlIlA);
                                                            this.IlIlJ(this.IlIlm);
                                                            this.IlIlR(this.IlIlw.IlIlA);
                                                            this.IlIlR(this.IlIlw.IlIlF);
                                                            this.IlIlR(this.IlIlw.IlIlp);
                                                            this.IlIla(this.IlIlb.orElse(false));
                                                            bl2 = this.IlIlg.IlIlz(ServerVersion.V_1_19);
                                                            if (string != null) break block15;
                                                            if (!bl2) break block16;
                                                            ilIlb54 = this;
                                                            if (string != null) break block17;
                                                            bl2 = ilIlb54.IlIlg.IlIlz(ServerVersion.V_1_21_2);
                                                        }
                                                        if (bl2) {
                                                            this.IlIla(this.IlIlu.orElse(false));
                                                        }
                                                        ilIlb54 = this;
                                                    }
                                                    ilIlb54.IlIlJ(this.IlIln);
                                                    if (string == null) break block16;
                                                }
                                                ilIlb53 = this;
                                                if (string != null) break block18;
                                                bl = ilIlb53.IlIlg.IlIlS(ServerVersion.V_1_7_10);
                                            }
                                            if (!bl) break block19;
                                            this.IlIla(this.IlIlA.IlIlj);
                                            this.IlIlu(this.IlIlA.IlIlw);
                                            this.IlIla(this.IlIlA.IlIlk);
                                            if (string == null) break block20;
                                        }
                                        ilIlb53 = this;
                                    }
                                    ilIlb53.IlIlh(this.IlIlA);
                                }
                                ilIlb52 = this;
                                if (string != null) break block21;
                                if (!ilIlb52.IlIlg.IlIlz(ServerVersion.V_1_9)) break block22;
                                this.IlIlJ(this.IlIlm);
                                this.IlIlJ(this.IlIly.IlIlr());
                                if (string == null) break block23;
                            }
                            this.IlIlu(this.IlIlm);
                            ilIlb52 = this;
                        }
                        ilIlb52.IlIlj(this.IlIlJ.orElse(IlIlCg.IlIlP));
                    }
                    ilIlb5 = this;
                    if (string != null) break block24;
                    if (!ilIlb5.IlIlg.IlIlz(ServerVersion.V_1_11)) break block25;
                    this.IlIlR(this.IlIlw.IlIlA);
                    this.IlIlR(this.IlIlw.IlIlF);
                    this.IlIlR(this.IlIlw.IlIlp);
                    if (string == null) break block16;
                }
                this.IlIlu((int)(this.IlIlw.IlIlA * 16.0f));
                this.IlIlu((int)(this.IlIlw.IlIlF * 16.0f));
                ilIlb5 = this;
            }
            ilIlb5.IlIlu((int)(this.IlIlw.IlIlp * 16.0f));
        }
    }

    public void IlIlZ(IlIlb5 ilIlb5) {
        this.IlIly = ilIlb5.IlIly;
        this.IlIlA = ilIlb5.IlIlA;
        this.IlIlH = ilIlb5.IlIlH;
        this.IlIlm = ilIlb5.IlIlm;
        this.IlIlw = ilIlb5.IlIlw;
        this.IlIlJ = ilIlb5.IlIlJ;
        this.IlIlb = ilIlb5.IlIlb;
        this.IlIlu = ilIlb5.IlIlu;
        this.IlIln = ilIlb5.IlIln;
    }

    public IlIlfx IlIlY() {
        return this.IlIly;
    }

    public void IlIlh(IlIlfx ilIlfx) {
        this.IlIly = ilIlfx;
    }

    public IlIlAn IlIlu() {
        return this.IlIlA;
    }

    public void IlIlH(IlIlAn ilIlAn) {
        this.IlIlA = ilIlAn;
    }

    public int IlIlD() {
        return this.IlIlm;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void IlIll(int var1_1) {
        var2_2 = IlIlb5.b ^ 88020058969502L;
        this.IlIlm = var1_1;
        var4_3 = IlIlJH.IlIlw();
        v0 = this.IlIlg.IlIlz(ServerVersion.V_1_9);
        if (var4_3 != null) ** GOTO lbl10
        if (v0 != 0) {
            v1 = IlIlAV.IlIlf(var1_1);
        } else {
            v0 = var1_1;
lbl10:
            // 2 sources

            v1 = IlIlAV.IlIlA(v0);
        }
        this.IlIlH = v1;
    }

    public IlIlAV IlIlT() {
        return this.IlIlH;
    }

    public void IlIlc(IlIlAV ilIlAV) {
        this.IlIlH = ilIlAV;
        this.IlIlm = ilIlAV.IlIlK();
    }

    public IlIlQG IlIlf() {
        return this.IlIlw;
    }

    public void IlIld(IlIlQG ilIlQG) {
        this.IlIlw = ilIlQG;
    }

    public Optional<IlIlCg> IlIlm() {
        return this.IlIlJ;
    }

    public void IlIlF(Optional<IlIlCg> optional) {
        this.IlIlJ = optional;
    }

    public Optional<Boolean> IlIlt() {
        long l = b ^ 0x4F4B98A9F93FL;
        String string = IlIlJH.IlIlw();
        Optional<Boolean> optional = this.IlIlb;
        if (string == null) {
            optional = optional != null ? this.IlIlb : Optional.empty();
        }
        return optional;
    }

    public void IlIlv(Optional<Boolean> optional) {
        this.IlIlb = optional;
    }

    public Optional<Boolean> IlIlN() {
        long l = b ^ 0xEF6C4A0B49FL;
        String string = IlIlJH.IlIlw();
        Optional<Boolean> optional = this.IlIlu;
        if (string == null) {
            optional = optional != null ? this.IlIlu : Optional.empty();
        }
        return optional;
    }

    public void IlIld(Optional<Boolean> optional) {
        this.IlIlu = optional;
    }

    public int IlIl_() {
        return this.IlIln;
    }

    public void IlIlQ(int n) {
        this.IlIln = n;
    }
}

