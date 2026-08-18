/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.ComponentType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.ComponentTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.IlIlLE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.IlIlfa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIla;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlj4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIln7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.IlIlZC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.IlIlQY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.IlIlyM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.IlIlZ1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTList;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTShort;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlh9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@NullMarked
public class IlIlCg {
    public static final IlIlCg IlIlP;
    private final ClientVersion IlIlr;
    private final IlIlz IlIlq;
    private final ItemType IlIlm;
    private int IlIlX;
    @ApiStatus.Obsolete
    private @Nullable NBTCompound IlIlG;
    private @Nullable IlIlfa IlIlH;
    @ApiStatus.Obsolete
    private int IlIlA;
    private static PacketWrapper[] IlIlB;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String sxFHakYXly = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlCg(ItemType itemType, int n, @Nullable NBTCompound nBTCompound, @Nullable IlIlfa ilIlfa, int n2, ClientVersion clientVersion, IlIlz ilIlz) {
        this.IlIlm = itemType;
        this.IlIlX = n;
        this.IlIlG = nBTCompound;
        this.IlIlH = ilIlfa;
        this.IlIlA = n2;
        this.IlIlr = clientVersion;
        this.IlIlq = ilIlz;
    }

    public static IlIlCg IlIlz(NBT nBT, PacketWrapper<?> packetWrapper) {
        return IlIlCg.IlIlz(nBT, packetWrapper.IlIlw().IlIlE());
    }

    @Deprecated
    public static IlIlCg IlIlz(NBT nBT, ClientVersion clientVersion) {
        NBT nBT2;
        long l;
        block2: {
            block3: {
                l = a ^ 0x1E7F9C04DEDBL;
                boolean bl = IlIln7.IlIlg();
                try {
                    nBT2 = nBT;
                    if (bl) break block2;
                    if (!(nBT2 instanceof NBTString)) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
                ResourceLocation resourceLocation = new ResourceLocation(((NBTString)nBT).getValue());
                return IlIlCg.IlIlq().IlIlC(ItemTypes.getByName(resourceLocation.toString())).IlIlD();
            }
            nBT2 = nBT;
        }
        NBTCompound nBTCompound = (NBTCompound)nBT2;
        IlIlj4 ilIlj4 = IlIlCg.IlIlq();
        ResourceLocation resourceLocation = Optional.ofNullable(nBTCompound.getStringTagValueOrNull((String)((Object)IlIlCg.a("b", (int)1651, (long)(0x25D9DBCD8681E4F5L ^ l))))).map(Optional::of).orElseGet(() -> {
            long l = a ^ 0x1B2D8C2B51A0L;
            return Optional.ofNullable(nBTCompound.getStringTagValueOrNull((String)((Object)IlIlCg.a("b", (int)29745, (long)(0x437EDEC2751919D3L ^ l)))));
        }).map(ResourceLocation::new).orElseThrow(() -> {
            long l = a ^ 0x186787990AC3L;
            return new IllegalArgumentException((String)((Object)IlIlCg.a("b", (int)6584, (long)(0x6A6BA646C066AF3EL ^ l))) + nBTCompound.getTags().keySet());
        });
        ilIlj4.IlIlC(ItemTypes.getByName(resourceLocation.toString()));
        ilIlj4.IlIlc(nBTCompound.getCompoundTagOrNull((String)((Object)IlIlCg.a("b", (int)20361, (long)(0x2F6CA8BC713F2D0AL ^ l)))));
        Optional.ofNullable(nBTCompound.getNumberTagOrNull((String)((Object)IlIlCg.a("b", (int)12024, (long)(0x25EB11B9FCE9CC69L ^ l))))).map(Optional::of).orElseGet(() -> {
            long l = a ^ 0x5FA42025D833L;
            return Optional.ofNullable(nBTCompound.getNumberTagOrNull((String)((Object)IlIlCg.a("b", (int)2874, (long)(0x1565EDBF851BEF58L ^ l)))));
        }).map(NBTNumber::getAsInt).ifPresent(ilIlj4::IlIlr);
        return ilIlj4.IlIlD();
    }

    public static NBT IlIlK(PacketWrapper<?> packetWrapper, IlIlCg ilIlCg) {
        return IlIlCg.IlIli(ilIlCg, packetWrapper.IlIlw().IlIlE());
    }

    @Deprecated
    public static NBT IlIli(IlIlCg ilIlCg, ClientVersion clientVersion) {
        NBTCompound nBTCompound;
        block37: {
            boolean bl;
            block39: {
                block38: {
                    boolean bl2;
                    block35: {
                        NBTCompound nBTCompound2;
                        block36: {
                            long l;
                            block30: {
                                boolean bl3;
                                block31: {
                                    block34: {
                                        block32: {
                                            IlIlfa ilIlfa;
                                            block33: {
                                                block29: {
                                                    l = a ^ 0x2987F4BEB52CL;
                                                    bl2 = IlIln7.IlIly();
                                                    try {
                                                        try {
                                                            bl3 = clientVersion.IlIlw(ClientVersion.V_1_20_5);
                                                            if (!bl2) break block29;
                                                            if (!bl3) break block30;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw IlIlCg.a(illegalArgumentException);
                                                        }
                                                        bl3 = ilIlCg.IlIlV();
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (!bl2) break block31;
                                                                if (bl3) break block32;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw IlIlCg.a(illegalArgumentException);
                                                            }
                                                            ilIlfa = ilIlCg.IlIlH;
                                                            if (!bl2) break block33;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw IlIlCg.a(illegalArgumentException);
                                                        }
                                                        if (ilIlfa == null) break block32;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    ilIlfa = ilIlCg.IlIlH;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                            }
                                            try {
                                                bl3 = ilIlfa.IlIlf().isEmpty();
                                                if (!bl2) break block31;
                                                if (!bl3) break block34;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                        }
                                        bl3 = true;
                                        break block31;
                                    }
                                    bl3 = false;
                                }
                                boolean bl4 = bl3;
                                try {
                                    if (bl4) {
                                        return new NBTString(ilIlCg.IlIlm.getName().toString());
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            nBTCompound2 = new NBTCompound();
                            try {
                                try {
                                    try {
                                        try {
                                            nBTCompound = nBTCompound2;
                                            if (!bl2) break block35;
                                            nBTCompound.setTag((String)((Object)IlIlCg.a("b", (int)1651, (long)(0x25D9EC35EE3B8F02L ^ l))), new NBTString(ilIlCg.IlIlm.getName().toString()));
                                            if (!clientVersion.IlIlO(ClientVersion.V_1_20_5)) break block36;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        nBTCompound2.setTag((String)((Object)IlIlCg.a("b", (int)14961, (long)(0x5A12E4A82D33331CL ^ l))), new NBTInt(ilIlCg.IlIlO()));
                                        nBTCompound = ilIlCg.IlIlG;
                                        if (!bl2) break block35;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    if (nBTCompound == null) break block36;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                                nBTCompound2.setTag((String)((Object)IlIlCg.a("b", (int)10904, (long)(0x2AAD3675CA57A3E6L ^ l))), ilIlCg.IlIlG);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                        }
                        nBTCompound = nBTCompound2;
                    }
                    try {
                        try {
                            if (PacketWrapper.IlIlz() != null) break block37;
                            if (!bl2) break block38;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        bl = false;
                        break block39;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                bl = true;
            }
            IlIln7.IlIlm(bl);
        }
        return nBTCompound;
    }

    public int IlIlq() {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x15117FD86203L;
                boolean bl = IlIln7.IlIly();
                try {
                    try {
                        n = this.IlIlr.IlIlw(ClientVersion.V_1_20_5);
                        if (!bl) break block4;
                        if (n == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    return this.IlIlJ(ComponentTypes.IlIluo, 1);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            n = this.IlIlJ().getMaxAmount();
        }
        return n;
    }

    public boolean IlIln() {
        boolean bl;
        block12: {
            block11: {
                block13: {
                    boolean bl2;
                    block10: {
                        long l = a ^ 0x6A82A750EB01L;
                        bl2 = IlIln7.IlIly();
                        try {
                            try {
                                bl = this.IlIlq();
                                if (!bl2) break block10;
                                if (bl <= true) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            bl = this.IlIlq();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (!bl2) break block12;
                                if (!bl) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            bl = this.IlIlh();
                            if (!bl2) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        if (bl) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IlIlq() {
        NBTCompound nBTCompound;
        boolean bl;
        long l;
        block32: {
            IlIlCg ilIlCg;
            block31: {
                int n;
                block30: {
                    block26: {
                        block27: {
                            boolean bl2;
                            block29: {
                                block28: {
                                    l = a ^ 0xD6BE1CECABFL;
                                    bl = IlIln7.IlIlg();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    n = this.IlIlr.IlIlw(ClientVersion.V_1_20_5);
                                                    if (bl) break block26;
                                                    if (n == 0) break block27;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                                bl2 = this.IlIlN(ComponentTypes.IlIluM);
                                                if (bl) break block28;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                            if (!bl2) return false;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        bl2 = this.IlIlN(ComponentTypes.IlIlB);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (bl) break block29;
                                        if (bl2) return false;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    bl2 = this.IlIlN(ComponentTypes.IlIluy);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            try {
                                if (bl) return bl2;
                                if (!bl2) return false;
                                return true;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                        }
                        n = this.IlIlV();
                    }
                    try {
                        try {
                            try {
                                if (bl) break block30;
                                if (n != 0) return false;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            ilIlCg = this;
                            if (bl) break block31;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        n = ilIlCg.IlIlR();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                if (n <= 0) return false;
                ilIlCg = this;
            }
            try {
                try {
                    nBTCompound = ilIlCg.IlIlG;
                    if (bl) break block32;
                    if (nBTCompound == null) return true;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
                nBTCompound = this.IlIlG;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw IlIlCg.a(illegalArgumentException);
            }
        }
        try {
            boolean bl3 = nBTCompound.getBoolean((String)((Object)IlIlCg.a("b", (int)4282, (long)(0x507F80EFE2596642L ^ l))));
            if (bl) return bl3;
            if (bl3) return false;
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIlCg.a(illegalArgumentException);
        }
    }

    public boolean IlIlh() {
        int n;
        block8: {
            block7: {
                boolean bl;
                block6: {
                    long l = a ^ 0x58E45330AA7L;
                    bl = IlIln7.IlIly();
                    try {
                        try {
                            n = this.IlIlq();
                            if (!bl) break block6;
                            if (n == 0) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        n = this.IlIlh();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                try {
                    if (!bl) break block8;
                    if (n <= 0) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    public int IlIlh() {
        int n;
        block16: {
            block17: {
                int n2;
                block22: {
                    NBTNumber nBTNumber;
                    block20: {
                        NBTNumber nBTNumber2;
                        block21: {
                            NBTNumber nBTNumber3;
                            boolean bl;
                            block23: {
                                block19: {
                                    NBTCompound nBTCompound;
                                    long l;
                                    block18: {
                                        block14: {
                                            block15: {
                                                l = a ^ 0x686AEE035B05L;
                                                bl = IlIln7.IlIly();
                                                try {
                                                    n = this.IlIlr.IlIlw(ClientVersion.V_1_20_5);
                                                    if (!bl) break block14;
                                                    if (n == 0) break block15;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                                int n3 = this.IlIlJ(ComponentTypes.IlIluy, 0);
                                                return IlIlh9.IlIln(n3, 0, this.IlIlR());
                                            }
                                            n = this.IlIlr.IlIlw(ClientVersion.V_1_13);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (!bl) break block16;
                                                        if (n == 0) break block17;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    nBTCompound = this.IlIlG;
                                                    if (!bl) break block18;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                                if (nBTCompound == null) break block19;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                            nBTCompound = this.IlIlG;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                    }
                                    nBTNumber3 = nBTCompound.getNumberTagOrNull((String)((Object)IlIlCg.a("b", (int)2418, (long)(0x769AB91BF73D6E2CL ^ l))));
                                    break block23;
                                }
                                nBTNumber3 = null;
                            }
                            nBTNumber2 = nBTNumber3;
                            try {
                                try {
                                    nBTNumber = nBTNumber2;
                                    if (!bl) break block20;
                                    if (nBTNumber != null) break block21;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                                n2 = 0;
                                break block22;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                        }
                        nBTNumber = nBTNumber2;
                    }
                    n2 = nBTNumber.getAsInt();
                }
                return n2;
            }
            n = Math.max(0, this.IlIlA);
        }
        return n;
    }

    public void IlIll(int n) {
        block14: {
            block15: {
                IlIlCg ilIlCg;
                boolean bl;
                boolean bl2;
                long l;
                block12: {
                    l = a ^ 0x1AAD205AE18L;
                    bl2 = IlIln7.IlIlg();
                    try {
                        try {
                            block13: {
                                try {
                                    try {
                                        bl = this.IlIlr.IlIlw(ClientVersion.V_1_20_5);
                                        if (bl2) break block12;
                                        if (!bl) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    this.IlIlj(ComponentTypes.IlIluy, IlIlh9.IlIln(n, 0, this.IlIlR()));
                                    if (!bl2) break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            ilIlCg = this;
                            if (bl2) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        bl = ilIlCg.IlIlr.IlIlw(ClientVersion.V_1_13);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                try {
                    block16: {
                        try {
                            if (!bl) break block16;
                            this.IlIlO().setTag((String)((Object)IlIlCg.a("b", (int)12825, (long)(0x5819FA960091A05EL ^ l))), new NBTInt(Math.max(0, n)));
                            if (!bl2) break block14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                    }
                    ilIlCg = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            ilIlCg.IlIlA = Math.max(0, n);
        }
    }

    public int IlIlR() {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x41CCCA2E72D6L;
                boolean bl = IlIln7.IlIly();
                try {
                    try {
                        n = this.IlIlr.IlIlw(ClientVersion.V_1_20_5);
                        if (!bl) break block4;
                        if (n == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    return this.IlIlJ(ComponentTypes.IlIluM, 0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            n = this.IlIlJ().getMaxDurability();
        }
        return n;
    }

    public NBTCompound IlIlO() {
        NBTCompound nBTCompound;
        block4: {
            block5: {
                long l = a ^ 0x192BB502208FL;
                boolean bl = IlIln7.IlIly();
                try {
                    try {
                        nBTCompound = this.IlIlG;
                        if (!bl) break block4;
                        if (nBTCompound != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    this.IlIlG = new NBTCompound();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            nBTCompound = this.IlIlG;
        }
        return nBTCompound;
    }

    public ItemType IlIlJ() {
        IlIlCg ilIlCg;
        block8: {
            block9: {
                ItemType itemType;
                block12: {
                    IlIlCg ilIlCg2;
                    block10: {
                        block11: {
                            long l = a ^ 0x5E9F7AF77179L;
                            boolean bl = IlIln7.IlIly();
                            try {
                                try {
                                    try {
                                        try {
                                            ilIlCg = this;
                                            if (!bl) break block8;
                                            if (!ilIlCg.IlIlr.IlIlw(ClientVersion.V_1_11)) break block9;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        ilIlCg2 = this;
                                        if (!bl) break block10;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    if (!ilIlCg2.IlIlV()) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                                itemType = ItemTypes.AIR;
                                break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                        }
                        ilIlCg2 = this;
                    }
                    itemType = ilIlCg2.IlIlm;
                }
                return itemType;
            }
            ilIlCg = this;
        }
        return ilIlCg.IlIlm;
    }

    public int IlIlO() {
        int n;
        block8: {
            block9: {
                int n2;
                block12: {
                    IlIlCg ilIlCg;
                    block10: {
                        block11: {
                            long l = a ^ 0x5A4CDB8C75EDL;
                            boolean bl = IlIln7.IlIlg();
                            try {
                                try {
                                    try {
                                        try {
                                            n = this.IlIlr.IlIlw(ClientVersion.V_1_11);
                                            if (bl) break block8;
                                            if (n == 0) break block9;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        ilIlCg = this;
                                        if (bl) break block10;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    if (!ilIlCg.IlIlV()) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                                n2 = 0;
                                break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                        }
                        ilIlCg = this;
                    }
                    n2 = ilIlCg.IlIlX;
                }
                return n2;
            }
            n = this.IlIlX;
        }
        return n;
    }

    public void IlIlx(int n) {
        this.IlIlX -= n;
    }

    public void IlIlv(int n) {
        this.IlIlX += n;
    }

    public void IlIlm(int n) {
        this.IlIlX = n;
    }

    public IlIlCg IlIlv(int n) {
        int n2 = Math.min(n, this.IlIlO());
        IlIlCg ilIlCg = this.IlIlr();
        ilIlCg.IlIlm(n2);
        this.IlIlx(n2);
        return ilIlCg;
    }

    public IlIlCg IlIlr() {
        NBTCompound nBTCompound;
        int n;
        ItemType itemType;
        IlIlCg ilIlCg;
        IlIlCg ilIlCg2;
        block7: {
            IlIlCg ilIlCg3;
            block6: {
                long l = a ^ 0x2815B6195A6CL;
                boolean bl = IlIln7.IlIly();
                try {
                    try {
                        ilIlCg3 = this;
                        if (!bl) break block6;
                        if (!ilIlCg3.IlIlV()) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    ilIlCg3 = IlIlP;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            return ilIlCg3;
        }
        try {
            IlIlCg ilIlCg4;
            ilIlCg2 = ilIlCg4;
            ilIlCg = ilIlCg4;
            itemType = this.IlIlm;
            n = this.IlIlX;
            nBTCompound = this.IlIlG == null ? null : this.IlIlG.copy();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIlCg.a(illegalArgumentException);
        }
        ilIlCg2(itemType, n, nBTCompound, this.IlIlH == null ? null : this.IlIlH.IlIlt(), this.IlIlA, this.IlIlr, this.IlIlq);
        return ilIlCg;
    }

    public @Nullable NBTCompound IlIlL() {
        return this.IlIlG;
    }

    public void IlIlA(NBTCompound nBTCompound) {
        this.IlIlG = nBTCompound;
    }

    public <T> T IlIlJ(ComponentType<T> componentType, T t) {
        IlIlCg ilIlCg;
        block4: {
            block5: {
                long l = a ^ 0x44DBF026EE6AL;
                boolean bl = IlIln7.IlIly();
                try {
                    try {
                        ilIlCg = this;
                        if (!bl) break block4;
                        if (!ilIlCg.IlIlS()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    return this.IlIlZ().IlIlY(componentType, t);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            ilIlCg = this.IlIlJ().getComponents(this.IlIlr).IlIlY(componentType, t);
        }
        return (T)ilIlCg;
    }

    public <T> Optional<T> IlIll(ComponentType<T> componentType) {
        IlIlCg ilIlCg;
        block4: {
            block5: {
                long l = a ^ 0x701D9CFCC06DL;
                boolean bl = IlIln7.IlIlg();
                try {
                    try {
                        ilIlCg = this;
                        if (bl) break block4;
                        if (!ilIlCg.IlIlS()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    return this.IlIlZ().IlIlO(componentType);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            ilIlCg = this;
        }
        return ilIlCg.IlIlJ().getComponents(this.IlIlr).IlIlO(componentType);
    }

    public <T> void IlIlj(ComponentType<T> componentType, T t) {
        this.IlIlZ().IlIla(componentType, t);
    }

    public <T> void IlIle(ComponentType<T> componentType) {
        this.IlIlZ().IlIlM(componentType);
    }

    public <T> void IlIlL(ComponentType<T> componentType, Optional<T> optional) {
        this.IlIlZ().IlIlO(componentType, optional);
    }

    public boolean IlIlN(ComponentType<?> componentType) {
        boolean bl;
        block4: {
            block5: {
                long l = a ^ 0x7E4464E6A935L;
                boolean bl2 = IlIln7.IlIlg();
                try {
                    try {
                        bl = this.IlIlS();
                        if (bl2) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    return this.IlIlZ().IlIlM(componentType);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            bl = this.IlIlJ().getComponents(this.IlIlr).IlIlM(componentType);
        }
        return bl;
    }

    public boolean IlIlS() {
        boolean bl;
        block8: {
            block7: {
                IlIlfa ilIlfa;
                boolean bl2;
                block6: {
                    long l = a ^ 0x74E8F0263B08L;
                    bl2 = IlIln7.IlIlg();
                    try {
                        try {
                            ilIlfa = this.IlIlH;
                            if (bl2) break block6;
                            if (ilIlfa == null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        ilIlfa = this.IlIlH;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                try {
                    bl = ilIlfa.IlIlf().isEmpty();
                    if (bl2) break block8;
                    if (bl) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public IlIlfa IlIlZ() {
        IlIlfa ilIlfa;
        block4: {
            block5: {
                long l = a ^ 0x7B406E3F816AL;
                boolean bl = IlIln7.IlIlg();
                try {
                    try {
                        ilIlfa = this.IlIlH;
                        if (bl) break block4;
                        if (ilIlfa != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    this.IlIlH = new IlIlfa(this.IlIlm.getComponents(this.IlIlr), new HashMap(4), this.IlIlq);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            ilIlfa = this.IlIlH;
        }
        return ilIlfa;
    }

    public void IlIls(@Nullable IlIlfa ilIlfa) {
        this.IlIlH = ilIlfa;
    }

    public int IlIlE() {
        return this.IlIlA;
    }

    public void IlIlJ(int n) {
        this.IlIlA = n;
    }

    public boolean IlIlk() {
        return this.IlIlf(this.IlIlr);
    }

    @Deprecated
    public boolean IlIlf(ClientVersion clientVersion) {
        boolean bl;
        block46: {
            block44: {
                boolean bl2;
                block45: {
                    block43: {
                        IlIlCg ilIlCg;
                        block42: {
                            ItemType itemType;
                            ItemType itemType2;
                            block38: {
                                block39: {
                                    boolean bl3;
                                    block40: {
                                        block41: {
                                            block34: {
                                                boolean bl4;
                                                block37: {
                                                    block36: {
                                                        block35: {
                                                            block33: {
                                                                long l = a ^ 0x12E20DCC1E06L;
                                                                bl2 = IlIln7.IlIlg();
                                                                try {
                                                                    try {
                                                                        bl4 = clientVersion.IlIlw(ClientVersion.V_1_20_5);
                                                                        if (bl2) break block33;
                                                                        if (!bl4) break block34;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw IlIlCg.a(illegalArgumentException);
                                                                    }
                                                                    bl4 = this.IlIlN(ComponentTypes.IlIlA);
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw IlIlCg.a(illegalArgumentException);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (bl2) break block35;
                                                                    if (!bl4) break block36;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw IlIlCg.a(illegalArgumentException);
                                                                }
                                                                bl4 = this.IlIlk(clientVersion);
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw IlIlCg.a(illegalArgumentException);
                                                            }
                                                        }
                                                        try {
                                                            if (bl2) break block37;
                                                            if (bl4) break block36;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw IlIlCg.a(illegalArgumentException);
                                                        }
                                                        bl4 = true;
                                                        break block37;
                                                    }
                                                    bl4 = false;
                                                }
                                                return bl4;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            ItemType itemType = this.IlIlm;
                                                            itemType = ItemTypes.BOOK;
                                                            if (bl2) break block38;
                                                            if (itemType2 != itemType) break block39;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw IlIlCg.a(illegalArgumentException);
                                                        }
                                                        bl3 = this.IlIlO();
                                                        if (bl2) break block40;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    if (!bl3) break block41;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                                bl3 = true;
                                                break block40;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                        }
                                        bl3 = false;
                                    }
                                    return bl3;
                                }
                                try {
                                    ilIlCg = this;
                                    if (bl2) break block42;
                                    ItemType itemType = ilIlCg.IlIlm;
                                    itemType = ItemTypes.ENCHANTED_BOOK;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            try {
                                if (itemType2 == itemType) {
                                    return false;
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            ilIlCg = this;
                        }
                        try {
                            try {
                                bl = ilIlCg.IlIlq();
                                if (bl2) break block43;
                                if (!bl) break block44;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            bl = this.IlIlp();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (bl2) break block45;
                            if (!bl) break block44;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        bl = this.IlIlk(clientVersion);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                try {
                    if (bl2) break block46;
                    if (bl) break block44;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
                bl = true;
                break block46;
            }
            bl = false;
        }
        return bl;
    }

    public boolean IlIl_() {
        return this.IlIlk(this.IlIlr);
    }

    @Deprecated
    public boolean IlIlk(ClientVersion clientVersion) {
        block24: {
            boolean bl;
            block27: {
                block26: {
                    NBTList<NBTCompound> nBTList;
                    boolean bl2;
                    block25: {
                        IlIlCg ilIlCg;
                        block23: {
                            block19: {
                                boolean bl3;
                                block20: {
                                    block22: {
                                        block21: {
                                            block18: {
                                                long l = a ^ 0x70C215707839L;
                                                bl2 = IlIln7.IlIlg();
                                                try {
                                                    try {
                                                        bl3 = clientVersion.IlIlw(ClientVersion.V_1_20_5);
                                                        if (bl2) break block18;
                                                        if (!bl3) break block19;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    bl3 = this.IlIlJ(ComponentTypes.IlIlT, IlIlLE.IlIlW).IlIlE();
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (bl2) break block20;
                                                        if (!bl3) break block21;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    bl3 = this.IlIlJ(ComponentTypes.IlIluO, IlIlLE.IlIlW).IlIlE();
                                                    if (bl2) break block20;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                                if (bl3) break block22;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                        }
                                        bl3 = true;
                                        break block20;
                                    }
                                    bl3 = false;
                                }
                                return bl3;
                            }
                            try {
                                try {
                                    ilIlCg = this;
                                    if (bl2) break block23;
                                    if (ilIlCg.IlIlG == null) break block24;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                                ilIlCg = this;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                        }
                        String string = ilIlCg.IlIlN(clientVersion);
                        NBTList<NBTCompound> nBTList2 = this.IlIlG.getCompoundListTagOrNull(string);
                        try {
                            nBTList = nBTList2;
                            if (bl2) break block25;
                            if (nBTList == null) break block26;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        nBTList = nBTList2;
                    }
                    try {
                        bl = nBTList.getTags().isEmpty();
                        if (bl2) break block27;
                        if (bl) break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    bl = true;
                    break block27;
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public List<IlIlZC> IlIla() {
        return this.IlIlk(this.IlIlr);
    }

    @Deprecated
    public List<IlIlZC> IlIlk(ClientVersion clientVersion) {
        block27: {
            NBTList<NBTCompound> nBTList;
            boolean bl;
            long l;
            block28: {
                IlIlCg ilIlCg;
                block26: {
                    block23: {
                        ArrayList<IlIlZC> arrayList;
                        block25: {
                            Map.Entry<IlIlQY, Integer> entry;
                            Iterator<Map.Entry<IlIlQY, Integer>> iterator;
                            ArrayList<IlIlZC> arrayList2;
                            block24: {
                                Object object;
                                block22: {
                                    l = a ^ 0x28D5D2DFCB1EL;
                                    bl = IlIln7.IlIly();
                                    try {
                                        try {
                                            object = clientVersion;
                                            if (!bl) break block22;
                                            if (!object.IlIlw(ClientVersion.V_1_20_5)) break block23;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        object = this.IlIlJ(ComponentTypes.IlIlT, IlIlLE.IlIlW);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                }
                                IlIlLE ilIlLE = (IlIlLE)object;
                                IlIlLE ilIlLE2 = this.IlIlJ(ComponentTypes.IlIluO, IlIlLE.IlIlW);
                                arrayList2 = new ArrayList<IlIlZC>(ilIlLE.IlIlX() + ilIlLE2.IlIlX());
                                iterator = ilIlLE.iterator();
                                while (iterator.hasNext()) {
                                    entry = iterator.next();
                                    try {
                                        arrayList2.add(new IlIlZC(entry.getKey(), entry.getValue()));
                                        if (bl) {
                                            if (bl) continue;
                                            break;
                                        }
                                        break block24;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                }
                                iterator = ilIlLE2.iterator();
                            }
                            while (iterator.hasNext()) {
                                entry = iterator.next();
                                try {
                                    arrayList = arrayList2;
                                    if (bl) {
                                        arrayList.add(new IlIlZC(entry.getKey(), entry.getValue()));
                                        if (bl) continue;
                                        break;
                                    }
                                    break block25;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        return arrayList;
                    }
                    try {
                        try {
                            ilIlCg = this;
                            if (!bl) break block26;
                            if (ilIlCg.IlIlG == null) break block27;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                        ilIlCg = this;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                String string = ilIlCg.IlIlN(clientVersion);
                NBTList<NBTCompound> nBTList2 = this.IlIlG.getCompoundListTagOrNull(string);
                try {
                    nBTList = nBTList2;
                    if (!bl) break block28;
                    if (nBTList == null) break block27;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
                nBTList = nBTList2;
            }
            List<NBTCompound> list = nBTList.getTags();
            ArrayList<IlIlZC> arrayList = new ArrayList<IlIlZC>(list.size());
            for (NBTCompound nBTCompound : list) {
                block30: {
                    IlIlQY ilIlQY = IlIlCg.IlIlU(nBTCompound, clientVersion);
                    if (ilIlQY != null) {
                        NBTNumber nBTNumber;
                        block29: {
                            NBTNumber nBTNumber2 = nBTCompound.getNumberTagOrNull((String)((Object)IlIlCg.a("b", (int)16200, (long)(0x73FCC80E49D7480AL ^ l))));
                            try {
                                nBTNumber = nBTNumber2;
                                if (!bl) break block29;
                                if (nBTNumber == null) break block30;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            nBTNumber = nBTNumber2;
                        }
                        int n = nBTNumber.getAsInt();
                        IlIlZC ilIlZC = IlIlZC.IlIls().IlIll(ilIlQY).IlIlM(n).IlIlX();
                        arrayList.add(ilIlZC);
                    }
                }
                if (bl) continue;
            }
            return arrayList;
        }
        return new ArrayList<IlIlZC>(0);
    }

    public int IlIlj(IlIlQY ilIlQY) {
        return this.IlIlK(ilIlQY, this.IlIlr);
    }

    @Deprecated
    public int IlIlK(IlIlQY ilIlQY, ClientVersion clientVersion) {
        int n;
        block35: {
            block33: {
                NBTList<NBTCompound> nBTList;
                boolean bl;
                long l;
                block34: {
                    IlIlCg ilIlCg;
                    block32: {
                        block27: {
                            int n2;
                            block30: {
                                block31: {
                                    IlIlLE ilIlLE;
                                    block28: {
                                        block29: {
                                            Object object;
                                            block26: {
                                                l = a ^ 0x2CB3DF0E753CL;
                                                bl = IlIln7.IlIly();
                                                try {
                                                    try {
                                                        object = clientVersion;
                                                        if (!bl) break block26;
                                                        if (!object.IlIlw(ClientVersion.V_1_20_5)) break block27;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    object = this.IlIlJ(ComponentTypes.IlIlT, IlIlLE.IlIlW);
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                            }
                                            IlIlLE ilIlLE2 = (IlIlLE)object;
                                            try {
                                                try {
                                                    ilIlLE = ilIlLE2;
                                                    if (!bl) break block28;
                                                    if (ilIlLE.IlIlE()) break block29;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                                ilIlLE = ilIlLE2;
                                                if (!bl) break block28;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                            int n3 = ilIlLE.IlIlv(ilIlQY);
                                            try {
                                                if (n3 > 0) {
                                                    return n3;
                                                }
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                        }
                                        ilIlLE = this.IlIlJ(ComponentTypes.IlIluO, IlIlLE.IlIlW);
                                    }
                                    IlIlLE ilIlLE3 = ilIlLE;
                                    try {
                                        try {
                                            n2 = ilIlLE3.IlIlE();
                                            if (!bl) break block30;
                                            if (n2 != 0) break block31;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        return ilIlLE3.IlIlv(ilIlQY);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                }
                                n2 = 0;
                            }
                            return n2;
                        }
                        try {
                            try {
                                ilIlCg = this;
                                if (!bl) break block32;
                                if (ilIlCg.IlIlG == null) break block33;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            ilIlCg = this;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                    }
                    String string = ilIlCg.IlIlN(clientVersion);
                    NBTList<NBTCompound> nBTList2 = this.IlIlG.getCompoundListTagOrNull(string);
                    try {
                        nBTList = nBTList2;
                        if (!bl) break block34;
                        if (nBTList == null) break block33;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    nBTList = nBTList2;
                }
                for (NBTCompound nBTCompound : nBTList.getTags()) {
                    block36: {
                        int n3;
                        block39: {
                            block38: {
                                NBTNumber nBTNumber;
                                block37: {
                                    IlIlQY ilIlQY2 = IlIlCg.IlIlU(nBTCompound, clientVersion);
                                    try {
                                        n = Objects.equals(ilIlQY2, ilIlQY) ? 1 : 0;
                                        if (!bl) break block35;
                                        if (n == 0) break block36;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    NBTNumber nBTNumber2 = nBTCompound.getNumberTagOrNull((String)((Object)IlIlCg.a("b", (int)20075, (long)(0x792F4A72298E071EL ^ l))));
                                    try {
                                        nBTNumber = nBTNumber2;
                                        if (!bl) break block37;
                                        if (nBTNumber == null) break block38;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    nBTNumber = nBTNumber2;
                                }
                                n3 = nBTNumber.getAsInt();
                                break block39;
                            }
                            n3 = 0;
                        }
                        return n3;
                    }
                    if (bl) continue;
                }
            }
            n = 0;
        }
        return n;
    }

    private static @Nullable IlIlQY IlIlU(NBTCompound nBTCompound, ClientVersion clientVersion) {
        IlIlQY ilIlQY;
        long l = a ^ 0x4F90487EFF83L;
        if (clientVersion.IlIlw(ClientVersion.V_1_13)) {
            String string = nBTCompound.getStringTagValueOrNull((String)((Object)IlIlCg.a("b", (int)120, (long)(0x6FA02FA21B1AC3BFL ^ l))));
            return IlIlyM.IlIlv(string);
        }
        NBTShort nBTShort = nBTCompound.getTagOfTypeOrNull((String)((Object)IlIlCg.a("b", (int)1651, (long)(0x25D98A2252FBC5ADL ^ l))), NBTShort.class);
        try {
            ilIlQY = nBTShort != null ? IlIlyM.IlIlC(clientVersion, nBTShort.getAsInt()) : null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIlCg.a(illegalArgumentException);
        }
        return ilIlQY;
    }

    public void IlIlb(List<IlIlZC> list) {
        this.IlIli(list, this.IlIlr);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Deprecated
    public void IlIli(List<IlIlZC> var1_1, ClientVersion var2_2) {
        block31: {
            block29: {
                block32: {
                    block30: {
                        block35: {
                            block28: {
                                block27: {
                                    var3_3 = IlIlCg.a ^ 118406900101562L;
                                    var5_4 = IlIln7.IlIly();
                                    if (!var2_2.IlIlw(ClientVersion.V_1_20_5)) break block35;
                                    var6_5 = new HashMap<K, V>(var1_1.size());
                                    for (Optional<IlIlLE> var8_7 : var1_1) {
                                        try {
                                            var6_5.put(var8_7.IlIlo(), var8_7.IlIlq());
                                            if (var5_4) {
                                                if (var5_4) continue;
                                                break;
                                            }
                                            break block27;
                                        }
                                        catch (IllegalArgumentException v0) {
                                            throw IlIlCg.a(v0);
                                        }
                                    }
                                    try {
                                        if (!this.IlIlN(ComponentTypes.IlIluO)) break block27;
                                        v1 = ComponentTypes.IlIluO;
                                        break block28;
                                    }
                                    catch (IllegalArgumentException v2) {
                                        throw IlIlCg.a(v2);
                                    }
                                }
                                v1 = ComponentTypes.IlIlT;
                            }
                            var7_6 = v1;
                            var8_7 = this.IlIll(var7_6);
                            var9_8 = var8_7.map((Function<IlIlLE, Boolean>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIli(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/component/IlIlLE;)Ljava/lang/Boolean;)()).orElse(true);
                            this.IlIlj(var7_6, new IlIlLE((Map<IlIlQY, Integer>)var6_5, var9_8));
                            if (var5_4) break block31;
                        }
                        var6_5 = this.IlIlN(var2_2);
                        try {
                            try {
                                try {
                                    if (!var1_1.isEmpty()) break block29;
                                    v3 /* !! */  = this.IlIlG;
                                    if (!var5_4) break block30;
                                }
                                catch (IllegalArgumentException v4) {
                                    throw IlIlCg.a(v4);
                                }
                                if (v3 /* !! */  == null) break block31;
                            }
                            catch (IllegalArgumentException v5) {
                                throw IlIlCg.a(v5);
                            }
                            v3 /* !! */  = this.IlIlG.getTagOrNull((String)var6_5);
                        }
                        catch (IllegalArgumentException v6) {
                            throw IlIlCg.a(v6);
                        }
                    }
                    try {
                        try {
                            if (!var5_4) break block32;
                            if (v3 /* !! */  == null) break block31;
                        }
                        catch (IllegalArgumentException v7) {
                            throw IlIlCg.a(v7);
                        }
                        v3 /* !! */  = this.IlIlG.removeTag((String)var6_5);
                    }
                    catch (IllegalArgumentException v8) {
                        throw IlIlCg.a(v8);
                    }
                }
                if (var5_4) break block31;
            }
            var7_6 = new ArrayList<E>();
            for (IlIlZC var9_9 : var1_1) {
                block34: {
                    block33: {
                        var10_10 = new NBTCompound();
                        try {
                            try {
                                try {
                                    if (!var5_4) break block31;
                                    if (!var5_4) break block33;
                                }
                                catch (IllegalArgumentException v9) {
                                    throw IlIlCg.a(v9);
                                }
                                if (var2_2.IlIlw(ClientVersion.V_1_13)) {
                                }
                                ** GOTO lbl86
                            }
                            catch (IllegalArgumentException v10) {
                                throw IlIlCg.a(v10);
                            }
                            var10_10.setTag((String)IlIlCg.a("b", (int)1651, (long)(2727402376649313172L ^ var3_3)), new NBTString(var9_9.IlIlo().getName().toString()));
                        }
                        catch (IllegalArgumentException v11) {
                            throw IlIlCg.a(v11);
                        }
                    }
                    try {
                        if (var5_4) break block34;
lbl86:
                        // 2 sources

                        var10_10.setTag((String)IlIlCg.a("b", (int)1651, (long)(2727402376649313172L ^ var3_3)), new NBTShort((short)var9_9.IlIlo().IlIlH(var2_2)));
                    }
                    catch (IllegalArgumentException v12) {
                        throw IlIlCg.a(v12);
                    }
                }
                var10_10.setTag((String)IlIlCg.a("b", (int)20075, (long)(8732212982411969432L ^ var3_3)), new NBTShort((short)var9_9.IlIlq()));
                var7_6.add((NBTCompound)var10_10);
                if (var5_4) continue;
            }
            this.IlIlO().setTag((String)var6_5, new NBTList<IlIlLE>((IlIlZ1<IlIlLE>)IlIlZ1.IlIlN, (List<IlIlLE>)var7_6));
        }
    }

    @Deprecated
    public String IlIlN(ClientVersion clientVersion) {
        CallSite callSite;
        long l = a ^ 0x313B057B1CDEL;
        try {
            CallSite callSite2 = callSite = clientVersion.IlIlw(ClientVersion.V_1_13) ? IlIlCg.a("b", (int)6996, (long)(0x2AD97555C0413BD3L ^ l)) : IlIlCg.a("b", (int)3324, (long)(0x198893D14A722C6CL ^ l));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIlCg.a(illegalArgumentException);
        }
        if (this.IlIlm == ItemTypes.ENCHANTED_BOOK) {
            callSite = IlIlCg.a("b", (int)1593, (long)(0x4195E0B3849EA6A4L ^ l));
        }
        return callSite;
    }

    public boolean IlIlp() {
        boolean bl;
        block2: {
            block3: {
                long l = a ^ 0xB8E6C1311D6L;
                boolean bl2 = IlIln7.IlIlg();
                try {
                    bl = this.IlIlR();
                    if (bl2) break block2;
                    if (bl <= false) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public boolean IlIlL(ItemType itemType) {
        boolean bl;
        long l = a ^ 0x55FD95AF8CEL;
        try {
            bl = this.IlIlJ() == itemType;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIlCg.a(illegalArgumentException);
        }
        return bl;
    }

    public static boolean IlIlk(IlIlCg ilIlCg, IlIlCg ilIlCg2) {
        return IlIlCg.IlIlx(ilIlCg, ilIlCg2);
    }

    public static boolean IlIlx(IlIlCg ilIlCg, IlIlCg ilIlCg2) {
        boolean bl;
        block50: {
            block47: {
                block51: {
                    boolean bl2;
                    block48: {
                        block46: {
                            block38: {
                                block39: {
                                    boolean bl3;
                                    block44: {
                                        block41: {
                                            block45: {
                                                block42: {
                                                    block40: {
                                                        ClientVersion clientVersion;
                                                        ClientVersion clientVersion2;
                                                        block36: {
                                                            block37: {
                                                                long l = a ^ 0x6DEEA970D2B3L;
                                                                bl2 = IlIln7.IlIlg();
                                                                try {
                                                                    try {
                                                                        clientVersion2 = ilIlCg.IlIlr;
                                                                        clientVersion = ilIlCg2.IlIlr;
                                                                        if (bl2) break block36;
                                                                        if (clientVersion2 == clientVersion) break block37;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw IlIlCg.a(illegalArgumentException);
                                                                    }
                                                                    throw new IllegalArgumentException((String)((Object)IlIlCg.a("b", (int)8696, (long)(0x7FBDE8488FB4F0BL ^ l))) + (Object)((Object)ilIlCg.IlIlr) + (String)((Object)IlIlCg.a("b", (int)24683, (long)(0x21E4992AEB090E94L ^ l))) + (Object)((Object)ilIlCg2.IlIlr));
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw IlIlCg.a(illegalArgumentException);
                                                                }
                                                            }
                                                            clientVersion2 = ilIlCg.IlIlr;
                                                            clientVersion = ClientVersion.V_1_20_5;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        bl = clientVersion2.IlIlw(clientVersion);
                                                                        if (bl2) break block38;
                                                                        if (!bl) break block39;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw IlIlCg.a(illegalArgumentException);
                                                                    }
                                                                    bl3 = ilIlCg.IlIlL(ilIlCg2.IlIlJ());
                                                                    if (bl2) break block40;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw IlIlCg.a(illegalArgumentException);
                                                                }
                                                                if (!bl3) break block41;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw IlIlCg.a(illegalArgumentException);
                                                            }
                                                            bl3 = ilIlCg.IlIlV();
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw IlIlCg.a(illegalArgumentException);
                                                        }
                                                    }
                                                    try {
                                                        block43: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (bl2) break block42;
                                                                        if (!bl3) break block43;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw IlIlCg.a(illegalArgumentException);
                                                                    }
                                                                    bl3 = ilIlCg2.IlIlV();
                                                                    if (bl2) break block44;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw IlIlCg.a(illegalArgumentException);
                                                                }
                                                                if (bl3) break block45;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw IlIlCg.a(illegalArgumentException);
                                                            }
                                                        }
                                                        bl3 = ilIlCg.IlIlZ().equals(ilIlCg2.IlIlZ());
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                }
                                                try {
                                                    if (bl2) break block44;
                                                    if (!bl3) break block41;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                            }
                                            bl3 = true;
                                            break block44;
                                        }
                                        bl3 = false;
                                    }
                                    return bl3;
                                }
                                bl = ilIlCg.IlIlL(ilIlCg2.IlIlJ());
                            }
                            try {
                                try {
                                    if (bl2) break block46;
                                    if (!bl) break block47;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                                bl = ilIlCg.IlIlV();
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                        }
                        try {
                            block49: {
                                try {
                                    try {
                                        try {
                                            if (bl2) break block48;
                                            if (!bl) break block49;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        bl = ilIlCg2.IlIlV();
                                        if (bl2) break block50;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    if (bl) break block51;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            bl = Objects.equals(ilIlCg.IlIlG, ilIlCg2.IlIlG);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (bl2) break block50;
                        if (!bl) break block47;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                }
                bl = true;
                break block50;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean IlIlj(@Nullable IlIlCg ilIlCg, @Nullable IlIlCg ilIlCg2) {
        boolean bl;
        block28: {
            block29: {
                ClientVersion clientVersion;
                ClientVersion clientVersion2;
                boolean bl2;
                block26: {
                    block27: {
                        IlIlCg ilIlCg3;
                        long l;
                        block24: {
                            block25: {
                                block22: {
                                    block23: {
                                        block20: {
                                            block21: {
                                                l = a ^ 0xA3F49C254ADL;
                                                bl2 = IlIln7.IlIlg();
                                                try {
                                                    try {
                                                        ilIlCg3 = ilIlCg;
                                                        if (bl2) break block20;
                                                        if (ilIlCg3 != ilIlCg2) break block21;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    return true;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                            }
                                            ilIlCg3 = ilIlCg;
                                        }
                                        try {
                                            try {
                                                if (bl2) break block22;
                                                if (ilIlCg3 != null) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                            return ilIlCg2.IlIlV();
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                    }
                                    ilIlCg3 = ilIlCg2;
                                }
                                try {
                                    try {
                                        if (bl2) break block24;
                                        if (ilIlCg3 != null) break block25;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    return ilIlCg.IlIlV();
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            ilIlCg3 = ilIlCg;
                        }
                        try {
                            try {
                                clientVersion2 = ilIlCg3.IlIlr;
                                clientVersion = ilIlCg2.IlIlr;
                                if (bl2) break block26;
                                if (clientVersion2 == clientVersion) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            throw new IllegalArgumentException((String)((Object)IlIlCg.a("b", (int)13687, (long)(0x6D7D500829E25D8AL ^ l))) + (Object)((Object)ilIlCg.IlIlr) + (String)((Object)IlIlCg.a("b", (int)15161, (long)(0x4E3DE2A4A4EAD3CAL ^ l))) + (Object)((Object)ilIlCg2.IlIlr));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                    }
                    clientVersion2 = ilIlCg.IlIlr;
                    clientVersion = ClientVersion.V_1_20_5;
                }
                try {
                    try {
                        bl = clientVersion2.IlIlw(clientVersion);
                        if (bl2) break block28;
                        if (!bl) break block29;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    return ilIlCg.IlIlZ().equals(ilIlCg2.IlIlZ());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            bl = Objects.equals(ilIlCg.IlIlG, ilIlCg2.IlIlG);
        }
        return bl;
    }

    public boolean IlIlV() {
        int n;
        block26: {
            int n2;
            block27: {
                int n3;
                block28: {
                    block30: {
                        int n4;
                        boolean bl;
                        long l;
                        block24: {
                            block25: {
                                block23: {
                                    IlIlCg ilIlCg;
                                    block22: {
                                        l = a ^ 0x51EFDEB357BBL;
                                        bl = IlIln7.IlIlg();
                                        try {
                                            try {
                                                ilIlCg = this;
                                                if (bl) break block22;
                                                if (ilIlCg.IlIlm == ItemTypes.AIR) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                            ilIlCg = this;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        n4 = ilIlCg.IlIlX;
                                        if (bl) break block24;
                                        if (n4 > 0) break block25;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                }
                                n4 = 1;
                                break block24;
                            }
                            n4 = 0;
                        }
                        n2 = n4;
                        try {
                            block29: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            n = this.IlIlr.IlIlZ(ClientVersion.V_1_12_2);
                                                            if (bl) break block26;
                                                            if (n == 0) break block27;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw IlIlCg.a(illegalArgumentException);
                                                        }
                                                        n3 = n2;
                                                        if (bl) break block28;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    if (n3 != 0) break block29;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                                n3 = this.IlIlA;
                                                if (bl) break block28;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                            if (n3 < IlIlCg.b("a", (int)30024, (long)(0x41C2C35CE4E13FA8L ^ l))) break block29;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        n3 = this.IlIlA;
                                        if (bl) break block28;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    if (n3 <= IlIlCg.b("a", (int)16404, (long)(0x3B46D847A2FA0AF5L ^ l))) break block30;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            n3 = 1;
                            break block28;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                    }
                    n3 = 0;
                }
                return n3 != 0;
            }
            n = n2;
        }
        return n != 0;
    }

    public ClientVersion IlIlz() {
        return this.IlIlr;
    }

    public IlIlz IlIlW() {
        return this.IlIlq;
    }

    public boolean equals(Object object) {
        boolean bl;
        block28: {
            block29: {
                int n;
                block35: {
                    block31: {
                        IlIlCg ilIlCg;
                        boolean bl2;
                        block34: {
                            block33: {
                                block32: {
                                    block30: {
                                        Object object2;
                                        block26: {
                                            block27: {
                                                long l = a ^ 0x269131354CB0L;
                                                bl2 = IlIln7.IlIly();
                                                try {
                                                    try {
                                                        object2 = this;
                                                        if (!bl2) break block26;
                                                        if (object2 != object) break block27;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IlIlCg.a(illegalArgumentException);
                                                    }
                                                    return true;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IlIlCg.a(illegalArgumentException);
                                                }
                                            }
                                            object2 = object;
                                        }
                                        try {
                                            bl = object2 instanceof IlIlCg;
                                            if (!bl2) break block28;
                                            if (!bl) break block29;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        ilIlCg = (IlIlCg)object;
                                        try {
                                            try {
                                                n = this.IlIlm.equals(ilIlCg.IlIlm);
                                                if (!bl2) break block30;
                                                if (n == 0) break block31;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IlIlCg.a(illegalArgumentException);
                                            }
                                            n = this.IlIlX;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!bl2) break block32;
                                            if (n != ilIlCg.IlIlX) break block31;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IlIlCg.a(illegalArgumentException);
                                        }
                                        n = Objects.equals(this.IlIlG, ilIlCg.IlIlG) ? 1 : 0;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (!bl2) break block33;
                                        if (n == 0) break block31;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IlIlCg.a(illegalArgumentException);
                                    }
                                    n = Objects.equals(this.IlIlH, ilIlCg.IlIlH) ? 1 : 0;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    if (!bl2) break block34;
                                    if (n == 0) break block31;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IlIlCg.a(illegalArgumentException);
                                }
                                n = this.IlIlA;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (!bl2) break block35;
                                if (n != ilIlCg.IlIlA) break block31;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IlIlCg.a(illegalArgumentException);
                            }
                            n = 1;
                            break block35;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IlIlCg.a(illegalArgumentException);
                        }
                    }
                    n = 0;
                }
                return n != 0;
            }
            bl = false;
        }
        return bl;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder;
        String string2;
        StringBuilder stringBuilder2;
        Object object;
        StringBuilder stringBuilder3;
        long l;
        block11: {
            block12: {
                l = a ^ 0x2634558B95C5L;
                boolean bl = IlIln7.IlIlg();
                try {
                    if (this.IlIlV()) {
                        return IlIlCg.a("b", (int)5541, (long)(0x75BAB86E5579BC3AL ^ l));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
                try {
                    try {
                        stringBuilder3 = new StringBuilder().append((String)((Object)IlIlCg.a("b", (int)23422, (long)(0x1E057EDC653472E8L ^ l)))).append(this.IlIlO()).append((String)((Object)IlIlCg.a("b", (int)22631, (long)(0x3F224EFC6B271EDL ^ l)))).append(this.IlIlq());
                        object = IlIlCg.a("b", (int)3679, (long)(0x2AFB620AF6E927DCL ^ l));
                        if (bl) break block11;
                        stringBuilder3 = stringBuilder3.append((String)object).append(this.IlIlm.getName());
                        if (this.IlIlG == null) break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlCg.a(illegalArgumentException);
                    }
                    object = (String)((Object)IlIlCg.a("b", (int)3612, (long)(0x55D2482DD9B3A792L ^ l))) + this.IlIlG.getTagNames();
                    break block11;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlCg.a(illegalArgumentException);
                }
            }
            object = "";
        }
        try {
            stringBuilder2 = stringBuilder3.append((String)object);
            string2 = this.IlIlA != -1 ? (String)((Object)IlIlCg.a("b", (int)9447, (long)(0x5D0E7B0996680D6FL ^ l))) + this.IlIlA : "";
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIlCg.a(illegalArgumentException);
        }
        try {
            stringBuilder = stringBuilder2.append(string2);
            string = this.IlIlH != null ? (String)((Object)IlIlCg.a("b", (int)10443, (long)(0x5B785390711C0146L ^ l))) + this.IlIlH.IlIlf() : "";
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIlCg.a(illegalArgumentException);
        }
        return stringBuilder.append(string).append("]").toString();
    }

    public static IlIlj4 IlIlq() {
        return new IlIlj4();
    }

    /* synthetic */ IlIlCg(ItemType itemType, int n, NBTCompound nBTCompound, IlIlfa ilIlfa, int n2, ClientVersion clientVersion, IlIlz ilIlz, IlIla ilIla) {
        this(itemType, n, nBTCompound, ilIlfa, n2, clientVersion, ilIlz);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        IlIlCg.a = IlIls.a(-7827763783541044280L, 5091885442910769953L, MethodHandles.lookup().lookupClass()).a(239151677344973L);
                        IlIlCg.d = new HashMap<K, V>(13);
                        IlIlCg.IlIlc(new PacketWrapper[5]);
                        var11 = IlIlCg.a ^ 72888814046753L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[28];
                        var18_4 = 0;
                        var17_5 = "b\u00c8\u008b\u008e\u008e\u009cr?U\u00b7w\u00b8\u00e2\u0089\u00c3 \u00e5\u001f\u00c2\u0018\u0094\f\u0017\u00cc\u008e\u00e5\u0096\u0089\u00a9\u00bew\u00ec\u0010\u00cf`\u009cU\u00c5\u0098\u00aa\u00d3\u001d\u00c5y\u00c3Mc\u00b4\"\u0010\u00ba\u00e2\b\u00f1\u00b5\u00ea>y/`j*\u00cbw\u00ab\u00f9(\u008a\fs\u00ad2\u00bd.\u00fe\u00cd\u0089\u00d7J\u00cc_\u008e\u00adB\u00da\tl\u0098\u00d3o\u00aee!\u0095~\u00b2}$\u00c8\u0099hJ\u009b\u009d\u00cf\u0093c\u0010\u00e1\u00c1\u00d8\u0080R\u0001\u0015\u00e4\u0092\u00fcf+\u008b\u00a8\u00eb\u0090 -\u0012`l\u00b4\u00a4\u00e5\u00ae\u00c2\u00f3\u0000\u00f8\u00d0E\u00acD\u00af\u008f\u000e\u00c3U\u0013\u000f\u001d\u00abr\u00b9\u00cb\u00a5\u00a7\u0094\u00f4\u0010)\u00d9\u00ef\"\u008a\u001f\u0000\u0017pW\u00ee\u00c7b\u00f1\u008c\u00db\u0010\u00cf=\u00c4s\u00993\u00fcE\u00cc*\u00d0\u00b0\u00ac|q\u00afP\u0094o\u00ed\u00aed\u008b8\"\u00bb@\u0089\u0001\u00c8q\u00c9\u00e8b\"\t\u007f*\u0006-\u0013(\u00af\u000e\u00f6\u00d6\u0086U\u00c4\u0019\u00c1\u00a7p\u00fd\u00b5J7N\u00af\u0002\u0098\u0084e\u00b4\u00b84\u0095B\u00d4\u00cb\u00f2\u00eb \u0088ypo\u00ca\u00e8UhcER\u0004\u0087\u008b\u00e23Y\u00d2\u000eGu]Y\u00c4\u0010\u00e3\u00b2\u0084F\u00dd\u008b&7\f0\u00bf\u008c\u0094\u009d\u00af\u008c\u00103WR\u00f3\u00cb\\\u001b\u00eb\u00a7~\u00ff\u00cfP\u0095\u0004\u008e(5\u009d\n\u00a4\u00c8\u009efb\u00d7N\u00c2\u00f45\u008f\r2\u00a6t\u0016\b\u009eG\u0001\u0001\u000bX4\u00d55\u00de\u0084z\u00ecl\u00ab\u00d5s-z\u00b5\u0010lL\u0015GwO\u00b1O<?3\u0011\u0093\u00dc-\u00fa8\u001fi\u00def\u00a3\u0017!\u00fa\u000e\u00bb\u00cdR\u00f9\u00bf]\u00e7c\u0019\u0012\u00bb`\u00c1\u00bc\u0000Z\u00be\u00f1\u00e1\u00e5\u00e4\u0099t\u00f5\u00a8\u00e1+\u00ca^\u008ac\u00a5\u0086{oj\u00e1\u00ec\u00a82\u0095\u0087\u00b8\u00e6e\u00e3\u001a\u0010\u0002\u000b\u00d1}\u00b1\u00b9\u00c1\u00a7t\u00ba\u00bf&^\u0091\u00dd,\u0018\u00b0\u00f3_\u0000(RU\u00dcj4\u00aba\u00a8\u00e8B1\u0007\u00f7/\u0002j\u00c5\u00edc\u0010\u00df\u00197\u00c7\u00ddj\u00a5q\u0002\u00db\u00b4\u0094\u00e2\u00de\u0010\u00b3\u0018\u00dc{\u001a\u00ecZ\u00d8`>\u008e\u00dc\u00ef\u0018N\u00e2\u00a6\u009d\u00fc\u0085\u00ec(w~\u00a5!(^b\u008f\u00c5\u0094\u00d4\u00b3G\u00e9u#\u00a8\u00e5\u009d\u0092\u00a5.{\u009b9];\u00e3\u0011~c{\u001b\u00af\u00ba\u00c4\u00a7\u00a1\u00d5+J\u00c7P\u001f4\u0010\u00af\u00f0f\u00f7\u00f7\u00cd\u00b5\u00ac6\u0097\u00eft\u00b0l\u00e9\u00e8\u0010E\u00ca\u00de\"F\u0003\u0099IC\u00a88F\u0015\u0098K\u00f4\u0010Z\u00f7\u00f7m\u0003\u00aa\u009eb\u00fe-\u00fd\u00fa\u009a\u009d\u00cb\u0098\u0010Rl\u00d7\u00e22\u00a5E\u0097\u0082\u001b\u0091*f\u00e4\u00a5g\u0010\u00aax{\u00bb$*\u00b4\u0002\u00fdO\u00e2S\u009b&\u001c\u00a7H-=t\u00a6\u0019\u00fc<.\u00eb\u00ec\u001e\u0091\u00bc\u00d5\u00e6\u00b1\u008b\u00cf\u0012\u00d5\u00a8\u00e0\u00cd\u007fV\u00db\u0096Y\u0003z?i]\u00c8\u00de\u00fd\n\u00d2\u00a8J\u0095\\>\u0094s\u00f0\u007fUf6kCD3\u0089\u0082:zy\u0018\u00b5\u009a\u00a9\u0015kJ\u00e4\u007ft\u00f5\u0081\u00ba\u0010|\u00ce\u00cd\u00c9\u00db\u00ca\u00d6\u00cdjX\u0016qowI\u00ac";
                        var19_6 = "b\u00c8\u008b\u008e\u008e\u009cr?U\u00b7w\u00b8\u00e2\u0089\u00c3 \u00e5\u001f\u00c2\u0018\u0094\f\u0017\u00cc\u008e\u00e5\u0096\u0089\u00a9\u00bew\u00ec\u0010\u00cf`\u009cU\u00c5\u0098\u00aa\u00d3\u001d\u00c5y\u00c3Mc\u00b4\"\u0010\u00ba\u00e2\b\u00f1\u00b5\u00ea>y/`j*\u00cbw\u00ab\u00f9(\u008a\fs\u00ad2\u00bd.\u00fe\u00cd\u0089\u00d7J\u00cc_\u008e\u00adB\u00da\tl\u0098\u00d3o\u00aee!\u0095~\u00b2}$\u00c8\u0099hJ\u009b\u009d\u00cf\u0093c\u0010\u00e1\u00c1\u00d8\u0080R\u0001\u0015\u00e4\u0092\u00fcf+\u008b\u00a8\u00eb\u0090 -\u0012`l\u00b4\u00a4\u00e5\u00ae\u00c2\u00f3\u0000\u00f8\u00d0E\u00acD\u00af\u008f\u000e\u00c3U\u0013\u000f\u001d\u00abr\u00b9\u00cb\u00a5\u00a7\u0094\u00f4\u0010)\u00d9\u00ef\"\u008a\u001f\u0000\u0017pW\u00ee\u00c7b\u00f1\u008c\u00db\u0010\u00cf=\u00c4s\u00993\u00fcE\u00cc*\u00d0\u00b0\u00ac|q\u00afP\u0094o\u00ed\u00aed\u008b8\"\u00bb@\u0089\u0001\u00c8q\u00c9\u00e8b\"\t\u007f*\u0006-\u0013(\u00af\u000e\u00f6\u00d6\u0086U\u00c4\u0019\u00c1\u00a7p\u00fd\u00b5J7N\u00af\u0002\u0098\u0084e\u00b4\u00b84\u0095B\u00d4\u00cb\u00f2\u00eb \u0088ypo\u00ca\u00e8UhcER\u0004\u0087\u008b\u00e23Y\u00d2\u000eGu]Y\u00c4\u0010\u00e3\u00b2\u0084F\u00dd\u008b&7\f0\u00bf\u008c\u0094\u009d\u00af\u008c\u00103WR\u00f3\u00cb\\\u001b\u00eb\u00a7~\u00ff\u00cfP\u0095\u0004\u008e(5\u009d\n\u00a4\u00c8\u009efb\u00d7N\u00c2\u00f45\u008f\r2\u00a6t\u0016\b\u009eG\u0001\u0001\u000bX4\u00d55\u00de\u0084z\u00ecl\u00ab\u00d5s-z\u00b5\u0010lL\u0015GwO\u00b1O<?3\u0011\u0093\u00dc-\u00fa8\u001fi\u00def\u00a3\u0017!\u00fa\u000e\u00bb\u00cdR\u00f9\u00bf]\u00e7c\u0019\u0012\u00bb`\u00c1\u00bc\u0000Z\u00be\u00f1\u00e1\u00e5\u00e4\u0099t\u00f5\u00a8\u00e1+\u00ca^\u008ac\u00a5\u0086{oj\u00e1\u00ec\u00a82\u0095\u0087\u00b8\u00e6e\u00e3\u001a\u0010\u0002\u000b\u00d1}\u00b1\u00b9\u00c1\u00a7t\u00ba\u00bf&^\u0091\u00dd,\u0018\u00b0\u00f3_\u0000(RU\u00dcj4\u00aba\u00a8\u00e8B1\u0007\u00f7/\u0002j\u00c5\u00edc\u0010\u00df\u00197\u00c7\u00ddj\u00a5q\u0002\u00db\u00b4\u0094\u00e2\u00de\u0010\u00b3\u0018\u00dc{\u001a\u00ecZ\u00d8`>\u008e\u00dc\u00ef\u0018N\u00e2\u00a6\u009d\u00fc\u0085\u00ec(w~\u00a5!(^b\u008f\u00c5\u0094\u00d4\u00b3G\u00e9u#\u00a8\u00e5\u009d\u0092\u00a5.{\u009b9];\u00e3\u0011~c{\u001b\u00af\u00ba\u00c4\u00a7\u00a1\u00d5+J\u00c7P\u001f4\u0010\u00af\u00f0f\u00f7\u00f7\u00cd\u00b5\u00ac6\u0097\u00eft\u00b0l\u00e9\u00e8\u0010E\u00ca\u00de\"F\u0003\u0099IC\u00a88F\u0015\u0098K\u00f4\u0010Z\u00f7\u00f7m\u0003\u00aa\u009eb\u00fe-\u00fd\u00fa\u009a\u009d\u00cb\u0098\u0010Rl\u00d7\u00e22\u00a5E\u0097\u0082\u001b\u0091*f\u00e4\u00a5g\u0010\u00aax{\u00bb$*\u00b4\u0002\u00fdO\u00e2S\u009b&\u001c\u00a7H-=t\u00a6\u0019\u00fc<.\u00eb\u00ec\u001e\u0091\u00bc\u00d5\u00e6\u00b1\u008b\u00cf\u0012\u00d5\u00a8\u00e0\u00cd\u007fV\u00db\u0096Y\u0003z?i]\u00c8\u00de\u00fd\n\u00d2\u00a8J\u0095\\>\u0094s\u00f0\u007fUf6kCD3\u0089\u0082:zy\u0018\u00b5\u009a\u00a9\u0015kJ\u00e4\u007ft\u00f5\u0081\u00ba\u0010|\u00ce\u00cd\u00c9\u00db\u00ca\u00d6\u00cdjX\u0016qowI\u00ac".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIlCg.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00c9h*&\u000e\u00d6\u0013\u00c9\u00e1jMm\u00fe\u00c2\u009e\u00fa \u00810`\u0011\u00d9=\u00c1\u0002]\u00cb\u00f7yB\u00e7\u00e8\u00b2u\u00cc\u00b5@%\u00ea\u00abMRY\u00ac\u00ae\u00bbL\u00ec\u0011";
                            var19_6 = "\u00c9h*&\u000e\u00d6\u0013\u00c9\u00e1jMm\u00fe\u00c2\u009e\u00fa \u00810`\u0011\u00d9=\u00c1\u0002]\u00cb\u00f7yB\u00e7\u00e8\u00b2u\u00cc\u00b5@%\u00ea\u00abMRY\u00ac\u00ae\u00bbL\u00ec\u0011".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIlCg.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                IlIlCg.b = var20_3;
                IlIlCg.c = new String[28];
                IlIlCg.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u00a6\u00af\u00f0U\u0097b\u00c9\u00c2\u00b1\u00aby(\u0016H\u00b3\u00dd";
                var5_15 = "\u00a6\u00af\u00f0U\u0097b\u00c9\u00c2\u00b1\u00aby(\u0016H\u00b3\u00dd".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        IlIlCg.e = var6_12;
        IlIlCg.f = new Integer[2];
        IlIlCg.IlIlP = IlIlCg.IlIlq().IlIlc(new NBTCompound()).IlIlD();
    }

    public static void IlIlc(PacketWrapper[] packetWrapperArray) {
        IlIlB = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlv() {
        return IlIlB;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x61A2;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/IlIlCg", exception);
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
            IlIlCg.c[n2] = IlIlCg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlCg.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/IlIlCg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x40B0;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/IlIlCg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlCg.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlCg.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/IlIlCg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlCg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(IlIlCg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

