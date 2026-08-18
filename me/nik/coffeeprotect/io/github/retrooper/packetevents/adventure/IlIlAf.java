/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlCK;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlOY;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlPH;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlfk;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlhX;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlj.IlIlv8;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlnK;
import org.jspecify.annotations.Nullable;

final class IlIlAf
implements IlIlnK {
    private final IlIlPH IlIlj;
    private final IdentityHashMap<IlIlfk<?>, Object> IlIlt = new IdentityHashMap();
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String UlvdrMZKfM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlAf(IlIlPH ilIlPH) {
        this.IlIlj = ilIlPH;
    }

    @Override
    public IlIlOY IlIlz() {
        block5: {
            IlIlAf ilIlAf;
            block4: {
                long l = a ^ 0x40FBC376B287L;
                int[] nArray = IlIlv_.IlIll();
                try {
                    try {
                        ilIlAf = this;
                        if (nArray != null) break block4;
                        if (!ilIlAf.IlIlt.isEmpty()) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlAf.a(illegalStateException);
                    }
                    ilIlAf = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlAf.a(illegalStateException);
                }
            }
            return ilIlAf.IlIlj.IlIlS();
        }
        return new IlIlhX(this.IlIlj, this.IlIlt);
    }

    @Override
    public <V> IlIlnK IlIlU(IlIlfk<V> ilIlfk, @Nullable V v) {
        block12: {
            Object object;
            int[] nArray;
            block10: {
                block11: {
                    long l = a ^ 0x30A05D46ACFEL;
                    nArray = IlIlv_.IlIll();
                    try {
                        try {
                            object = this.IlIlj;
                            if (nArray != null) break block10;
                            if (object.IlIlB(Objects.requireNonNull(ilIlfk, (String)((Object)IlIlAf.a("o", (int)10548, (long)(0x3B49BB9DD6783978L ^ l)))))) break block11;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw IlIlAf.a(illegalStateException);
                        }
                        throw new IllegalStateException((String)((Object)IlIlAf.a("o", (int)21153, (long)(0x186F0CFB6BF442ECL ^ l))) + ilIlfk.IlIlI() + (String)((Object)IlIlAf.a("o", (int)29624, (long)(0x499E8D4CD742E3F3L ^ l))));
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlAf.a(illegalStateException);
                    }
                }
                object = v;
            }
            try {
                block13: {
                    try {
                        try {
                            if (nArray != null) break block12;
                            if (object != null) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw IlIlAf.a(illegalStateException);
                        }
                        this.IlIlt.remove(ilIlfk);
                        if (nArray == null) break block12;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlAf.a(illegalStateException);
                    }
                }
                object = this.IlIlt.put(ilIlfk, v);
            }
            catch (IllegalStateException illegalStateException) {
                throw IlIlAf.a(illegalStateException);
            }
        }
        return this;
    }

    private void IlIle(Map<IlIlfk<?>, Object> map) {
        long l = a ^ 0xA09C0367B8AL;
        Iterator<Map.Entry<IlIlfk<?>, Object>> iterator = map.entrySet().iterator();
        int[] nArray = IlIlv_.IlIll();
        while (iterator.hasNext()) {
            block5: {
                Object object;
                Map.Entry<IlIlfk<?>, Object> entry;
                block6: {
                    entry = iterator.next();
                    try {
                        try {
                            object = this.IlIlj;
                            if (nArray != null) break block5;
                            if (object.IlIlB(entry.getKey())) break block6;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw IlIlAf.a(illegalStateException);
                        }
                        throw new IllegalStateException((String)((Object)IlIlAf.a("o", (int)949, (long)(0x4EA1259C76E2448FL ^ l))) + entry.getKey().IlIlI() + (String)((Object)IlIlAf.a("o", (int)9171, (long)(0x1B386B3455BAE4E8L ^ l))));
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlAf.a(illegalStateException);
                    }
                }
                object = this.IlIlt.put(entry.getKey(), entry.getValue());
            }
            if (nArray == null) continue;
        }
    }

    @Override
    public IlIlnK IlIlZ(IlIlOY ilIlOY) {
        block12: {
            boolean bl;
            int[] nArray;
            long l;
            block10: {
                l = a ^ 0x4C032E1EBCD3L;
                nArray = IlIlv_.IlIll();
                try {
                    block11: {
                        try {
                            try {
                                bl = ilIlOY instanceof IlIlhX;
                                if (nArray != null) break block10;
                                if (!bl) break block11;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw IlIlAf.a(illegalStateException);
                            }
                            this.IlIle(IlIlhX.IlIlU((IlIlhX)ilIlOY));
                            if (nArray == null) break block12;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw IlIlAf.a(illegalStateException);
                        }
                    }
                    bl = ilIlOY instanceof IlIlCK;
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlAf.a(illegalStateException);
                }
            }
            try {
                block13: {
                    try {
                        if (!bl) break block13;
                        this.IlIle(IlIlhX.IlIlU((IlIlhX)IlIlCK.IlIlQ((IlIlCK)ilIlOY)));
                        if (nArray == null) break block12;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlAf.a(illegalStateException);
                    }
                }
                throw new IllegalArgumentException((String)((Object)IlIlAf.a("o", (int)1760, (long)(0x551EDF06FB040684L ^ l))) + ilIlOY + (String)((Object)IlIlAf.a("o", (int)12675, (long)(0x111877729FA531E4L ^ l))));
            }
            catch (IllegalStateException illegalStateException) {
                throw IlIlAf.a(illegalStateException);
            }
        }
        return this;
    }

    @Override
    public IlIlnK IlIlo(IlIlv8 ilIlv8) {
        long l = a ^ 0x1FB32A4A6EDDL;
        Iterator<IlIlfk<?>> iterator = this.IlIlj.IlIlJ().iterator();
        int[] nArray = IlIlv_.IlIll();
        while (iterator.hasNext()) {
            block5: {
                IlIlfk<?> ilIlfk = iterator.next();
                Object obj = ilIlv8.IlIlw(ilIlfk);
                try {
                    Object object;
                    try {
                        object = obj;
                        if (nArray != null || object == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw IlIlAf.a(illegalStateException);
                    }
                    object = this.IlIlt.put(ilIlfk, obj);
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlAf.a(illegalStateException);
                }
            }
            if (nArray == null) continue;
        }
        return this;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIlAf.a = IlIls.a(5964863845969025945L, -2755679398592597607L, MethodHandles.lookup().lookupClass()).a(264860286182015L);
                IlIlAf.d = new HashMap<K, V>(13);
                var0 = IlIlAf.a ^ 14727710333218L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u00f3xA\u0013\u00d8\u00d0Z\u00b1\u0001%\u00e6\u0001\u00d3I\u0088{U\u00e0\u00f1:\u00b2\u001dm\u00d5\u00dc.(\u00e3(\u0086Q\u00ae-\u00d4H\u00e1L\u00fe3\u0082\u00ba\u00a8\u00c6VA\u00bd\u00fb!~\u000e!2\u00fe\u00b0\u009f^w\u00c5\u00c8\u009d\u0092C\u00c6\u0007 \u00d7\u0086\u00a9\u00a1J\u00bc\u00a6\u009f\u00ea\u0019\u0016\u0081a\u00ca\u00fe0\u00f5\u00ffw\u00f4\u0089#\u0094\u00bb\u0088\u00c5y\u00ef\u00fc\u0018\u00b7\u00bc\u0018\u00e3\u00d3p\u000b\u0016<\u00c2\u00fc\u0085\u00b6Y\u00ddv\r.\u00ff\u00d6\u00aa\u00b9\u009f\u00dfYX\u00c8\u00107K\u0007\u0004\u00a5\u00f6\u00e5\u00ff\u00df\u00b6bL`\u00932\u0019@p\u00a7\u00d7\u00dd\u00b6\u00b3\u00b2s\u0010\u0018\u00d2\u00ce\u00d5L\tP\u00e2\u001cw\u007f\u0000\u00b2_\u001d\u00df\u0001;\u00c0\r8\u00cd\u00a0\u00fe\u00e9f-i2\u00f5\u0097\u00ec\u00ba\u0097\u00f05o8\u00cc\u00c4\u00a3\u0090/DA\u001c\u00ac$\u00c1\u0084\u0015\u009b\u00f8\u00d8\u00e6";
                var8_6 = "\u00f3xA\u0013\u00d8\u00d0Z\u00b1\u0001%\u00e6\u0001\u00d3I\u0088{U\u00e0\u00f1:\u00b2\u001dm\u00d5\u00dc.(\u00e3(\u0086Q\u00ae-\u00d4H\u00e1L\u00fe3\u0082\u00ba\u00a8\u00c6VA\u00bd\u00fb!~\u000e!2\u00fe\u00b0\u009f^w\u00c5\u00c8\u009d\u0092C\u00c6\u0007 \u00d7\u0086\u00a9\u00a1J\u00bc\u00a6\u009f\u00ea\u0019\u0016\u0081a\u00ca\u00fe0\u00f5\u00ffw\u00f4\u0089#\u0094\u00bb\u0088\u00c5y\u00ef\u00fc\u0018\u00b7\u00bc\u0018\u00e3\u00d3p\u000b\u0016<\u00c2\u00fc\u0085\u00b6Y\u00ddv\r.\u00ff\u00d6\u00aa\u00b9\u009f\u00dfYX\u00c8\u00107K\u0007\u0004\u00a5\u00f6\u00e5\u00ff\u00df\u00b6bL`\u00932\u0019@p\u00a7\u00d7\u00dd\u00b6\u00b3\u00b2s\u0010\u0018\u00d2\u00ce\u00d5L\tP\u00e2\u001cw\u007f\u0000\u00b2_\u001d\u00df\u0001;\u00c0\r8\u00cd\u00a0\u00fe\u00e9f-i2\u00f5\u0097\u00ec\u00ba\u0097\u00f05o8\u00cc\u00c4\u00a3\u0090/DA\u001c\u00ac$\u00c1\u0084\u0015\u009b\u00f8\u00d8\u00e6".length();
                var5_7 = 64;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIlAf.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "(\u0010<\u0093\u00ca\u0089\n_\u00e05\u00fdl\u0094\u00de\r\u007f\u00ec$\u0092/4g\u00edJ\u00da*\u00d4+\u00abu\u0015:\u001dn\u000exyhr\u008fW\u0005Kjb\u00ba@\u0096\u0013\u0004\u00bb\u009fL\u00c8\u009f\u008a\u001c\u00cf\u00ad\u00e6h%\u00a5\u0091 P\u008a\u0018\u00e4\u0000\u0019X,\u00ab|\"\u00bd\u00f6/\u0081\u00dbv\u00b5\u00aeR\u00b6\u00ce\"iN\u00cf\u00aaX\u007fw\b\u0083";
                    var8_6 = "(\u0010<\u0093\u00ca\u0089\n_\u00e05\u00fdl\u0094\u00de\r\u007f\u00ec$\u0092/4g\u00edJ\u00da*\u00d4+\u00abu\u0015:\u001dn\u000exyhr\u008fW\u0005Kjb\u00ba@\u0096\u0013\u0004\u00bb\u009fL\u00c8\u009f\u008a\u001c\u00cf\u00ad\u00e6h%\u00a5\u0091 P\u008a\u0018\u00e4\u0000\u0019X,\u00ab|\"\u00bd\u00f6/\u0081\u00dbv\u00b5\u00aeR\u00b6\u00ce\"iN\u00cf\u00aaX\u007fw\b\u0083".length();
                    var5_7 = 64;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIlAf.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        IlIlAf.b = var9_3;
        IlIlAf.c = new String[7];
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x55BF;
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
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/IlIlAf", exception);
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
            IlIlAf.c[n2] = IlIlAf.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlAf.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/IlIlAf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlAf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

