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
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score.IlIlW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlvM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlhp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlrp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlFz
extends PacketWrapper<IlIlFz> {
    private String IlIlq;
    private IlIlrp IlIld;
    private Component IlIlN;
    @Nullable
    private IlIlhp IlIlt;
    @Nullable
    private IlIlW IlIlQ;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String dSQsrOKwXi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFz(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFz(String string, IlIlrp ilIlrp, Component component, @Nullable IlIlhp ilIlhp) {
        this(string, ilIlrp, component, ilIlhp, null);
    }

    public IlIlFz(String string, IlIlrp ilIlrp, Component component, @Nullable IlIlhp ilIlhp, @Nullable IlIlW ilIlW) {
        super(IlIlAG.SCOREBOARD_OBJECTIVE);
        this.IlIlq = string;
        this.IlIld = ilIlrp;
        this.IlIlN = component;
        this.IlIlt = ilIlhp;
        this.IlIlQ = ilIlW;
    }

    @Override
    public void IlIle() {
        block10: {
            block13: {
                IlIlFz ilIlFz;
                boolean bl;
                block11: {
                    PacketWrapper[] packetWrapperArray;
                    block12: {
                        IlIlFz ilIlFz2;
                        long l;
                        block7: {
                            block8: {
                                block9: {
                                    block6: {
                                        block4: {
                                            IlIlFz ilIlFz3;
                                            block5: {
                                                l = b ^ 0x49122C0DA95AL;
                                                packetWrapperArray = IlIlFh.IlIla();
                                                ilIlFz3 = this;
                                                if (packetWrapperArray == null) break block4;
                                                if (!ilIlFz3.IlIlg.IlIlz(ServerVersion.V_1_18)) break block5;
                                                this.IlIlq = this.IlIli();
                                                if (packetWrapperArray != null) break block6;
                                            }
                                            ilIlFz3 = this;
                                        }
                                        ilIlFz3.IlIlq = this.IlIlp((int)IlIlFz.b("h", (int)16225, (long)(0x2B0EB99D151B9C1L ^ l)));
                                    }
                                    this.IlIld = IlIlrp.IlIlH(this.IlIlE());
                                    ilIlFz2 = this;
                                    if (packetWrapperArray == null) break block7;
                                    if (ilIlFz2.IlIld == IlIlrp.CREATE) break block8;
                                    ilIlFz2 = this;
                                    if (packetWrapperArray == null) break block7;
                                    if (ilIlFz2.IlIld == IlIlrp.UPDATE) break block8;
                                    this.IlIlN = Component.empty();
                                    this.IlIlt = IlIlhp.INTEGER;
                                    IlIlFz ilIlFz4 = this;
                                    if (packetWrapperArray == null) break block9;
                                    if (!ilIlFz4.IlIlg.IlIlz(ServerVersion.V_1_20_3)) break block10;
                                    ilIlFz4 = this;
                                }
                                ilIlFz4.IlIlQ = null;
                                if (packetWrapperArray != null) break block10;
                            }
                            ilIlFz2 = this;
                        }
                        bl = ilIlFz2.IlIlg.IlIlC(ServerVersion.V_1_13);
                        if (packetWrapperArray == null) break block11;
                        if (!bl) break block12;
                        this.IlIlN = this.IlIlq().IlIlE(this.IlIlp((int)IlIlFz.b("h", (int)9567, (long)(0x6FBF83F40C8A3FDL ^ l))));
                        this.IlIlt = IlIlhp.IlIlY(this.IlIli());
                        if (packetWrapperArray != null) break block10;
                    }
                    this.IlIlN = this.IlIlJ();
                    this.IlIlt = IlIlhp.IlIlp(this.IlIlf());
                    ilIlFz = this;
                    if (packetWrapperArray == null) break block13;
                    bl = ilIlFz.IlIlg.IlIlz(ServerVersion.V_1_20_3);
                }
                if (!bl) break block10;
                ilIlFz = this;
            }
            ilIlFz.IlIlQ = (IlIlW)this.IlIlN(IlIlW::IlIlD);
        }
    }

    @Override
    public void IlIlJ() {
        block13: {
            IlIlFz ilIlFz;
            block22: {
                PacketWrapper[] packetWrapperArray;
                block21: {
                    IlIlFz ilIlFz2;
                    block19: {
                        block20: {
                            block14: {
                                block15: {
                                    block18: {
                                        IlIlFz ilIlFz3;
                                        block16: {
                                            block17: {
                                                long l;
                                                block11: {
                                                    block12: {
                                                        block10: {
                                                            IlIlFz ilIlFz4;
                                                            block8: {
                                                                block9: {
                                                                    l = b ^ 0x506F51E497F2L;
                                                                    packetWrapperArray = IlIlFh.IlIla();
                                                                    ilIlFz4 = this;
                                                                    if (packetWrapperArray == null) break block8;
                                                                    if (!ilIlFz4.IlIlg.IlIlz(ServerVersion.V_1_18)) break block9;
                                                                    this.IlIlM(this.IlIlq);
                                                                    if (packetWrapperArray != null) break block10;
                                                                }
                                                                ilIlFz4 = this;
                                                            }
                                                            ilIlFz4.IlIlm(this.IlIlq, (int)IlIlFz.b("h", (int)4927, (long)(0x111436F280F9AB34L ^ l)));
                                                        }
                                                        this.IlIlu((byte)this.IlIld.ordinal());
                                                        ilIlFz2 = this;
                                                        if (packetWrapperArray == null) break block11;
                                                        if (ilIlFz2.IlIld == IlIlrp.CREATE) break block12;
                                                        ilIlFz2 = this;
                                                        if (packetWrapperArray == null) break block11;
                                                        if (ilIlFz2.IlIld != IlIlrp.UPDATE) break block13;
                                                    }
                                                    ilIlFz2 = this;
                                                }
                                                if (packetWrapperArray == null) break block14;
                                                if (!ilIlFz2.IlIlg.IlIlC(ServerVersion.V_1_13)) break block15;
                                                String string = this.IlIlq().IlIle(this.IlIlN);
                                                this.IlIlM(IlIlvM.IlIlQ(string, (int)IlIlFz.b("h", (int)19267, (long)(0x557B7F528D83734AL ^ l))));
                                                ilIlFz3 = this;
                                                if (packetWrapperArray == null) break block16;
                                                if (ilIlFz3.IlIlt == null) break block17;
                                                this.IlIlM(this.IlIlt.name().toLowerCase(Locale.ROOT));
                                                if (packetWrapperArray != null) break block18;
                                            }
                                            ilIlFz3 = this;
                                        }
                                        ilIlFz3.IlIlM(IlIlhp.INTEGER.name().toLowerCase(Locale.ROOT));
                                    }
                                    if (packetWrapperArray != null) break block13;
                                }
                                this.IlIlz(this.IlIlN);
                                ilIlFz2 = this;
                            }
                            if (packetWrapperArray == null) break block19;
                            if (ilIlFz2.IlIlt == null) break block20;
                            this.IlIlJ(this.IlIlt.ordinal());
                            if (packetWrapperArray != null) break block21;
                        }
                        ilIlFz2 = this;
                    }
                    ilIlFz2.IlIlJ(IlIlhp.INTEGER.ordinal());
                }
                ilIlFz = this;
                if (packetWrapperArray == null) break block22;
                if (!ilIlFz.IlIlg.IlIlz(ServerVersion.V_1_20_3)) break block13;
                ilIlFz = this;
            }
            ilIlFz.IlIlI(this.IlIlQ, IlIlW::IlIlL);
        }
    }

    public void IlIls(IlIlFz ilIlFz) {
        this.IlIlq = ilIlFz.IlIlq;
        this.IlIld = ilIlFz.IlIld;
        this.IlIlN = ilIlFz.IlIlN;
        this.IlIlt = ilIlFz.IlIlt;
        this.IlIlQ = ilIlFz.IlIlQ;
    }

    public String IlIlH() {
        return this.IlIlq;
    }

    public void IlIlW(String string) {
        this.IlIlq = string;
    }

    public IlIlrp IlIlY() {
        return this.IlIld;
    }

    public void IlIlo(IlIlrp ilIlrp) {
        this.IlIld = ilIlrp;
    }

    public Component IlIlB() {
        return this.IlIlN;
    }

    public void IlIlR(@Nullable Component component) {
        this.IlIlN = component;
    }

    @Nullable
    public IlIlhp IlIlB() {
        return this.IlIlt;
    }

    public void IlIlq(@Nullable IlIlhp ilIlhp) {
        this.IlIlt = ilIlhp;
    }

    @Nullable
    public IlIlW IlIls() {
        return this.IlIlQ;
    }

    public void IlIla(@Nullable IlIlW ilIlW) {
        this.IlIlQ = ilIlW;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IlIlFz.b = IlIls.a(-4647457482178484615L, -3518126357642610744L, MethodHandles.lookup().lookupClass()).a(188295554952331L);
                IlIlFz.h = new HashMap<K, V>(13);
                var0 = IlIlFz.b ^ 75893574119142L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "4\u00b0\u00d2\u009b\u00f4\u0003\u00c7\u0091\u00f9m\u00b8a\f\u00c2\u00dc\u00de";
                var7_6 = "4\u00b0\u00d2\u009b\u00f4\u0003\u00c7\u0091\u00f9m\u00b8a\f\u00c2\u00dc\u00de".length();
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
                    var6_5 = "m\u00ed!\u00fa\u00f9\u00e4\u00f6\u0086\u009b\u00ba\u00b6\u0012\u00bfx\u0092\r";
                    var7_6 = "m\u00ed!\u00fa\u00f9\u00e4\u00f6\u0086\u009b\u00ba\u00b6\u0012\u00bfx\u0092\r".length();
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
        IlIlFz.c = var8_3;
        IlIlFz.g = new Integer[4];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBD0;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlFz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlFz.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlFz.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlFz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlFz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

