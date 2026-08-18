/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlLG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlfC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlQH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlQI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlQv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlTI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlWW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlqn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlxZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public class IlIlPF {
    public final IlIlWW IlIlp;
    public IlIlxZ IlIlC;
    public IlIlQv IlIle;
    private static int[] IlIld;
    private static final long a;
    private static final long b;
    private static transient /* synthetic */ String ccXdNxRNyy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlPF(IlIlxZ ilIlxZ, IlIlQv ilIlQv, IlIlWW ilIlWW) {
        this.IlIlC = ilIlxZ;
        this.IlIle = ilIlQv;
        this.IlIlp = ilIlWW;
    }

    @Deprecated
    public static IlIlPF IlIly() {
        return IlIlWW.CHUNK.IlIlF();
    }

    @Deprecated
    public static IlIlPF IlIlf() {
        return IlIlWW.BIOME.IlIlF();
    }

    @Deprecated
    public static IlIlPF IlIlj(IlIlWW ilIlWW) {
        return ilIlWW.IlIlF();
    }

    @Deprecated
    public static IlIlPF IlIlc(IlIlfC ilIlfC, IlIlWW ilIlWW) {
        return IlIlPF.IlIlj(ilIlfC, ilIlWW, true);
    }

    @Deprecated
    public static IlIlPF IlIlj(IlIlfC ilIlfC, IlIlWW ilIlWW, boolean bl) {
        return IlIlPF.IlIlz(ilIlfC, ilIlWW, bl, true);
    }

    @Deprecated
    public static IlIlPF IlIlz(IlIlfC ilIlfC, IlIlWW ilIlWW, boolean bl, boolean n) {
        IlIlQH ilIlQH;
        IlIlxZ ilIlxZ;
        block7: {
            int n2;
            block5: {
                block6: {
                    long l = a ^ 0x5D4934D3F800L;
                    byte by = ilIlfC.IlIl_();
                    ilIlxZ = IlIlPF.IlIlW(ilIlWW, by, ilIlfC, bl);
                    int[] nArray = IlIlPF.IlIlH();
                    n2 = ilIlxZ instanceof IlIlCa;
                    if (nArray == null) break block5;
                    if (n2 != 0) break block6;
                    long[] lArray = n != 0 ? ilIlfC.IlIlg(ilIlfC.IlIlO()) : null;
                    ilIlQH = new IlIlQH(by, ilIlWW.IlIlq(), lArray);
                    int n3 = n;
                    if (nArray != null && n3 == 0) {
                        n3 = ilIlfC.IlIlO(ilIlQH.IlIl_());
                    }
                    if (nArray != null) break block7;
                }
                n2 = n;
            }
            if (n2 != 0) {
                ilIlfC.IlIlg(ilIlfC.IlIlO());
            }
            ilIlQH = null;
        }
        return new IlIlPF(ilIlxZ, ilIlQH, ilIlWW);
    }

    @Deprecated
    public static void IlIlA(IlIlLG ilIlLG, IlIlPF ilIlPF) {
        IlIlPF.IlIlb(ilIlLG, ilIlPF, true);
    }

    @Deprecated
    public static void IlIlb(IlIlLG ilIlLG, IlIlPF ilIlPF, boolean bl) {
        IlIlPF ilIlPF2;
        int[] nArray;
        block14: {
            boolean bl2;
            block10: {
                block11: {
                    block13: {
                        int n;
                        IlIlLG ilIlLG2;
                        block12: {
                            long l = a ^ 0x25C2B86133E3L;
                            nArray = IlIlPF.IlIlH();
                            bl2 = ilIlPF.IlIlC instanceof IlIlCa;
                            if (nArray == null) break block10;
                            if (!bl2) break block11;
                            ilIlLG.IlIlO(0);
                            ilIlLG2 = ilIlLG;
                            n = ilIlPF.IlIlC.IlIlT(0);
                            if (nArray == null) break block12;
                            ilIlLG2.IlIlN(n);
                            if (!bl) break block13;
                            ilIlLG2 = ilIlLG;
                            n = 0;
                        }
                        ilIlLG2.IlIlN(n);
                    }
                    return;
                }
                ilIlLG.IlIlO(ilIlPF.IlIle.IlIlU());
                ilIlPF2 = ilIlPF;
                if (nArray == null) break block14;
                bl2 = ilIlPF2.IlIlC instanceof IlIlTI;
            }
            if (!bl2) {
                int n = ilIlPF.IlIlC.IlIlp();
                ilIlLG.IlIlN(n);
                for (int i = 0; i < n; ++i) {
                    ilIlLG.IlIlN(ilIlPF.IlIlC.IlIlT(i));
                    if (nArray != null) continue;
                }
            }
            ilIlPF2 = ilIlPF;
        }
        long[] lArray = ilIlPF2.IlIle.IlIl_();
        if (nArray != null) {
            if (bl) {
                ilIlLG.IlIlN(lArray.length);
            }
            ilIlLG.IlIlM(lArray);
        }
    }

    @Deprecated
    public static IlIlPF IlIlB(IlIlfC ilIlfC) {
        long l = a ^ 0x280986D8E1FCL;
        int n = Math.max(4, ilIlfC.IlIl_() & (int)b);
        IlIlxZ ilIlxZ = IlIlPF.IlIlW(IlIlWW.CHUNK, n, ilIlfC, false);
        IlIlQI ilIlQI = new IlIlQI(n, ilIlfC.IlIlg(ilIlfC.IlIlO()));
        return new IlIlPF(ilIlxZ, ilIlQI, IlIlWW.CHUNK);
    }

    public int IlIlV(int n, int n2, int n3) {
        long l = a ^ 0xB9148F1256AL;
        int[] nArray = IlIlPF.IlIlH();
        IlIlPF ilIlPF = this;
        if (nArray != null) {
            if (ilIlPF.IlIle != null) {
                int n4 = this.IlIle.IlIlo(IlIlPF.IlIlS(this.IlIlp, n, n2, n3));
                return this.IlIlC.IlIlT(n4);
            }
            ilIlPF = this;
        }
        return ilIlPF.IlIlC.IlIlT(0);
    }

    public int IlIlC(int n, int n2, int n3, int n4) {
        block7: {
            IlIlPF ilIlPF;
            int n5;
            block6: {
                int[] nArray;
                block5: {
                    int n6;
                    block4: {
                        long l = a ^ 0x2811F8EE8067L;
                        n5 = this.IlIlC.IlIlQ(n4);
                        nArray = IlIlPF.IlIlH();
                        n6 = n5;
                        if (nArray == null) break block4;
                        if (n6 != -1) break block5;
                        this.IlIld();
                        n6 = this.IlIlC.IlIlQ(n4);
                    }
                    n5 = n6;
                }
                ilIlPF = this;
                if (nArray == null) break block6;
                if (ilIlPF.IlIle == null) break block7;
                ilIlPF = this;
            }
            int n7 = IlIlPF.IlIlS(ilIlPF.IlIlp, n, n2, n3);
            int n8 = this.IlIle.IlIlo(n7);
            this.IlIle.IlIlr(n7, n5);
            return n8;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    @Deprecated
    private static IlIlxZ IlIlW(IlIlWW var0, int var1_1, IlIlfC var2_2, boolean var3_3) {
        var4_4 = IlIlPF.a ^ 18291508321012L;
        var6_5 = IlIlPF.IlIlH();
        v0 = var1_1;
        if (var6_5 != null) {
            if (v0 == 0) {
                v0 = (int)var3_3;
                if (var6_5 != null) {
                    if (v0 != 0) {
                        return new IlIlCa(var2_2);
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1;
            }
        }
        v1 = var0.IlIlc();
        if (var6_5 != null) {
            if (v0 <= v1) {
                v2 = var0.IlIlv();
                if (var6_5 != null) {
                    v2 = v2 != 0 ? var0.IlIlc() : var1_1;
                }
                var7_6 = v2;
                return new IlIlqn(var7_6, var2_2);
            }
            v0 = var1_1;
            v1 = var0.IlIlV();
        }
        if (v0 <= v1) {
            return new IlIlS(var1_1, var2_2);
        }
        return IlIlTI.IlIlz;
    }

    /*
     * Unable to fully structure code
     */
    private void IlIld() {
        block8: {
            block9: {
                block10: {
                    var1_1 = IlIlPF.a ^ 128707452800153L;
                    var4_2 = this.IlIlC;
                    var3_3 = IlIlPF.IlIlH();
                    v0 = var5_4 = this.IlIle;
                    if (var3_3 == null) ** GOTO lbl8
                    if (v0 != null) {
                        v0 = var5_4;
lbl8:
                        // 2 sources

                        v1 = v0.IlIlU();
                    } else {
                        v1 = 0;
                    }
                    var6_5 = v1;
                    this.IlIlC = IlIlPF.IlIlf(var6_5 + 1, this.IlIlp);
                    v2 = this;
                    if (var3_3 == null) break block9;
                    v2.IlIle = new IlIlQH(this.IlIlC.IlIlo(), this.IlIlp.IlIlq());
                    if (var5_4 == null) break block10;
                    var8_7 = this.IlIlp.IlIlq();
                    for (var7_6 = 0; var7_6 < var8_7; ++var7_6) {
                        this.IlIle.IlIlr(var7_6, this.IlIlC.IlIlQ(var4_2.IlIlT(var5_4.IlIlo(var7_6))));
                        if (var3_3 != null) {
                            if (var3_3 != null) continue;
                        }
                        break block8;
                    }
                    if (var3_3 != null) break block8;
                }
                v2 = this;
            }
            v2.IlIlC.IlIlQ(var4_2.IlIlT(0));
        }
    }

    private static IlIlxZ IlIlf(int n, IlIlWW ilIlWW) {
        long l = a ^ 0xA16F3751E99L;
        int[] nArray = IlIlPF.IlIlH();
        int n2 = n;
        int n3 = ilIlWW.IlIlc();
        if (nArray != null) {
            if (n2 <= n3) {
                int n4 = ilIlWW.IlIlv();
                if (nArray != null) {
                    n4 = n4 != 0 ? ilIlWW.IlIlc() : n;
                }
                int n5 = n4;
                return new IlIlqn(n5);
            }
            n2 = n;
            n3 = ilIlWW.IlIlV();
        }
        if (n2 <= n3) {
            return new IlIlS(n);
        }
        return IlIlTI.IlIlz;
    }

    private static int IlIlS(IlIlWW ilIlWW, int n, int n2, int n3) {
        return (n2 << ilIlWW.IlIlP() | n3) << ilIlWW.IlIlP() | n;
    }

    public static void IlIlI(int[] nArray) {
        IlIld = nArray;
    }

    public static int[] IlIlH() {
        return IlIld;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a(1071572161106111136L, 501054701106524472L, MethodHandles.lookup().lookupClass()).a(53847044640662L);
        long l = a ^ 0x37B348AF547EL;
        IlIlPF.IlIlI(new int[4]);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7445217947850657222L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

