/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlLG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlLh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlfC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlfm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlPF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlWW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.IlIld_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@NullMarked
public class IlIlZq
implements IlIlCV {
    private final ClientVersion IlIlv;
    private int IlIlx;
    private int IlIlZ;
    private final IlIlPF IlIle;
    private final IlIlPF IlIl_;
    private static String IlIlG;
    private static final long b;
    private static transient /* synthetic */ String vCjbxluKgU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Deprecated
    public IlIlZq() {
        this(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE());
    }

    public IlIlZq(ClientVersion clientVersion) {
        this.IlIlv = clientVersion;
        this.IlIle = IlIlWW.CHUNK.IlIlF();
        this.IlIl_ = IlIlWW.BIOME.IlIlF();
    }

    @Deprecated
    @ApiStatus.Obsolete
    public IlIlZq(int n, IlIlPF ilIlPF, IlIlPF ilIlPF2) {
        this(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE(), n, 0, ilIlPF, ilIlPF2);
    }

    @Deprecated
    public IlIlZq(int n, int n2, IlIlPF ilIlPF, IlIlPF ilIlPF2) {
        this(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE(), n, n2, ilIlPF, ilIlPF2);
    }

    @ApiStatus.Obsolete
    public IlIlZq(ClientVersion clientVersion, int n, IlIlPF ilIlPF, IlIlPF ilIlPF2) {
        this(clientVersion, n, 0, ilIlPF, ilIlPF2);
    }

    public IlIlZq(ClientVersion clientVersion, int n, int n2, IlIlPF ilIlPF, IlIlPF ilIlPF2) {
        this.IlIlv = clientVersion;
        this.IlIlx = n;
        this.IlIlZ = n2;
        this.IlIle = ilIlPF;
        this.IlIl_ = ilIlPF2;
    }

    public static IlIlZq IlIlc(PacketWrapper<?> packetWrapper) {
        ClientVersion clientVersion = packetWrapper.IlIlw().IlIlE();
        boolean bl = clientVersion.IlIlO(ClientVersion.V_1_21_5);
        boolean bl2 = clientVersion.IlIlw(ClientVersion.V_26_1);
        return IlIlZq.IlIly(clientVersion, new IlIlfm(packetWrapper), bl, bl2);
    }

    @Deprecated
    public static IlIlZq IlIlX(IlIlfC ilIlfC) {
        return IlIlZq.IlIlZ(ilIlfC, true);
    }

    @Deprecated
    public static IlIlZq IlIlZ(IlIlfC ilIlfC, boolean bl) {
        return IlIlZq.IlIlS(ilIlfC, bl, false);
    }

    @Deprecated
    public static IlIlZq IlIlS(IlIlfC ilIlfC, boolean bl, boolean bl2) {
        return IlIlZq.IlIly(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE(), ilIlfC, bl, bl2);
    }

    @Deprecated
    public static IlIlZq IlIly(ClientVersion clientVersion, IlIlfC ilIlfC, boolean bl, boolean s) {
        long l = b ^ 0x2DD84C8E7203L;
        short s2 = ilIlfC.IlIlV();
        String string = IlIlZq.IlIle();
        short s3 = s;
        if (string != null) {
            s3 = s3 != 0 ? ilIlfC.IlIlV() : (short)0;
        }
        short s4 = s3;
        IlIlPF ilIlPF = IlIlPF.IlIlz(ilIlfC, IlIlWW.CHUNK, true, bl);
        IlIlPF ilIlPF2 = IlIlPF.IlIlz(ilIlfC, IlIlWW.BIOME, true, bl);
        IlIlZq ilIlZq = new IlIlZq(clientVersion, s2, s4, ilIlPF, ilIlPF2);
        if (string == null) {
            PacketWrapper.IlIle(new int[5]);
        }
        return ilIlZq;
    }

    public static void IlIlx(PacketWrapper<?> packetWrapper, IlIlZq ilIlZq) {
        boolean bl = packetWrapper.IlIlw().IlIlC(ServerVersion.V_1_21_5);
        boolean bl2 = packetWrapper.IlIlw().IlIlz(ServerVersion.V_26_1);
        IlIlZq.IlIli(new IlIlLh(packetWrapper), ilIlZq, bl, bl2);
    }

    @Deprecated
    public static void IlIlv(IlIlLG ilIlLG, IlIlZq ilIlZq) {
        IlIlZq.IlIlA(ilIlLG, ilIlZq, true);
    }

    @Deprecated
    public static void IlIlA(IlIlLG ilIlLG, IlIlZq ilIlZq, boolean bl) {
        IlIlZq.IlIli(ilIlLG, ilIlZq, bl, false);
    }

    @Deprecated
    public static void IlIli(IlIlLG ilIlLG, IlIlZq ilIlZq, boolean bl, boolean bl2) {
        long l = b ^ 0x5CC63E77460BL;
        String string = IlIlZq.IlIle();
        ilIlLG.IlIlS(ilIlZq.IlIlx);
        String string2 = string;
        if (string2 != null) {
            if (bl2) {
                ilIlLG.IlIlS(ilIlZq.IlIlZ);
            }
            IlIlPF.IlIlb(ilIlLG, ilIlZq.IlIle, bl);
            IlIlPF.IlIlb(ilIlLG, ilIlZq.IlIl_, bl);
        }
    }

    @Override
    public int IlIly(int n, int n2, int n3) {
        return this.IlIle.IlIlV(n, n2, n3);
    }

    @Override
    public void IlIlk(int n, int n2, int n3, IlIld_ ilIld_) {
        block14: {
            boolean bl;
            block15: {
                block16: {
                    String string;
                    block13: {
                        IlIld_ ilIld_2;
                        block11: {
                            block12: {
                                block9: {
                                    block10: {
                                        long l = b ^ 0x1F629EDD5F55L;
                                        int n4 = this.IlIle.IlIlC(n, n2, n3, ilIld_.IlIls());
                                        ilIld_2 = IlIld_.IlIlW(this.IlIlv, n4);
                                        string = IlIlZq.IlIle();
                                        bl = ilIld_2.IlIlf().IlIlM();
                                        if (string == null) break block9;
                                        if (!bl) break block10;
                                        bl = ilIld_.IlIlf().IlIlM();
                                        if (string == null) break block11;
                                        if (bl) break block12;
                                        ++this.IlIlx;
                                        if (string != null) break block12;
                                    }
                                    bl = ilIld_.IlIlf().IlIlM();
                                }
                                if (string == null) break block11;
                                if (bl) {
                                    --this.IlIlx;
                                }
                            }
                            bl = this.IlIlv.IlIlw(ClientVersion.V_26_1);
                        }
                        if (string == null) break block13;
                        if (!bl) break block14;
                        bl = ilIld_2.IlIlx();
                    }
                    if (string == null) break block15;
                    if (bl) break block16;
                    if (!ilIld_.IlIlx()) break block14;
                    ++this.IlIlZ;
                    if (string != null) break block14;
                }
                bl = ilIld_.IlIlx();
            }
            if (!bl) {
                --this.IlIlZ;
            }
        }
        if (PacketWrapper.IlIlz() == null) {
            IlIlZq.IlIlr("CRknwb");
        }
    }

    @Override
    public void IlIlA(int n, int n2, int n3, int n4) {
        this.IlIlk(n, n2, n3, IlIld_.IlIlW(this.IlIlv, n4));
    }

    @Override
    public void IlIlA(ClientVersion clientVersion, int n, int n2, int n3, int n4) {
        this.IlIlk(n, n2, n3, IlIld_.IlIlW(clientVersion, n4));
    }

    @Override
    public boolean IlIlq() {
        long l = b ^ 0x6C4C0B6795A1L;
        String string = IlIlZq.IlIle();
        boolean bl = this.IlIlx;
        if (string != null) {
            bl = !bl;
        }
        return bl;
    }

    public int IlIlh() {
        return this.IlIlx;
    }

    public void IlIlw(int n) {
        this.IlIlx = n;
    }

    public int IlIlj() {
        return this.IlIlZ;
    }

    public void IlIlZ(int n) {
        this.IlIlZ = n;
    }

    public IlIlPF IlIlq() {
        return this.IlIle;
    }

    public IlIlPF IlIlV() {
        return this.IlIl_;
    }

    public static void IlIlr(String string) {
        IlIlG = string;
    }

    public static String IlIle() {
        return IlIlG;
    }

    static {
        b = IlIls.a(-2548825872651694355L, -7491716779081937752L, MethodHandles.lookup().lookupClass()).a(13388958774463L);
        if (IlIlZq.IlIle() == null) {
            IlIlZq.IlIlr("vivHGb");
        }
    }
}

