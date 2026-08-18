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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlf9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlh9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlLV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlxv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlbg
extends PacketWrapper<IlIlbg> {
    private static final int IlIlf;
    private static final int IlIls;
    private IlIlAn IlIlI;
    private IlIlxv IlIlv;
    private IlIlLV IlIlX;
    private String IlIlF;
    private IlIlAn IlIly;
    private IlIlAn IlIlL;
    private IlIlCn IlIle;
    private IlIlf9 IlIlx;
    private String IlIlr;
    private boolean IlIlm;
    private boolean IlIlT;
    private boolean IlIlD;
    private boolean IlIlQ;
    private float IlIlw;
    private long IlIlo;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String vxcrbOFIeL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbg(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbg(IlIlAn ilIlAn, IlIlxv ilIlxv, IlIlLV ilIlLV, String string, IlIlAn ilIlAn2, IlIlAn ilIlAn3, IlIlCn ilIlCn, IlIlf9 ilIlf9, String string2, boolean bl, boolean bl2, boolean bl3, float f, long l) {
        this(ilIlAn, ilIlxv, ilIlLV, string, ilIlAn2, ilIlAn3, ilIlCn, ilIlf9, string2, bl, false, bl2, bl3, f, l);
    }

    public IlIlbg(IlIlAn ilIlAn, IlIlxv ilIlxv, IlIlLV ilIlLV, String string, IlIlAn ilIlAn2, IlIlAn ilIlAn3, IlIlCn ilIlCn, IlIlf9 ilIlf9, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, float f, long l) {
        super(IlIlnN.UPDATE_STRUCTURE_BLOCK);
        this.IlIlI = ilIlAn;
        this.IlIlv = ilIlxv;
        this.IlIlX = ilIlLV;
        this.IlIlF = string;
        this.IlIly = ilIlAn2;
        this.IlIlL = ilIlAn3;
        this.IlIle = ilIlCn;
        this.IlIlx = ilIlf9;
        this.IlIlr = string2;
        this.IlIlm = bl;
        this.IlIlT = bl2;
        this.IlIlD = bl3;
        this.IlIlQ = bl4;
        this.IlIlw = f;
        this.IlIlo = l;
    }

    @Override
    public void IlIle() {
        long l = b ^ 0x2A99BB5C9FF1L;
        this.IlIlI = this.IlIlE();
        this.IlIlv = this.IlIly(IlIlxv.class);
        String string = IlIlJH.IlIlw();
        this.IlIlX = this.IlIly(IlIlLV.class);
        this.IlIlF = this.IlIli();
        Object object = this.IlIlg.IlIlz(ServerVersion.V_1_16_2);
        if (string == null) {
            object = object != 0 ? IlIlbg.b("s", (int)8654, (long)(0x1262EE88C3C3C966L ^ l)) : IlIlbg.b("s", (int)22698, (long)(0x5426CA0B09713005L ^ l));
        }
        int n = object;
        this.IlIly = new IlIlAn(IlIlh9.IlIln(this.IlIlE(), -n, n), IlIlh9.IlIln(this.IlIlE(), -n, n), IlIlh9.IlIln(this.IlIlE(), -n, n));
        this.IlIlL = new IlIlAn(IlIlh9.IlIln(this.IlIlE(), 0, n), IlIlh9.IlIln(this.IlIlE(), 0, n), IlIlh9.IlIln(this.IlIlE(), 0, n));
        this.IlIle = this.IlIly(IlIlCn.class);
        this.IlIlx = this.IlIly(IlIlf9.class);
        Object object2 = this.IlIlg.IlIlz(ServerVersion.V_1_17);
        if (string == null) {
            object2 = object2 != 0 ? (Object)IlIlbg.b("s", (int)27360, (long)(0x36EBC01AA0D0024AL ^ l)) : (Object)IlIlbg.b("s", (int)17572, (long)(0x310DDD4923CF2C0AL ^ l));
        }
        this.IlIlr = this.IlIlp((int)object2);
        this.IlIlw = IlIlh9.IlIlJ(this.IlIlX(), 0.0f, 1.0f);
        this.IlIlo = this.IlIlo();
        byte by = this.IlIlE();
        int n2 = by & 1;
        if (string == null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        this.IlIlm = n2;
        int n3 = by & IlIlbg.b("s", (int)29960, (long)(0x19626D02AACA9DA3L ^ l));
        if (string == null) {
            n3 = n3 != 0 ? 1 : 0;
        }
        this.IlIlT = n3;
        int n4 = by & 2;
        if (string == null) {
            n4 = n4 != 0 ? 1 : 0;
        }
        this.IlIlD = n4;
        int n5 = by & 4;
        if (string == null) {
            this.IlIlQ = n5 != 0 ? 1 : 0;
            n5 = this.IlIlQ ? 1 : 0;
        }
        if (string != null) {
            PacketWrapper.IlIle(new int[2]);
        }
    }

    @Override
    public void IlIlJ() {
        long l = b ^ 0x33E4C6B5A159L;
        String string = IlIlJH.IlIlw();
        this.IlIlh(this.IlIlI);
        String string2 = string;
        this.IlIlw(this.IlIlv);
        this.IlIlw(this.IlIlX);
        this.IlIlM(this.IlIlF);
        this.IlIlu(this.IlIly.IlIlj);
        this.IlIlu(this.IlIly.IlIlw);
        this.IlIlu(this.IlIly.IlIlk);
        this.IlIlu(this.IlIlL.IlIlj);
        this.IlIlu(this.IlIlL.IlIlw);
        this.IlIlu(this.IlIlL.IlIlk);
        this.IlIlw(this.IlIle);
        this.IlIlw(this.IlIlx);
        this.IlIlM(this.IlIlr);
        this.IlIlR(this.IlIlw);
        this.IlIls(this.IlIlo);
        int n = this.IlIlm;
        if (string2 == null) {
            n = n != 0 ? 1 : 0;
        }
        int n3 = 0 | n;
        n3 = this.IlIlD;
        if (string2 == null) {
            n3 = n3 != 0 ? 2 : 0;
        }
        int n5 = n2 | n3;
        n5 = this.IlIlQ;
        if (string2 == null) {
            n5 = n5 != 0 ? 4 : 0;
        }
        int n6 = n4 | n5;
        Object object = this.IlIlT;
        if (string2 == null) {
            object = object != 0 ? (Object)IlIlbg.b("s", (int)11387, (long)(0x2C5A4A5C1B637A7EL ^ l)) : 0;
        }
        this.IlIlu(n6 | object);
        if (PacketWrapper.IlIlz() == null) {
            IlIlJH.IlIlq("v22D");
        }
    }

    public void IlIlC(IlIlbg ilIlbg) {
        this.IlIlI = ilIlbg.IlIlI;
        this.IlIlv = ilIlbg.IlIlv;
        this.IlIlX = ilIlbg.IlIlX;
        this.IlIlF = ilIlbg.IlIlF;
        this.IlIly = ilIlbg.IlIly;
        this.IlIlL = ilIlbg.IlIlL;
        this.IlIle = ilIlbg.IlIle;
        this.IlIlx = ilIlbg.IlIlx;
        this.IlIlr = ilIlbg.IlIlr;
        this.IlIlm = ilIlbg.IlIlm;
        this.IlIlT = ilIlbg.IlIlT;
        this.IlIlD = ilIlbg.IlIlD;
        this.IlIlQ = ilIlbg.IlIlQ;
        this.IlIlw = ilIlbg.IlIlw;
        this.IlIlo = ilIlbg.IlIlo;
    }

    public IlIlAn IlIlf() {
        return this.IlIlI;
    }

    public void IlIlk(IlIlAn ilIlAn) {
        this.IlIlI = ilIlAn;
    }

    public IlIlxv IlIlu() {
        return this.IlIlv;
    }

    public void IlIlI(IlIlxv ilIlxv) {
        this.IlIlv = ilIlxv;
    }

    public IlIlLV IlIlc() {
        return this.IlIlX;
    }

    public void IlIla(IlIlLV ilIlLV) {
        this.IlIlX = ilIlLV;
    }

    public String IlIlz() {
        return this.IlIlF;
    }

    public void IlIlQ(String string) {
        this.IlIlF = string;
    }

    public IlIlAn IlIla() {
        return this.IlIly;
    }

    public void IlIlZ(IlIlAn ilIlAn) {
        this.IlIly = ilIlAn;
    }

    public IlIlAn IlIl_() {
        return this.IlIlL;
    }

    public void IlIlr(IlIlAn ilIlAn) {
        this.IlIlL = ilIlAn;
    }

    public IlIlCn IlIlB() {
        return this.IlIle;
    }

    public void IlIlc(IlIlCn ilIlCn) {
        this.IlIle = ilIlCn;
    }

    public IlIlf9 IlIlP() {
        return this.IlIlx;
    }

    public void IlIlF(IlIlf9 ilIlf9) {
        this.IlIlx = ilIlf9;
    }

    public String IlIlP() {
        return this.IlIlr;
    }

    public void IlIlz(String string) {
        this.IlIlr = string;
    }

    public boolean IlIlA() {
        return this.IlIlm;
    }

    public void IlIlJ(boolean bl) {
        this.IlIlm = bl;
    }

    public boolean IlIlk() {
        return this.IlIlT;
    }

    public void IlIlX(boolean bl) {
        this.IlIlT = bl;
    }

    public boolean IlIlx() {
        return this.IlIlD;
    }

    public void IlIlD(boolean bl) {
        this.IlIlD = bl;
    }

    public boolean IlIla() {
        return this.IlIlQ;
    }

    public void IlIlt(boolean bl) {
        this.IlIlQ = bl;
    }

    public float IlIlr() {
        return this.IlIlw;
    }

    public void IlIlJ(float f) {
        this.IlIlw = f;
    }

    public long IlIlX() {
        return this.IlIlo;
    }

    public void IlIlZ(long l) {
        this.IlIlo = l;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IlIlbg.b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(5167062602454314925L, -8913309043420722188L, MethodHandles.lookup().lookupClass()).a(201135158182961L);
                IlIlbg.h = new HashMap<K, V>(13);
                var0 = IlIlbg.b ^ 2544592741450L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "w\u009dt\u00d5\u00c6B\u00bb\u00ae\u00e2.\u00eb\u0014\u00f1\u00a4f\u0082\u008d;\u00c5\u00d4\u00fe\u00eb\u0004\u00cb\u00e6v\u00e6AU\u009fR\u0011\u009c4\u0095\u00b2\u009f\u000f{\u00e3)\u00b0\u00d0t\u00b0B\u0005\u00b6";
                var7_6 = "w\u009dt\u00d5\u00c6B\u00bb\u00ae\u00e2.\u00eb\u0014\u00f1\u00a4f\u0082\u008d;\u00c5\u00d4\u00fe\u00eb\u0004\u00cb\u00e6v\u00e6AU\u009fR\u0011\u009c4\u0095\u00b2\u009f\u000f{\u00e3)\u00b0\u00d0t\u00b0B\u0005\u00b6".length();
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
                    var6_5 = "\u0089\u00b5T\u00f2\u00c6\u00db\u00da\u00b1|47=R\u00fae\u00eb";
                    var7_6 = "\u0089\u00b5T\u00f2\u00c6\u00db\u00da\u00b1|47=R\u00fae\u00eb".length();
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
        IlIlbg.c = var8_3;
        IlIlbg.g = new Integer[8];
        IlIlbg.IlIlf = (int)IlIlbg.b("s", (int)13724, (long)(var0 ^ 1607914203223369358L));
        IlIlbg.IlIls = (int)IlIlbg.b("s", (int)24830, (long)(var0 ^ 2104381559119279081L));
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x65DF;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlbg.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlbg.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlbg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlbg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

