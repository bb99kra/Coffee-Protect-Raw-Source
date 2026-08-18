/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlAJ;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlL6;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlTT;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlWc;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIldz;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlf5;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlqG;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

final class IlIlCB
implements IlIlf5 {
    private final StringBuilder IlIlk;
    private final IlIlTT IlIlD;
    @Nullable
    private IlIlAJ IlIlA;
    private IlIlTT[] IlIlH;
    private int IlIlw;
    final IlIlL6 IlIlN;
    private static final long a = IlIls.a(-4157654608791930395L, 3677989514283100176L, MethodHandles.lookup().lookupClass()).a(109824838925794L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String uDCdIsSYOO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlCB(IlIlL6 ilIlL6) {
        long l = a ^ 0x1BE57A0AC0B1L;
        this.IlIlN = ilIlL6;
        this.IlIlk = new StringBuilder();
        this.IlIlD = new IlIlTT(this);
        this.IlIlH = new IlIlTT[(int)e];
        this.IlIlw = -1;
    }

    @Override
    public void IlIlA(@NotNull IlIldz ilIldz) {
        IlIlTT ilIlTT;
        block9: {
            long l = a ^ 0xF6C1BA24030L;
            int n = ++this.IlIlw;
            boolean bl = IlIlWc.IlIlQ();
            try {
                if (n >= this.IlIlH.length) {
                    this.IlIlH = Arrays.copyOf(this.IlIlH, this.IlIlH.length * 2);
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw IlIlCB.a(illegalStateException);
            }
            ilIlTT = this.IlIlH[n];
            if (ilIlTT == null) {
                this.IlIlH[n] = ilIlTT = new IlIlTT(this);
            }
            try {
                block8: {
                    try {
                        if (n <= 0) break block8;
                        ilIlTT.IlIln(this.IlIlH[n - 1]);
                        if (bl) break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlCB.a(illegalStateException);
                    }
                }
                ilIlTT.IlIlK();
            }
            catch (IllegalStateException illegalStateException) {
                throw IlIlCB.a(illegalStateException);
            }
        }
        ilIlTT.IlIlP(ilIldz);
    }

    @Override
    public void IlIlW(@NotNull String string) {
        block10: {
            IlIlCB ilIlCB;
            block11: {
                int n;
                long l;
                block9: {
                    l = a ^ 0x737342DA1471L;
                    boolean bl = IlIlWc.IlIlE();
                    try {
                        try {
                            try {
                                n = string.isEmpty();
                                if (bl) break block9;
                                if (n != 0) break block10;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw IlIlCB.a(illegalStateException);
                            }
                            ilIlCB = this;
                            if (bl) break block11;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw IlIlCB.a(illegalStateException);
                        }
                        n = ilIlCB.IlIlw;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlCB.a(illegalStateException);
                    }
                }
                try {
                    if (n < 0) {
                        throw new IllegalStateException((String)((Object)IlIlCB.a("b", (int)12058, (long)(0x6A204F27C836BC8AL ^ l))));
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlCB.a(illegalStateException);
                }
                this.IlIlH[this.IlIlw].IlIlF();
                ilIlCB = this;
            }
            ilIlCB.IlIlk.append(string);
        }
    }

    @Override
    public void IlIlw(@NotNull IlIldz ilIldz) {
        long l = a ^ 0xC2696BBD2B6L;
        try {
            if (this.IlIlw-- < 0) {
                throw new IllegalStateException((String)((Object)IlIlCB.a("b", (int)16408, (long)(0x1CB1634956FE954EL ^ l))));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw IlIlCB.a(illegalStateException);
        }
    }

    void IlIl_(@Nullable IlIlAJ ilIlAJ) {
        block5: {
            IlIlCB ilIlCB;
            block6: {
                long l = a ^ 0xAA6E95B50D0L;
                boolean bl = IlIlWc.IlIlQ();
                try {
                    ilIlCB = this;
                    if (!bl) break block5;
                    if (ilIlCB.IlIlA == ilIlAJ) break block6;
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlCB.a(illegalStateException);
                }
                String string = IlIlL6.IlIlG(this.IlIlN, ilIlAJ);
                try {
                    if (string == null) {
                        return;
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlCB.a(illegalStateException);
                }
                this.IlIlk.append(IlIlL6.IlIlW(this.IlIlN)).append(string);
            }
            ilIlCB = this;
        }
        ilIlCB.IlIlA = ilIlAJ;
    }

    public String toString() {
        return this.IlIlk.toString();
    }

    IlIlCB(IlIlL6 ilIlL6, IlIlqG ilIlqG) {
        this(ilIlL6);
    }

    static IlIlTT IlIlM(IlIlCB ilIlCB) {
        return ilIlCB.IlIlD;
    }

    static IlIlAJ IlIlf(IlIlCB ilIlCB) {
        return ilIlCB.IlIlA;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x5A9124A6B70EL;
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
        String string = "\u00a8\u00ae\u00d0\u00c4\u00cb\u00f0\u0096\u00d4|\u0094\u009aDB!\u00ae<\u00a4+g[Y\u00a7;\u0004.\u0000\u00c7\u00d9\u00dc\u000f,\u008c\u00bb\u00c7\u00f2n&\u0016O0\u0006q\u00ebO\u00e7\u00b5\u000b\u000186\b\u00a4\u00d5\u001b\r\u00b89yv\u00baC\u00de\u0000\u00bb\u00cd\u00d3\u00d3\u001bg1m\u00bb\u00e2\u008bFx,\u00d4\u00cf\u00d9\u00e4{;xn\u00b6\u0002\u00f6EP\u0080Yr\u0091\u009e\u00ff\u00c4\u00e7\u00b1\u00820\u00c3\r\u0002\u0000";
        int n2 = "\u00a8\u00ae\u00d0\u00c4\u00cb\u00f0\u0096\u00d4|\u0094\u009aDB!\u00ae<\u00a4+g[Y\u00a7;\u0004.\u0000\u00c7\u00d9\u00dc\u000f,\u008c\u00bb\u00c7\u00f2n&\u0016O0\u0006q\u00ebO\u00e7\u00b5\u000b\u000186\b\u00a4\u00d5\u001b\r\u00b89yv\u00baC\u00de\u0000\u00bb\u00cd\u00d3\u00d3\u001bg1m\u00bb\u00e2\u008bFx,\u00d4\u00cf\u00d9\u00e4{;xn\u00b6\u0002\u00f6EP\u0080Yr\u0091\u009e\u00ff\u00c4\u00e7\u00b1\u00820\u00c3\r\u0002\u0000".length();
        int n3 = 48;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlCB.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -2827204505448763302L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                e = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6AE6;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/IlIlCB", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            IlIlCB.c[n2] = IlIlCB.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlCB.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/IlIlCB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlCB.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

