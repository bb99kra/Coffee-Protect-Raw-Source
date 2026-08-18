/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlbC
extends PacketWrapper<IlIlbC> {
    private Optional<Integer> IlIle;
    private boolean IlIl_;
    private String IlIlm;
    @Nullable
    private IlIlAn IlIlv;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String FojwwTYKoI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbC(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbC(int n, String string, @Nullable IlIlAn ilIlAn) {
        super(IlIlnN.TAB_COMPLETE);
        this.IlIle = Optional.of(n);
        this.IlIl_ = true;
        this.IlIlm = string;
        this.IlIlv = ilIlAn;
    }

    @Deprecated
    public IlIlbC(String string, boolean bl, @Nullable IlIlAn ilIlAn) {
        super(IlIlnN.TAB_COMPLETE);
        this.IlIle = Optional.empty();
        this.IlIlm = string;
        this.IlIl_ = bl;
        this.IlIlv = ilIlAn;
    }

    @Override
    public void IlIle() {
        block12: {
            block14: {
                IlIlbC ilIlbC;
                boolean bl;
                block13: {
                    Object object;
                    Object object2;
                    String string;
                    block7: {
                        long l;
                        block8: {
                            block11: {
                                Object object3;
                                block9: {
                                    block10: {
                                        l = b ^ 0x559D1BD628FL;
                                        int n = this.IlIlg.IlIlz(ServerVersion.V_1_13);
                                        string = IlIlJH.IlIlw();
                                        object2 = n;
                                        if (string != null) break block7;
                                        if (object2 == 0) break block8;
                                        object3 = this.IlIlg.IlIlz(ServerVersion.V_1_13_1);
                                        if (string != null) break block9;
                                        if (!object3) break block10;
                                        object = IlIlbC.b("l", (int)30661, (long)(0x2D2D7596FBC66957L ^ l));
                                        if (string == null) break block11;
                                    }
                                    object3 = IlIlbC.b("l", (int)6557, (long)(0x3ADEBE50CD768709L ^ l));
                                }
                                object = object3;
                            }
                            this.IlIle = Optional.of(this.IlIlf());
                            this.IlIlm = this.IlIlp((int)object);
                            if (string == null) break block12;
                        }
                        this.IlIle = Optional.empty();
                        object2 = IlIlbC.b("l", (int)16808, (long)(0x1B645A07D6105F39L ^ l));
                    }
                    object = object2;
                    this.IlIlm = this.IlIlp((int)object);
                    bl = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                    if (string != null) break block13;
                    if (bl) {
                        this.IlIl_ = this.IlIlK();
                    }
                    ilIlbC = this;
                    if (string != null) break block14;
                    bl = ilIlbC.IlIlg.IlIlz(ServerVersion.V_1_8);
                }
                if (!bl) break block12;
                ilIlbC = this;
            }
            ilIlbC.IlIlv = (IlIlAn)this.IlIlN(PacketWrapper::IlIlE);
        }
    }

    @Override
    public void IlIlJ() {
        block12: {
            IlIlbC ilIlbC;
            block14: {
                boolean bl;
                block13: {
                    Object object;
                    Object object2;
                    String string;
                    block7: {
                        long l;
                        block8: {
                            block11: {
                                Object object3;
                                block9: {
                                    block10: {
                                        l = b ^ 0x1C24AC545C27L;
                                        int n = this.IlIlg.IlIlz(ServerVersion.V_1_13);
                                        string = IlIlJH.IlIlw();
                                        object2 = n;
                                        if (string != null) break block7;
                                        if (object2 == 0) break block8;
                                        object3 = this.IlIlg.IlIlz(ServerVersion.V_1_13_1);
                                        if (string != null) break block9;
                                        if (!object3) break block10;
                                        object = IlIlbC.b("l", (int)9813, (long)(0x6501B9157A98066DL ^ l));
                                        if (string == null) break block11;
                                    }
                                    object3 = IlIlbC.b("l", (int)12775, (long)(0x4BA1773630F911DAL ^ l));
                                }
                                object = object3;
                            }
                            this.IlIlJ(this.IlIle.orElse(0));
                            this.IlIlm(this.IlIlm, (int)object);
                            if (string == null) break block12;
                        }
                        object2 = IlIlbC.b("l", (int)12533, (long)(0xCBB4FFB8B8B90CEL ^ l));
                    }
                    object = object2;
                    this.IlIlm(this.IlIlm, (int)object);
                    bl = this.IlIlg.IlIlz(ServerVersion.V_1_9);
                    if (string != null) break block13;
                    if (bl) {
                        this.IlIla(this.IlIl_);
                    }
                    ilIlbC = this;
                    if (string != null) break block14;
                    bl = ilIlbC.IlIlg.IlIlz(ServerVersion.V_1_8);
                }
                if (!bl) break block12;
                ilIlbC = this;
            }
            ilIlbC.IlIlI(this.IlIlv, PacketWrapper::IlIlh);
        }
    }

    public void IlIlW(IlIlbC ilIlbC) {
        this.IlIlm = ilIlbC.IlIlm;
        this.IlIl_ = ilIlbC.IlIl_;
        this.IlIle = ilIlbC.IlIle;
        this.IlIlv = ilIlbC.IlIlv;
    }

    public String IlIlA() {
        return this.IlIlm;
    }

    public void IlIln(String string) {
        this.IlIlm = string;
    }

    public Optional<Integer> IlIlN() {
        return this.IlIle;
    }

    public void IlIlC(@Nullable Integer n) {
        this.IlIle = Optional.ofNullable(n);
    }

    @Deprecated
    public boolean IlIlz() {
        return this.IlIl_;
    }

    @Deprecated
    public void IlIlM(boolean bl) {
        this.IlIl_ = bl;
    }

    public Optional<IlIlAn> IlIlV() {
        return Optional.ofNullable(this.IlIlv);
    }

    public void IlIlv(@Nullable IlIlAn ilIlAn) {
        this.IlIlv = ilIlAn;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IlIlbC.b = IlIls.a(-6060852315951467310L, 411164659311694909L, MethodHandles.lookup().lookupClass()).a(15918693390420L);
                IlIlbC.h = new HashMap<K, V>(13);
                var0 = IlIlbC.b ^ 65707747416958L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "u\u00dc\u00a7\u00d5\u00ce\u00feY[{\u00fa\u00ee\u00db\u00b3\u00cc\u00bd9P\u00a2j\u00be\u00a9\"\u00b8\u0003\u00ff\u009aJ\u00e6\u00b0\u00b9\u00ad\u00e3";
                var7_6 = "u\u00dc\u00a7\u00d5\u00ce\u00feY[{\u00fa\u00ee\u00db\u00b3\u00cc\u00bd9P\u00a2j\u00be\u00a9\"\u00b8\u0003\u00ff\u009aJ\u00e6\u00b0\u00b9\u00ad\u00e3".length();
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
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00bf\u008d)\u00fe\u00c6\u00feB\u008e\u000b(.vlu\u0016\u00cd";
                    var7_6 = "\u00bf\u008d)\u00fe\u00c6\u00feB\u008e\u000b(.vlu\u0016\u00cd".length();
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
lbl39:
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        IlIlbC.c = var8_3;
        IlIlbC.g = new Integer[6];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x13E1;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlbC.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlbC.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlbC.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

