/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlA7;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlGB;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlyv;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.internal.Internals;

final class IlIlCQ
implements IlIlA7 {
    private final IlIlyv IlIlK;
    private final IlIlGB IlIlw;
    private static final long b = IlIls.a(6562162347457118112L, 5738403485672930452L, MethodHandles.lookup().lookupClass()).a(191679107148595L);
    private static final String f;
    private static final long g;
    private static transient /* synthetic */ String rBtGtlREBA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlCQ(IlIlyv ilIlyv, IlIlGB ilIlGB) {
        long l = b ^ 0x34E4B0E18FE4L;
        this.IlIlK = ilIlyv;
        this.IlIlw = Objects.requireNonNull(ilIlGB, f);
    }

    @Override
    @NotNull
    public IlIlyv IlIlL() {
        return this.IlIlK;
    }

    @Override
    public @NotNull IlIlGB IlIlM() {
        return this.IlIlw;
    }

    public String toString() {
        return Internals.toString(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object object) {
        long l = b ^ 0x23025B8685D3L;
        String[] stringArray = IlIlyv.IlIlg();
        Object object2 = this;
        if (stringArray == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (object2 == null) return false;
        Object object3 = this.getClass();
        if (stringArray == null) {
            if (object3 != object.getClass()) {
                return false;
            }
            object3 = object;
        }
        IlIlCQ ilIlCQ = (IlIlCQ)object3;
        IlIlCQ ilIlCQ2 = this;
        if (stringArray == null) {
            if (ilIlCQ2.IlIlK != ilIlCQ.IlIlK) return false;
            ilIlCQ2 = this;
        }
        if (ilIlCQ2.IlIlw != ilIlCQ.IlIlw) return false;
        return true;
    }

    public int hashCode() {
        long l = b ^ 0x6857757C0EF5L;
        int n = this.IlIlK.hashCode();
        n = (int)g * n + this.IlIlw.hashCode();
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x6D978E7E328CL;
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
        byte[] byArray3 = cipher.doFinal("\u00dc\u00c8\u00a1\n\u0013\u00f6\u0088\u00de".getBytes("ISO-8859-1"));
        f = IlIlCQ.b(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 5535347791661756379L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                g = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String b(byte[] byArray) {
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

