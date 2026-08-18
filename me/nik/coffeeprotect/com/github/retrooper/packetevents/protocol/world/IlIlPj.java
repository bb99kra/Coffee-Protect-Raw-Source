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
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTLongArray;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlTy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlo3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlrw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlPj {
    private final int IlIlD;
    private final int IlIlM;
    private final boolean IlIlL;
    private final IlIlCV[] IlIlk;
    private final IlIlTy[] IlIlN;
    private final boolean IlIlT;
    @Nullable
    private NBTCompound IlIlS;
    @Nullable
    private Map<IlIlrw, long[]> IlIlP;
    private final boolean IlIlt;
    private int[] IlIln;
    private byte[] IlIlK;
    private static final long a = IlIls.a(-2028576094097797784L, -8039951915187237204L, MethodHandles.lookup().lookupClass()).a(114753876514535L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static transient /* synthetic */ String BBYbcJJOrB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public IlIlPj(int var1_1, int var2_2, boolean var3_3, IlIlCV[] var4_4, IlIlTy[] var5_5, int[] var6_6) {
        var7_7 = IlIlPj.a ^ 61574198912421L;
        v0 = IlIlo3.IlIlF();
        super();
        var9_8 = v0;
        this.IlIlD = var1_1;
        this.IlIlM = var2_2;
        v1 = this;
        v2 = var3_3;
        if (var9_8 == null) ** GOTO lbl17
        v1.IlIlL = v2;
        this.IlIlk = Arrays.copyOf(var4_4, var4_4.length);
        v1 = this;
        if (var5_5 != null) {
            v3 = var5_5;
        } else {
            v2 = 0;
lbl17:
            // 2 sources

            v3 = new IlIlTy[v2];
        }
        v1.IlIlN = v3;
        this.IlIlT = false;
        this.IlIlS = new NBTCompound();
        this.IlIlt = true;
        v4 /* !! */  = var6_6;
        if (var9_8 != null) {
            v4 /* !! */  = (int[])(v4 /* !! */  != null ? Arrays.copyOf(var6_6, var6_6.length) : null);
        }
        this.IlIln = v4 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public IlIlPj(int var1_1, int var2_2, boolean var3_3, IlIlCV[] var4_4, IlIlTy[] var5_5) {
        var6_6 = IlIlPj.a ^ 53595719653714L;
        super();
        this.IlIlD = var1_1;
        this.IlIlM = var2_2;
        var8_7 = IlIlo3.IlIlF();
        v0 = this;
        v1 = var3_3;
        if (var8_7 == null) ** GOTO lbl16
        v0.IlIlL = v1;
        this.IlIlk = Arrays.copyOf(var4_4, var4_4.length);
        v0 = this;
        if (var5_5 != null) {
            v2 = var5_5;
        } else {
            v1 = 0;
lbl16:
            // 2 sources

            v2 = new IlIlTy[v1];
        }
        v0.IlIlN = v2;
        this.IlIlT = false;
        this.IlIlS = new NBTCompound();
        this.IlIlt = false;
        this.IlIln = new int[IlIlPj.a("s", (int)27568, (long)(3855590452242949776L ^ var6_6))];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public IlIlPj(int var1_1, int var2_2, boolean var3_3, IlIlCV[] var4_4, IlIlTy[] var5_5, NBTCompound var6_6) {
        var7_7 = IlIlPj.a ^ 59066545028971L;
        v0 = IlIlo3.IlIlF();
        super();
        var9_8 = v0;
        this.IlIlD = var1_1;
        this.IlIlM = var2_2;
        v1 = this;
        v2 = var3_3;
        if (var9_8 == null) ** GOTO lbl17
        v1.IlIlL = v2;
        this.IlIlk = Arrays.copyOf(var4_4, var4_4.length);
        v1 = this;
        if (var5_5 != null) {
            v3 = var5_5;
        } else {
            v2 = 0;
lbl17:
            // 2 sources

            v3 = new IlIlTy[v2];
        }
        v1.IlIlN = v3;
        this.IlIlT = true;
        this.IlIlS = var6_6;
        this.IlIlt = false;
        this.IlIln = new int[IlIlPj.a("s", (int)11692, (long)(7228513684620510900L ^ var7_7))];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public IlIlPj(int var1_1, int var2_2, boolean var3_3, IlIlCV[] var4_4, IlIlTy[] var5_5, Map<IlIlrw, long[]> var6_6) {
        var7_7 = IlIlPj.a ^ 49737582252546L;
        v0 = IlIlo3.IlIlF();
        super();
        var9_8 = v0;
        this.IlIlD = var1_1;
        this.IlIlM = var2_2;
        v1 = this;
        v2 = var3_3;
        if (var9_8 == null) ** GOTO lbl17
        v1.IlIlL = v2;
        this.IlIlk = Arrays.copyOf(var4_4, var4_4.length);
        v1 = this;
        if (var5_5 != null) {
            v3 = var5_5;
        } else {
            v2 = 0;
lbl17:
            // 2 sources

            v3 = new IlIlTy[v2];
        }
        v1.IlIlN = v3;
        this.IlIlT = true;
        this.IlIlS = null;
        this.IlIlP = var6_6;
        this.IlIlt = false;
        this.IlIln = new int[IlIlPj.a("s", (int)11692, (long)(7228504318865320925L ^ var7_7))];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public IlIlPj(int var1_1, int var2_2, boolean var3_3, IlIlCV[] var4_4, IlIlTy[] var5_5, NBTCompound var6_6, int[] var7_7) {
        var8_8 = IlIlPj.a ^ 70286741180507L;
        super();
        this.IlIlD = var1_1;
        this.IlIlM = var2_2;
        var10_9 = IlIlo3.IlIlF();
        v0 = this;
        v1 = var3_3;
        if (var10_9 == null) ** GOTO lbl16
        v0.IlIlL = v1;
        this.IlIlk = Arrays.copyOf(var4_4, var4_4.length);
        v0 = this;
        if (var5_5 != null) {
            v2 = var5_5;
        } else {
            v1 = 0;
lbl16:
            // 2 sources

            v2 = new IlIlTy[v1];
        }
        v0.IlIlN = v2;
        this.IlIlT = true;
        this.IlIlS = var6_6;
        this.IlIlt = true;
        v3 /* !! */  = var7_7;
        if (var10_9 != null) {
            v3 /* !! */  = (int[])(v3 /* !! */  != null ? Arrays.copyOf(var7_7, var7_7.length) : null);
        }
        this.IlIln = v3 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public IlIlPj(int var1_1, int var2_2, boolean var3_3, IlIlCV[] var4_4, IlIlTy[] var5_5, NBTCompound var6_6, byte[] var7_7) {
        var8_8 = IlIlPj.a ^ 84566463749409L;
        super();
        this.IlIlD = var1_1;
        var10_9 = IlIlo3.IlIlF();
        this.IlIlM = var2_2;
        v0 = this;
        v1 = var3_3;
        if (var10_9 == null) ** GOTO lbl16
        v0.IlIlL = v1;
        this.IlIlk = Arrays.copyOf(var4_4, var4_4.length);
        v0 = this;
        if (var5_5 != null) {
            v2 = var5_5;
        } else {
            v1 = 0;
lbl16:
            // 2 sources

            v2 = new IlIlTy[v1];
        }
        v0.IlIlN = v2;
        this.IlIlT = true;
        this.IlIlS = var6_6;
        this.IlIlt = true;
        v3 /* !! */  = var7_7;
        if (var10_9 != null) {
            v3 /* !! */  = (byte[])(v3 /* !! */  != null ? Arrays.copyOf(var7_7, var7_7.length) : null);
        }
        this.IlIlK = v3 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public IlIlPj(int var1_1, int var2_2, boolean var3_3, IlIlCV[] var4_4, IlIlTy[] var5_5, byte[] var6_6) {
        var7_7 = IlIlPj.a ^ 67548553648383L;
        v0 = IlIlo3.IlIlF();
        super();
        this.IlIlD = var1_1;
        var9_8 = v0;
        this.IlIlM = var2_2;
        v1 = this;
        v2 = var3_3;
        if (var9_8 == null) ** GOTO lbl17
        v1.IlIlL = v2;
        this.IlIlk = Arrays.copyOf(var4_4, var4_4.length);
        v1 = this;
        if (var5_5 != null) {
            v3 = var5_5;
        } else {
            v2 = 0;
lbl17:
            // 2 sources

            v3 = new IlIlTy[v2];
        }
        v1.IlIlN = v3;
        this.IlIlT = false;
        this.IlIlS = new NBTCompound();
        this.IlIlt = true;
        v4 /* !! */  = var6_6;
        if (var9_8 != null) {
            v4 /* !! */  = (byte[])(v4 /* !! */  != null ? Arrays.copyOf(var6_6, var6_6.length) : null);
        }
        this.IlIlK = v4 /* !! */ ;
    }

    public int IlIlG() {
        return this.IlIlD;
    }

    public int IlIlx() {
        return this.IlIlM;
    }

    public boolean IlIlP() {
        return this.IlIlL;
    }

    public IlIlCV[] IlIlZ() {
        return this.IlIlk;
    }

    public IlIlTy[] IlIld() {
        return this.IlIlN;
    }

    public boolean IlIlE() {
        return this.IlIlT;
    }

    @Deprecated
    public NBTCompound IlIlK() {
        long l = a ^ 0x78C71FD68D5AL;
        String string = IlIlo3.IlIlF();
        NBTCompound nBTCompound = this.IlIlS;
        if (string != null) {
            if (nBTCompound == null) {
                this.IlIlS = new NBTCompound();
                for (Map.Entry<IlIlrw, long[]> entry : this.IlIlA().entrySet()) {
                    nBTCompound = this.IlIlS;
                    if (string != null) {
                        nBTCompound.setTag(entry.getKey().IlIld(), new NBTLongArray(entry.getValue()));
                        if (string != null) continue;
                    }
                    break;
                }
            } else {
                nBTCompound = this.IlIlS;
            }
        }
        return nBTCompound;
    }

    public Map<IlIlrw, long[]> IlIlA() {
        Map<IlIlrw, long[]> map;
        block3: {
            block4: {
                NBTCompound nBTCompound;
                String string;
                block7: {
                    block8: {
                        block5: {
                            IlIlPj ilIlPj;
                            block6: {
                                long l = a ^ 0x547CA522AF77L;
                                string = IlIlo3.IlIlF();
                                map = this.IlIlP;
                                if (string == null) break block3;
                                if (map != null) break block4;
                                ilIlPj = this;
                                if (string == null) break block5;
                                if (!ilIlPj.IlIlT) break block6;
                                nBTCompound = this.IlIlS;
                                if (string == null) break block7;
                                if (!nBTCompound.isEmpty()) break block8;
                            }
                            ilIlPj = this;
                        }
                        ilIlPj.IlIlP = Collections.emptyMap();
                        if (string != null) break block4;
                    }
                    this.IlIlP = new EnumMap<IlIlrw, long[]>(IlIlrw.class);
                    nBTCompound = this.IlIlS;
                }
                for (Map.Entry<String, NBT> entry : nBTCompound.getTags().entrySet()) {
                    block10: {
                        Object object;
                        IlIlrw ilIlrw;
                        block11: {
                            block9: {
                                object = ilIlrw = IlIlrw.IlIlH(entry.getKey());
                                if (string == null) break block9;
                                if (object == null) break block10;
                                object = entry.getValue();
                            }
                            if (string == null) break block11;
                            if (!(object instanceof NBTLongArray)) break block10;
                            object = entry.getValue();
                        }
                        long[] lArray = ((NBTLongArray)object).getValue();
                        this.IlIlP.put(ilIlrw, lArray);
                    }
                    if (string != null) continue;
                }
            }
            map = this.IlIlP;
        }
        return map;
    }

    public boolean IlIlg() {
        return this.IlIlt;
    }

    public int[] IlIlP() {
        return this.IlIln;
    }

    public byte[] IlIlL() {
        return this.IlIlK;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x73FBE6BE105AL;
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
        String string = "5q=\u00f2\u00b9K\u00833\u009bYr\u00df\u00dd\u0096*\u00b6";
        int n2 = "5q=\u00f2\u00b9K\u00833\u009bYr\u00df\u00dd\u0096*\u00b6".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5AB6;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlPj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlPj.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlPj.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlPj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlPj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

