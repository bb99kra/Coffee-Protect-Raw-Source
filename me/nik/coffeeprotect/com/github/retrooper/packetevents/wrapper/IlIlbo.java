/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlfx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlGk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.Nullable;

public class IlIlbo
extends PacketWrapper<IlIlbo> {
    private int IlIlq;
    private IlIlE IlIla;
    private @Nullable IlIlv_ IlIlp;
    private IlIlfx IlIlu;
    private boolean IlIlw;
    private static final long b = IlIls.a(5718448999281940912L, -4724233492664047208L, MethodHandles.lookup().lookupClass()).a(42316123087244L);
    private static transient /* synthetic */ String POQXoGNxqC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbo(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    @Deprecated
    public IlIlbo(int n, IlIlE ilIlE, IlIlfx ilIlfx, Optional<IlIlQG> optional, Optional<Boolean> optional2) {
        this(n, ilIlE, optional.map(IlIlv_::new).orElse(null), ilIlfx, optional2.orElse(false));
    }

    public IlIlbo(int n, IlIlfx ilIlfx, IlIlv_ ilIlv_, boolean bl) {
        this(n, IlIlE.INTERACT_AT, ilIlv_, ilIlfx, bl);
    }

    @ApiStatus.Obsolete
    public IlIlbo(int n, IlIlE ilIlE, @Nullable IlIlv_ ilIlv_, IlIlfx ilIlfx, boolean bl) {
        super(IlIlnN.INTERACT_ENTITY);
        this.IlIlq = n;
        this.IlIla = ilIlE;
        this.IlIlp = ilIlv_;
        this.IlIlu = ilIlfx;
        this.IlIlw = bl;
    }

    @Override
    public void IlIle() {
        block8: {
            block9: {
                IlIlbo ilIlbo;
                block10: {
                    String string;
                    block19: {
                        block18: {
                            block14: {
                                IlIlbo ilIlbo2;
                                block15: {
                                    block16: {
                                        IlIlbo ilIlbo3;
                                        block17: {
                                            block13: {
                                                block11: {
                                                    IlIlbo ilIlbo4;
                                                    block12: {
                                                        boolean bl;
                                                        block6: {
                                                            block7: {
                                                                long l = b ^ 0x495618E93131L;
                                                                string = IlIlJH.IlIlw();
                                                                bl = this.IlIlg.IlIlz(ServerVersion.V_26_1);
                                                                if (string != null) break block6;
                                                                if (!bl) break block7;
                                                                this.IlIlq = this.IlIlf();
                                                                this.IlIlu = (IlIlfx)this.IlIlH(IlIlfx.values());
                                                                this.IlIlp = IlIlGk.IlIlX(this);
                                                                this.IlIlw = this.IlIlK();
                                                                this.IlIla = IlIlE.INTERACT_AT;
                                                                if (string == null) break block8;
                                                            }
                                                            ilIlbo = this;
                                                            if (string != null) break block9;
                                                            bl = ilIlbo.IlIlg.IlIlz(ServerVersion.V_1_8);
                                                        }
                                                        if (!bl) break block10;
                                                        this.IlIlq = this.IlIlf();
                                                        this.IlIla = (IlIlE)this.IlIlH(IlIlE.values());
                                                        ilIlbo4 = this;
                                                        if (string != null) break block11;
                                                        if (ilIlbo4.IlIla != IlIlE.INTERACT_AT) break block12;
                                                        this.IlIlp = new IlIlv_(IlIlQG.IlIlb(this));
                                                        if (string == null) break block13;
                                                    }
                                                    ilIlbo4 = this;
                                                }
                                                ilIlbo4.IlIlp = IlIlv_.IlIld();
                                            }
                                            ilIlbo2 = this;
                                            if (string != null) break block14;
                                            if (!ilIlbo2.IlIlg.IlIlz(ServerVersion.V_1_9)) break block15;
                                            ilIlbo3 = this;
                                            if (string != null) break block16;
                                            if (ilIlbo3.IlIla == IlIlE.INTERACT) break block17;
                                            ilIlbo2 = this;
                                            if (string != null) break block14;
                                            if (ilIlbo2.IlIla != IlIlE.INTERACT_AT) break block15;
                                        }
                                        ilIlbo3 = this;
                                    }
                                    ilIlbo3.IlIlu = (IlIlfx)this.IlIlH(IlIlfx.values());
                                    if (string == null) break block18;
                                }
                                ilIlbo2 = this;
                            }
                            ilIlbo2.IlIlu = IlIlfx.MAIN_HAND;
                        }
                        IlIlbo ilIlbo5 = this;
                        if (string != null) break block19;
                        if (!ilIlbo5.IlIlg.IlIlz(ServerVersion.V_1_16)) break block8;
                        ilIlbo5 = this;
                    }
                    ilIlbo5.IlIlw = this.IlIlK();
                    if (string == null) break block8;
                }
                this.IlIlq = this.IlIlW();
                this.IlIla = IlIlE.VALUES[this.IlIlE()];
                this.IlIlu = IlIlfx.MAIN_HAND;
                ilIlbo = this;
            }
            ilIlbo.IlIla = IlIlE.INTERACT;
        }
    }

    @Override
    public void IlIlJ() {
        block11: {
            IlIlbo ilIlbo;
            block12: {
                block13: {
                    IlIlbo ilIlbo2;
                    String string;
                    block19: {
                        boolean bl;
                        block14: {
                            block18: {
                                block15: {
                                    IlIlbo ilIlbo3;
                                    block16: {
                                        block17: {
                                            boolean bl2;
                                            block9: {
                                                block10: {
                                                    long l = b ^ 0x502B65000F99L;
                                                    string = IlIlJH.IlIlw();
                                                    bl2 = this.IlIlg.IlIlz(ServerVersion.V_26_1);
                                                    if (string != null) break block9;
                                                    if (!bl2) break block10;
                                                    this.IlIlJ(this.IlIlq);
                                                    this.IlIlw(this.IlIlu);
                                                    IlIlv_ ilIlv_ = this.IlIlp;
                                                    if (string == null) {
                                                        ilIlv_ = ilIlv_ != null ? this.IlIlp : IlIlv_.IlIld();
                                                    }
                                                    IlIlGk.IlIlE(this, ilIlv_);
                                                    this.IlIla(this.IlIlw);
                                                    if (string == null) break block11;
                                                }
                                                ilIlbo = this;
                                                if (string != null) break block12;
                                                bl2 = ilIlbo.IlIlg.IlIlz(ServerVersion.V_1_8);
                                            }
                                            if (!bl2) break block13;
                                            this.IlIlJ(this.IlIlq);
                                            this.IlIlw(this.IlIla);
                                            IlIlbo ilIlbo4 = this;
                                            if (string == null) {
                                                if (ilIlbo4.IlIla == IlIlE.INTERACT_AT) {
                                                    IlIlQG.IlIly(this, new IlIlQG(this.IlIlp != null ? this.IlIlp : IlIlv_.IlIld()));
                                                }
                                                ilIlbo4 = this;
                                            }
                                            bl = ilIlbo4.IlIlg.IlIlz(ServerVersion.V_1_9);
                                            if (string != null) break block14;
                                            if (!bl) break block15;
                                            ilIlbo3 = this;
                                            if (string != null) break block16;
                                            if (ilIlbo3.IlIla == IlIlE.INTERACT) break block17;
                                            ilIlbo2 = this;
                                            if (string != null) break block18;
                                            if (ilIlbo2.IlIla != IlIlE.INTERACT_AT) break block15;
                                        }
                                        ilIlbo3 = this;
                                    }
                                    ilIlbo3.IlIlw(this.IlIlu);
                                }
                                ilIlbo2 = this;
                            }
                            if (string != null) break block19;
                            bl = ilIlbo2.IlIlg.IlIlz(ServerVersion.V_1_16);
                        }
                        if (!bl) break block11;
                        ilIlbo2 = this;
                    }
                    ilIlbo2.IlIla(this.IlIlw);
                    if (string == null) break block11;
                }
                this.IlIla(this.IlIlq);
                ilIlbo = this;
            }
            ilIlbo.IlIlu(this.IlIla.ordinal());
        }
    }

    public void IlIlD(IlIlbo ilIlbo) {
        this.IlIlq = ilIlbo.IlIlq;
        this.IlIla = ilIlbo.IlIla;
        this.IlIlp = ilIlbo.IlIlp;
        this.IlIlu = ilIlbo.IlIlu;
        this.IlIlw = ilIlbo.IlIlw;
    }

    public int IlIl_() {
        return this.IlIlq;
    }

    public void IlIlb(int n) {
        this.IlIlq = n;
    }

    @ApiStatus.Obsolete
    public IlIlE IlIlK() {
        return this.IlIla;
    }

    @ApiStatus.Obsolete
    public void IlIlm(IlIlE ilIlE) {
        this.IlIla = ilIlE;
    }

    public IlIlfx IlIlx() {
        return this.IlIlu;
    }

    public void IlIlS(IlIlfx ilIlfx) {
        this.IlIlu = ilIlfx;
    }

    public @UnknownNullability IlIlv_ IlIll() {
        return this.IlIlp;
    }

    public void IlIlR(@UnknownNullability IlIlv_ ilIlv_) {
        this.IlIlp = ilIlv_;
    }

    @Deprecated
    public Optional<IlIlQG> IlIlA() {
        return Optional.ofNullable(this.IlIlp).map(IlIlQG::new);
    }

    @Deprecated
    public void IlIlJ(Optional<IlIlQG> optional) {
        this.IlIlp = optional.map(IlIlv_::new).orElse(null);
    }

    public Optional<Boolean> IlIlJ() {
        return Optional.of(this.IlIlw);
    }

    public void IlIly(boolean bl) {
        this.IlIlw = bl;
    }

    @Deprecated
    public void IlIlo(Optional<Boolean> optional) {
        this.IlIlw = optional.orElse(false);
    }
}

