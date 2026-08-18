/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.Parsers$Parser;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlq_ {
    public static final byte IlIlk;
    public static final byte IlIlv = 0;
    public static final byte IlIlm = 1;
    public static final byte IlIlX;
    public static final byte IlIl_;
    public static final byte IlIlW;
    public static final byte IlIlo;
    public static final byte IlIlr;
    public static final byte IlIlb;
    private byte IlIlJ;
    private List<Integer> IlIlA;
    private int IlIlK;
    private Optional<String> IlIlO;
    private Optional<Parsers$Parser> IlIlE;
    private Optional<List<Object>> IlIlt;
    private Optional<ResourceLocation> IlIlV;
    private static final long a;
    private static transient /* synthetic */ String VgJWueCjfA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlq_(byte by, List<Integer> list, int n, @Nullable String string, @Nullable Integer n2, @Nullable List<Object> list2, @Nullable ResourceLocation resourceLocation) {
        long l = a ^ 0x5FCC4E3140C3L;
        this(by, list, n, string, n2 == null ? null : IlIlxt.IlIlo(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE(), n2), list2, resourceLocation);
    }

    public IlIlq_(byte by, List<Integer> list, int n, @Nullable String string, @Nullable Parsers$Parser parsers$Parser, @Nullable List<Object> list2, @Nullable ResourceLocation resourceLocation) {
        this.IlIlJ = by;
        this.IlIlA = list;
        this.IlIlK = n;
        this.IlIlO = Optional.ofNullable(string);
        this.IlIlE = Optional.ofNullable(parsers$Parser);
        this.IlIlt = Optional.ofNullable(list2);
        this.IlIlV = Optional.ofNullable(resourceLocation);
    }

    public byte IlIls() {
        return this.IlIlJ;
    }

    public void IlIlk(byte by) {
        this.IlIlJ = by;
    }

    public List<Integer> IlIlR() {
        return this.IlIlA;
    }

    public void IlIlr(List<Integer> list) {
        this.IlIlA = list;
    }

    public int IlIlX() {
        return this.IlIlK;
    }

    public void IlIlO(int n) {
        this.IlIlK = n;
    }

    public Optional<String> IlIlA() {
        return this.IlIlO;
    }

    public void IlIlp(Optional<String> optional) {
        this.IlIlO = optional;
    }

    public Optional<Parsers$Parser> IlIlT() {
        return this.IlIlE;
    }

    public void IlIlM(Optional<Parsers$Parser> optional) {
        this.IlIlE = optional;
    }

    public Optional<Integer> IlIlx() {
        return this.IlIlE.map(parsers$Parser -> parsers$Parser.IlIlH(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE()));
    }

    public void IlIlI(Optional<Integer> optional) {
        this.IlIlE = optional.map(n -> IlIlxt.IlIlo(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE(), n));
    }

    public Optional<List<Object>> IlIla() {
        return this.IlIlt;
    }

    public void IlIlf(Optional<List<Object>> optional) {
        this.IlIlt = optional;
    }

    public Optional<ResourceLocation> IlIlm() {
        return this.IlIlV;
    }

    public void IlIls(Optional<ResourceLocation> optional) {
        this.IlIlV = optional;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IlIlq_.a = IlIls.a(-5452173219675741551L, -2543082033506372488L, MethodHandles.lookup().lookupClass()).a(36341780226670L);
                var1 = IlIlq_.a ^ 114850733411200L;
                var3_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var1 >>> 56);
                for (var4_2 = 1; var4_2 < 8; ++var4_2) {
                    v2 = v2;
                    v2[var4_2] = (byte)(var1 << var4_2 * 8 >>> 56);
                }
                var3_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[7];
                var6_4 = 0;
                var7_5 = "|\u00deo\u00cc\u0007\u00c4\n\u00e5\u0005\u00ecib\u00d4b\u00f2\u00e9\u009ao\u0015\u00f7\u0005<\u00a69\u00c4\u0083\u008f\u00b3\u009c3\u007fD\u0010h\u008a\u00a1\u0018\u0014%L";
                var8_6 = "|\u00deo\u00cc\u0007\u00c4\n\u00e5\u0005\u00ecib\u00d4b\u00f2\u00e9\u009ao\u0015\u00f7\u0005<\u00a69\u00c4\u0083\u008f\u00b3\u009c3\u007fD\u0010h\u008a\u00a1\u0018\u0014%L".length();
                var5_7 = 0;
                while (true) {
                    var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var6_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var5_7 < var8_6) ** continue;
                    var7_5 = "$\u00f4f\u00c5~\u00ca~Dpv\u0083\u00ee\u00e4\u00d3\u009d\u0083";
                    var8_6 = "$\u00f4f\u00c5~\u00ca~Dpv\u0083\u00ee\u00e4\u00d3\u009d\u0083".length();
                    var5_7 = 0;
                    while (true) {
                        var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var6_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var5_7 < var8_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var3_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        IlIlq_.IlIlW = (byte)var0_3[6];
        IlIlq_.IlIlb = (byte)var0_3[4];
        IlIlq_.IlIl_ = (byte)var0_3[3];
        IlIlq_.IlIlX = (byte)var0_3[5];
        IlIlq_.IlIlr = (byte)var0_3[1];
        IlIlq_.IlIlk = (byte)var0_3[0];
        IlIlq_.IlIlo = (byte)var0_3[2];
    }
}

