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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlZz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIljW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlvE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlh8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIliH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlJ1
extends PacketWrapper<IlIlJ1> {
    private String IlIlu;
    private IlIliH IlIlT;
    private List<IlIljW> IlIls;
    @Nullable
    private IlIlZz IlIlG;
    @Nullable
    private IlIlvE IlIlh;
    private static final long b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(7822033148648424303L, -5857844520285540848L, MethodHandles.lookup().lookupClass()).a(103983791108921L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String TOMbhHBdEu = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ1(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJ1(String string, IlIliH ilIliH, List<IlIljW> list, @Nullable IlIlvE ilIlvE) {
        super(IlIlnN.CHAT_COMMAND);
        this.IlIlu = string;
        this.IlIlT = ilIliH;
        this.IlIls = list;
        this.IlIlh = ilIlvE;
    }

    public IlIlJ1(String string, IlIliH ilIliH, List<IlIljW> list, @Nullable IlIlZz ilIlZz) {
        super(IlIlnN.CHAT_COMMAND);
        this.IlIlu = string;
        this.IlIlT = ilIliH;
        this.IlIls = list;
        this.IlIlG = ilIlZz;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        block7: {
            block8: {
                block5: {
                    block6: {
                        var1_1 = IlIlJ1.b ^ 75616946421560L;
                        var3_2 = IlIlJH.IlIlw();
                        v0 = this;
                        if (var3_2 != null) ** GOTO lbl9
                        if (v0.IlIlg.IlIlz(ServerVersion.V_1_20_5)) {
                            v1 = this.IlIli();
                        } else {
                            v0 = this;
lbl9:
                            // 2 sources

                            v1 = v0.IlIlp((int)IlIlJ1.b("x", (int)1903, (long)(5522077181148190712L ^ var1_1)));
                        }
                        this.IlIlu = v1;
                        var4_3 = this.IlIle();
                        var5_4 = this.IlIli();
                        this.IlIlT = new IlIliH(new IlIlh8(var5_4, new byte[0]), var4_3);
                        this.IlIls = this.IlIlm();
                        v2 = this.IlIlg.IlIlz(ServerVersion.V_1_19_3);
                        if (var3_2 != null) break block5;
                        if (!v2) break block6;
                        this.IlIlG = this.IlIlB();
                        if (var3_2 == null) break block7;
                    }
                    v2 = this.IlIlK();
                }
                var7_5 = v2;
                this.IlIlT.IlIlU(var7_5);
                v3 = this;
                if (var3_2 != null) break block8;
                if (!v3.IlIlg.IlIlz(ServerVersion.V_1_19_1)) break block7;
                v3 = this;
            }
            v3.IlIlh = this.IlIle();
        }
    }

    @Override
    public void IlIlJ() {
        block10: {
            IlIlJ1 ilIlJ1;
            block12: {
                String string;
                block11: {
                    boolean bl;
                    block7: {
                        block8: {
                            IlIlJ1 ilIlJ12;
                            block9: {
                                block6: {
                                    IlIlJ1 ilIlJ13;
                                    long l;
                                    block4: {
                                        block5: {
                                            l = b ^ 0x5DB88CD3C190L;
                                            string = IlIlJH.IlIlw();
                                            ilIlJ13 = this;
                                            if (string != null) break block4;
                                            if (!ilIlJ13.IlIlg.IlIlz(ServerVersion.V_1_20_5)) break block5;
                                            this.IlIlM(this.IlIlu);
                                            if (string == null) break block6;
                                        }
                                        ilIlJ13 = this;
                                    }
                                    ilIlJ13.IlIlm(this.IlIlu, (int)IlIlJ1.b("x", (int)20489, (long)(0x5E02EE48198FBE37L ^ l)));
                                }
                                this.IlIlw(this.IlIlT.IlIln());
                                this.IlIlP(this.IlIlT.IlIlp().IlIlA());
                                this.IlIlX(this.IlIls);
                                bl = this.IlIlg.IlIlz(ServerVersion.V_1_19_3);
                                if (string != null) break block7;
                                if (!bl) break block8;
                                ilIlJ12 = this;
                                if (string != null) break block9;
                                if (ilIlJ12.IlIlG == null) break block10;
                                ilIlJ12 = this;
                            }
                            ilIlJ12.IlIlD(this.IlIlG);
                            if (string == null) break block10;
                        }
                        this.IlIla(this.IlIlT.IlIlK());
                        ilIlJ1 = this;
                        if (string != null) break block11;
                        bl = ilIlJ1.IlIlg.IlIlz(ServerVersion.V_1_19_1);
                    }
                    if (!bl) break block10;
                    ilIlJ1 = this;
                }
                if (string != null) break block12;
                if (ilIlJ1.IlIlh == null) break block10;
                ilIlJ1 = this;
            }
            ilIlJ1.IlIlh(this.IlIlh);
        }
    }

    public void IlIlr(IlIlJ1 ilIlJ1) {
        this.IlIlu = ilIlJ1.IlIlu;
        this.IlIlT = ilIlJ1.IlIlT;
        this.IlIls = ilIlJ1.IlIls;
        this.IlIlG = ilIlJ1.IlIlG;
        this.IlIlh = ilIlJ1.IlIlh;
    }

    public String IlIlv() {
        return this.IlIlu;
    }

    public void IlIlE(String string) {
        this.IlIlu = string;
    }

    public IlIliH IlIlA() {
        return this.IlIlT;
    }

    public void IlIlu(IlIliH ilIliH) {
        this.IlIlT = ilIliH;
    }

    public List<IlIljW> IlIls() {
        return this.IlIls;
    }

    @Override
    public void IlIlw(List<IlIljW> list) {
        this.IlIls = list;
    }

    public @Nullable IlIlZz IlIlM() {
        return this.IlIlG;
    }

    public void IlIlm(@Nullable IlIlZz ilIlZz) {
        this.IlIlG = ilIlZz;
    }

    @Nullable
    public IlIlvE IlIlP() {
        return this.IlIlh;
    }

    public void IlIlC(@Nullable IlIlvE ilIlvE) {
        this.IlIlh = ilIlvE;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x71A4C402CFC0L;
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
        String string = "\u00e0\u00ec>{\u0001\u0093b+\u000f\u00c7\u0092\u001b\u0013\u00daQx";
        int n2 = "\u00e0\u00ec>{\u0001\u0093b+\u000f\u00c7\u0092\u001b\u0013\u00daQx".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5DE6;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlJ1", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlJ1.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlJ1.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlJ1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlJ1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

