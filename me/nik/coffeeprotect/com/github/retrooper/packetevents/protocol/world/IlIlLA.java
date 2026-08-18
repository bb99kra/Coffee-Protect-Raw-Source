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
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlGa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlo3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlLA
implements Cloneable {
    private boolean IlIlf;
    private BitSet IlIle;
    private BitSet IlIlF;
    private BitSet IlIlT;
    private BitSet IlIlt;
    private int IlIln;
    private int IlIll;
    private byte[][] IlIlb;
    private byte[][] IlIlx;
    private static final long a = IlIls.a(-3377294597906296835L, -7221598149157757475L, MethodHandles.lookup().lookupClass()).a(13828078464145L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static transient /* synthetic */ String MQDYFFQxtx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlLA() {
    }

    public IlIlLA(boolean bl, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, int n, int n2, byte[][] byArray, byte[][] byArray2) {
        this.IlIlf = bl;
        this.IlIle = bitSet;
        this.IlIlF = bitSet2;
        this.IlIlT = bitSet3;
        this.IlIlt = bitSet4;
        this.IlIln = n;
        this.IlIll = n2;
        this.IlIlb = byArray;
        this.IlIlx = byArray2;
    }

    public IlIlLA IlIlo() {
        try {
            IlIlLA ilIlLA = (IlIlLA)super.clone();
            ilIlLA.IlIle = (BitSet)this.IlIle.clone();
            ilIlLA.IlIlF = (BitSet)this.IlIlF.clone();
            ilIlLA.IlIlT = (BitSet)this.IlIlT.clone();
            ilIlLA.IlIlt = (BitSet)this.IlIlt.clone();
            ilIlLA.IlIlb = (byte[][])this.IlIlb.clone();
            ilIlLA.IlIlx = (byte[][])this.IlIlx.clone();
            return ilIlLA;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError();
        }
    }

    public boolean IlIlf() {
        return this.IlIlf;
    }

    public void IlIlB(boolean bl) {
        this.IlIlf = bl;
    }

    public BitSet IlIlb() {
        return this.IlIle;
    }

    public void IlIlZ(BitSet bitSet) {
        this.IlIle = bitSet;
    }

    public BitSet IlIlj() {
        return this.IlIlF;
    }

    public void IlIlt(BitSet bitSet) {
        this.IlIlF = bitSet;
    }

    public BitSet IlIld() {
        return this.IlIlT;
    }

    public void IlIlf(BitSet bitSet) {
        this.IlIlT = bitSet;
    }

    public BitSet IlIlD() {
        return this.IlIlt;
    }

    public void IlIlm(BitSet bitSet) {
        this.IlIlt = bitSet;
    }

    public int IlIlE() {
        return this.IlIln;
    }

    public void IlIlI(int n) {
        this.IlIln = n;
    }

    public int IlIlm() {
        return this.IlIll;
    }

    public void IlIld(int n) {
        this.IlIll = n;
    }

    public byte[][] IlIlF() {
        return this.IlIlb;
    }

    public void IlIlZ(byte[][] byArray) {
        this.IlIlb = byArray;
    }

    public byte[][] IlIl_() {
        return this.IlIlx;
    }

    public void IlIlu(byte[][] byArray) {
        this.IlIlx = byArray;
    }

    public static IlIlLA IlIlN(PacketWrapper<?> packetWrapper) {
        int n;
        int n2;
        String string;
        IlIlLA ilIlLA;
        block12: {
            int n3;
            long l = a ^ 0x14A4D5481573L;
            ilIlLA = new IlIlLA();
            ServerVersion serverVersion = packetWrapper.IlIlw();
            string = IlIlo3.IlIlF();
            int n4 = serverVersion.IlIlS(ServerVersion.V_1_19_4);
            if (string != null) {
                if (n4 != 0) {
                    ilIlLA.IlIlf = packetWrapper.IlIlK();
                }
                ilIlLA.IlIlF = IlIlGa.IlIlO(packetWrapper);
                ilIlLA.IlIle = IlIlGa.IlIlO(packetWrapper);
                ilIlLA.IlIlt = IlIlGa.IlIlO(packetWrapper);
                ilIlLA.IlIlT = IlIlGa.IlIlO(packetWrapper);
                n4 = serverVersion.IlIlz(ServerVersion.V_1_17) ? 1 : 0;
            }
            Object object = n2 = n4;
            if (string != null) {
                object = object != 0 ? packetWrapper.IlIlf() : (Object)IlIlLA.a("x", (int)3786, (long)(0x75CDC8B1908EFDB8L ^ l));
            }
            ilIlLA.IlIln = object;
            ilIlLA.IlIlb = new byte[ilIlLA.IlIln][];
            for (n = 0; n < ilIlLA.IlIln; ++n) {
                block15: {
                    IlIlLA ilIlLA2;
                    block14: {
                        boolean bl;
                        block13: {
                            n3 = n2;
                            if (string == null) break block12;
                            if (string == null) break block13;
                            if (n3 != 0) break block14;
                            ilIlLA2 = ilIlLA;
                            if (string == null) break block15;
                            bl = ilIlLA2.IlIlF.get(n);
                        }
                        if (!bl) continue;
                    }
                    ilIlLA2 = ilIlLA;
                }
                ilIlLA2.IlIlb[n] = packetWrapper.IlIll();
                if (string != null) continue;
                PacketWrapper.IlIle(new int[3]);
                break;
            }
            Object object2 = n2;
            if (string != null) {
                object2 = object2 != 0 ? packetWrapper.IlIlf() : (Object)IlIlLA.a("x", (int)23882, (long)(0x28F1EB43EDA12E39L ^ l));
            }
            ilIlLA.IlIll = object2;
            ilIlLA.IlIlx = new byte[ilIlLA.IlIll][];
            n3 = n = 0;
        }
        while (n < ilIlLA.IlIll) {
            block19: {
                block18: {
                    IlIlLA ilIlLA3;
                    block17: {
                        int n5;
                        block16: {
                            n5 = n2;
                            if (string == null) break block16;
                            if (n5 != 0) break block17;
                            ilIlLA3 = ilIlLA;
                            if (string == null) break block18;
                            n5 = ilIlLA3.IlIle.get(n) ? 1 : 0;
                        }
                        if (n5 == 0) break block19;
                    }
                    ilIlLA3 = ilIlLA;
                }
                ilIlLA3.IlIlx[n] = packetWrapper.IlIll();
            }
            ++n;
            if (string != null) continue;
        }
        return ilIlLA;
    }

    public static void IlIl_(PacketWrapper<?> packetWrapper, IlIlLA ilIlLA) {
        int n;
        int n2;
        int n3;
        String string;
        block15: {
            long l = a ^ 0x103D85E6AD95L;
            ServerVersion serverVersion = packetWrapper.IlIlw();
            string = IlIlo3.IlIlF();
            int n4 = serverVersion.IlIlS(ServerVersion.V_1_19_4);
            if (string != null) {
                if (n4 != 0) {
                    packetWrapper.IlIla(ilIlLA.IlIlf);
                }
                IlIlGa.IlIlZ(packetWrapper, ilIlLA.IlIlF);
                IlIlGa.IlIlZ(packetWrapper, ilIlLA.IlIle);
                IlIlGa.IlIlZ(packetWrapper, ilIlLA.IlIlt);
                IlIlGa.IlIlZ(packetWrapper, ilIlLA.IlIlT);
                n4 = serverVersion.IlIlz(ServerVersion.V_1_17) ? 1 : 0;
            }
            int n5 = n3 = n4;
            if (string != null) {
                if (n5 != 0) {
                    packetWrapper.IlIlJ(ilIlLA.IlIln);
                }
                n5 = n2 = 0;
            }
            while (n2 < ilIlLA.IlIln) {
                block18: {
                    block17: {
                        boolean bl;
                        block16: {
                            n = n3;
                            if (string == null) break block15;
                            if (string == null) break block16;
                            if (n != 0) break block17;
                            bl = ilIlLA.IlIlF.get(n2);
                        }
                        if (!bl) break block18;
                    }
                    packetWrapper.IlIlU(ilIlLA.IlIlb[n2]);
                }
                ++n2;
                if (string != null) continue;
            }
            n = n3;
        }
        if (string != null) {
            if (n != 0) {
                packetWrapper.IlIlJ(ilIlLA.IlIll);
            }
            n = n2 = 0;
        }
        while (n2 < ilIlLA.IlIll) {
            block21: {
                block20: {
                    int n6;
                    block19: {
                        n6 = n3;
                        if (string == null) break block19;
                        if (n6 != 0) break block20;
                        n6 = ilIlLA.IlIle.get(n2) ? 1 : 0;
                    }
                    if (n6 == 0) break block21;
                }
                packetWrapper.IlIlU(ilIlLA.IlIlx[n2]);
            }
            ++n2;
            if (string != null) continue;
        }
        if (PacketWrapper.IlIlz() == null) {
            IlIlo3.IlIla("CSZ4tc");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x4F15AED9197EL;
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
        String string = "O\t\u00c8\u00bc<\u00b8\u009a\u00cd\u00b2\u00f0e \u0001\u00b6GF";
        int n2 = "O\t\u00c8\u00bc<\u00b8\u009a\u00cd\u00b2\u00f0e \u0001\u00b6GF".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x17A8;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlLA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlLA.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlLA.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlLA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlLA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

