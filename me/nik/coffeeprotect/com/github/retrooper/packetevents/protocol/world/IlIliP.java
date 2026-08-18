/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public class IlIliP {
    private IlIlv_ IlIlf;
    private float IlIlO;
    private float IlIlD;
    private static int IlIlx;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String bshikXofKj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIliP(IlIlv_ ilIlv_, float f, float f2) {
        this.IlIlf = ilIlv_;
        this.IlIlO = f;
        this.IlIlD = f2;
    }

    public IlIliP(double d, double d2, double d3, float f, float f2) {
        this(new IlIlv_(d, d2, d3), f, f2);
    }

    public IlIlv_ IlIln() {
        return this.IlIlf;
    }

    public double IlIlm() {
        return this.IlIlf.IlIll();
    }

    public double IlIlh() {
        return this.IlIlf.IlIlk();
    }

    public double IlIlR() {
        return this.IlIlf.IlIlY();
    }

    public void IlIlf(IlIlv_ ilIlv_) {
        this.IlIlf = ilIlv_;
    }

    public float IlIlH() {
        return this.IlIlO;
    }

    public void IlIlI(float f) {
        this.IlIlO = f;
    }

    public float IlIlP() {
        return this.IlIlD;
    }

    public void IlIlm(float f) {
        this.IlIlD = f;
    }

    public IlIlQG IlIl_() {
        double d = this.IlIlH();
        double d2 = this.IlIlP();
        float f = (float)(-Math.sin(Math.toRadians(d2)));
        double d3 = Math.cos(Math.toRadians(d2));
        float f2 = (float)(-d3 * Math.sin(Math.toRadians(d)));
        float f3 = (float)(d3 * Math.cos(Math.toRadians(d)));
        return new IlIlQG(f2, f, f3);
    }

    public void IlIlZ(IlIlQG ilIlQG) {
        block6: {
            double d;
            double d2;
            double d3;
            double d4;
            block4: {
                block5: {
                    long l = a ^ 0x22610C201100L;
                    double d5 = Math.PI * 2;
                    int n = IlIliP.IlIlW();
                    d4 = ilIlQG.IlIlY();
                    d3 = ilIlQG.IlIlu();
                    d2 = d4;
                    d = 0.0;
                    if (n != 0) break block4;
                    if (d2 != d) break block5;
                    d2 = d3;
                    d = 0.0;
                    if (n != 0) break block4;
                    if (d2 != d) break block5;
                    float f = ilIlQG.IlIlg();
                    if (n == 0) {
                        f = this.IlIlD = (double)f > 0.0 ? -90.0f : 90.0f;
                    }
                    if (n == 0) break block6;
                }
                d2 = -d4;
                d = d3;
            }
            double d6 = Math.atan2(d2, d);
            this.IlIlO = (float)Math.toDegrees((d6 + Math.PI * 2) % (Math.PI * 2));
            double d7 = d4 * d4;
            double d8 = d3 * d3;
            double d9 = Math.sqrt(d7 + d8);
            this.IlIlD = (float)Math.toDegrees(Math.atan((double)(-ilIlQG.IlIlg()) / d9));
        }
    }

    public IlIliP IlIlp() {
        return new IlIliP(this.IlIlf, this.IlIlO, this.IlIlD);
    }

    public String toString() {
        long l = a ^ 0x32117188E3BBL;
        return (String)((Object)IlIliP.a("i", (int)17253, (long)(0x6DE2D4240E8A89B1L ^ l))) + this.IlIlf.toString() + (String)((Object)IlIliP.a("i", (int)31361, (long)(0x64AD09A279D4B054L ^ l))) + this.IlIlO + (String)((Object)IlIliP.a("i", (int)27563, (long)(0x685AC9BAB579217CL ^ l))) + this.IlIlD + "}";
    }

    public static void IlIle(int n) {
        IlIlx = n;
    }

    public static int IlIlI() {
        return IlIlx;
    }

    public static int IlIlW() {
        int n = IlIliP.IlIlI();
        if (n == 0) {
            return 64;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a(-512895736736368075L, 1420258592025462117L, MethodHandles.lookup().lookupClass()).a(15272036436088L);
        d = new HashMap(13);
        long l = a ^ 0x7D0A4017BB2EL;
        IlIliP.IlIle(36);
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u001d$\u00eb\u00ceE\u00c5\u00b2\u00fc\u00a7\u0012\u00de5\u00e2C\u00e7\u00c1'\u009es\u00db\u00d1\u0091\u00c8\u0014 `\u00b3Z\u009b>\u008a\u009dt\u00ff' \u00bct\u0081\u0014\u00d2\u001a\u00ad\u00d40\u00ceQ\u009d\u00ad=z\u0012K\u00883\u008c\u00bb  P\u00b8`\u00d6I\u00c6\u0000g\u0014\u001a\u0091\u00dbF\u0017\u00df\u00f8\u00fd\u00b0k\nd\u00ec\u00e1\u009d\u00c4\u0086\u0013\u00af)\\\u00c8";
        int n2 = "\u001d$\u00eb\u00ceE\u00c5\u00b2\u00fc\u00a7\u0012\u00de5\u00e2C\u00e7\u00c1'\u009es\u00db\u00d1\u0091\u00c8\u0014 `\u00b3Z\u009b>\u008a\u009dt\u00ff' \u00bct\u0081\u0014\u00d2\u001a\u00ad\u00d40\u00ceQ\u009d\u00ad=z\u0012K\u00883\u008c\u00bb  P\u00b8`\u00d6I\u00c6\u0000g\u0014\u001a\u0091\u00dbF\u0017\u00df\u00f8\u00fd\u00b0k\nd\u00ec\u00e1\u009d\u00c4\u0086\u0013\u00af)\\\u00c8".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIliP.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1C8;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIliP", exception);
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
            IlIliP.c[n2] = IlIliP.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIliP.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIliP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIliP.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

