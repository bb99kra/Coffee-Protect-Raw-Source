/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIlvo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.IlIlGq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.IlIlQO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlOv {
    public static final NbtCodec<IlIlOv> IlIlV;
    private final IlIlQO IlIlC;
    private final IlIlQO IlIlD;
    private final IlIlQO IlIlf;
    private final IlIlQO IlIlW;
    private static PacketWrapper[] IlIlM;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String IdwYZveOco = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlOv(IlIlQO ilIlQO, IlIlQO ilIlQO2, IlIlQO ilIlQO3, IlIlQO ilIlQO4) {
        this.IlIlC = ilIlQO;
        this.IlIlD = ilIlQO2;
        this.IlIlf = ilIlQO3;
        this.IlIlW = ilIlQO4;
    }

    @ApiStatus.Internal
    public static IlIlOv IlIlJ(String string) {
        long l = a ^ 0x17E032F3B477L;
        VersionedRegistry<IlIlQO> versionedRegistry = IlIlGq.IlIlo();
        IlIlQO ilIlQO = (IlIlQO)versionedRegistry.IlIlu(string + (String)((Object)IlIlOv.a("t", (int)31004, (long)(0x7F9C23D87E8A497L ^ l))));
        IlIlQO ilIlQO2 = (IlIlQO)versionedRegistry.IlIlu(string + (String)((Object)IlIlOv.a("t", (int)8107, (long)(0x21D004957F5D4222L ^ l))));
        IlIlQO ilIlQO3 = (IlIlQO)versionedRegistry.IlIlu(string + (String)((Object)IlIlOv.a("t", (int)32213, (long)(0x7B33EDB3ED3A205DL ^ l))));
        IlIlQO ilIlQO4 = (IlIlQO)versionedRegistry.IlIlu(string + (String)((Object)IlIlOv.a("t", (int)19821, (long)(0x7C309C80B59910E7L ^ l))));
        return new IlIlOv(ilIlQO, ilIlQO2, ilIlQO3, ilIlQO4);
    }

    public IlIlQO IlIlA() {
        return this.IlIlC;
    }

    public IlIlQO IlIlz() {
        return this.IlIlD;
    }

    public IlIlQO IlIlZ() {
        return this.IlIlf;
    }

    public IlIlQO IlIln() {
        return this.IlIlW;
    }

    public boolean equals(Object object) {
        long l = a ^ 0xD5B10CF5C0AL;
        PacketWrapper[] packetWrapperArray = IlIlOv.IlIlu();
        Object object2 = object;
        if (packetWrapperArray != null) {
            if (!(object2 instanceof IlIlOv)) {
                return false;
            }
            object2 = object;
        }
        IlIlOv ilIlOv = (IlIlOv)object2;
        boolean bl = this.IlIlC.equals(ilIlOv.IlIlC);
        if (packetWrapperArray != null) {
            if (!bl) {
                return false;
            }
            bl = this.IlIlD.equals(ilIlOv.IlIlD);
        }
        if (packetWrapperArray != null) {
            if (!bl) {
                return false;
            }
            bl = this.IlIlf.equals(ilIlOv.IlIlf);
        }
        if (packetWrapperArray != null) {
            if (!bl) {
                return false;
            }
            bl = this.IlIlW.equals(ilIlOv.IlIlW);
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash(this.IlIlC, this.IlIlD, this.IlIlf, this.IlIlW);
    }

    static /* synthetic */ IlIlQO IlIlP(IlIlOv ilIlOv) {
        return ilIlOv.IlIlC;
    }

    static /* synthetic */ IlIlQO IlIlJ(IlIlOv ilIlOv) {
        return ilIlOv.IlIlD;
    }

    static /* synthetic */ IlIlQO IlIlA(IlIlOv ilIlOv) {
        return ilIlOv.IlIlf;
    }

    static /* synthetic */ IlIlQO IlIly(IlIlOv ilIlOv) {
        return ilIlOv.IlIlW;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIlOv.a = IlIls.a(2238156240968955881L, -441703529701504848L, MethodHandles.lookup().lookupClass()).a(191648943582300L);
                IlIlOv.d = new HashMap<K, V>(13);
                var0 = IlIlOv.a ^ 4696852979893L;
                IlIlOv.IlIlQ(new PacketWrapper[1]);
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00c0\u00db\u00ab\u00e1\u00d0h\u00f5L\u00bf\u00a2\u00ca{\u00fbu\u00b8\u00b5\u0010V\u00ceB\u0080H\u0097\u0092'\u00a7\u0001\u007f\u00be$\u00cf\u0010\u00ed";
                var8_6 = "\u00c0\u00db\u00ab\u00e1\u00d0h\u00f5L\u00bf\u00a2\u00ca{\u00fbu\u00b8\u00b5\u0010V\u00ceB\u0080H\u0097\u0092'\u00a7\u0001\u007f\u00be$\u00cf\u0010\u00ed".length();
                var5_7 = 16;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIlOv.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a7\u00c8$\u00aa\u00a2\u00ceR\u00bc\u0087:\u00e9^X\u0003\u00d1\u009f\u0010\u00de\u000f\u00f1\u00eb'\u0090\u0001\u001a\u0002\u001b\n\u00bc\u0012\u00d3\u00952";
                    var8_6 = "\u00a7\u00c8$\u00aa\u00a2\u00ceR\u00bc\u0087:\u00e9^X\u0003\u00d1\u009f\u0010\u00de\u000f\u00f1\u00eb'\u0090\u0001\u001a\u0002\u001b\n\u00bc\u0012\u00d3\u00952".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl35:
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
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIlOv.a(var10_9).intern();
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        IlIlOv.b = var9_3;
        IlIlOv.c = new String[4];
        IlIlOv.IlIlV = new IlIlvo().IlIlq();
    }

    public static void IlIlQ(PacketWrapper[] packetWrapperArray) {
        IlIlM = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlu() {
        return IlIlM;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x473A;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/IlIlOv", exception);
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
            IlIlOv.c[n2] = IlIlOv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlOv.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/IlIlOv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlOv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

