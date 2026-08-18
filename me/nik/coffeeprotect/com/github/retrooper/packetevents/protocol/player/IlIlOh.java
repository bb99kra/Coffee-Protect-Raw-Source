/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class IlIlOh
extends Enum<IlIlOh> {
    public static final /* enum */ IlIlOh LEFT;
    public static final /* enum */ IlIlOh RIGHT;
    public static final IlIlOh[] VALUES;
    private static final /* synthetic */ IlIlOh[] IlIlR;
    private static final long a;

    public static IlIlOh[] values() {
        return (IlIlOh[])IlIlR.clone();
    }

    public static IlIlOh valueOf(String string) {
        return Enum.valueOf(IlIlOh.class, string);
    }

    public int IlIlZ() {
        long l = a ^ 0x5B879FDACE30L;
        return this == RIGHT ? 0 : 1;
    }

    public static IlIlOh IlIly(int n) {
        long l = a ^ 0x62223C18EC4EL;
        return n == 0 ? RIGHT : LEFT;
    }

    public static IlIlOh IlIlE(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x3D65C68E439DL;
        return packetWrapper.IlIlf() == 1 ? RIGHT : LEFT;
    }

    public static void IlIlq(PacketWrapper<?> packetWrapper, IlIlOh ilIlOh) {
        packetWrapper.IlIlw(ilIlOh);
    }

    private static /* synthetic */ IlIlOh[] IlIlY() {
        return new IlIlOh[]{LEFT, RIGHT};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a(-8689461233775913772L, 905091003382397201L, MethodHandles.lookup().lookupClass()).a(183965382924285L);
        long l = a ^ 0x17FB410CE320L;
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
        String string = "C9\u00a4\u0089+\u00dd\u0015\u0004\b\u00e7w\u00b5\u0089\u008b\u001a\u0013\u0016";
        int n2 = "C9\u00a4\u0089+\u00dd\u0015\u0004\b\u00e7w\u00b5\u0089\u008b\u001a\u0013\u0016".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlOh.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                LEFT = new IlIlOh();
                RIGHT = new IlIlOh();
                IlIlR = IlIlOh.IlIlY();
                VALUES = IlIlOh.values();
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

