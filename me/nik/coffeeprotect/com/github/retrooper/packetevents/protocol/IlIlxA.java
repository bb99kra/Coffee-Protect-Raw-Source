/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public final class IlIlxA
extends Enum<IlIlxA> {
    public static final /* enum */ IlIlxA PLUGIN_MESSAGE;
    public static final /* enum */ IlIlxA DISCONNECT;
    public static final /* enum */ IlIlxA CONFIGURATION_END;
    public static final /* enum */ IlIlxA KEEP_ALIVE;
    public static final /* enum */ IlIlxA PING;
    public static final /* enum */ IlIlxA REGISTRY_DATA;
    public static final /* enum */ IlIlxA RESOURCE_PACK_SEND;
    public static final /* enum */ IlIlxA UPDATE_ENABLED_FEATURES;
    public static final /* enum */ IlIlxA UPDATE_TAGS;
    private static final /* synthetic */ IlIlxA[] IlIlM;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static IlIlxA[] values() {
        return (IlIlxA[])IlIlM.clone();
    }

    public static IlIlxA valueOf(String string) {
        return Enum.valueOf(IlIlxA.class, string);
    }

    private static /* synthetic */ IlIlxA[] IlIlz() {
        long l = a ^ 0x288B49A25E44L;
        IlIlxA[] ilIlxAArray = new IlIlxA[IlIlxA.a("z", (int)20444, (long)(0x345D83939AE7CAD5L ^ l))];
        ilIlxAArray[0] = PLUGIN_MESSAGE;
        ilIlxAArray[1] = DISCONNECT;
        ilIlxAArray[2] = CONFIGURATION_END;
        ilIlxAArray[3] = KEEP_ALIVE;
        ilIlxAArray[4] = PING;
        ilIlxAArray[5] = REGISTRY_DATA;
        ilIlxAArray[IlIlxA.a("z", (int)6187, (long)(0x7A1AB7F7194C1D27L ^ l))] = RESOURCE_PACK_SEND;
        ilIlxAArray[IlIlxA.a("z", (int)14921, (long)(0x1EDF081233DFBF41L ^ l))] = UPDATE_ENABLED_FEATURES;
        ilIlxAArray[IlIlxA.a("z", (int)21631, (long)(0xEF968C9AF05D171L ^ l))] = UPDATE_TAGS;
        return ilIlxAArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        IlIlxA.a = IlIls.a(520689319354391908L, -3606885492195284083L, MethodHandles.lookup().lookupClass()).a(272781612228609L);
                        var20 = IlIlxA.a ^ 50906314659042L;
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[9];
                        var17_4 = 0;
                        var16_5 = "\u0013\u0097\u00f5C\u001f\u00b7\u00fb\u0097\u00c2\u00b8\u00bf\u00d7\\;;i\b\u00d8\"\u0006Q\u00c3\u00eb\u008c>\u0010Co\u0094\u0081\u00d5\u009dP)\u00e4\u00caL(\u008b$LZ\u0010zmUb\u00fc\u00dc#y\u0098\u0095\u009d`\u008e\u00f8\u008d\u00d4\u0018\u0018\u0086.\u00ba\u00fai\u00cd\u00f4\u001a\u009aG\u00ce\u00f8\u0080Ox\u00cf9\u00e1\u00c0iq\u00d6\u00c9\u0018m\u00d6\u0085l\u00bb\u00dd\u00c08\u00dfgMDf\u0007\u00a7?\u00a2T\u0099\u00a8i\u00fb#\u009f\u0018b\u0099@\u0005{\u00fd\u00bd.\u0092]\u00f0}T\u009e\u0090\b{\u00a3\u00a3i\u00a1\u0085\u00b5\u00b8";
                        var18_6 = "\u0013\u0097\u00f5C\u001f\u00b7\u00fb\u0097\u00c2\u00b8\u00bf\u00d7\\;;i\b\u00d8\"\u0006Q\u00c3\u00eb\u008c>\u0010Co\u0094\u0081\u00d5\u009dP)\u00e4\u00caL(\u008b$LZ\u0010zmUb\u00fc\u00dc#y\u0098\u0095\u009d`\u008e\u00f8\u008d\u00d4\u0018\u0018\u0086.\u00ba\u00fai\u00cd\u00f4\u001a\u009aG\u00ce\u00f8\u0080Ox\u00cf9\u00e1\u00c0iq\u00d6\u00c9\u0018m\u00d6\u0085l\u00bb\u00dd\u00c08\u00dfgMDf\u0007\u00a7?\u00a2T\u0099\u00a8i\u00fb#\u009f\u0018b\u0099@\u0005{\u00fd\u00bd.\u0092]\u00f0}T\u009e\u0090\b{\u00a3\u00a3i\u00a1\u0085\u00b5\u00b8".length();
                        var15_7 = 16;
                        var14_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = IlIlxA.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "N\u0016\u00c1\u008f\u00e8\u00817\u00acB\t\u00b0\r'\u009c\u00a6@\u0010\u00e2\u00f5\u00ec\u0006\u00f3\u00e4\u00d0\u00985%\u00a9d\u00a1%\u00d0+";
                            var18_6 = "N\u0016\u00c1\u008f\u00e8\u00817\u00acB\t\u00b0\r'\u009c\u00a6@\u0010\u00e2\u00f5\u00ec\u0006\u00f3\u00e4\u00d0\u00985%\u00a9d\u00a1%\u00d0+".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = IlIlxA.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                IlIlxA.d = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[7];
                var3_13 = 0;
                var4_14 = "\u0006\u00dfk\u00de\u00a7\u007f\u00a5\u0089b\u009c\u0086\u0014\u001b\u00e0\u00f5=b\u00169\u00f5t\u00db/\"\u0011\u00b9\u00b16)A\u008c\u00c0\u009d\u0087Be\u0086=\u00f0<";
                var5_15 = "\u0006\u00dfk\u00de\u00a7\u007f\u00a5\u0089b\u009c\u0086\u0014\u001b\u00e0\u00f5=b\u00169\u00f5t\u00db/\"\u0011\u00b9\u00b16)A\u008c\u00c0\u009d\u0087Be\u0086=\u00f0<".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u0085\u0096\u0088\u0080\u00e8\u00ea\u0018\u00d3\u008cm\u000e\u00c8Eb\u00e5\u00d7";
                    var5_15 = "\u0085\u0096\u0088\u0080\u00e8\u00ea\u0018\u00d3\u008cm\u000e\u00c8Eb\u00e5\u00d7".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl101:
                // 1 sources

                ** continue;
            }
        }
        IlIlxA.b = var6_12;
        IlIlxA.c = new Integer[7];
        IlIlxA.PLUGIN_MESSAGE = new IlIlxA();
        IlIlxA.DISCONNECT = new IlIlxA();
        IlIlxA.CONFIGURATION_END = new IlIlxA();
        IlIlxA.KEEP_ALIVE = new IlIlxA();
        IlIlxA.PING = new IlIlxA();
        IlIlxA.REGISTRY_DATA = new IlIlxA();
        IlIlxA.RESOURCE_PACK_SEND = new IlIlxA();
        IlIlxA.UPDATE_ENABLED_FEATURES = new IlIlxA();
        IlIlxA.UPDATE_TAGS = new IlIlxA();
        IlIlxA.IlIlM = IlIlxA.IlIlz();
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x316;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/IlIlxA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlxA.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlxA.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/IlIlxA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlxA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

