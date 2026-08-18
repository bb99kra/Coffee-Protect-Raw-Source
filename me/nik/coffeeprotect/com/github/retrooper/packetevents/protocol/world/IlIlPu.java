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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlC8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlC6;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIliP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlGo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlPL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlQs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlXd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIliN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlnq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlOu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Deprecated
public class IlIlPu {
    private int IlIlJ;
    private NBTCompound IlIla;
    private static final long a = IlIls.a(7820029785198819865L, 382080866470994372L, MethodHandles.lookup().lookupClass()).a(194947625737030L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String spaxnXkMjn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Deprecated
    public IlIlPu(IlIlC6 ilIlC6) {
        this.IlIlJ = ilIlC6.IlIlN();
        this.IlIla = new NBTCompound();
    }

    public IlIlPu(int n) {
        this.IlIlJ = n;
        this.IlIla = new NBTCompound();
    }

    public IlIlPu(NBTCompound nBTCompound) {
        this.IlIla = nBTCompound;
    }

    @Deprecated
    public IlIlPu(int n, NBTCompound nBTCompound) {
        this.IlIlJ = n;
        this.IlIla = nBTCompound;
    }

    public static IlIlPu IlIlk(IlIlx ilIlx) {
        long l;
        block21: {
            IlIlx ilIlx2;
            block20: {
                boolean bl;
                block18: {
                    int n;
                    block19: {
                        block16: {
                            block17: {
                                block14: {
                                    block15: {
                                        l = a ^ 0x48985F8B0BC7L;
                                        n = IlIliP.IlIlI();
                                        try {
                                            bl = ilIlx instanceof IlIlGo;
                                            if (n == 0) break block14;
                                            if (!bl) break block15;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw IlIlPu.a(unsupportedOperationException);
                                        }
                                        IlIlPu ilIlPu = new IlIlPu(0);
                                        ilIlPu.IlIlC(ilIlx.IlIlc().toString());
                                        return ilIlPu;
                                    }
                                    bl = ilIlx instanceof IlIlXd;
                                }
                                try {
                                    try {
                                        if (n == 0) break block16;
                                        if (!bl) break block17;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw IlIlPu.a(unsupportedOperationException);
                                    }
                                    return new IlIlPu(ilIlx.IlIlD());
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw IlIlPu.a(unsupportedOperationException);
                                }
                            }
                            bl = ilIlx instanceof IlIlPL;
                        }
                        try {
                            try {
                                if (n == 0) break block18;
                                if (!bl) break block19;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw IlIlPu.a(unsupportedOperationException);
                            }
                            return new IlIlPu((NBTCompound)ilIlx.IlIlX());
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw IlIlPu.a(unsupportedOperationException);
                        }
                    }
                    try {
                        ilIlx2 = ilIlx;
                        if (n == 0) break block20;
                        bl = ilIlx2 instanceof IlIlQs;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw IlIlPu.a(unsupportedOperationException);
                    }
                }
                if (!bl) break block21;
                ilIlx2 = ilIlx;
            }
            return IlIlPu.IlIlL(((IlIlQs)ilIlx2).IlIlW(), null, ((IlIlQs)ilIlx).IlIly());
        }
        throw new UnsupportedOperationException((String)((Object)IlIlPu.a("l", (int)855, (long)(0x7C8A806150856804L ^ l))) + ilIlx);
    }

    public static IlIlPu IlIlL(IlIlnq ilIlnq, @Nullable IlIlG2 ilIlG2, @Nullable ClientVersion clientVersion) {
        block8: {
            ClientVersion clientVersion2;
            block11: {
                IlIlC8<?> ilIlC8;
                block10: {
                    block9: {
                        long l = a ^ 0x356AD256D9DBL;
                        int n = IlIliP.IlIlI();
                        try {
                            try {
                                try {
                                    try {
                                        if (clientVersion != null) break block8;
                                        if (ilIlG2 == null) break block9;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw IlIlPu.a(unsupportedOperationException);
                                    }
                                    ilIlC8 = IlIlr7.IlIlb();
                                    if (n == 0) break block10;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw IlIlPu.a(unsupportedOperationException);
                                }
                                if (!ilIlC8.IlIlh().IlIlK()) break block9;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw IlIlPu.a(unsupportedOperationException);
                            }
                            clientVersion2 = ilIlG2.IlIlh();
                            break block11;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw IlIlPu.a(unsupportedOperationException);
                        }
                    }
                    ilIlC8 = IlIlr7.IlIlb();
                }
                clientVersion2 = ilIlC8.IlIlq().IlIlF().IlIlE();
            }
            clientVersion = clientVersion2;
        }
        NBTCompound nBTCompound = (NBTCompound)IlIlnq.IlIle(ilIlnq, clientVersion);
        return new IlIlPu(ilIlnq.IlIlH(clientVersion), nBTCompound);
    }

    public IlIlx IlIli() {
        NBTCompound nBTCompound;
        block7: {
            block8: {
                long l = a ^ 0x23D4D2724CEL;
                int n = IlIliP.IlIlI();
                try {
                    try {
                        nBTCompound = this.IlIla;
                        if (n == 0) break block7;
                        if (nBTCompound != null) break block8;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw IlIlPu.a(unsupportedOperationException);
                    }
                    return new IlIlXd(this.IlIlJ);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw IlIlPu.a(unsupportedOperationException);
                }
            }
            nBTCompound = this.IlIla;
        }
        try {
            if (nBTCompound.size() > 1) {
                return new IlIlPL(this.IlIla);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw IlIlPu.a(unsupportedOperationException);
        }
        ResourceLocation resourceLocation = new ResourceLocation(this.IlIlJ());
        return new IlIlGo(resourceLocation);
    }

    public IlIlnq IlIlG(@Nullable IlIlG2 ilIlG2, @Nullable ClientVersion clientVersion) {
        IlIlOu<IlIlnq> ilIlOu;
        block19: {
            block18: {
                IlIlG2 ilIlG22;
                block17: {
                    int n;
                    block13: {
                        ClientVersion clientVersion2;
                        block16: {
                            IlIlC8<?> ilIlC8;
                            block15: {
                                block14: {
                                    long l = a ^ 0x13596B992F7DL;
                                    n = IlIliP.IlIlI();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (clientVersion != null) break block13;
                                                    if (ilIlG2 == null) break block14;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw IlIlPu.a(unsupportedOperationException);
                                                }
                                                ilIlC8 = IlIlr7.IlIlb();
                                                if (n == 0) break block15;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw IlIlPu.a(unsupportedOperationException);
                                            }
                                            if (!ilIlC8.IlIlh().IlIlK()) break block14;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw IlIlPu.a(unsupportedOperationException);
                                        }
                                        clientVersion2 = ilIlG2.IlIlh();
                                        break block16;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw IlIlPu.a(unsupportedOperationException);
                                    }
                                }
                                ilIlC8 = IlIlr7.IlIlb();
                            }
                            clientVersion2 = ilIlC8.IlIlq().IlIlF().IlIlE();
                        }
                        clientVersion = clientVersion2;
                    }
                    try {
                        ilIlG22 = ilIlG2;
                        if (n == 0) break block17;
                        if (ilIlG22 == null) break block18;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw IlIlPu.a(unsupportedOperationException);
                    }
                    ilIlG22 = ilIlG2;
                }
                ilIlOu = ilIlG22.IlIlF(IlIliN.IlIlQ(), clientVersion);
                break block19;
            }
            ilIlOu = IlIliN.IlIlQ();
        }
        VersionedRegistry<IlIlnq> versionedRegistry = ilIlOu;
        String string = this.IlIlJ();
        try {
            if (!string.isEmpty()) {
                return (IlIlnq)versionedRegistry.getByName(new ResourceLocation(string));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw IlIlPu.a(unsupportedOperationException);
        }
        return (IlIlnq)versionedRegistry.getById(clientVersion, this.IlIlJ);
    }

    public String IlIlJ() {
        long l = a ^ 0x79022EBCBAA3L;
        return this.IlIlt().getStringTagValueOrDefault((String)((Object)IlIlPu.a("l", (int)24521, (long)(0x7795DCBD9C5605FCL ^ l))), "");
    }

    public void IlIlC(String string) {
        long l = a ^ 0x6CEF7805BDD5L;
        NBTCompound nBTCompound = this.IlIlt();
        nBTCompound.setTag((String)((Object)IlIlPu.a("l", (int)22272, (long)(0x303962591B100A40L ^ l))), new NBTString(string));
        this.IlIlp(nBTCompound);
    }

    public int IlIlF() {
        return this.IlIlJ;
    }

    public void IlIll(int n) {
        this.IlIlJ = n;
    }

    @Deprecated
    public IlIlC6 IlIlt() {
        return IlIlC6.IlIlP(this.IlIlJ);
    }

    @Deprecated
    public void IlIlC(IlIlC6 ilIlC6) {
        this.IlIlJ = ilIlC6.IlIlN();
    }

    public NBTCompound IlIlt() {
        return this.IlIla;
    }

    public void IlIlp(NBTCompound nBTCompound) {
        this.IlIla = nBTCompound;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x2B55AF8BF4C0L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "w\u00e7F9BK\n\u00d3\u0003PRP5xW,\u008c\u00a6\u00d3\u00ef\u0087\u00e6'y\u00b3\u0001\u00d6\u00e5o|\u0018C\u0099r+Eod\u0080j\u00e6\u00ba\u0015\u00e1\u00e1k\u00a6\u00b9\u00f8R\u0000\u00e7\u0015\u00b4\u00e1\u00cb\u00da\u00ab\u00e3\u00a0q\u0001!\u00adr\u0012\u00b3\u0002\u00f0M\u00a1\u008d\u0010\u0089\u00f7\u008fX\u0014\b\u00a3_\u00deE\u00b18\u00a6\u009bV'\u0010\u0096'M\r\\\u00cb\u00db\u00bf'G#T\u00d0\u0001>\u001d";
        int n2 = "w\u00e7F9BK\n\u00d3\u0003PRP5xW,\u008c\u00a6\u00d3\u00ef\u0087\u00e6'y\u00b3\u0001\u00d6\u00e5o|\u0018C\u0099r+Eod\u0080j\u00e6\u00ba\u0015\u00e1\u00e1k\u00a6\u00b9\u00f8R\u0000\u00e7\u0015\u00b4\u00e1\u00cb\u00da\u00ab\u00e3\u00a0q\u0001!\u00adr\u0012\u00b3\u0002\u00f0M\u00a1\u008d\u0010\u0089\u00f7\u008fX\u0014\b\u00a3_\u00deE\u00b18\u00a6\u009bV'\u0010\u0096'M\r\\\u00cb\u00db\u00bf'G#T\u00d0\u0001>\u001d".length();
        int n3 = 72;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlPu.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5ED7;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlPu", exception);
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
            IlIlPu.c[n2] = IlIlPu.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlPu.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlPu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlPu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

