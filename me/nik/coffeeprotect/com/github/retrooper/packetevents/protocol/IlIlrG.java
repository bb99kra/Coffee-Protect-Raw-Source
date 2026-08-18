/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public final class IlIlrG
extends Enum<IlIlrG> {
    public static final /* enum */ IlIlrG UNKNOWN;
    private static final /* synthetic */ IlIlrG[] IlIlz;

    public static IlIlrG[] values() {
        return (IlIlrG[])IlIlz.clone();
    }

    public static IlIlrG valueOf(String string) {
        return Enum.valueOf(IlIlrG.class, string);
    }

    private static /* synthetic */ IlIlrG[] IlIlY() {
        return new IlIlrG[]{UNKNOWN};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = IlIls.a(7077938915060803461L, 6631069248719699996L, MethodHandles.lookup().lookupClass()).a(41780977720425L) ^ 0x5C9EB5E2A720L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d7\u0015\u00cd\u0005oO\u00ca\u0094".getBytes("ISO-8859-1"));
                String string = IlIlrG.a(byArray3).intern();
                UNKNOWN = new IlIlrG();
                IlIlz = IlIlrG.IlIlY();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

