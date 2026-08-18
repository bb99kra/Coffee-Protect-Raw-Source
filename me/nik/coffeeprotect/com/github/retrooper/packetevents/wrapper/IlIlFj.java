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
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlZM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlOa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIljY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIloQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlOw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlQ9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlTd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlrd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class IlIlFj
extends PacketWrapper<IlIlFj> {
    private EnumSet<IlIlTd> IlIlw;
    private List<IlIlrd> IlIln;
    private static final long b = IlIls.a(1367895121334930658L, 489890895429481828L, MethodHandles.lookup().lookupClass()).a(125885309134952L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String pwxGUcHjGx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFj(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFj(EnumSet<IlIlTd> enumSet, List<IlIlrd> list) {
        super(IlIlAG.PLAYER_INFO_UPDATE);
        this.IlIlw = enumSet;
        this.IlIln = list;
    }

    public IlIlFj(EnumSet<IlIlTd> enumSet, IlIlrd ... ilIlrdArray) {
        super(IlIlAG.PLAYER_INFO_UPDATE);
        this.IlIlw = enumSet;
        this.IlIln = new ArrayList<IlIlrd>();
        Collections.addAll(this.IlIln, ilIlrdArray);
    }

    public IlIlFj(IlIlTd ilIlTd, List<IlIlrd> list) {
        this(EnumSet.of(ilIlTd), list);
    }

    public IlIlFj(IlIlTd ilIlTd, IlIlrd ... ilIlrdArray) {
        this(EnumSet.of(ilIlTd), ilIlrdArray);
    }

    @Override
    public void IlIle() {
        this.IlIlw = this.IlIlY(IlIlTd.class);
        this.IlIln = this.IlIll(this::lambda$read$0);
    }

    @Override
    public void IlIlJ() {
        this.IlIlG(this.IlIlw, IlIlTd.class);
        this.IlIlQ(this.IlIln, this::lambda$write$2);
    }

    public void IlIlF(IlIlFj ilIlFj) {
        this.IlIlw = ilIlFj.IlIlw;
        this.IlIln = ilIlFj.IlIln;
    }

    public EnumSet<IlIlTd> IlIlB() {
        return this.IlIlw;
    }

    public void IlIlH(EnumSet<IlIlTd> enumSet) {
        this.IlIlw = enumSet;
    }

    public List<IlIlrd> IlIlk() {
        return this.IlIln;
    }

    public void IlIlf(List<IlIlrd> list) {
        this.IlIln = list;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$write$2(PacketWrapper var1_1, IlIlrd var2_2) {
        var3_3 = IlIlFj.b ^ 97216765061790L;
        v0 = IlIlFh.IlIla();
        var1_1.IlIlc(var2_2.IlIll());
        var5_4 = v0;
        for (IlIlTd var7_6 : this.IlIlw) {
            if (var5_4 == null) ** GOTO lbl11
            switch (var7_6.ordinal()) {
                case 0: {
                    var1_1.IlIlm(var2_2.IlIlQ().IlIlE(), (int)IlIlFj.b("g", (int)24754, (long)(3072632023972611649L ^ var3_3)));
                    this.IlIlQ(var2_2.IlIlQ().IlIlf(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$write$1(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIloQ ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/IlIloQ;)V)());
lbl11:
                    // 2 sources

                    if (var5_4 != null) break;
                }
                case 1: {
                    var1_1.IlIlI(var2_2.IlIlN(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlq(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlZM ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/IlIlZM;)V)());
                    if (var5_4 != null) break;
                }
                case 2: {
                    var1_1.IlIlJ(var2_2.IlIlJ().IlIli());
                    if (var5_4 != null) break;
                }
                case 3: {
                    var1_1.IlIla(var2_2.IlIlE());
                    if (var5_4 != null) break;
                }
                case 4: {
                    var1_1.IlIlJ(var2_2.IlIlV());
                    if (var5_4 != null) break;
                }
                case 5: {
                    var1_1.IlIlI(var2_2.IlIls(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlz(me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/Component;)V)());
                    if (var5_4 != null) break;
                }
                case 6: {
                    v1 /* !! */  = this;
                    if (var5_4 != null) {
                        if (!v1 /* !! */ .IlIlg.IlIlz(ServerVersion.V_1_21_2)) break;
                        v1 /* !! */  = var1_1;
                    }
                    v1 /* !! */ .IlIlJ(var2_2.IlIlG());
                    if (var5_4 != null) break;
                }
                case 7: {
                    v2 /* !! */  = this;
                    if (var5_4 != null) {
                        if (!v2 /* !! */ .IlIlg.IlIlz(ServerVersion.V_1_21_4)) break;
                        v2 /* !! */  = var1_1;
                    }
                    v2 /* !! */ .IlIla(var2_2.IlIlY());
                }
            }
            if (var5_4 != null) continue;
        }
    }

    private static /* synthetic */ void lambda$write$1(PacketWrapper packetWrapper, IlIloQ ilIloQ) {
        packetWrapper.IlIlM(ilIloQ.IlIlK());
        packetWrapper.IlIlM(ilIloQ.IlIlT());
        packetWrapper.IlIlI(ilIloQ.IlIlV(), PacketWrapper::IlIlM);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ IlIlrd lambda$read$0(PacketWrapper var1_1) {
        var2_2 = IlIlFj.b ^ 82343443359532L;
        var5_3 = var1_1.IlIlv();
        var6_4 = new IlIlOa(var5_3, null);
        var7_5 = IlIljY.IlIlK();
        var8_6 = false;
        var9_7 = 0;
        var4_8 = IlIlFh.IlIla();
        var10_9 = null;
        var11_10 = null;
        var12_11 = 0;
        var13_12 = false;
        for (IlIlTd var15_14 : this.IlIlw) {
            v0 = var15_14.ordinal();
            if (var4_8 == null) ** GOTO lbl20
            block0 : switch (v0) {
                case 0: {
                    var6_4.IlIlK(var5_3);
                    var6_4.IlIlN(var1_1.IlIlp((int)IlIlFj.b("g", (int)11190, (long)(9159803296985497846L ^ var2_2))));
                    v0 = var1_1.IlIlf();
lbl20:
                    // 2 sources

                    var16_15 = v0;
                    for (var17_16 = 0; var17_16 < var16_15; ++var17_16) {
                        var18_17 = var1_1.IlIli();
                        var19_18 = var1_1.IlIli();
                        var20_19 = (String)var1_1.IlIlN((IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIli(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/String;)());
                        var21_20 = new IlIloQ(var18_17, var19_18, var20_19);
                        var6_4.IlIlf().add(var21_20);
                        if (var4_8 == null) break block0;
                        if (var4_8 != null) continue;
                    }
                    if (var4_8 != null) break;
                }
                case 1: {
                    var10_9 = (IlIlZM)var1_1.IlIlN((IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlc(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/IlIlZM;)());
                    if (var4_8 != null) break;
                }
                case 2: {
                    var7_5 = IlIljY.IlIlE(var1_1.IlIlf());
                    if (var4_8 != null) break;
                }
                case 3: {
                    var8_6 = var1_1.IlIlK();
                    if (var4_8 != null) break;
                }
                case 4: {
                    var9_7 = var1_1.IlIlf();
                    if (var4_8 != null) break;
                }
                case 5: {
                    var11_10 = (Component)var1_1.IlIlN((IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlJ(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/Component;)());
                    if (var4_8 != null) break;
                }
                case 6: {
                    v1 = this.IlIlg.IlIlz(ServerVersion.V_1_21_2);
                    if (var4_8 != null) {
                        if (v1 == 0) break;
                        v1 = var1_1.IlIlf();
                    }
                    var12_11 = v1;
                    if (var4_8 != null) break;
                }
                case 7: {
                    v2 = this.IlIlg.IlIlz(ServerVersion.V_1_21_4);
                    if (var4_8 == null || !v2) break;
                    v2 = var13_12 = var1_1.IlIlK();
                }
            }
            if (var4_8 != null) continue;
        }
        return new IlIlrd(var6_4, var8_6, var9_7, var7_5, var11_10, var10_9, var12_11, var13_12);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x4154E09C360FL;
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
        String string = "\u00fe\u0091F\u001b\r\u00b6\u0097\u00ad\u009e\u009d\u0097\u00c3\u00ac\u00aa\u00d9\u0001";
        int n2 = "\u00fe\u0091F\u001b\r\u00b6\u0097\u00ad\u009e\u009d\u0097\u00c3\u00ac\u00aa\u00d9\u0001".length();
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
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2BD;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlFj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlFj.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlFj.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlFj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlFj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

