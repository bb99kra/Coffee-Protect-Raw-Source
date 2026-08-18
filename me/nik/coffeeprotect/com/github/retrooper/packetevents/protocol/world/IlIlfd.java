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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public final class IlIlfd
extends Enum<IlIlfd> {
    public static final /* enum */ IlIlfd PEACEFUL;
    public static final /* enum */ IlIlfd EASY;
    public static final /* enum */ IlIlfd NORMAL;
    public static final /* enum */ IlIlfd HARD;
    private static final IlIlfd[] IlIle;
    private static final /* synthetic */ IlIlfd[] IlIlh;

    public static IlIlfd[] values() {
        return (IlIlfd[])IlIlh.clone();
    }

    public static IlIlfd valueOf(String string) {
        return Enum.valueOf(IlIlfd.class, string);
    }

    public int IlIlM() {
        return this.ordinal();
    }

    public static IlIlfd IlIlB(int n) {
        return IlIle[n];
    }

    private static /* synthetic */ IlIlfd[] IlIlu() {
        return new IlIlfd[]{PEACEFUL, EASY, NORMAL, HARD};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = IlIls.a(8968554045477094725L, -8411122767583060484L, MethodHandles.lookup().lookupClass()).a(35474842430928L) ^ 82502415752602L;
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
                var5_5 = "w:\u0099<Y\u0018,T\bW\u00c9l\u009a\u00e8\u0010\u00a1[";
                var7_6 = "w:\u0099<Y\u0018,T\bW\u00c9l\u009a\u00e8\u0010\u00a1[".length();
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
                    var0_3[var6_4++] = IlIlfd.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00b6\u00db:;L\u00aa\u00be'r\u00ff\u0088\u0003^/dC\b\u00ea6k\u00e5H1\u0080\u001d";
                    var7_6 = "\u00b6\u00db:;L\u00aa\u00be'r\u00ff\u0088\u0003^/dC\b\u00ea6k\u00e5H1\u0080\u001d".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = IlIlfd.a(var8_9).intern();
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
        IlIlfd.PEACEFUL = new IlIlfd();
        IlIlfd.EASY = new IlIlfd();
        IlIlfd.NORMAL = new IlIlfd();
        IlIlfd.HARD = new IlIlfd();
        IlIlfd.IlIlh = IlIlfd.IlIlu();
        IlIlfd.IlIle = IlIlfd.values();
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

