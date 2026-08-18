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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbp
extends PacketWrapper<IlIlbp> {
    private boolean IlIld;
    private Optional<Boolean> IlIle;
    private Optional<Boolean> IlIlD;
    private Optional<Boolean> IlIlc;
    private Optional<Float> IlIlm;
    private Optional<Float> IlIlZ;
    private static final long b = IlIls.a(-5130097112372619427L, -4575568620696097228L, MethodHandles.lookup().lookupClass()).a(155783116918112L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String updfqZrjbs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbp(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbp(boolean bl, Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3, Optional<Float> optional4, Optional<Float> optional5) {
        super(IlIlnN.PLAYER_ABILITIES);
        this.IlIld = bl;
        this.IlIle = optional;
        this.IlIlD = optional2;
        this.IlIlc = optional3;
        this.IlIlm = optional4;
        this.IlIlZ = optional5;
    }

    public IlIlbp(boolean bl) {
        this(bl, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @Override
    public void IlIle() {
        block10: {
            String string;
            byte by;
            long l;
            block8: {
                IlIlbp ilIlbp;
                block9: {
                    l = b ^ 0x3F2D9F1F9E7DL;
                    by = this.IlIlE();
                    string = IlIlJH.IlIlw();
                    ilIlbp = this;
                    if (string != null) break block8;
                    if (!ilIlbp.IlIlg.IlIlz(ServerVersion.V_1_16)) break block9;
                    int n = by & 2;
                    if (string == null) {
                        n = n != 0 ? 1 : 0;
                    }
                    this.IlIld = n;
                    this.IlIle = Optional.empty();
                    this.IlIlD = Optional.empty();
                    this.IlIlc = Optional.empty();
                    this.IlIlm = Optional.empty();
                    this.IlIlZ = Optional.empty();
                    if (string == null) break block10;
                }
                ilIlbp = this;
            }
            boolean bl = by & 1;
            if (string == null) {
                bl = bl;
            }
            ilIlbp.IlIle = Optional.of(bl);
            int n = by & 2;
            if (string == null) {
                n = n != 0 ? 1 : 0;
            }
            this.IlIld = n;
            boolean bl2 = by & 4;
            if (string == null) {
                bl2 = bl2;
            }
            this.IlIlD = Optional.of(bl2);
            boolean bl3 = by & IlIlbp.b("o", (int)7501, (long)(0x1622074AF013E307L ^ l));
            if (string == null) {
                bl3 = bl3;
            }
            this.IlIlc = Optional.of(bl3);
            this.IlIlm = Optional.of(Float.valueOf(this.IlIlX()));
            this.IlIlZ = Optional.of(Float.valueOf(this.IlIlX()));
        }
    }

    @Override
    public void IlIlJ() {
        block12: {
            IlIlbp ilIlbp;
            block14: {
                boolean bl;
                byte by;
                long l;
                block13: {
                    byte by2;
                    String string;
                    block10: {
                        block11: {
                            l = b ^ 0x2650E2F6A0D5L;
                            string = IlIlJH.IlIlw();
                            by2 = this.IlIlg.IlIlz(ServerVersion.V_1_16);
                            if (string != null) break block10;
                            if (by2 == 0) break block11;
                            int n = this.IlIld;
                            if (string == null) {
                                n = n != 0 ? 2 : 0;
                            }
                            by = (byte)n;
                            this.IlIlu(by);
                            if (string == null) break block12;
                        }
                        by2 = 0;
                    }
                    by = by2;
                    bl = this.IlIle.orElse(false);
                    if (string == null) {
                        if (bl) {
                            by = (byte)(by | 1);
                        }
                        bl = this.IlIld;
                    }
                    if (string == null) {
                        if (bl) {
                            by = (byte)(by | 2);
                        }
                        bl = this.IlIlD.orElse(false);
                    }
                    if (string != null) break block13;
                    if (bl) {
                        by = (byte)(by | 4);
                    }
                    ilIlbp = this;
                    if (string != null) break block14;
                    bl = ilIlbp.IlIlc.orElse(false);
                }
                if (bl) {
                    by = (byte)(by | IlIlbp.b("o", (int)5817, (long)(0x447A534C784D65AL ^ l)));
                }
                this.IlIlu(by);
                this.IlIlR(this.IlIlm.orElse(Float.valueOf(0.1f)).floatValue());
                ilIlbp = this;
            }
            ilIlbp.IlIlR(this.IlIlZ.orElse(Float.valueOf(0.2f)).floatValue());
        }
    }

    public void IlIlW(IlIlbp ilIlbp) {
        this.IlIle = ilIlbp.IlIle;
        this.IlIld = ilIlbp.IlIld;
        this.IlIlD = ilIlbp.IlIlD;
        this.IlIlc = ilIlbp.IlIlc;
        this.IlIlm = ilIlbp.IlIlm;
        this.IlIlZ = ilIlbp.IlIlZ;
    }

    public boolean IlIlf() {
        return this.IlIld;
    }

    public void IlIlY(boolean bl) {
        this.IlIld = bl;
    }

    public Optional<Boolean> IlIlU() {
        return this.IlIle;
    }

    public void IlIlE(Optional<Boolean> optional) {
        this.IlIle = optional;
    }

    public Optional<Boolean> IlIlo() {
        return this.IlIlD;
    }

    public void IlIls(Optional<Boolean> optional) {
        this.IlIlD = optional;
    }

    public Optional<Boolean> IlIlt() {
        return this.IlIlc;
    }

    public void IlIlq(Optional<Boolean> optional) {
        this.IlIlc = optional;
    }

    public Optional<Float> IlIlH() {
        return this.IlIlm;
    }

    public void IlIlY(Optional<Float> optional) {
        this.IlIlm = optional;
    }

    public Optional<Float> IlIln() {
        return this.IlIlZ;
    }

    public void IlIlM(Optional<Float> optional) {
        this.IlIlZ = optional;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x5867741E814AL;
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
        String string = "\u00bb\u0089\u009c\u00df\u00e2\u00f7\u00e2\u007fy<\u0003\u00c5]\u00e3\u001aY";
        int n2 = "\u00bb\u0089\u009c\u00df\u00e2\u00f7\u00e2\u007fy<\u0003\u00c5]\u00e3\u001aY".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x733B;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlbp.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlbp.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlbp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

