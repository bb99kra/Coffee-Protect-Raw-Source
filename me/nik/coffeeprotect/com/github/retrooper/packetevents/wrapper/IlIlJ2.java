/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlXE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlCt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlOw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlJ2
extends PacketWrapper<IlIlJ2> {
    private static final int IlIly;
    private int IlIlx;
    @Nullable
    private Integer IlIll;
    private int IlIlQ;
    private int IlIlc;
    @Nullable
    private Integer IlIlN;
    private IlIlCt IlIlV;
    @Nullable
    private Map<Integer, IlIlCg> IlIln;
    @Nullable
    private Map<Integer, Optional<IlIlXE>> IlIlH;
    @Nullable
    private IlIlCg IlIlJ;
    @Nullable
    private IlIlXE IlIlE;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String egCoTuvmqj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ2(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    @ApiStatus.Obsolete
    public IlIlJ2(int n, Optional<Integer> optional, int n2, int n3, Optional<Integer> optional2, IlIlCt ilIlCt, Optional<Map<Integer, IlIlCg>> optional3, IlIlCg ilIlCg) {
        super(IlIlnN.CLICK_WINDOW);
        this.IlIlx = n;
        this.IlIll = optional.orElse(null);
        this.IlIlQ = n2;
        this.IlIlc = n3;
        this.IlIlN = optional2.orElse(null);
        this.IlIlV = ilIlCt;
        this.IlIln = optional3.orElse(null);
        this.IlIlJ = ilIlCg;
    }

    /*
     * Unable to fully structure code
     */
    public IlIlJ2(int var1_1, @Nullable Integer var2_2, int var3_3, int var4_4, IlIlCt var5_5, @Nullable Map<Integer, Optional<IlIlXE>> var6_6, @Nullable Optional<IlIlXE> var7_7) {
        var8_8 = IlIlJ2.b ^ 53380921114360L;
        super(IlIlnN.CLICK_WINDOW);
        this.IlIlx = var1_1;
        var10_9 = IlIlJH.IlIlw();
        this.IlIll = var2_2;
        this.IlIlQ = var3_3;
        this.IlIlc = var4_4;
        this.IlIlV = var5_5;
        this.IlIlH = var6_6;
        v0 = var7_7;
        if (var10_9 != null) ** GOTO lbl14
        if (v0 != null) {
            v0 = var7_7.orElse(null);
lbl14:
            // 2 sources

            v1 = (IlIlXE)v0;
        } else {
            v1 = null;
        }
        this.IlIlE = v1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void IlIle() {
        var1_1 = IlIlJ2.b ^ 138496022695453L;
        this.IlIlx = this.IlIle();
        var3_2 = IlIlJH.IlIlw();
        v0 = this.IlIlg.IlIlz(ServerVersion.V_1_17_1);
        if (var3_2 != null) ** GOTO lbl8
        if (v0 != 0) {
            v0 = this.IlIlf();
lbl8:
            // 2 sources

            v1 = v0;
        } else {
            v1 = null;
        }
        this.IlIll = v1;
        this.IlIlQ = this.IlIlG();
        this.IlIlc = this.IlIlE();
        v2 = this.IlIlg.IlIlz(ServerVersion.V_1_17);
        if (var3_2 != null) ** GOTO lbl20
        if (v2 != 0) {
            v3 = null;
        } else {
            v2 = this.IlIlG();
lbl20:
            // 2 sources

            v3 = v2;
        }
        this.IlIlN = v3;
        this.IlIlV = IlIlCt.IlIlO(this.IlIlf());
        this.IlIli();
    }

    protected void IlIli() {
        block6: {
            block7: {
                IlIlJ2 ilIlJ2;
                boolean bl;
                block4: {
                    String string;
                    block5: {
                        long l = b ^ 0x91DF1E0F0C2L;
                        string = IlIlJH.IlIlw();
                        bl = this.IlIlg.IlIlz(ServerVersion.V_1_21_5);
                        if (string != null) break block4;
                        if (!bl) break block5;
                        this.IlIlH = this.IlIli(packetWrapper -> Math.toIntExact(packetWrapper.IlIlG()), IlIlXE::IlIlB, (int)IlIlJ2.b("i", (int)18762, (long)(0x156F983D679BD50CL ^ l)));
                        this.IlIlE = IlIlXE.IlIlF(this);
                        if (string == null) break block6;
                    }
                    ilIlJ2 = this;
                    if (string != null) break block7;
                    bl = ilIlJ2.IlIlg.IlIlz(ServerVersion.V_1_17);
                }
                if (bl) {
                    this.IlIln = this.IlIlc(packetWrapper -> Math.toIntExact(packetWrapper.IlIlG()), PacketWrapper::IlIlk);
                }
                ilIlJ2 = this;
            }
            ilIlJ2.IlIlJ = this.IlIlk();
        }
    }

    public void IlIlo(IlIlJ2 ilIlJ2) {
        this.IlIlx = ilIlJ2.IlIlx;
        this.IlIll = ilIlJ2.IlIll;
        this.IlIlQ = ilIlJ2.IlIlQ;
        this.IlIlc = ilIlJ2.IlIlc;
        this.IlIlN = ilIlJ2.IlIlN;
        this.IlIlV = ilIlJ2.IlIlV;
        this.IlIln = ilIlJ2.IlIln;
        this.IlIlH = ilIlJ2.IlIlH;
        this.IlIlJ = ilIlJ2.IlIlJ;
        this.IlIlE = ilIlJ2.IlIlE;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void IlIlJ() {
        block16: {
            block14: {
                block15: {
                    block12: {
                        block13: {
                            block10: {
                                block11: {
                                    var1_1 = IlIlJ2.b ^ 110549838164149L;
                                    v0 = IlIlJH.IlIlw();
                                    var4_2 = this.IlIlg.IlIlz(ServerVersion.V_1_17);
                                    this.IlIlr(this.IlIlx);
                                    var3_3 = v0;
                                    v1 = this.IlIlg.IlIlz(ServerVersion.V_1_17_1);
                                    if (var3_3 != null) break block10;
                                    if (!v1) break block11;
                                    v2 = this.IlIll;
                                    if (var3_3 != null) ** GOTO lbl13
                                    if (v2 != null) {
                                        v2 = this.IlIll;
lbl13:
                                        // 2 sources

                                        v3 = v2;
                                    } else {
                                        v3 = -1;
                                    }
                                    this.IlIlJ(v3);
                                }
                                this.IlIlG(this.IlIlQ);
                                this.IlIlu(this.IlIlc);
                                v1 = var4_2;
                            }
                            if (var3_3 != null) break block12;
                            if (v1) break block13;
                            v4 = this.IlIlN;
                            if (var3_3 != null) ** GOTO lbl28
                            if (v4 != null) {
                                v4 = this.IlIlN;
lbl28:
                                // 2 sources

                                v5 = v4;
                            } else {
                                v5 = -1;
                            }
                            this.IlIlG(v5);
                        }
                        this.IlIlJ(this.IlIlV.ordinal());
                        v1 = this.IlIlg.IlIlz(ServerVersion.V_1_21_5);
                    }
                    if (var3_3 != null) break block14;
                    if (!v1) break block15;
                    v6 /* !! */  = this.IlIlH;
                    if (var3_3 == null) {
                        v6 /* !! */  = v6 /* !! */  != null ? this.IlIlH : Collections.emptyMap();
                    }
                    this.IlIla(v6 /* !! */ , (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlG(int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Integer;)V)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlE(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> java.util.Optional<me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlXE> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
                    IlIlXE.IlIlR(this, this.IlIlE);
                    if (var3_3 == null) break block16;
                }
                v1 = var4_2;
            }
            if (v1) {
                v7 /* !! */  = this.IlIln;
                if (var3_3 == null) {
                    v7 /* !! */  = v7 /* !! */  != null ? this.IlIln : Collections.emptyMap();
                }
                this.IlIla(v7 /* !! */ , (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlG(int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Integer;)V)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlj(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/IlIlCg;)V)());
            }
            this.IlIlj(this.IlIlJ);
        }
    }

    public int IlIlF() {
        return this.IlIlx;
    }

    public void IlIlQ(int n) {
        this.IlIlx = n;
    }

    public Optional<Integer> IlIlS() {
        return Optional.ofNullable(this.IlIll);
    }

    public void IlIlF(Optional<Integer> optional) {
        this.IlIll = optional.orElse(null);
    }

    public int IlIlN() {
        return this.IlIlQ;
    }

    public void IlIlx(int n) {
        this.IlIlQ = n;
    }

    public int IlIlC() {
        return this.IlIlc;
    }

    public void IlIlC(int n) {
        this.IlIlc = n;
    }

    @ApiStatus.Obsolete
    public Optional<Integer> IlIlK() {
        return Optional.ofNullable(this.IlIlN);
    }

    @ApiStatus.Obsolete
    public void IlIlS(int n) {
        this.IlIlN = n;
    }

    public IlIlCt IlIlC() {
        return this.IlIlV;
    }

    public void IlIlr(IlIlCt ilIlCt) {
        this.IlIlV = ilIlCt;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @ApiStatus.Obsolete
    public Optional<Map<Integer, IlIlCg>> IlIlY() {
        block6: {
            block5: {
                var1_1 = IlIlJ2.b ^ 122227755650476L;
                var3_2 = IlIlJH.IlIlw();
                v0 /* !! */  = this.IlIln;
                if (var3_2 == null) {
                    if (v0 /* !! */  != null) {
                        return Optional.of(this.IlIln);
                    }
                    v0 /* !! */  = this.IlIlH;
                }
                if (v0 /* !! */  == null) break block6;
                var4_3 = new HashMap<Integer, IlIlCg>(this.IlIlH.size());
                for (Map.Entry<Integer, Optional<IlIlXE>> var6_5 : this.IlIlH.entrySet()) {
                    var7_6 = var6_5.getValue().orElse(null);
                    v1 = var4_3;
                    if (var3_2 != null) break block5;
                    v2 = var7_6;
                    if (var3_2 != null) ** GOTO lbl18
                    if (v2 != null) {
                        v2 = var7_6;
lbl18:
                        // 2 sources

                        v3 = v2.IlIlf();
                    } else {
                        v3 = IlIlCg.IlIlP;
                    }
                    v1.put(var6_5.getKey(), v3);
                    if (var3_2 == null) continue;
                }
                v1 = var4_3;
            }
            return Optional.of(v1);
        }
        return Optional.empty();
    }

    @ApiStatus.Obsolete
    public void IlIlS(Map<Integer, IlIlCg> map) {
        this.IlIlP(Optional.ofNullable(map));
    }

    @ApiStatus.Obsolete
    public void IlIlP(Optional<Map<Integer, IlIlCg>> optional) {
        block6: {
            block7: {
                IlIlJ2 ilIlJ2;
                block8: {
                    long l = b ^ 0x445B60AC230BL;
                    this.IlIln = optional.orElse(null);
                    String string = IlIlJH.IlIlw();
                    ilIlJ2 = this;
                    if (string != null) break block7;
                    if (ilIlJ2.IlIln == null) break block8;
                    this.IlIlH = new HashMap<Integer, Optional<IlIlXE>>(this.IlIln.size());
                    for (Map.Entry<Integer, IlIlCg> entry : this.IlIln.entrySet()) {
                        this.IlIlH.put(entry.getKey(), IlIlXE.IlIle(entry.getValue()));
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block6;
                    }
                    if (string == null) break block6;
                }
                ilIlJ2 = this;
            }
            ilIlJ2.IlIlH = null;
        }
    }

    public @UnknownNullability Map<Integer, Optional<IlIlXE>> IlIlX() {
        return this.IlIlH;
    }

    public void IlIlW(Map<Integer, Optional<IlIlXE>> map) {
        this.IlIlH = map;
    }

    @ApiStatus.Obsolete
    public IlIlCg IlIln() {
        block6: {
            IlIlXE ilIlXE;
            block5: {
                long l = b ^ 0x30D52DEDC73AL;
                String string = IlIlJH.IlIlw();
                IlIlJ2 ilIlJ2 = this;
                if (string == null) {
                    if (ilIlJ2.IlIlJ != null) {
                        return this.IlIlJ;
                    }
                    ilIlJ2 = this;
                }
                ilIlXE = ilIlJ2.IlIlE;
                if (string != null) break block5;
                if (ilIlXE == null) break block6;
                ilIlXE = this.IlIlE;
            }
            return ilIlXE.IlIlf();
        }
        return IlIlCg.IlIlP;
    }

    @ApiStatus.Obsolete
    public void IlIlU(IlIlCg ilIlCg) {
        this.IlIlJ = ilIlCg;
        this.IlIlE = IlIlXE.IlIlq(ilIlCg);
    }

    public Optional<IlIlXE> IlIlW() {
        return Optional.ofNullable(this.IlIlE);
    }

    public void IlIlz(@Nullable IlIlXE ilIlXE) {
        this.IlIlE = ilIlXE;
    }

    public void IlIlT(Optional<IlIlXE> optional) {
        this.IlIlE = optional.orElse(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = IlIls.a(1453025046950115890L, -846745902182412907L, MethodHandles.lookup().lookupClass()).a(116045210040386L);
        h = new HashMap(13);
        long l = b ^ 0x396284D9F3A5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "9D\u00e2\u009a\u00e9&uIU\u0001\u00feV}\u008b<\u0091";
        int n2 = "9D\u00e2\u009a\u00e9&uIU\u0001\u00feV}\u008b<\u0091".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        g = new Integer[2];
        IlIly = (int)IlIlJ2.b("i", (int)6657, (long)(l ^ 0x245DFD269A9C8521L));
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2FE9;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlJ2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlJ2.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlJ2.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlJ2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlJ2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

