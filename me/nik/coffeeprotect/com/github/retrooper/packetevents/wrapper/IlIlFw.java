/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadLocalRandom;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.IlIlGq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.IlIlQO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.IlIlTl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.StaticSound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlFw
extends PacketWrapper<IlIlFw> {
    private IlIlQO IlIlv;
    private IlIlTl IlIlB;
    private IlIlAn IlIlJ;
    private float IlIl_;
    private float IlIlq;
    private long IlIlr;
    private static final long b = IlIls.a(-2033920527473383743L, -4348279589856632687L, MethodHandles.lookup().lookupClass()).a(112975741376418L);
    private static transient /* synthetic */ String fhTHVinXDc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFw(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFw(int n, IlIlTl ilIlTl, IlIlAn ilIlAn, float f, float f2) {
        this(n, ilIlTl, ilIlAn, f, f2, ThreadLocalRandom.current().nextLong());
    }

    public IlIlFw(int n, IlIlTl ilIlTl, IlIlAn ilIlAn, float f, float f2, long l) {
        this(IlIlGq.IlIlk(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE(), n), ilIlTl, ilIlAn, f, f2, l);
    }

    public IlIlFw(IlIlQO ilIlQO, IlIlTl ilIlTl, IlIlAn ilIlAn, float f, float f2) {
        this(ilIlQO, ilIlTl, ilIlAn, f, f2, ThreadLocalRandom.current().nextLong());
    }

    public IlIlFw(IlIlQO ilIlQO, IlIlTl ilIlTl, IlIlAn ilIlAn, float f, float f2, long l) {
        super(IlIlAG.SOUND_EFFECT);
        this.IlIlv = ilIlQO;
        this.IlIlB = ilIlTl;
        this.IlIlJ = ilIlAn;
        this.IlIl_ = f;
        this.IlIlq = f2;
        this.IlIlr = l;
    }

    @Override
    public void IlIle() {
        block20: {
            block19: {
                PacketWrapper[] packetWrapperArray;
                block18: {
                    block16: {
                        IlIlFw ilIlFw;
                        block17: {
                            boolean bl;
                            block15: {
                                block12: {
                                    ResourceLocation resourceLocation;
                                    IlIlQO ilIlQO;
                                    IlIlFw ilIlFw2;
                                    block13: {
                                        block14: {
                                            boolean bl2;
                                            block10: {
                                                block11: {
                                                    long l = b ^ 0x131D54B14DB4L;
                                                    packetWrapperArray = IlIlFh.IlIla();
                                                    bl2 = this.IlIlg.IlIlz(ServerVersion.V_1_19_3);
                                                    if (packetWrapperArray == null) break block10;
                                                    if (!bl2) break block11;
                                                    this.IlIlv = IlIlQO.IlIlq(this);
                                                    if (packetWrapperArray != null) break block12;
                                                }
                                                ilIlFw2 = this;
                                                if (packetWrapperArray == null) break block13;
                                                bl2 = ilIlFw2.IlIlg.IlIlz(ServerVersion.V_1_9);
                                            }
                                            if (!bl2) break block14;
                                            this.IlIlv = IlIlGq.IlIlk(this.IlIlg.IlIlE(), this.IlIlf());
                                            if (packetWrapperArray != null) break block12;
                                        }
                                        ilIlFw2 = this;
                                    }
                                    this.IlIlv = (ilIlQO = IlIlGq.IlIlC((resourceLocation = ilIlFw2.readIdentifier()).toString())) == null ? new StaticSound(resourceLocation, null) : ilIlQO;
                                }
                                bl = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                                if (packetWrapperArray == null) break block15;
                                if (bl) {
                                    this.IlIlB = IlIlTl.IlIlF(this.IlIlf());
                                }
                                this.IlIlJ = new IlIlAn(this.IlIlW(), this.IlIlW(), this.IlIlW());
                                this.IlIl_ = this.IlIlX();
                                ilIlFw = this;
                                if (packetWrapperArray == null) break block16;
                                bl = ilIlFw.IlIlg.IlIlz(ServerVersion.V_1_10);
                            }
                            if (!bl) break block17;
                            this.IlIlq = this.IlIlX();
                            if (packetWrapperArray != null) break block18;
                        }
                        ilIlFw = this;
                    }
                    ilIlFw.IlIlq = (float)this.IlIlP() / 63.5f;
                }
                IlIlFw ilIlFw = this;
                if (packetWrapperArray == null) break block19;
                if (!ilIlFw.IlIlg.IlIlz(ServerVersion.V_1_19)) break block20;
                ilIlFw = this;
            }
            ilIlFw.IlIlr = this.IlIli();
        }
    }

    @Override
    public void IlIlJ() {
        block20: {
            IlIlFw ilIlFw;
            block19: {
                PacketWrapper[] packetWrapperArray;
                block18: {
                    IlIlFw ilIlFw2;
                    block16: {
                        block17: {
                            boolean bl;
                            block15: {
                                block12: {
                                    IlIlFw ilIlFw3;
                                    block13: {
                                        block14: {
                                            boolean bl2;
                                            block10: {
                                                block11: {
                                                    long l = b ^ 0xA602958731CL;
                                                    packetWrapperArray = IlIlFh.IlIla();
                                                    bl2 = this.IlIlg.IlIlz(ServerVersion.V_1_19_3);
                                                    if (packetWrapperArray == null) break block10;
                                                    if (!bl2) break block11;
                                                    IlIlQO.IlIlw(this, this.IlIlv);
                                                    if (packetWrapperArray != null) break block12;
                                                }
                                                ilIlFw3 = this;
                                                if (packetWrapperArray == null) break block13;
                                                bl2 = ilIlFw3.IlIlg.IlIlz(ServerVersion.V_1_9);
                                            }
                                            if (!bl2) break block14;
                                            this.IlIlJ(this.IlIlv.IlIlH(this.IlIlg.IlIlE()));
                                            if (packetWrapperArray != null) break block12;
                                        }
                                        ilIlFw3 = this;
                                    }
                                    ilIlFw3.IlIlM(this.IlIlv.getSoundId().getKey());
                                }
                                bl = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                                if (packetWrapperArray == null) break block15;
                                if (bl) {
                                    this.IlIlJ(this.IlIlB.ordinal());
                                }
                                this.IlIla(this.IlIlJ.IlIlj);
                                this.IlIla(this.IlIlJ.IlIlw);
                                this.IlIla(this.IlIlJ.IlIlk);
                                this.IlIlR(this.IlIl_);
                                ilIlFw2 = this;
                                if (packetWrapperArray == null) break block16;
                                bl = ilIlFw2.IlIlg.IlIlz(ServerVersion.V_1_10);
                            }
                            if (!bl) break block17;
                            this.IlIlR(this.IlIlq);
                            if (packetWrapperArray != null) break block18;
                        }
                        ilIlFw2 = this;
                    }
                    ilIlFw2.IlIlu((int)(this.IlIlq * 63.5f));
                }
                ilIlFw = this;
                if (packetWrapperArray == null) break block19;
                if (!ilIlFw.IlIlg.IlIlz(ServerVersion.V_1_19)) break block20;
                ilIlFw = this;
            }
            ilIlFw.IlIlP(this.IlIlr);
        }
    }

    public void IlIlC(IlIlFw ilIlFw) {
        this.IlIlv = ilIlFw.IlIlv;
        this.IlIlB = ilIlFw.IlIlB;
        this.IlIlJ = ilIlFw.IlIlJ;
        this.IlIl_ = ilIlFw.IlIl_;
        this.IlIlq = ilIlFw.IlIlq;
        this.IlIlr = ilIlFw.IlIlr;
    }

    public IlIlQO IlIls() {
        return this.IlIlv;
    }

    public void IlIlG(IlIlQO ilIlQO) {
        this.IlIlv = ilIlQO;
    }

    @Deprecated
    public int IlIly() {
        return this.IlIls().IlIlH(this.IlIlg.IlIlE());
    }

    @Deprecated
    public void IlIlC(int n) {
        this.IlIlG(IlIlGq.IlIlk(this.IlIlg.IlIlE(), n));
    }

    @Nullable
    public IlIlTl IlIlI() {
        return this.IlIlB;
    }

    public void IlIlq(IlIlTl ilIlTl) {
        this.IlIlB = ilIlTl;
    }

    public IlIlAn IlIlf() {
        return this.IlIlJ;
    }

    public void IlIlF(IlIlAn ilIlAn) {
        this.IlIlJ = ilIlAn;
    }

    public float IlIlo() {
        return this.IlIl_;
    }

    public void IlIlO(float f) {
        this.IlIl_ = f;
    }

    public float IlIln() {
        return this.IlIlq;
    }

    public void IlIlM(float f) {
        this.IlIlq = f;
    }

    public long IlIlV() {
        return this.IlIlr;
    }

    public void IlIlt(long l) {
        this.IlIlr = l;
    }
}

