/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIld0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIluA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlOU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlXv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class IlIliI
implements IlIlOU<IlIluA> {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String mUTDfCMGHl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIliI() {
    }

    public IlIluA IlIlI(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws IlIlXv {
        IlIluA ilIluA;
        Object object;
        long l = a ^ 0x1FA600ADCED0L;
        int n = IlIld0.IlIlg();
        try {
            object = packetWrapper.IlIlw().IlIlz(ServerVersion.V_1_21_5) ? "" : IlIliI.a("a", (int)5425, (long)(0x421D4A99F5FD035BL ^ l));
        }
        catch (IlIlXv ilIlXv) {
            throw IlIliI.a(ilIlXv);
        }
        String string = object;
        ResourceLocation resourceLocation = nBTCompound.getOrThrow((String)((Object)IlIliI.a("a", (int)25619, (long)(0x5E8250AC032A727FL ^ l))) + string, ResourceLocation.CODEC, packetWrapper);
        ResourceLocation resourceLocation2 = nBTCompound.getOrThrow((String)((Object)IlIliI.a("a", (int)1130, (long)(0x65351272F36C9204L ^ l))) + string, ResourceLocation.CODEC, packetWrapper);
        ResourceLocation resourceLocation3 = nBTCompound.getOrThrow((String)((Object)IlIliI.a("a", (int)3471, (long)(0x4A50E4C7C37F9BE7L ^ l))) + string, ResourceLocation.CODEC, packetWrapper);
        try {
            ilIluA = new IlIluA(resourceLocation, resourceLocation2, resourceLocation3);
            if (PacketWrapper.IlIlz() == null) {
                IlIld0.IlIlC(++n);
            }
        }
        catch (IlIlXv ilIlXv) {
            throw IlIliI.a(ilIlXv);
        }
        return ilIluA;
    }

    public void IlIlB(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, IlIluA ilIluA) throws IlIlXv {
        Object object;
        long l = a ^ 0x41540DB5060AL;
        try {
            object = packetWrapper.IlIlw().IlIlz(ServerVersion.V_1_21_5) ? "" : IlIliI.a("a", (int)23584, (long)(0x3087008F95C30291L ^ l));
        }
        catch (IlIlXv ilIlXv) {
            throw IlIliI.a(ilIlXv);
        }
        String string = object;
        nBTCompound.set((String)((Object)IlIliI.a("a", (int)25519, (long)(0x4F951B84A763BD1AL ^ l))) + string, ilIluA.IlIlE(), ResourceLocation.CODEC, packetWrapper);
        nBTCompound.set((String)((Object)IlIliI.a("a", (int)31222, (long)(0x645C10B1416D2745L ^ l))) + string, ilIluA.IlIlN(), ResourceLocation.CODEC, packetWrapper);
        nBTCompound.set((String)((Object)IlIliI.a("a", (int)16900, (long)(0x152F53E0720C1CB3L ^ l))) + string, ilIluA.IlIlQ(), ResourceLocation.CODEC, packetWrapper);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIliI.a = IlIls.a(-3507263849097754715L, -667027579808416992L, MethodHandles.lookup().lookupClass()).a(12742630778487L);
                IlIliI.d = new HashMap<K, V>(13);
                var0 = IlIliI.a ^ 43602568844911L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u0089\u00e51\u00b5\u008f&\u00cf\u00cf2\u00ae\u00e0sA\u00de\u007f\u00c0\u0010\u00ae:\u00cc\u00fb4\u00ffY\u00e7\u0094\u0089\u00d46oW\u00f0\u009c\u0018\u00efkVDf1\u009e\u00f6\u009ar\u00cb\u00b9\u009ar\u009f\u0082\u00f2\u00b6\u00d5\u00e4%\u00cb\u00f9\u0093\u0018\u0084]\u0004\u00ff\u0004e\r\u00c1\u0019C\u00b09\u00fc\u00aaC\u00a4\u009b\u009a\u0015\u0091\u00f7\u00e1}\\\u00108kD\u00051\u00f7\u00c4\u0017\u00c1\u0001\u0001#\u009aAT/\u0010\u0012\u0004L\u008e0[\u0096\u00f9\u00b6H\u00bd\u00a7\u000e36\u00fd";
                var8_6 = "\u0089\u00e51\u00b5\u008f&\u00cf\u00cf2\u00ae\u00e0sA\u00de\u007f\u00c0\u0010\u00ae:\u00cc\u00fb4\u00ffY\u00e7\u0094\u0089\u00d46oW\u00f0\u009c\u0018\u00efkVDf1\u009e\u00f6\u009ar\u00cb\u00b9\u009ar\u009f\u0082\u00f2\u00b6\u00d5\u00e4%\u00cb\u00f9\u0093\u0018\u0084]\u0004\u00ff\u0004e\r\u00c1\u0019C\u00b09\u00fc\u00aaC\u00a4\u009b\u009a\u0015\u0091\u00f7\u00e1}\\\u00108kD\u00051\u00f7\u00c4\u0017\u00c1\u0001\u0001#\u009aAT/\u0010\u0012\u0004L\u008e0[\u0096\u00f9\u00b6H\u00bd\u00a7\u000e36\u00fd".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIliI.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ee<x\u00d11XI\u00aaDl\u001e\u00efvX\u00ec\u008b\u0010]\"M\u0099Di\u00a3\u00f5\u00a1 \u00daX\u00dc\u0013\u009d$";
                    var8_6 = "\u00ee<x\u00d11XI\u00aaDl\u001e\u00efvX\u00ec\u008b\u0010]\"M\u0099Di\u00a3\u00f5\u00a1 \u00daX\u00dc\u0013\u009d$".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIliI.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        IlIliI.b = var9_3;
        IlIliI.c = new String[8];
    }

    private static IlIlXv a(IlIlXv ilIlXv) {
        return ilIlXv;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4143;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/IlIliI", exception);
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
            IlIliI.c[n2] = IlIliI.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIliI.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/IlIliI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIliI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

