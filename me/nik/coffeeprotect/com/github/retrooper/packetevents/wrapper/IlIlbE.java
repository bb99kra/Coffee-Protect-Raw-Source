/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIliP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbE
extends PacketWrapper<IlIlbE> {
    private boolean IlIlA;
    private boolean IlIlM;
    private IlIliP IlIlc;
    private boolean IlIln;
    private boolean IlIll;
    private static final long b = IlIls.a(-8071125979818011991L, -4848100154134063116L, MethodHandles.lookup().lookupClass()).a(38983381486751L);
    private static transient /* synthetic */ String TjembubKae = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    public IlIlbE(PacketReceiveEvent var1_1) {
        block5: {
            block4: {
                var2_2 = IlIlbE.b ^ 70111869622054L;
                v0 = IlIlJH.IlIlw();
                super(var1_1, false);
                var4_3 = v0;
                v1 = var1_1.getPacketType();
                v2 = IlIlnN.PLAYER_POSITION;
                if (var4_3 != null) break block4;
                if (v1 == v2) ** GOTO lbl-1000
                v1 = var1_1.getPacketType();
                v2 = IlIlnN.PLAYER_POSITION_AND_ROTATION;
            }
            if (v1 == v2) lbl-1000:
            // 2 sources

            {
                v3 = true;
            } else {
                v3 = false;
            }
            this.IlIlA = v3;
            v4 = var1_1.getPacketType();
            v5 = IlIlnN.PLAYER_ROTATION;
            if (var4_3 != null) break block5;
            if (v4 == v5) ** GOTO lbl-1000
            v4 = var1_1.getPacketType();
            v5 = IlIlnN.PLAYER_POSITION_AND_ROTATION;
        }
        if (v4 == v5) lbl-1000:
        // 2 sources

        {
            v6 = true;
        } else {
            v6 = false;
        }
        this.IlIlM = v6;
        this.IlIlc(var1_1);
    }

    public IlIlbE(boolean bl, boolean bl2, boolean bl3, IlIliP ilIliP) {
        this(bl, bl2, bl3, false, ilIliP);
    }

    public IlIlbE(boolean bl, boolean bl2, boolean bl3, boolean bl4, IlIliP ilIliP) {
        long l = b ^ 0x1559C3C6C87L;
        super(bl && bl2 ? IlIlnN.PLAYER_POSITION_AND_ROTATION : (bl ? IlIlnN.PLAYER_POSITION : (bl2 ? IlIlnN.PLAYER_ROTATION : IlIlnN.PLAYER_FLYING)));
        this.IlIlA = bl;
        this.IlIlM = bl2;
        this.IlIln = bl3;
        this.IlIll = bl4;
        this.IlIlc = ilIliP;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IlIlM(IlIloL ilIloL) {
        long l = b ^ 0x45F77EF2B774L;
        String string = IlIlJH.IlIlw();
        IlIloL ilIloL2 = ilIloL;
        IlIlnN ilIlnN = IlIlnN.PLAYER_FLYING;
        if (string == null) {
            if (ilIloL2 == ilIlnN) return true;
            ilIloL2 = ilIloL;
            ilIlnN = IlIlnN.PLAYER_POSITION;
        }
        if (string == null) {
            if (ilIloL2 == ilIlnN) return true;
            ilIloL2 = ilIloL;
            ilIlnN = IlIlnN.PLAYER_ROTATION;
        }
        if (string == null) {
            if (ilIloL2 == ilIlnN) return true;
            ilIloL2 = ilIloL;
            ilIlnN = IlIlnN.PLAYER_POSITION_AND_ROTATION;
        }
        if (ilIloL2 != ilIlnN) return false;
        return true;
    }

    @Override
    public void IlIle() {
        long l = b ^ 0x3F8A1085C887L;
        IlIlv_ ilIlv_ = new IlIlv_();
        String string = IlIlJH.IlIlw();
        float f = 0.0f;
        float f2 = 0.0f;
        byte by = this.IlIlA;
        if (string == null) {
            if (by != 0) {
                double d;
                double d2 = this.IlIlb();
                double d3 = this.IlIlb();
                IlIlbE ilIlbE = this;
                if (string == null) {
                    if (ilIlbE.IlIlg.IlIlS(ServerVersion.V_1_7_10)) {
                        d = this.IlIlb();
                    }
                    ilIlbE = this;
                }
                d = ilIlbE.IlIlb();
                ilIlv_ = new IlIlv_(d2, d3, d);
            }
            by = this.IlIlM;
        }
        if (string == null) {
            if (by != 0) {
                f = this.IlIlX();
                f2 = this.IlIlX();
            }
            this.IlIlc = new IlIliP(ilIlv_, f, f2);
            by = this.IlIlE();
        }
        byte by2 = by;
        boolean bl = by2 & true;
        if (string == null) {
            bl = bl;
        }
        this.IlIln = bl;
        int n = by2 & 2;
        if (string == null) {
            n = n == 2 ? 1 : 0;
        }
        this.IlIll = n;
    }

    @Override
    public void IlIlJ() {
        IlIlbE ilIlbE;
        String string;
        block10: {
            boolean bl;
            block9: {
                long l = b ^ 0x26F76D6CF62FL;
                string = IlIlJH.IlIlw();
                bl = this.IlIlA;
                if (string != null) break block9;
                if (bl) {
                    this.IlIlY(this.IlIlc.IlIln().IlIll());
                    IlIlbE ilIlbE2 = this;
                    if (string == null) {
                        if (ilIlbE2.IlIlg.IlIlS(ServerVersion.V_1_7_10)) {
                            this.IlIlY(this.IlIlc.IlIln().IlIlk() + 1.62);
                        }
                        this.IlIlY(this.IlIlc.IlIln().IlIlk());
                        ilIlbE2 = this;
                    }
                    ilIlbE2.IlIlY(this.IlIlc.IlIln().IlIlY());
                }
                ilIlbE = this;
                if (string != null) break block10;
                bl = ilIlbE.IlIlM;
            }
            if (bl) {
                this.IlIlR(this.IlIlc.IlIlH());
                this.IlIlR(this.IlIlc.IlIlP());
            }
            ilIlbE = this;
        }
        int n = this.IlIln;
        if (string == null) {
            n = n != 0 ? 1 : 0;
        }
        int n2 = this.IlIll;
        if (string == null) {
            n2 = n2 != 0 ? 2 : 0;
        }
        ilIlbE.IlIlu(n | n2);
    }

    public void IlIlz(IlIlbE ilIlbE) {
        this.IlIlA = ilIlbE.IlIlA;
        this.IlIlM = ilIlbE.IlIlM;
        this.IlIlc = ilIlbE.IlIlc;
        this.IlIln = ilIlbE.IlIln;
        this.IlIll = ilIlbE.IlIll;
    }

    public IlIliP IlIlP() {
        return this.IlIlc;
    }

    public void IlIlI(IlIliP ilIliP) {
        this.IlIlc = ilIliP;
    }

    public boolean IlIlo() {
        return this.IlIlA;
    }

    public void IlIlz(boolean bl) {
        this.IlIlA = bl;
    }

    public boolean IlIlz() {
        return this.IlIlM;
    }

    public void IlIlm(boolean bl) {
        this.IlIlM = bl;
    }

    public boolean IlIlD() {
        return this.IlIln;
    }

    public void IlIlU(boolean bl) {
        this.IlIln = bl;
    }

    public boolean IlIlr() {
        return this.IlIll;
    }

    public void IlIlk(boolean bl) {
        this.IlIll = bl;
    }
}

