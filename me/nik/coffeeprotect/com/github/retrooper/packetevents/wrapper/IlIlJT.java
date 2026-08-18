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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIln0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlOa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIloQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public class IlIlJT
extends PacketWrapper<IlIlJT> {
    private IlIlOa IlIlA;
    private boolean IlIls;
    private static int[] IlIlH;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String KOjQlSmYnT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJT(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJT(UUID uUID, String string) {
        this(new IlIlOa(uUID, string));
    }

    public IlIlJT(IlIlOa ilIlOa) {
        this(ilIlOa, true);
    }

    public IlIlJT(IlIlOa ilIlOa, boolean bl) {
        super(IlIln0.LOGIN_SUCCESS);
        this.IlIlA = ilIlOa;
        this.IlIls = bl;
    }

    @Override
    public void IlIle() {
        block14: {
            block19: {
                IlIlJT ilIlJT;
                boolean bl;
                block18: {
                    UUID uUID;
                    int[] nArray;
                    long l;
                    block17: {
                        IlIlJT ilIlJT2;
                        block15: {
                            block16: {
                                l = b ^ 0x2557A9A5878AL;
                                nArray = IlIlJT.IlIlT();
                                ilIlJT2 = this;
                                if (nArray == null) break block15;
                                if (!ilIlJT2.IlIlg.IlIlz(ServerVersion.V_1_16)) break block16;
                                uUID = this.IlIlv();
                                if (nArray != null) break block17;
                                PacketWrapper.IlIle(new int[1]);
                            }
                            ilIlJT2 = this;
                        }
                        uUID = UUID.fromString(ilIlJT2.IlIlp((int)IlIlJT.b("u", (int)15028, (long)(0x91DAE3ABE30D49L ^ l))));
                    }
                    String string = this.IlIlp((int)IlIlJT.b("u", (int)20145, (long)(0x588DFADD4E3A794EL ^ l)));
                    this.IlIlA = new IlIlOa(uUID, string);
                    bl = this.IlIlg.IlIlz(ServerVersion.V_1_19);
                    if (nArray != null) {
                        if (bl) {
                            int n = this.IlIlf();
                            for (int i = 0; i < n; ++i) {
                                String string2 = this.IlIli();
                                String string3 = this.IlIli();
                                String string4 = (String)this.IlIlN(PacketWrapper::IlIli);
                                IlIloQ ilIloQ = new IlIloQ(string2, string3, string4);
                                this.IlIlA.IlIlf().add(ilIloQ);
                                if (nArray != null) {
                                    if (nArray != null) continue;
                                }
                                break block14;
                            }
                        }
                        bl = this.IlIlg.IlIlz(ServerVersion.V_1_20_5);
                    }
                    if (nArray == null) break block18;
                    if (!bl) break block14;
                    ilIlJT = this;
                    if (nArray == null) break block19;
                    bl = ilIlJT.IlIlg.IlIlC(ServerVersion.V_1_21_2);
                }
                if (!bl) break block14;
                ilIlJT = this;
            }
            ilIlJT.IlIls = this.IlIlK();
        }
    }

    @Override
    public void IlIlJ() {
        block15: {
            IlIlJT ilIlJT;
            block20: {
                boolean bl;
                block19: {
                    int[] nArray;
                    long l;
                    block18: {
                        IlIlJT ilIlJT2;
                        block16: {
                            block17: {
                                l = b ^ 0x3C2AD44CB922L;
                                nArray = IlIlJT.IlIlT();
                                ilIlJT2 = this;
                                if (nArray == null) break block16;
                                if (!ilIlJT2.IlIlg.IlIlz(ServerVersion.V_1_16)) break block17;
                                this.IlIlc(this.IlIlA.IlIlM());
                                if (nArray != null) break block18;
                            }
                            ilIlJT2 = this;
                        }
                        ilIlJT2.IlIlm(this.IlIlA.IlIlM().toString(), (int)IlIlJT.b("u", (int)8976, (long)(0x17C7458FA18EAA44L ^ l)));
                    }
                    this.IlIlm(this.IlIlA.IlIlE(), (int)IlIlJT.b("u", (int)20252, (long)(0x762125E10EB3464AL ^ l)));
                    bl = this.IlIlg.IlIlz(ServerVersion.V_1_19);
                    if (nArray != null) {
                        if (bl) {
                            this.IlIlJ(this.IlIlA.IlIlf().size());
                            for (IlIloQ ilIloQ : this.IlIlA.IlIlf()) {
                                this.IlIlM(ilIloQ.IlIlK());
                                this.IlIlM(ilIloQ.IlIlT());
                                this.IlIlI(ilIloQ.IlIlV(), PacketWrapper::IlIlM);
                                if (nArray != null) {
                                    if (nArray != null) continue;
                                }
                                break block15;
                            }
                        }
                        bl = this.IlIlg.IlIlz(ServerVersion.V_1_20_5);
                    }
                    if (nArray == null) break block19;
                    if (!bl) break block15;
                    ilIlJT = this;
                    if (nArray == null) break block20;
                    bl = ilIlJT.IlIlg.IlIlC(ServerVersion.V_1_21_2);
                }
                if (!bl) break block15;
                ilIlJT = this;
            }
            ilIlJT.IlIla(this.IlIls);
        }
        if (PacketWrapper.IlIlz() == null) {
            IlIlJT.IlIlz(new int[5]);
        }
    }

    public void IlIlA(IlIlJT ilIlJT) {
        this.IlIlA = ilIlJT.IlIlA;
    }

    public IlIlOa IlIlW() {
        return this.IlIlA;
    }

    public void IlIlZ(IlIlOa ilIlOa) {
        this.IlIlA = ilIlOa;
    }

    @ApiStatus.Obsolete
    public boolean IlIli() {
        return this.IlIls;
    }

    @ApiStatus.Obsolete
    public void IlIlj(boolean bl) {
        this.IlIls = bl;
    }

    public static void IlIlz(int[] nArray) {
        IlIlH = nArray;
    }

    public static int[] IlIlT() {
        return IlIlH;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IlIlJT.b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(-253031445078394263L, 8242538650274404337L, MethodHandles.lookup().lookupClass()).a(3757612350580L);
                IlIlJT.h = new HashMap<K, V>(13);
                IlIlJT.IlIlz(new int[2]);
                var0 = IlIlJT.b ^ 82754010264592L;
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
                var6_5 = "\u00f3\u0087b\u00e5\u009d\u0096Q\u00fcH\u009c4\u00fe\u00b3?\u0099\u00e3";
                var7_6 = "\u00f3\u0087b\u00e5\u009d\u0096Q\u00fcH\u009c4\u00fe\u00b3?\u0099\u00e3".length();
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
                    var6_5 = "\u0007'\u001c\u0007T\u00d4\u00e1l`\u00d4Pzw\u0001\u0004\u00bf";
                    var7_6 = "\u0007'\u001c\u0007T\u00d4\u00e1l`\u00d4Pzw\u0001\u0004\u00bf".length();
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
        IlIlJT.c = var8_3;
        IlIlJT.g = new Integer[4];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A8D;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlJT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlJT.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlJT.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/IlIlJT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlJT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

