/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.IlIlLD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.IlIlnm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIliP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlh9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlFm
extends PacketWrapper<IlIlFm> {
    private static final float IlIlt = 0.7111111f;
    private int IlIlI;
    private UUID IlIll;
    private IlIlv_ IlIlO;
    private float IlIlF;
    private float IlIlu;
    @Deprecated
    private ItemType IlIlz;
    private List<IlIlnm<?>> IlIlY;
    private static final long b = IlIls.a(-618751298647819304L, -5837083355105236127L, MethodHandles.lookup().lookupClass()).a(78881728558273L);
    private static transient /* synthetic */ String BActqzOjDw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFm(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFm(int n, UUID uUID, IlIliP ilIliP, IlIlLD ilIlLD) {
        this(n, uUID, ilIliP.IlIln(), ilIliP.IlIlH(), ilIliP.IlIlP(), ilIlLD.IlIlp(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE()));
    }

    public IlIlFm(int n, UUID uUID, IlIliP ilIliP, List<IlIlnm<?>> list) {
        this(n, uUID, ilIliP.IlIln(), ilIliP.IlIlH(), ilIliP.IlIlP(), list);
    }

    public IlIlFm(int n, UUID uUID, IlIliP ilIliP, IlIlnm<?> ... ilIlnmArray) {
        this(n, uUID, ilIliP.IlIln(), ilIliP.IlIlH(), ilIliP.IlIlP(), Arrays.asList(ilIlnmArray));
    }

    public IlIlFm(int n, UUID uUID, IlIlv_ ilIlv_, float f, float f2, List<IlIlnm<?>> list) {
        super(IlIlAG.SPAWN_PLAYER);
        this.IlIlI = n;
        this.IlIll = uUID;
        this.IlIlO = ilIlv_;
        this.IlIlF = f;
        this.IlIlu = f2;
        this.IlIlY = list;
        this.IlIlz = ItemTypes.AIR;
    }

    public IlIlFm(int n, UUID uUID, IlIlv_ ilIlv_, float f, float f2, IlIlLD ilIlLD) {
        this(n, uUID, ilIlv_, f, f2, ilIlLD.IlIlp(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE()));
    }

    @Override
    public void IlIle() {
        block14: {
            block12: {
                IlIlFm ilIlFm;
                block13: {
                    PacketWrapper[] packetWrapperArray;
                    block11: {
                        block9: {
                            IlIlFm ilIlFm2;
                            block10: {
                                boolean bl;
                                block8: {
                                    block7: {
                                        block6: {
                                            long l = b ^ 0x494FAD37D700L;
                                            this.IlIlI = this.IlIlf();
                                            packetWrapperArray = IlIlFh.IlIla();
                                            this.IlIll = this.IlIlv();
                                            bl = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                                            if (packetWrapperArray == null) break block6;
                                            if (!bl) break block7;
                                            this.IlIlO = new IlIlv_(this.IlIlb(), this.IlIlb(), this.IlIlb());
                                        }
                                        if (packetWrapperArray != null) break block8;
                                    }
                                    this.IlIlO = new IlIlv_((double)this.IlIlW() / 32.0, (double)this.IlIlW() / 32.0, (double)this.IlIlW() / 32.0);
                                }
                                this.IlIlF = (float)this.IlIlE() / 0.7111111f;
                                ilIlFm2 = this;
                                if (packetWrapperArray == null) break block9;
                                ilIlFm2.IlIlu = (float)this.IlIlE() / 0.7111111f;
                                if (bl) break block10;
                                this.IlIlz = ItemTypes.getById(this.IlIlg.IlIlE(), this.IlIlG());
                                if (packetWrapperArray != null) break block11;
                            }
                            ilIlFm2 = this;
                        }
                        ilIlFm2.IlIlz = ItemTypes.AIR;
                    }
                    ilIlFm = this;
                    if (packetWrapperArray == null) break block12;
                    if (!ilIlFm.IlIlg.IlIlC(ServerVersion.V_1_15)) break block13;
                    this.IlIlY = this.IlIlc();
                    if (packetWrapperArray != null) break block14;
                }
                ilIlFm = this;
            }
            ilIlFm.IlIlY = new ArrayList();
        }
    }

    @Override
    public void IlIlJ() {
        block12: {
            IlIlFm ilIlFm;
            block11: {
                boolean bl;
                block10: {
                    boolean bl2;
                    PacketWrapper[] packetWrapperArray;
                    block9: {
                        block7: {
                            block8: {
                                long l = b ^ 0x5032D0DEE9A8L;
                                this.IlIlJ(this.IlIlI);
                                PacketWrapper[] packetWrapperArray2 = IlIlFh.IlIla();
                                this.IlIlc(this.IlIll);
                                packetWrapperArray = packetWrapperArray2;
                                bl2 = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                                if (packetWrapperArray == null) break block7;
                                if (!bl2) break block8;
                                this.IlIlY(this.IlIlO.IlIll());
                                this.IlIlY(this.IlIlO.IlIlk());
                                this.IlIlY(this.IlIlO.IlIlY());
                                if (packetWrapperArray != null) break block9;
                            }
                            this.IlIla(IlIlh9.IlIlK(this.IlIlO.IlIll() * 32.0));
                            this.IlIla(IlIlh9.IlIlK(this.IlIlO.IlIlk() * 32.0));
                        }
                        this.IlIla(IlIlh9.IlIlK(this.IlIlO.IlIlY() * 32.0));
                    }
                    this.IlIlu((byte)(this.IlIlF * 0.7111111f));
                    this.IlIlu((byte)(this.IlIlu * 0.7111111f));
                    bl = bl2;
                    if (packetWrapperArray == null) break block10;
                    if (!bl) {
                        this.IlIlG(this.IlIlz.IlIlH(this.IlIlg.IlIlE()));
                    }
                    ilIlFm = this;
                    if (packetWrapperArray == null) break block11;
                    bl = ilIlFm.IlIlg.IlIlC(ServerVersion.V_1_15);
                }
                if (!bl) break block12;
                ilIlFm = this;
            }
            ilIlFm.IlIlx(this.IlIlY);
        }
    }

    public void IlIlE(IlIlFm ilIlFm) {
        this.IlIlI = ilIlFm.IlIlI;
        this.IlIll = ilIlFm.IlIll;
        this.IlIlO = ilIlFm.IlIlO;
        this.IlIlF = ilIlFm.IlIlF;
        this.IlIlu = ilIlFm.IlIlu;
        this.IlIlz = ilIlFm.IlIlz;
        this.IlIlY = ilIlFm.IlIlY;
    }

    public int IlIlV() {
        return this.IlIlI;
    }

    public void IlIlm(int n) {
        this.IlIlI = n;
    }

    public UUID IlIln() {
        return this.IlIll;
    }

    public void IlIl_(UUID uUID) {
        this.IlIll = uUID;
    }

    public IlIlv_ IlIlp() {
        return this.IlIlO;
    }

    public void IlIlu(IlIlv_ ilIlv_) {
        this.IlIlO = ilIlv_;
    }

    public float IlIls() {
        return this.IlIlF;
    }

    public void IlIla(float f) {
        this.IlIlF = f;
    }

    public float IlIlB() {
        return this.IlIlu;
    }

    public void IlIlh(float f) {
        this.IlIlu = f;
    }

    @Deprecated
    public List<IlIlnm<?>> IlIlj() {
        return this.IlIlY;
    }

    @Deprecated
    public void IlIlf(List<IlIlnm<?>> list) {
        this.IlIlY = list;
    }

    @Deprecated
    public void IlIlH(IlIlLD ilIlLD) {
        this.IlIlY = ilIlLD.IlIlp(this.IlIlg.IlIlE());
    }

    @Deprecated
    public ItemType IlIlV() {
        return this.IlIlz;
    }

    @Deprecated
    public void IlIlw(ItemType itemType) {
        this.IlIlz = itemType;
    }
}

