/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlyv;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Unmodifiable;
import me.nik.coffeeprotect.libs.kyori.adventure.util.MonkeyBars;

public final class IlIlAz
extends Enum<IlIlAz> {
    public static final /* enum */ IlIlAz COLOR;
    public static final /* enum */ IlIlAz SHADOW_COLOR;
    public static final /* enum */ IlIlAz DECORATIONS;
    public static final /* enum */ IlIlAz EVENTS;
    public static final /* enum */ IlIlAz INSERTION;
    public static final /* enum */ IlIlAz FONT;
    static final Set<IlIlAz> IlIl_;
    static final Set<IlIlAz> IlIlt;
    private static final IlIlAz[] IlIln;
    private static final long a;
    private static final long b;

    public static IlIlAz[] values() {
        return (IlIlAz[])IlIln.clone();
    }

    public static IlIlAz valueOf(String string) {
        return Enum.valueOf(IlIlAz.class, string);
    }

    public static @Unmodifiable @NotNull Set<IlIlAz> IlIlT() {
        return IlIl_;
    }

    public static @Unmodifiable @NotNull Set<IlIlAz> IlIlH() {
        return IlIlt;
    }

    public static @Unmodifiable @NotNull Set<IlIlAz> IlIlR(IlIlAz ... ilIlAzArray) {
        return MonkeyBars.enumSet(IlIlAz.class, (Enum[])ilIlAzArray);
    }

    @Deprecated
    @ApiStatus.ScheduledForRemoval(inVersion="5.0.0")
    public static @Unmodifiable @NotNull Set<IlIlAz> IlIlf(IlIlAz ... ilIlAzArray) {
        return MonkeyBars.enumSet(IlIlAz.class, (Enum[])ilIlAzArray);
    }

    static boolean IlIlN(@NotNull Set<IlIlAz> set) {
        long l = a ^ 0x485C098B2862L;
        String[] stringArray = IlIlyv.IlIlg();
        int n = set.size();
        if (stringArray == null) {
            n = n == IlIl_.size() ? 1 : 0;
        }
        return n != 0;
    }

    private static IlIlAz[] IlIlY() {
        long l = a ^ 0x23F2AA619173L;
        IlIlAz[] ilIlAzArray = new IlIlAz[(int)b];
        ilIlAzArray[0] = COLOR;
        ilIlAzArray[1] = SHADOW_COLOR;
        ilIlAzArray[2] = DECORATIONS;
        ilIlAzArray[3] = EVENTS;
        ilIlAzArray[4] = INSERTION;
        ilIlAzArray[5] = FONT;
        return ilIlAzArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    IlIlAz.a = IlIls.a(-1661024763578843616L, -4997695923851133676L, MethodHandles.lookup().lookupClass()).a(218501703919617L);
                    var14 = IlIlAz.a ^ 67993843302305L;
                    var6_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var7_2 = 1; var7_2 < 8; ++var7_2) {
                        v2 = v2;
                        v2[var7_2] = (byte)(var14 << var7_2 * 8 >>> 56);
                    }
                    var6_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var5_3 = new String[6];
                    var11_4 = 0;
                    var10_5 = "D\u0019U\u0086\u00e1\u00f5[\u0006\u0010\u00a9@fE\u001d\u0006\u00ec\u00e3?\u00a4\u0015\u0096\u008a\u00c6\u00cc\u0012\b\u00fczb\u008a\u00a7h\u00f3\u001a\u0010\u00d1V\u007f\u00f7\u0085\u001e\u0087\u00c6\u009a\u00c2\u00c0!\r\u007fwT";
                    var12_6 = "D\u0019U\u0086\u00e1\u00f5[\u0006\u0010\u00a9@fE\u001d\u0006\u00ec\u00e3?\u00a4\u0015\u0096\u008a\u00c6\u00cc\u0012\b\u00fczb\u008a\u00a7h\u00f3\u001a\u0010\u00d1V\u007f\u00f7\u0085\u001e\u0087\u00c6\u009a\u00c2\u00c0!\r\u007fwT".length();
                    var9_7 = 8;
                    var8_8 = -1;
lbl19:
                    // 2 sources

                    while (true) {
                        v3 = ++var8_8;
                        v4 = var10_5.substring(v3, v3 + var9_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = IlIlAz.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = "\u008b\u00da\u0089b\u00044&\u00fe\u0010\u000b\u009e\u00ca\u00f3;`/\u0003$?\r\u0084i0\u00f0\u00f8";
                        var12_6 = "\u008b\u00da\u0089b\u00044&\u00fe\u0010\u000b\u009e\u00ca\u00f3;`/\u0003$?\r\u0084i0\u00f0\u00f8".length();
                        var9_7 = 8;
                        var8_8 = -1;
lbl33:
                        // 2 sources

                        while (true) {
                            v6 = ++var8_8;
                            v4 = var10_5.substring(v6, v6 + var9_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = IlIlAz.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var13_9 = var6_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl50:
                    // 1 sources

                    ** continue;
                }
            }
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var14 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl62:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -7289553388850391913L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        IlIlAz.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        IlIlAz.COLOR = new IlIlAz();
        IlIlAz.SHADOW_COLOR = new IlIlAz();
        IlIlAz.DECORATIONS = new IlIlAz();
        IlIlAz.EVENTS = new IlIlAz();
        IlIlAz.INSERTION = new IlIlAz();
        IlIlAz.FONT = new IlIlAz();
        IlIlAz.IlIln = IlIlAz.IlIlY();
        IlIlAz.IlIl_ = IlIlAz.IlIlR(IlIlAz.values());
        IlIlAz.IlIlt = IlIlAz.IlIlR(new IlIlAz[]{IlIlAz.COLOR, IlIlAz.DECORATIONS});
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}

