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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIloD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbf
extends PacketWrapper<IlIlbf> {
    private UUID IlIlf;
    private String IlIlL;
    private IlIloD IlIlX;
    private static final long b = IlIls.a(1360394123183613505L, -5523847385150516983L, MethodHandles.lookup().lookupClass()).a(170173638961450L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String LxCNlnawCj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbf(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbf(IlIloD ilIloD) {
        this(UUID.randomUUID(), ilIloD);
    }

    public IlIlbf(UUID uUID, IlIloD ilIloD) {
        super(IlIlnN.RESOURCE_PACK_STATUS);
        this.IlIlf = uUID;
        this.IlIlX = ilIloD;
    }

    @Deprecated
    public IlIlbf(String string, IlIloD ilIloD) {
        super(IlIlnN.RESOURCE_PACK_STATUS);
        this.IlIlL = string;
        this.IlIlX = ilIloD;
    }

    @Override
    public void IlIle() {
        block7: {
            block5: {
                IlIlbf ilIlbf;
                block6: {
                    boolean bl;
                    String string;
                    long l;
                    block4: {
                        l = b ^ 0x1A3F64FA730BL;
                        string = IlIlJH.IlIlw();
                        bl = this.IlIlg.IlIlz(ServerVersion.V_1_20_3);
                        if (string != null) break block4;
                        if (bl) {
                            this.IlIlf = this.IlIlv();
                        }
                        ilIlbf = this;
                        if (string != null) break block5;
                        bl = ilIlbf.IlIlg.IlIlC(ServerVersion.V_1_10);
                    }
                    if (!bl) break block6;
                    this.IlIlL = this.IlIlp((int)IlIlbf.b("c", (int)23945, (long)(0x7CFB98E0CE2E1FL ^ l)));
                    if (string == null) break block7;
                }
                ilIlbf = this;
            }
            ilIlbf.IlIlL = "";
        }
        int n = this.IlIlf();
        this.IlIlX = IlIloD.VALUES[n];
    }

    @Override
    public void IlIlJ() {
        IlIlbf ilIlbf;
        block6: {
            boolean bl;
            long l;
            block5: {
                l = b ^ 0x34219134DA3L;
                String string = IlIlJH.IlIlw();
                bl = this.IlIlg.IlIlz(ServerVersion.V_1_20_3);
                if (string != null) break block5;
                if (bl) {
                    this.IlIlc(this.IlIlf);
                }
                ilIlbf = this;
                if (string != null) break block6;
                bl = ilIlbf.IlIlg.IlIlC(ServerVersion.V_1_10);
            }
            if (bl) {
                this.IlIlm(this.IlIlL, (int)IlIlbf.b("c", (int)28194, (long)(0x4C929CA7B7B1231DL ^ l)));
            }
            ilIlbf = this;
        }
        ilIlbf.IlIlJ(this.IlIlX.ordinal());
    }

    public void IlIle(IlIlbf ilIlbf) {
        this.IlIlf = ilIlbf.IlIlf;
        this.IlIlL = ilIlbf.IlIlL;
        this.IlIlX = ilIlbf.IlIlX;
    }

    public UUID IlIln() {
        return this.IlIlf;
    }

    public void IlIll(UUID uUID) {
        this.IlIlf = uUID;
    }

    public IlIloD IlIlF() {
        return this.IlIlX;
    }

    public void IlIlf(IlIloD ilIloD) {
        this.IlIlX = ilIloD;
    }

    public String IlIlt() {
        return this.IlIlL;
    }

    public void IlIlt(String string) {
        this.IlIlL = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x46E632A269AAL;
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
        String string = " E\u00bfD\u00bd\u00d4\u00ebx\u001c~\u009a\u00c0T\u00cf \u00a6";
        int n2 = " E\u00bfD\u00bd\u00d4\u00ebx\u001c~\u009a\u00c0T\u00cf \u00a6".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7EE7;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlbf.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlbf.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlbf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

