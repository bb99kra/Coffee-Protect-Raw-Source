/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlyY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class IlIlF_
extends PacketWrapper<IlIlF_> {
    private ResourceLocation IlIll;
    private IlIlAn IlIlb;
    private float IlIlA;
    private float IlIlx;
    private static final long b = IlIls.a(-3240703098246273760L, -5041342426113325871L, MethodHandles.lookup().lookupClass()).a(261036733060609L);
    private static transient /* synthetic */ String zJBeXMjFHS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlF_(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlF_(IlIlAn ilIlAn) {
        this(ilIlAn, 0.0f);
    }

    public IlIlF_(IlIlAn ilIlAn, float f) {
        this(IlIlyY.IlIlL, ilIlAn, f, 0.0f);
    }

    public IlIlF_(ResourceLocation resourceLocation, IlIlAn ilIlAn, float f, float f2) {
        super(IlIlAG.SPAWN_POSITION);
        this.IlIll = resourceLocation;
        this.IlIlb = ilIlAn;
        this.IlIlA = f;
        this.IlIlx = f2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        block10: {
            block9: {
                block8: {
                    var1_1 = IlIlF_.b ^ 91586458830820L;
                    var3_2 = IlIlFh.IlIla();
                    v0 = this;
                    if (var3_2 != null) {
                        if (v0.IlIlg.IlIlz(ServerVersion.V_1_21_9)) {
                            this.IlIll = ResourceLocation.read(this);
                        }
                        v0 = this;
                    }
                    v1 = this;
                    if (var3_2 == null) ** GOTO lbl12
                    if (v1.IlIlg.IlIlz(ServerVersion.V_1_8)) {
                        v1 = this;
lbl12:
                        // 2 sources

                        v2 = v1.IlIlE();
                    } else {
                        v2 = new IlIlAn(this.IlIlW(), this.IlIlW(), this.IlIlW());
                    }
                    v0.IlIlb = v2;
                    v3 = this.IlIlg.IlIlz(ServerVersion.V_1_17);
                    if (var3_2 == null) break block8;
                    if (v3) {
                        this.IlIlA = this.IlIlX();
                    }
                    v4 = this;
                    if (var3_2 == null) break block9;
                    v3 = v4.IlIlg.IlIlz(ServerVersion.V_1_21_9);
                }
                if (!v3) break block10;
                v4 = this;
            }
            v4.IlIlx = this.IlIlX();
        }
    }

    @Override
    public void IlIlJ() {
        block14: {
            IlIlF_ ilIlF_;
            block13: {
                boolean bl;
                block12: {
                    PacketWrapper[] packetWrapperArray;
                    block11: {
                        IlIlF_ ilIlF_2;
                        block9: {
                            block10: {
                                boolean bl2;
                                block8: {
                                    long l = b ^ 0x4A315FB1794CL;
                                    packetWrapperArray = IlIlFh.IlIla();
                                    bl2 = this.IlIlg.IlIlz(ServerVersion.V_1_21_9);
                                    if (packetWrapperArray == null) break block8;
                                    if (bl2) {
                                        ResourceLocation.write(this, this.IlIll);
                                    }
                                    ilIlF_2 = this;
                                    if (packetWrapperArray == null) break block9;
                                    bl2 = ilIlF_2.IlIlg.IlIlz(ServerVersion.V_1_8);
                                }
                                if (!bl2) break block10;
                                this.IlIlh(this.IlIlb);
                                if (packetWrapperArray != null) break block11;
                            }
                            this.IlIla(this.IlIlb.IlIlj);
                            this.IlIla(this.IlIlb.IlIlw);
                            ilIlF_2 = this;
                        }
                        ilIlF_2.IlIla(this.IlIlb.IlIlk);
                    }
                    bl = this.IlIlg.IlIlz(ServerVersion.V_1_17);
                    if (packetWrapperArray == null) break block12;
                    if (bl) {
                        this.IlIlR(this.IlIlA);
                    }
                    ilIlF_ = this;
                    if (packetWrapperArray == null) break block13;
                    bl = ilIlF_.IlIlg.IlIlz(ServerVersion.V_1_21_9);
                }
                if (!bl) break block14;
                ilIlF_ = this;
            }
            ilIlF_.IlIlR(this.IlIlx);
        }
    }

    public void IlIlH(IlIlF_ ilIlF_) {
        this.IlIll = ilIlF_.IlIll;
        this.IlIlb = ilIlF_.IlIlb;
        this.IlIlA = ilIlF_.IlIlA;
        this.IlIlx = ilIlF_.IlIlx;
    }

    public ResourceLocation IlIlQ() {
        return this.IlIll;
    }

    public void IlIlY(ResourceLocation resourceLocation) {
        this.IlIll = resourceLocation;
    }

    public IlIlAn IlIlc() {
        return this.IlIlb;
    }

    public void IlIlf(IlIlAn ilIlAn) {
        this.IlIlb = ilIlAn;
    }

    @Deprecated
    public Optional<Float> IlIlE() {
        return Optional.ofNullable(Float.valueOf(this.IlIlA));
    }

    @Deprecated
    public void IlIlN(float f) {
        this.IlIlA = f;
    }

    public float IlIlA() {
        return this.IlIlA;
    }

    public void IlIlu(float f) {
        this.IlIlA = f;
    }

    public float IlIlO() {
        return this.IlIlx;
    }

    public void IlIll(float f) {
        this.IlIlx = f;
    }
}

