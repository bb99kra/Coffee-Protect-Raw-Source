/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlT2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlOu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlOw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlQ9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class IlIlZx<T extends MappedEntity> {
    @Nullable
    private final T IlIlx;
    @Nullable
    private final ResourceLocation IlIlg;
    @Nullable
    private final IlIlOu<T> IlIln;
    private static final long a = IlIls.a(-4814233126631462588L, -7679482603484322603L, MethodHandles.lookup().lookupClass()).a(53866240293860L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String EyZJcCKnEG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlZx(T t) {
        this(t, null, null);
    }

    public IlIlZx(ResourceLocation resourceLocation) {
        this(resourceLocation, (IlIlOu<T>)null);
    }

    public IlIlZx(ResourceLocation resourceLocation, @Nullable IlIlOu<T> ilIlOu) {
        this(null, resourceLocation, ilIlOu);
    }

    public IlIlZx(@Nullable T t, @Nullable ResourceLocation resourceLocation) {
        this(t, resourceLocation, null);
    }

    public IlIlZx(@Nullable T t, @Nullable ResourceLocation resourceLocation, @Nullable IlIlOu<T> ilIlOu) {
        block6: {
            block7: {
                long l = a ^ 0x67249FF82D78L;
                boolean bl = IlIlT2.IlIle();
                boolean bl2 = bl;
                try {
                    try {
                        try {
                            if (!bl2) break block6;
                            if (t != null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlZx.a(illegalArgumentException);
                        }
                        if (resourceLocation != null) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlZx.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException((String)((Object)IlIlZx.a("g", (int)14199, (long)(0x40267B9FD2348CCAL ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlZx.a(illegalArgumentException);
                }
            }
            this.IlIlx = t;
            this.IlIlg = resourceLocation;
            this.IlIln = ilIlOu;
        }
    }

    public static <T extends MappedEntity> IlIlZx<T> IlIlL(PacketWrapper<?> packetWrapper, IlIlOu<T> ilIlOu, IlIlQ9<T> ilIlQ9) {
        PacketWrapper<?> packetWrapper2;
        block4: {
            block5: {
                long l = a ^ 0x437F364580BAL;
                boolean bl = IlIlT2.IlIli();
                try {
                    try {
                        packetWrapper2 = packetWrapper;
                        if (bl) break block4;
                        if (!packetWrapper2.IlIlK()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlZx.a(illegalArgumentException);
                    }
                    return new IlIlZx<MappedEntity>((MappedEntity)ilIlQ9.apply(packetWrapper));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlZx.a(illegalArgumentException);
                }
            }
            packetWrapper2 = packetWrapper;
        }
        ClientVersion clientVersion = packetWrapper2.IlIlw().IlIlE();
        IlIlOu<T> ilIlOu2 = packetWrapper.IlIlu().IlIlF(ilIlOu, clientVersion);
        return new IlIlZx<T>(packetWrapper.readIdentifier(), ilIlOu2);
    }

    public static <T extends MappedEntity> void IlIls(PacketWrapper<?> packetWrapper, IlIlZx<T> ilIlZx, IlIlOw<T> ilIlOw) {
        block8: {
            block6: {
                long l = a ^ 0x3D8EFDB95603L;
                boolean bl = IlIlT2.IlIle();
                try {
                    block7: {
                        try {
                            try {
                                if (!bl) break block6;
                                if (ilIlZx.IlIlx == null) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlZx.a(illegalArgumentException);
                            }
                            packetWrapper.IlIla(true);
                            ilIlOw.accept(packetWrapper, ilIlZx.IlIlx);
                            if (bl) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlZx.a(illegalArgumentException);
                        }
                    }
                    packetWrapper.IlIla(false);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlZx.a(illegalArgumentException);
                }
            }
            packetWrapper.writeIdentifier(ilIlZx.IlIlg);
        }
    }

    public T IlIlV() {
        T t;
        block4: {
            T t2;
            block5: {
                long l = a ^ 0x43BA5115B0A6L;
                t2 = this.IlIlf();
                boolean bl = IlIlT2.IlIli();
                try {
                    try {
                        t = t2;
                        if (bl) break block4;
                        if (t != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlZx.a(illegalArgumentException);
                    }
                    throw new IllegalStateException((String)((Object)IlIlZx.a("g", (int)13055, (long)(0x6B4AB9C16C3149DL ^ l))) + this.IlIlg);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlZx.a(illegalArgumentException);
                }
            }
            t = t2;
        }
        return t;
    }

    @Nullable
    public T IlIlf() {
        block15: {
            IlIlZx ilIlZx;
            block16: {
                boolean bl;
                block14: {
                    block12: {
                        block13: {
                            long l = a ^ 0x50F472EC8643L;
                            bl = IlIlT2.IlIle();
                            try {
                                try {
                                    ilIlZx = this;
                                    if (!bl) break block12;
                                    if (ilIlZx.IlIlx == null) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlZx.a(illegalArgumentException);
                                }
                                return this.IlIlx;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlZx.a(illegalArgumentException);
                            }
                        }
                        ilIlZx = this;
                    }
                    try {
                        try {
                            if (!bl) break block14;
                            if (ilIlZx.IlIln == null) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlZx.a(illegalArgumentException);
                        }
                        ilIlZx = this;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlZx.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (!bl) break block16;
                        if (ilIlZx.IlIlg == null) break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlZx.a(illegalArgumentException);
                    }
                    ilIlZx = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlZx.a(illegalArgumentException);
                }
            }
            return ilIlZx.IlIln.getByName(this.IlIlg);
        }
        return null;
    }

    public ResourceLocation IlIlT() {
        block11: {
            T t;
            block10: {
                IlIlZx ilIlZx;
                boolean bl;
                block8: {
                    block9: {
                        long l = a ^ 0x423CF42655D3L;
                        bl = IlIlT2.IlIli();
                        try {
                            try {
                                ilIlZx = this;
                                if (bl) break block8;
                                if (ilIlZx.IlIlg == null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlZx.a(illegalArgumentException);
                            }
                            return this.IlIlg;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlZx.a(illegalArgumentException);
                        }
                    }
                    ilIlZx = this;
                }
                try {
                    try {
                        t = ilIlZx.IlIlx;
                        if (bl) break block10;
                        if (t == null) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlZx.a(illegalArgumentException);
                    }
                    t = this.IlIlx;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlZx.a(illegalArgumentException);
                }
            }
            return t.getName();
        }
        throw new AssertionError();
    }

    public boolean equals(Object object) {
        boolean bl;
        block10: {
            IlIlZx ilIlZx;
            block11: {
                Object object2;
                boolean bl2;
                block8: {
                    block9: {
                        long l = a ^ 0x3684ED04A77CL;
                        bl2 = IlIlT2.IlIli();
                        try {
                            try {
                                object2 = object;
                                if (bl2) break block8;
                                if (object2 instanceof IlIlZx) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlZx.a(illegalArgumentException);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlZx.a(illegalArgumentException);
                        }
                    }
                    object2 = object;
                }
                ilIlZx = (IlIlZx)object2;
                try {
                    try {
                        bl = Objects.equals(this.IlIlx, ilIlZx.IlIlx);
                        if (bl2) break block10;
                        if (bl) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlZx.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlZx.a(illegalArgumentException);
                }
            }
            bl = Objects.equals(this.IlIlg, ilIlZx.IlIlg);
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash(this.IlIlx, this.IlIlg);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x46A40715B515L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "+\u00f7'+cm\u000f\u00a7\u0005\u009b\u00ba\u00e1\u00f91\u0018\u00ff\u0083\u00bax\u00dc\u00c6\f\u00a6Z<Lt\u00d9\u00f9\u00b8o\u0087\u00c1\u00ef\u00f8\u0091\u0007*\u001eW2\u00e7\u00ed\u00be\u00d8\u0083E4X\u0086Ab\u0001\u00bd\u00ea\u00a1\u0014=\u0088\u00df\u0096\u0084\u00e0\u0010_{\u00b8\fg\u00fb\u00c9\u00f6\u00fb\u001bM^?\u009a\u0014\u0015\u0005v\u00d9\u00f78\u001b\u00e8n[\u00dblK.\u00ac\u00c8\u00a4\u00e8\tPl\u0088\u00afL\u0006f_\u00d1\u00c1\u007f\u00c6|\u00f1\u009d\u008f\u00d2\u00a7\u00c6\u0087\u0005\u0094W\u0087\u00ed6\u001b\u0011Z\u00e3_\u00ed\u00d5\u007fW\u00d9\u00cd\u0017\u00ea";
        int n2 = "+\u00f7'+cm\u000f\u00a7\u0005\u009b\u00ba\u00e1\u00f91\u0018\u00ff\u0083\u00bax\u00dc\u00c6\f\u00a6Z<Lt\u00d9\u00f9\u00b8o\u0087\u00c1\u00ef\u00f8\u0091\u0007*\u001eW2\u00e7\u00ed\u00be\u00d8\u0083E4X\u0086Ab\u0001\u00bd\u00ea\u00a1\u0014=\u0088\u00df\u0096\u0084\u00e0\u0010_{\u00b8\fg\u00fb\u00c9\u00f6\u00fb\u001bM^?\u009a\u0014\u0015\u0005v\u00d9\u00f78\u001b\u00e8n[\u00dblK.\u00ac\u00c8\u00a4\u00e8\tPl\u0088\u00afL\u0006f_\u00d1\u00c1\u007f\u00c6|\u00f1\u009d\u008f\u00d2\u00a7\u00c6\u0087\u0005\u0094W\u0087\u00ed6\u001b\u0011Z\u00e3_\u00ed\u00d5\u007fW\u00d9\u00cd\u0017\u00ea".length();
        int n3 = 48;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlZx.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1A8B;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/IlIlZx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            IlIlZx.c[n2] = IlIlZx.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlZx.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/IlIlZx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlZx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

