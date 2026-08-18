/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIljH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public abstract class IlIlT2
implements MappedEntity {
    protected final @Nullable TypesBuilderData IlIle;
    private static boolean IlIlm;
    private static final long c;
    private static final long j;

    protected IlIlT2(@Nullable TypesBuilderData typesBuilderData) {
        this.IlIle = typesBuilderData;
    }

    public @Nullable TypesBuilderData IlIlv() {
        return this.IlIle;
    }

    @Override
    public ResourceLocation getName() {
        long l = c ^ 0x4F8F39FA1B4CL;
        try {
            if (this.IlIle != null) {
                return this.IlIle.IlIl_();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw IlIlT2.b(unsupportedOperationException);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public int IlIlH(ClientVersion clientVersion) {
        block5: {
            TypesBuilderData typesBuilderData;
            block4: {
                long l = c ^ 0x35A3D35A91EEL;
                boolean bl = IlIlT2.IlIli();
                try {
                    try {
                        typesBuilderData = this.IlIle;
                        if (bl) break block4;
                        if (typesBuilderData == null) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw IlIlT2.b(unsupportedOperationException);
                    }
                    typesBuilderData = this.IlIle;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw IlIlT2.b(unsupportedOperationException);
                }
            }
            return typesBuilderData.getId(clientVersion);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean IlIlT() {
        boolean bl;
        long l = c ^ 0x3D6B8C6636A4L;
        try {
            bl = this.IlIle != null;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw IlIlT2.b(unsupportedOperationException);
        }
        return bl;
    }

    public boolean equals(Object object) {
        boolean bl;
        block29: {
            block30: {
                IlIlT2 ilIlT2;
                boolean bl2;
                block27: {
                    block28: {
                        IlIlT2 ilIlT22;
                        block25: {
                            block26: {
                                block23: {
                                    block24: {
                                        long l = c ^ 0x1F3577BAF155L;
                                        bl2 = IlIlT2.IlIli();
                                        try {
                                            block22: {
                                                try {
                                                    try {
                                                        if (object == null) break block22;
                                                        ilIlT22 = this;
                                                        if (bl2) break block23;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw IlIlT2.b(unsupportedOperationException);
                                                    }
                                                    if (ilIlT22.getClass() == object.getClass()) break block24;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw IlIlT2.b(unsupportedOperationException);
                                                }
                                            }
                                            return false;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw IlIlT2.b(unsupportedOperationException);
                                        }
                                    }
                                    ilIlT22 = this;
                                }
                                try {
                                    try {
                                        if (bl2) break block25;
                                        if (ilIlT22 != object) break block26;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw IlIlT2.b(unsupportedOperationException);
                                    }
                                    return true;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw IlIlT2.b(unsupportedOperationException);
                                }
                            }
                            ilIlT22 = (IlIlT2)object;
                        }
                        IlIlT2 ilIlT23 = ilIlT22;
                        try {
                            try {
                                try {
                                    try {
                                        ilIlT2 = this;
                                        if (bl2) break block27;
                                        if (ilIlT2.IlIle == null) break block28;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw IlIlT2.b(unsupportedOperationException);
                                    }
                                    ilIlT2 = ilIlT23;
                                    if (bl2) break block27;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw IlIlT2.b(unsupportedOperationException);
                                }
                                if (ilIlT2.IlIle == null) break block28;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw IlIlT2.b(unsupportedOperationException);
                            }
                            return this.IlIle.IlIl_().equals(ilIlT23.IlIle.IlIl_());
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw IlIlT2.b(unsupportedOperationException);
                        }
                    }
                    ilIlT2 = this;
                }
                try {
                    try {
                        bl = ilIlT2 instanceof IlIljH;
                        if (bl2) break block29;
                        if (!bl) break block30;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw IlIlT2.b(unsupportedOperationException);
                    }
                    return ((IlIljH)((Object)this)).deepEquals(object);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw IlIlT2.b(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n;
        block10: {
            block11: {
                IlIlT2 ilIlT2;
                boolean bl;
                block8: {
                    block9: {
                        long l = c ^ 0x5330437DEC5FL;
                        bl = IlIlT2.IlIle();
                        try {
                            try {
                                ilIlT2 = this;
                                if (!bl) break block8;
                                if (ilIlT2.IlIle == null) break block9;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw IlIlT2.b(unsupportedOperationException);
                            }
                            return Objects.hash(this.getClass(), this.IlIle.IlIl_());
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw IlIlT2.b(unsupportedOperationException);
                        }
                    }
                    ilIlT2 = this;
                }
                try {
                    try {
                        n = ilIlT2 instanceof IlIljH;
                        if (!bl) break block10;
                        if (n == 0) break block11;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw IlIlT2.b(unsupportedOperationException);
                    }
                    return ((IlIljH)((Object)this)).deepHashCode();
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw IlIlT2.b(unsupportedOperationException);
                }
            }
            n = System.identityHashCode(this);
        }
        return n;
    }

    public String toString() {
        Object object;
        StringBuilder stringBuilder;
        block6: {
            TypesBuilderData typesBuilderData;
            block4: {
                block5: {
                    long l = c ^ 0x58A4113A241L;
                    boolean bl = IlIlT2.IlIle();
                    try {
                        try {
                            stringBuilder = new StringBuilder().append(this.getClass().getSimpleName()).append("[");
                            typesBuilderData = this.IlIle;
                            if (!bl) break block4;
                            if (typesBuilderData != null) break block5;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw IlIlT2.b(unsupportedOperationException);
                        }
                        object = this.hashCode();
                        break block6;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw IlIlT2.b(unsupportedOperationException);
                    }
                }
                typesBuilderData = this.IlIle;
            }
            object = typesBuilderData.IlIl_();
        }
        return stringBuilder.append(object).append((char)j).toString();
    }

    public static void IlIlh(boolean bl) {
        IlIlm = bl;
    }

    public static boolean IlIli() {
        return IlIlm;
    }

    public static boolean IlIle() {
        boolean bl = IlIlT2.IlIli();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw IlIlT2.b(unsupportedOperationException);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = IlIls.a(7605966489406568381L, -4711554238490330283L, MethodHandles.lookup().lookupClass()).a(255507496396703L);
        long l = c ^ 0x3856BE5BFA99L;
        IlIlT2.IlIlh(false);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -5531003376675256979L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                j = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static UnsupportedOperationException b(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

