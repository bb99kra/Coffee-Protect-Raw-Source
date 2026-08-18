/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlT2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlod;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlv1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlAT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlrm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlOu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public interface IlIlO2<T extends MappedEntity>
extends Supplier<T> {
    public static final long a = IlIls.a(1211251040705210804L, -4022183118278282879L, MethodHandles.lookup().lookupClass()).a(49775054493430L);
    public static final String c;

    public T IlIlA();

    public static <T extends MappedEntity> IlIlO2<T> IlIlA(NBT nBT, IlIlOu<T> ilIlOu, IlIlAT<T> ilIlAT, PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x5A73463493E2L;
        if (nBT instanceof NBTString) {
            ResourceLocation resourceLocation = new ResourceLocation(((NBTString)nBT).getValue());
            return new IlIlod<T>(packetWrapper, ilIlOu, resourceLocation);
        }
        return new IlIlv1<MappedEntity>((MappedEntity)ilIlAT.IlIlA(nBT, packetWrapper));
    }

    public static <T extends MappedEntity> NBT IlIlJ(PacketWrapper<?> packetWrapper, IlIlrm<T> ilIlrm, IlIlO2<T> ilIlO2) {
        boolean bl;
        block7: {
            block8: {
                long l = a ^ 0x79893F3E1054L;
                boolean bl2 = IlIlT2.IlIle();
                try {
                    try {
                        bl = ilIlO2 instanceof IlIlod;
                        if (!bl2) break block7;
                        if (!bl) break block8;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw IlIlO2.a(unsupportedOperationException);
                    }
                    return new NBTString(IlIlod.IlIlm((IlIlod)ilIlO2).toString());
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw IlIlO2.a(unsupportedOperationException);
                }
            }
            bl = ilIlO2 instanceof IlIlv1;
        }
        try {
            if (bl) {
                return ilIlrm.IlIl_(packetWrapper, IlIlv1.IlIlQ((IlIlv1)ilIlO2));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw IlIlO2.a(unsupportedOperationException);
        }
        throw new UnsupportedOperationException(c + ilIlO2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x132162FA663DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0097k\u00b6\u00dc\u0012\u009d,5\u0002C\u00c9.\u008b\"\u00ad\u00f8k\u0097\u0006J],\u00a7\u00cf\u0092\u009c\u00f4o\u0006<%\u00b4\u0084\u00ec\u00bfD\u0093T\u0096\u000eaL\u0007\u000e7\u00f1rC".getBytes("ISO-8859-1"));
                c = IlIlO2.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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
}

