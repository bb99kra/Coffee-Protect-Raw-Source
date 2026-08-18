/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public final class IlIll
extends Enum<IlIll> {
    public static final /* enum */ IlIll BOTTOM;
    public static final /* enum */ IlIll LOWER;
    public static final /* enum */ IlIll TOP;
    public static final /* enum */ IlIll UPPER;
    private static final /* synthetic */ IlIll[] IlIlk;

    public static IlIll[] values() {
        return (IlIll[])IlIlk.clone();
    }

    public static IlIll valueOf(String string) {
        return Enum.valueOf(IlIll.class, string);
    }

    private static /* synthetic */ IlIll[] IlIlO() {
        return new IlIll[]{BOTTOM, LOWER, TOP, UPPER};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = IlIls.a(4594139121248454488L, -4738241060936274799L, MethodHandles.lookup().lookupClass()).a(112697017410932L) ^ 73465819912501L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "\u00f7-\u00b1\u00f5\u0018\u00cf H\b\u001b\t\u0012HSK>i";
                var7_6 = "\u00f7-\u00b1\u00f5\u0018\u00cf H\b\u001b\t\u0012HSK>i".length();
                var4_7 = 8;
                var3_8 = -1;
lbl18:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = IlIll.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00c3M\u00be\u0017\u00d5\u000b\u00b8\u00e2\br\u0005\u00fchy\u0083\u00c7n";
                    var7_6 = "\u00c3M\u00be\u0017\u00d5\u000b\u00b8\u00e2\br\u0005\u00fchy\u0083\u00c7n".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = IlIll.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl49:
                // 1 sources

                ** continue;
            }
        }
        IlIll.BOTTOM = new IlIll();
        IlIll.LOWER = new IlIll();
        IlIll.TOP = new IlIll();
        IlIll.UPPER = new IlIll();
        IlIll.IlIlk = IlIll.IlIlO();
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

