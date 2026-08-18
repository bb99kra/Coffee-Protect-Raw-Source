/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlOY;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlPH;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlPP;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlfk;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlnK;
import org.jspecify.annotations.Nullable;

final class IlIlCK
implements IlIlPP {
    private final IlIlPH IlIlf;
    private final SortedMap<Integer, IlIlOY> IlIlJ;
    private final int IlIlR;
    private final IlIlOY IlIln;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String irUUguiOor = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlCK(IlIlPH ilIlPH, SortedMap<Integer, IlIlOY> sortedMap, int n, IlIlOY ilIlOY) {
        this.IlIlf = ilIlPH;
        this.IlIlJ = sortedMap;
        this.IlIlR = n;
        this.IlIln = ilIlOY;
    }

    @Override
    public IlIlPH IlIlp() {
        return this.IlIlf;
    }

    @Override
    public boolean IlIlQ(IlIlfk<?> ilIlfk) {
        return this.IlIln.IlIlQ(ilIlfk);
    }

    @Override
    public <V> @Nullable V IlIld(IlIlfk<V> ilIlfk) {
        return this.IlIln.IlIld(ilIlfk);
    }

    @Override
    public Map<Integer, IlIlOY> IlIlP() {
        return Collections.unmodifiableSortedMap(this.IlIlJ.headMap(this.IlIlR + 1));
    }

    @Override
    public IlIlPP IlIlD(int n) {
        return new IlIlCK(this.IlIlf, this.IlIlJ, n, IlIlCK.IlIlB(this.IlIlf, this.IlIlJ, n));
    }

    public static IlIlOY IlIlB(IlIlPH ilIlPH, SortedMap<Integer, IlIlOY> sortedMap, int n) {
        IlIlnK ilIlnK;
        block2: {
            long l = a ^ 0x64C62909B7CAL;
            SortedMap<Integer, IlIlOY> sortedMap2 = sortedMap.headMap(n + 1);
            IlIlnK ilIlnK2 = ilIlPH.IlIlS();
            Iterator iterator = sortedMap2.values().iterator();
            int[] nArray = IlIlv_.IlIll();
            while (iterator.hasNext()) {
                IlIlOY ilIlOY = (IlIlOY)iterator.next();
                ilIlnK = ilIlnK2.IlIlZ(ilIlOY);
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block2;
            }
            ilIlnK = ilIlnK2;
        }
        return ilIlnK.IlIlz();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object object) {
        long l = a ^ 0x508BB775289EL;
        int[] nArray = IlIlv_.IlIll();
        Object object2 = this;
        if (nArray == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (object2 == null) return false;
        Object object3 = this.getClass();
        if (nArray == null) {
            if (object3 != object.getClass()) {
                return false;
            }
            object3 = object;
        }
        IlIlCK ilIlCK = (IlIlCK)object3;
        boolean bl = this.IlIlR;
        if (nArray == null) {
            if (bl != ilIlCK.IlIlR) return false;
            bl = Objects.equals(this.IlIlf, ilIlCK.IlIlf);
        }
        if (nArray == null) {
            if (!bl) return false;
            bl = Objects.equals(this.IlIlJ, ilIlCK.IlIlJ);
        }
        if (nArray == null) {
            if (!bl) return false;
            bl = Objects.equals(this.IlIln, ilIlCK.IlIln);
        }
        if (nArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    public int hashCode() {
        long l = a ^ 0x54935FFAFE19L;
        int[] nArray = IlIlv_.IlIll();
        int n = Objects.hash(this.IlIlf, this.IlIlJ, this.IlIlR, this.IlIln);
        if (PacketWrapper.IlIlz() == null) {
            IlIlv_.IlIlo(new int[2]);
        }
        return n;
    }

    public String toString() {
        long l = a ^ 0x79118742369AL;
        int[] nArray = IlIlv_.IlIll();
        String string = this.getClass().getSimpleName() + (String)((Object)IlIlCK.a("y", (int)11281, (long)(0x40883540E26DDE13L ^ l))) + this.IlIlf + (String)((Object)IlIlCK.a("y", (int)1396, (long)(0x7C324062757777L ^ l))) + this.IlIlJ + (String)((Object)IlIlCK.a("y", (int)14201, (long)(0x3528FA0303AD4579L ^ l))) + this.IlIlR + (String)((Object)IlIlCK.a("y", (int)31372, (long)(0x2CA552E341A5888DL ^ l))) + this.IlIln + (char)e;
        if (nArray != null) {
            PacketWrapper.IlIle(new int[2]);
        }
        return string;
    }

    static IlIlOY IlIlQ(IlIlCK ilIlCK) {
        return ilIlCK.IlIln;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    IlIlCK.a = IlIls.a(5214339231819302017L, -4529412556033417115L, MethodHandles.lookup().lookupClass()).a(131433200456515L);
                    IlIlCK.d = new HashMap<K, V>(13);
                    var5 = IlIlCK.a ^ 10287705236335L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[4];
                    var12_4 = 0;
                    var11_5 = "\fJB\u00f9\u00ed:\u0092\u0005%\u001bAI\u001cn\"s\u0089wcR\u00c6\u00c3O\u00fe(\u00aaj\u00df6\u00e0\u00ba\u00b3\u00aesb\u0001\u00b6\u00d8\u00fe\u00fel\u00de1\u001a\u0092\u008d\u00cb\u00f2\u00feK\u00ca\u00bb=\u009c\\\u00ad\u00cd\u00b8P\u00e4\u00ba(\u00b8\u0014\u0015";
                    var13_6 = "\fJB\u00f9\u00ed:\u0092\u0005%\u001bAI\u001cn\"s\u0089wcR\u00c6\u00c3O\u00fe(\u00aaj\u00df6\u00e0\u00ba\u00b3\u00aesb\u0001\u00b6\u00d8\u00fe\u00fel\u00de1\u001a\u0092\u008d\u00cb\u00f2\u00feK\u00ca\u00bb=\u009c\\\u00ad\u00cd\u00b8P\u00e4\u00ba(\u00b8\u0014\u0015".length();
                    var10_7 = 24;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = IlIlCK.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u001b\fq\u00f6=!b\u00c4\u00b5`\u00b0\u0088H.\u00dfJ *\u0007_5\n\u00eeF\u0090m\u00ef\u0091\u00ed6\u00a2},\u00d1\u00e3g\u00f93\u00b2\u0014\u00fdh\u00e5V\u00a67\u00feA~";
                        var13_6 = "\u001b\fq\u00f6=!b\u00c4\u00b5`\u00b0\u0088H.\u00dfJ *\u0007_5\n\u00eeF\u0090m\u00ef\u0091\u00ed6\u00a2},\u00d1\u00e3g\u00f93\u00b2\u0014\u00fdh\u00e5V\u00a67\u00feA~".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = IlIlCK.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl51:
                    // 1 sources

                    ** continue;
                }
            }
            IlIlCK.b = var14_3;
            IlIlCK.c = new String[4];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 3230117252784727876L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        IlIlCK.e = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3CB1;
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
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/IlIlCK", exception);
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
            IlIlCK.c[n2] = IlIlCK.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlCK.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/IlIlCK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlCK.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

