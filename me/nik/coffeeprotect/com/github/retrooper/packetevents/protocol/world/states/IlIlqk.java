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

public final class IlIlqk
extends Enum<IlIlqk> {
    public static final /* enum */ IlIlqk FOOT;
    public static final /* enum */ IlIlqk HEAD;
    private static final /* synthetic */ IlIlqk[] IlIlX;

    public static IlIlqk[] values() {
        return (IlIlqk[])IlIlX.clone();
    }

    public static IlIlqk valueOf(String string) {
        return Enum.valueOf(IlIlqk.class, string);
    }

    private static /* synthetic */ IlIlqk[] IlIlK() {
        return new IlIlqk[]{FOOT, HEAD};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = IlIls.a(7295328033961368877L, 7775715586288541992L, MethodHandles.lookup().lookupClass()).a(197706930966872L) ^ 0x2F28C723875DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00d7~\u00f0\u008b\u00f4'\u00ffX\b\u008ax\u00cf\u001a\u00d3Q\rO";
        int n2 = "\u00d7~\u00f0\u008b\u00f4'\u00ffX\b\u008ax\u00cf\u001a\u00d3Q\rO".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlqk.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                FOOT = new IlIlqk();
                HEAD = new IlIlqk();
                IlIlX = IlIlqk.IlIlK();
                return;
            }
            n3 = string.charAt(n4);
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

