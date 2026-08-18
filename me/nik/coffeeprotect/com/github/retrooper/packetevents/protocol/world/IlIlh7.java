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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlLG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlLh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlfC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlfm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlPF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlWW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlo3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlh7
implements IlIlCV {
    private static final int IlIlQ = 0;
    private static final int IlIlW;
    private int IlIlL;
    private final IlIlPF IlIlG;
    @Nullable
    private IlIlo3 IlIll;
    @Nullable
    private IlIlo3 IlIlc;
    private static String[] IlIlP;
    private static final long b;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String kjeWBnnOQi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlh7(int n, IlIlPF ilIlPF) {
        this(n, ilIlPF, null, null);
    }

    public IlIlh7(int n, IlIlPF ilIlPF, @Nullable IlIlo3 ilIlo3, @Nullable IlIlo3 ilIlo32) {
        long l = b ^ 0x70BC3FF73B6FL;
        this.IlIlL = n;
        this.IlIlG = ilIlPF;
        this.IlIll = ilIlo3;
        String[] stringArray = IlIlh7.IlIlg();
        this.IlIlc = ilIlo32;
        if (stringArray == null) {
            PacketWrapper.IlIle(new int[5]);
        }
    }

    @Deprecated
    public IlIlh7(IlIlfC ilIlfC, boolean bl, boolean bl2) {
        this(ilIlfC, bl, bl2, IlIlr7.IlIlb().IlIlq().IlIlF());
    }

    @Deprecated
    private IlIlh7(IlIlfC ilIlfC, boolean bl, boolean bl2, ServerVersion serverVersion) {
        long l = b ^ 0x6A67F62ADC24L;
        String[] stringArray = IlIlh7.IlIlg();
        String[] stringArray2 = stringArray;
        Object object = serverVersion.IlIlz(ServerVersion.V_1_14);
        if (stringArray2 != null) {
            object = object != 0 ? ilIlfC.IlIlV() : (Object)IlIlh7.b("j", (int)32375, (long)(0x582193671890A1C5L ^ l));
        }
        this.IlIlL = object;
        this.IlIlG = serverVersion.IlIlz(ServerVersion.V_1_16) ? IlIlPF.IlIlj(ilIlfC, IlIlWW.CHUNK, false) : IlIlPF.IlIlB(ilIlfC);
        this.IlIll = bl ? new IlIlo3(ilIlfC, (int)IlIlh7.b("j", (int)14188, (long)(0x2181CE3538A4E8DBL ^ l))) : null;
        this.IlIlc = bl2 ? new IlIlo3(ilIlfC, (int)IlIlh7.b("j", (int)27708, (long)(0x764BB564065F338AL ^ l))) : null;
    }

    public static IlIlh7 IlIlH(PacketWrapper<?> packetWrapper, boolean bl, boolean bl2) {
        long l = b ^ 0x1AEE6FD60EEFL;
        IlIlfm ilIlfm = new IlIlfm(packetWrapper);
        String[] stringArray = IlIlh7.IlIlg();
        IlIlh7 ilIlh7 = new IlIlh7(ilIlfm, bl, bl2, packetWrapper.IlIlw());
        if (PacketWrapper.IlIlz() == null) {
            IlIlh7.IlIlS(new String[2]);
        }
        return ilIlh7;
    }

    public static void IlIlg(PacketWrapper<?> packetWrapper, IlIlh7 ilIlh7) {
        IlIlLh ilIlLh = new IlIlLh(packetWrapper);
        IlIlh7.IlIlA(ilIlLh, ilIlh7, packetWrapper.IlIlw());
    }

    @Deprecated
    public static void IlIlK(IlIlLG ilIlLG, IlIlh7 ilIlh7) {
        IlIlh7.IlIlA(ilIlLG, ilIlh7, IlIlr7.IlIlb().IlIlq().IlIlF());
    }

    @Deprecated
    private static void IlIlA(IlIlLG ilIlLG, IlIlh7 ilIlh7, ServerVersion serverVersion) {
        long l = b ^ 0x7376F377BAA7L;
        String[] stringArray = IlIlh7.IlIlg();
        if (stringArray != null) {
            if (serverVersion.IlIlz(ServerVersion.V_1_14)) {
                ilIlLG.IlIlS(ilIlh7.IlIlL);
            }
            IlIlPF.IlIlA(ilIlLG, ilIlh7.IlIlG);
        }
        IlIlo3 ilIlo3 = ilIlh7.IlIll;
        if (stringArray != null) {
            if (ilIlo3 != null) {
                ilIlLG.IlIla(ilIlh7.IlIll.IlIlv());
            }
            ilIlo3 = ilIlh7.IlIlc;
        }
        if (ilIlo3 != null) {
            ilIlLG.IlIla(ilIlh7.IlIlc.IlIlv());
        }
    }

    @Override
    public int IlIly(int n, int n2, int n3) {
        return this.IlIlG.IlIlV(n, n2, n3);
    }

    @Override
    public void IlIlA(int n, int n2, int n3, int n4) {
        block8: {
            int n5;
            block9: {
                String[] stringArray;
                int n6;
                block6: {
                    block7: {
                        long l = b ^ 0x569709176640L;
                        n6 = this.IlIlG.IlIlC(n, n2, n3, n4);
                        stringArray = IlIlh7.IlIlg();
                        n5 = this.IlIlL;
                        if (stringArray != null) {
                            if (n5 == IlIlh7.b("j", (int)4078, (long)(0x126AB0EDEE33EA3AL ^ l))) {
                                return;
                            }
                            n5 = n4;
                        }
                        if (stringArray == null) break block6;
                        if (n5 == 0) break block7;
                        n5 = n6;
                        if (stringArray == null) break block6;
                        if (n5 != 0) break block7;
                        ++this.IlIlL;
                        if (stringArray != null) break block8;
                    }
                    n5 = n4;
                }
                if (stringArray == null) break block9;
                if (n5 != 0) break block8;
                n5 = n6;
            }
            if (n5 != 0) {
                --this.IlIlL;
            }
        }
    }

    @Override
    public boolean IlIlq() {
        long l = b ^ 0x41BADF1CB063L;
        String[] stringArray = IlIlh7.IlIlg();
        int n = this.IlIlL;
        if (stringArray != null) {
            if (n == IlIlh7.b("j", (int)32375, (long)(0x5821B8BA31A6CD82L ^ l))) {
                int n2;
                block9: {
                    int n3 = 0;
                    block0: while (true) {
                        int n4 = n3;
                        block1: while (n4 < IlIlh7.b("j", (int)16844, (long)(0x76C6BD11374AF23FL ^ l))) {
                            n2 = 0;
                            if (stringArray == null) break block9;
                            int n5 = n2;
                            block2: while (true) {
                                int n6 = n5;
                                block3: while (n6 < IlIlh7.b("j", (int)24852, (long)(0x72400004EF07D2E0L ^ l))) {
                                    n4 = 0;
                                    if (stringArray == null) continue block1;
                                    for (int i = v740511; i < IlIlh7.b("j", (int)24852, (long)(0x72400004EF07D2E0L ^ l)); ++i) {
                                        boolean bl;
                                        n6 = this.IlIlG.IlIlV(n3, n5, i);
                                        if (stringArray == null) continue block3;
                                        if (stringArray != null) {
                                            if (n6 == 0) continue;
                                            bl = false;
                                        }
                                        return bl;
                                    }
                                    ++n5;
                                    if (stringArray != null) continue block2;
                                }
                                break;
                            }
                            ++n3;
                            if (stringArray != null) continue block0;
                        }
                        break;
                    }
                    n2 = 1;
                }
                return n2 != 0;
            }
            n = this.IlIlL;
        }
        if (stringArray != null) {
            n = n == 0 ? 1 : 0;
        }
        return n != 0;
    }

    @Nullable
    public IlIlo3 IlIlx() {
        return this.IlIlc;
    }

    public void IlIlQ(@Nullable IlIlo3 ilIlo3) {
        this.IlIlc = ilIlo3;
    }

    @Nullable
    public IlIlo3 IlIlh() {
        return this.IlIll;
    }

    public void IlIlD(@Nullable IlIlo3 ilIlo3) {
        this.IlIll = ilIlo3;
    }

    public static void IlIlS(String[] stringArray) {
        IlIlP = stringArray;
    }

    public static String[] IlIlg() {
        return IlIlP;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IlIlh7.b = IlIls.a(-262618256005095948L, 9180298277126174348L, MethodHandles.lookup().lookupClass()).a(259577663167459L);
                IlIlh7.h = new HashMap<K, V>(13);
                IlIlh7.IlIlS(new String[2]);
                var0 = IlIlh7.b ^ 82604351949668L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u00cd,\u00120\u00b5\u00d9\u000b%Y\u00d0\u0090AD\u00b1\u00e8?\u00bdD\u00e2m\u001dU\u00bd`n?\u00e5\u00e0\u009c#\u0099\u00e3\u00b3\u00c1\u009b{t{l[";
                var7_6 = "\u00cd,\u00120\u00b5\u00d9\u000b%Y\u00d0\u0090AD\u00b1\u00e8?\u00bdD\u00e2m\u001dU\u00bd`n?\u00e5\u00e0\u009c#\u0099\u00e3\u00b3\u00c1\u009b{t{l[".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "uC\u0094\u00c4\u0080\u0006\u00ce\u00102@\u00887^\u0004\u00f6v";
                    var7_6 = "uC\u0094\u00c4\u0080\u0006\u00ce\u00102@\u00887^\u0004\u00f6v".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        IlIlh7.f = var8_3;
        IlIlh7.g = new Integer[7];
        IlIlh7.IlIlW = (int)IlIlh7.b("j", (int)19360, (long)(var0 ^ 2025613737889612629L));
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6AF3;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlh7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlh7.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlh7.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlh7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlh7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

