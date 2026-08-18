/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.IlIlqa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.IlIliR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.IlIlqX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.IlIlvu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.IlIlAW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.IlIlQC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlfM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlfP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIldL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIly8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.EntityDataType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.IlIlqq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.IlIlxV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.frog.IlIlqA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.nautilus.IlIlXC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.IlIloN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.IlIluj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.IlIluD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIlXo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIldv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.IlIlum;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlOh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlAV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlyY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.IlIlG0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlhJ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlOw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlQ9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public final class IlIlft {
    private static final VersionedRegistry<EntityDataType<?>> IlIls;
    public static final EntityDataType<Byte> IlIlr;
    public static final EntityDataType<Short> IlIlW;
    public static final EntityDataType<Integer> IlIlf;
    public static final EntityDataType<Long> IlIlF;
    public static final EntityDataType<Float> IlIlJ;
    public static final EntityDataType<String> IlIlx;
    @Deprecated
    public static final EntityDataType<String> IlIlm;
    public static final EntityDataType<Component> IlIlY;
    @Deprecated
    public static final EntityDataType<Optional<String>> IlIlC;
    public static final EntityDataType<Optional<Component>> IlIlO;
    public static final EntityDataType<IlIlCg> IlIlV;
    public static final EntityDataType<Optional<IlIlCg>> IlIld;
    public static final EntityDataType<Boolean> IlIlt;
    public static final EntityDataType<IlIlQG> IlIlw;
    public static final EntityDataType<IlIlAn> IlIle;
    public static final EntityDataType<Optional<IlIlAn>> IlIlo;
    public static final EntityDataType<IlIlAV> IlIlQ;
    public static final EntityDataType<Optional<UUID>> IlIlb;
    public static final EntityDataType<Integer> IlIlk;
    public static final EntityDataType<Integer> IlIlh;
    @ApiStatus.Obsolete
    public static final EntityDataType<NBTCompound> IlIlK;
    public static final EntityDataType<IlIlum<?>> IlIlR;
    public static final EntityDataType<IlIluD> IlIli;
    public static final EntityDataType<Optional<Integer>> IlIlT;
    public static final EntityDataType<IlIlqX> IlIly;
    @Deprecated
    public static final EntityDataType<Integer> IlIlg;
    public static final EntityDataType<IlIlAW> IlIlq;
    @Deprecated
    public static final EntityDataType<Integer> IlIlA;
    public static final EntityDataType<IlIlqA> IlIlu;
    public static final EntityDataType<Optional<IlIlyY>> IlIlZ;
    @Deprecated
    public static final EntityDataType<Integer> IlIlP;
    public static final EntityDataType<IlIlG0> IlIlj;
    public static final EntityDataType<IlIliR> IlIla;
    public static final EntityDataType<IlIlQG> IlIlM;
    public static final EntityDataType<IlIlhJ> IlIlL;
    public static final EntityDataType<IlIlvu> IlIlN;
    public static final EntityDataType<List<IlIlum<?>>> IlIln;
    @Deprecated
    public static final EntityDataType<Integer> IlIlX;
    public static final EntityDataType<IlIldv> IlIlE;
    public static final EntityDataType<IlIldL> IlIlG;
    public static final EntityDataType<IlIlXo> IlIlc;
    public static final EntityDataType<IlIloN> IlIl_;
    public static final EntityDataType<IlIlfP> IlIlv;
    public static final EntityDataType<IlIlqq> IlIlH;
    public static final EntityDataType<IlIlxV> IlIlz;
    public static final EntityDataType<IlIlqa> IlIll;
    public static final EntityDataType<IlIlXC> IlIlB;
    public static final EntityDataType<IlIlOh> IlIlS;
    public static final EntityDataType<IlIlQC> IlIlU;
    public static final EntityDataType<IlIlfM> IlIlI;
    public static final EntityDataType<IlIly8> IlIlD;
    public static final EntityDataType<IlIluj> IlIlp;
    private static final long a;
    private static final long b;
    private static transient /* synthetic */ String jSmSemXGIr = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlft() {
    }

    public static VersionedRegistry<EntityDataType<?>> IlIln() {
        return IlIls;
    }

    public static Collection<EntityDataType<?>> IlIlQ() {
        return IlIls.getEntries();
    }

    public static @Nullable EntityDataType<?> IlIlf(ClientVersion clientVersion, int n) {
        return IlIls.getById(clientVersion, n);
    }

    public static @Nullable EntityDataType<?> IlIlx(String string) {
        return IlIls.getByName(string);
    }

    @ApiStatus.Internal
    public static <T, Z extends T> EntityDataType<Z> IlIlN(String string, IlIlQ9<Z> ilIlQ9, IlIlOw<T> ilIlOw) {
        return IlIls.define(string, typesBuilderData -> new EntityDataType((TypesBuilderData)typesBuilderData, ilIlQ9, ilIlOw::accept));
    }

    private static IlIlQ9<Integer> IlIlv() {
        return packetWrapper -> {
            int n;
            long l = a ^ 0x2AD407B6B272L;
            int n2 = EntityDataType.IlIlW();
            PacketWrapper packetWrapper2 = packetWrapper;
            if (n2 == 0) {
                if (packetWrapper2.IlIlw().IlIlz(ServerVersion.V_1_9)) {
                    n = packetWrapper.IlIlf();
                    return n;
                }
                packetWrapper2 = packetWrapper;
            }
            n = packetWrapper2.IlIlW();
            return n;
        };
    }

    private static IlIlOw<Number> IlIlv() {
        return (packetWrapper, number) -> {
            block4: {
                PacketWrapper packetWrapper2;
                block2: {
                    block3: {
                        long l = a ^ 0x60193F4C5CE5L;
                        int n = EntityDataType.IlIlW();
                        packetWrapper2 = packetWrapper;
                        if (n != 0) break block2;
                        if (!packetWrapper2.IlIlw().IlIlz(ServerVersion.V_1_9)) break block3;
                        packetWrapper.IlIlJ(number.intValue());
                        if (n == 0) break block4;
                    }
                    packetWrapper2 = packetWrapper;
                }
                packetWrapper2.IlIla(number.intValue());
            }
        };
    }

    @Deprecated
    private static IlIlQ9<Optional<String>> IlIlL() {
        return packetWrapper -> packetWrapper.IlIlP(PacketWrapper::IlIlk);
    }

    @Deprecated
    private static IlIlOw<Optional<String>> IlIlC() {
        return (packetWrapper, optional) -> packetWrapper.IlIlf(optional, PacketWrapper::IlIlY);
    }

    private static IlIlQ9<Optional<Component>> IlIlU() {
        return packetWrapper -> packetWrapper.IlIlP(PacketWrapper::IlIlJ);
    }

    private static IlIlOw<Optional<Component>> IlIlN() {
        return (packetWrapper, optional) -> packetWrapper.IlIlf(optional, PacketWrapper::IlIlz);
    }

    private static IlIlQ9<Optional<IlIlAn>> IlIlS() {
        return packetWrapper2 -> {
            long l = a ^ 0x25C131307711L;
            int n = EntityDataType.IlIlW();
            PacketWrapper packetWrapper3 = packetWrapper2;
            if (n == 0) {
                if (packetWrapper3.IlIlw().IlIlz(ServerVersion.V_1_9)) {
                    return packetWrapper2.IlIlP(PacketWrapper::IlIlE);
                }
                packetWrapper3 = packetWrapper2;
            }
            return packetWrapper3.IlIlP(packetWrapper -> new IlIlAn(packetWrapper.IlIlW(), packetWrapper.IlIlW(), packetWrapper.IlIlW()));
        };
    }

    private static IlIlOw<Optional<IlIlAn>> IlIlL() {
        return (packetWrapper, optional) -> {
            block4: {
                PacketWrapper packetWrapper3;
                block2: {
                    block3: {
                        long l = a ^ 0x4802F2BEA45FL;
                        int n = EntityDataType.IlIlz();
                        packetWrapper3 = packetWrapper;
                        if (n == 0) break block2;
                        if (!packetWrapper3.IlIlw().IlIlz(ServerVersion.V_1_9)) break block3;
                        packetWrapper.IlIlf(optional, PacketWrapper::IlIlh);
                        if (n != 0) break block4;
                    }
                    packetWrapper3 = packetWrapper;
                }
                packetWrapper3.IlIlf(optional, (packetWrapper2, ilIlAn) -> {
                    packetWrapper.IlIla(ilIlAn.IlIlw());
                    packetWrapper.IlIla(ilIlAn.IlIlc());
                    packetWrapper.IlIla(ilIlAn.IlIlk());
                });
            }
        };
    }

    private static /* synthetic */ void lambda$static$29(PacketWrapper packetWrapper, List list) {
        packetWrapper.IlIlQ(list, IlIlum::IlIlu);
    }

    private static /* synthetic */ List lambda$static$28(PacketWrapper packetWrapper) {
        return packetWrapper.IlIll(IlIlum::IlIlg);
    }

    private static /* synthetic */ void lambda$static$27(PacketWrapper packetWrapper, IlIlvu ilIlvu) {
        packetWrapper.IlIlJ(ilIlvu.ordinal());
    }

    private static /* synthetic */ IlIlvu lambda$static$26(PacketWrapper packetWrapper) {
        return IlIlvu.values()[packetWrapper.IlIlf()];
    }

    private static /* synthetic */ void lambda$static$25(PacketWrapper packetWrapper, IlIlhJ ilIlhJ) {
        packetWrapper.IlIlR(ilIlhJ.IlIlS());
        packetWrapper.IlIlR(ilIlhJ.IlIlY());
        packetWrapper.IlIlR(ilIlhJ.IlIlw());
        packetWrapper.IlIlR(ilIlhJ.IlIlj());
    }

    private static /* synthetic */ IlIlhJ lambda$static$24(PacketWrapper packetWrapper) {
        return new IlIlhJ(packetWrapper.IlIlX(), packetWrapper.IlIlX(), packetWrapper.IlIlX(), packetWrapper.IlIlX());
    }

    private static /* synthetic */ void lambda$static$23(PacketWrapper packetWrapper, IlIlQG ilIlQG) {
        packetWrapper.IlIlR(ilIlQG.IlIlA);
        packetWrapper.IlIlR(ilIlQG.IlIlF);
        packetWrapper.IlIlR(ilIlQG.IlIlp);
    }

    private static /* synthetic */ IlIlQG lambda$static$22(PacketWrapper packetWrapper) {
        return new IlIlQG(packetWrapper.IlIlX(), packetWrapper.IlIlX(), packetWrapper.IlIlX());
    }

    private static /* synthetic */ void lambda$static$21(PacketWrapper packetWrapper, IlIliR ilIliR) {
        packetWrapper.IlIlJ(ilIliR.ordinal());
    }

    private static /* synthetic */ IlIliR lambda$static$20(PacketWrapper packetWrapper) {
        int n = packetWrapper.IlIlf();
        return IlIliR.values()[n];
    }

    private static /* synthetic */ void lambda$static$19(PacketWrapper packetWrapper2, Optional optional) {
        packetWrapper2.IlIlI(optional.orElse(null), (packetWrapper, ilIlyY) -> {
            packetWrapper.IlIlM(ilIlyY.IlIlK().toString());
            packetWrapper.IlIlh(ilIlyY.IlIli());
        });
    }

    private static /* synthetic */ Optional lambda$static$17(PacketWrapper packetWrapper2) {
        return Optional.ofNullable((IlIlyY)packetWrapper2.IlIlN(packetWrapper -> {
            long l = a ^ 0x34349208B3F4L;
            return new IlIlyY(new ResourceLocation(packetWrapper.IlIlp((int)b)), packetWrapper.IlIlE());
        }));
    }

    private static /* synthetic */ void lambda$static$15(PacketWrapper packetWrapper, IlIlqX ilIlqX) {
        packetWrapper.IlIlJ(ilIlqX.IlIlT(packetWrapper.IlIlw().IlIlE()));
    }

    private static /* synthetic */ IlIlqX lambda$static$14(PacketWrapper packetWrapper) {
        int n = packetWrapper.IlIlf();
        return IlIlqX.IlIlw(packetWrapper.IlIlw().IlIlE(), n);
    }

    private static /* synthetic */ void lambda$static$13(PacketWrapper packetWrapper, Optional optional) {
        packetWrapper.IlIlJ(optional.orElse(-1) + 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Optional lambda$static$12(PacketWrapper packetWrapper) {
        Optional<Object> optional;
        long l = a ^ 0x64184F2B2198L;
        int n = packetWrapper.IlIlf();
        int n2 = EntityDataType.IlIlz();
        int n3 = n;
        if (n2 != 0) {
            if (n3 == 0) {
                optional = Optional.empty();
                return optional;
            }
            n3 = n - 1;
        }
        optional = Optional.of(n3);
        return optional;
    }

    private static /* synthetic */ void lambda$static$11(PacketWrapper packetWrapper, Optional optional) {
        packetWrapper.IlIlI(optional.orElse(null), PacketWrapper::IlIlc);
    }

    private static /* synthetic */ Optional lambda$static$10(PacketWrapper packetWrapper) {
        return Optional.ofNullable((UUID)packetWrapper.IlIlN(PacketWrapper::IlIlv));
    }

    private static /* synthetic */ void lambda$static$9(PacketWrapper packetWrapper, IlIlAV ilIlAV) {
        packetWrapper.IlIlJ(ilIlAV.IlIlK());
    }

    private static /* synthetic */ IlIlAV lambda$static$8(PacketWrapper packetWrapper) {
        int n = packetWrapper.IlIlf();
        return IlIlAV.IlIlf(n);
    }

    private static /* synthetic */ void lambda$static$7(PacketWrapper packetWrapper, IlIlAn ilIlAn) {
        block4: {
            PacketWrapper packetWrapper2;
            block2: {
                block3: {
                    long l = a ^ 0x4ABECF936129L;
                    int n = EntityDataType.IlIlW();
                    packetWrapper2 = packetWrapper;
                    if (n != 0) break block2;
                    if (!packetWrapper2.IlIlw().IlIlz(ServerVersion.V_1_9)) break block3;
                    packetWrapper.IlIlh(ilIlAn);
                    if (n == 0) break block4;
                }
                packetWrapper.IlIla(ilIlAn.IlIlw());
                packetWrapper.IlIla(ilIlAn.IlIlc());
                packetWrapper2 = packetWrapper;
            }
            packetWrapper2.IlIla(ilIlAn.IlIlk());
        }
    }

    private static /* synthetic */ IlIlAn lambda$static$6(PacketWrapper packetWrapper) {
        long l = a ^ 0x4295D162F331L;
        int n = EntityDataType.IlIlz();
        int n2 = packetWrapper.IlIlw().IlIlz(ServerVersion.V_1_9);
        if (n != 0) {
            if (n2 != 0) {
                return packetWrapper.IlIlE();
            }
            n2 = packetWrapper.IlIlW();
        }
        int n3 = n2;
        int n4 = packetWrapper.IlIlW();
        int n5 = packetWrapper.IlIlW();
        return new IlIlAn(n3, n4, n5);
    }

    private static /* synthetic */ void lambda$static$5(PacketWrapper packetWrapper, IlIlQG ilIlQG) {
        packetWrapper.IlIlR(ilIlQG.IlIlA);
        packetWrapper.IlIlR(ilIlQG.IlIlF);
        packetWrapper.IlIlR(ilIlQG.IlIlp);
    }

    private static /* synthetic */ IlIlQG lambda$static$4(PacketWrapper packetWrapper) {
        return new IlIlQG(packetWrapper.IlIlX(), packetWrapper.IlIlX(), packetWrapper.IlIlX());
    }

    private static /* synthetic */ void lambda$static$3(PacketWrapper packetWrapper, Optional optional) {
        packetWrapper.IlIlj(optional.orElse(null));
    }

    private static /* synthetic */ Optional lambda$static$2(PacketWrapper packetWrapper) {
        return Optional.of(packetWrapper.IlIlk());
    }

    private static /* synthetic */ void lambda$static$1(PacketWrapper packetWrapper, Integer n) {
        block4: {
            PacketWrapper packetWrapper2;
            block2: {
                block3: {
                    long l = a ^ 0x30D1F625718FL;
                    int n2 = EntityDataType.IlIlW();
                    packetWrapper2 = packetWrapper;
                    if (n2 != 0) break block2;
                    if (!packetWrapper2.IlIlw().IlIlz(ServerVersion.V_1_9)) break block3;
                    packetWrapper.IlIlJ(n);
                    if (n2 == 0) break block4;
                }
                packetWrapper2 = packetWrapper;
            }
            packetWrapper2.IlIla(n);
        }
    }

    private static /* synthetic */ Integer lambda$static$0(PacketWrapper packetWrapper) {
        long l = a ^ 0x6C33E1794DA8L;
        int n = EntityDataType.IlIlz();
        int n2 = packetWrapper.IlIlw().IlIlz(ServerVersion.V_1_9);
        if (n != 0) {
            if (n2 != 0) {
                return packetWrapper.IlIlf();
            }
            n2 = packetWrapper.IlIlW();
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    IlIlft.a = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(-1518099984617577340L, 8851132370153426800L, MethodHandles.lookup().lookupClass()).a(42588750634932L);
                    var14 = IlIlft.a ^ 29706011688165L;
                    var6_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var7_2 = 1; var7_2 < 8; ++var7_2) {
                        v2 = v2;
                        v2[var7_2] = (byte)(var14 << var7_2 * 8 >>> 56);
                    }
                    var6_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var5_3 = new String[53];
                    var11_4 = 0;
                    var10_5 = "\u00e6&\\\u00f0\u00b5\u00d4\u00e5\u00c6\u0010x\u00cd\r\u0002\u0084m\u00de-\u0011{\u00ce%\u00f5\u0003\u00a0\u0091\u0018\u00ff\u00c3e\u0087\u001c\u00a8\u00e2\u00e5\u00e6\u008d.\u00e9\u00faT\u0098dD\u00d3f\u00c4\u00c8\u001c\u00bc\u00fa\u0010J\u00cag*\u00e8\u00e1\u0090\u00a3Wi?\u00c7,\u0092Uk\u0018\u00e2\u00bb\u0016+\u00b9\u0096\u0083\u00ef\u00ae\u00f7S\u00c3\u00eb\u00a6\u00aa\u00029\u00dd\u008f\u0089efG\u00c4\u0010\u00f9\u009cl\u00fd\u00b9 \u001e\u0085i\u00d3+\u0002\u0000\u0090\u00a7\u00e3\u0018\u00ed wJMy\u00f2\u009b\u00f2\u00a6\u0082a\u00d5\u00d4t)\u0080H\u00eby\u00f5\u00dff\u00ee\u0010q\u00b8\u0012\u0011\u0089\u0012\u00f5\u00ca\u00b0\u009b\u0089\u00acqj~\u00e3\u0010V\u001f\u00d3\u00dd\u00c0!\u009e\t\u00c2T?\u008f\u00ef\u00f5\u00abM\b\u00e97\u00fa%\u00e3\u001b\u00f1\u0091\u0018K\u00d6\u0003\u0091U1'/\u00a1^},\u00bc\u0015\u0094\u0018\u00cb\u0095\u00e5\u00f3\u00cen\u00fd\u0003\u0018\u00e4b\u00f6\u00ca\u00c6\u00caI\u00abU\u00b66\u00b2\u00eb\u008f\\\u00c7\u00a2\u00e8q}\u00bfwd\u00b0\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2H\u00f8\u009b\u00b1\u00fe0CT\u00ea\u009f\u0001\u00f5\u0004\u00b67}\u0010\u00dap\u00e2\u00ab\u009d\u001f\u00c6\u00c8\u008b3\u00a6\u00ec\u001d\u00f9\"g\u0018|\u0012\u00be\u00c6$\u00d0\u009bS\u00da\u00d0\t=\u00d0\u00fedO\u0010\u00c7\u0010u\u00c7Q91\u0010\u008cy\u0001P\u0084\u00fc&n\u001d(\u009a\u001a\u00e9\u00da\u00c0c\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u007fC>\u00d0n\b\u00e9s\u00c2/\u0087X\u0002\u00d5\u00cd\u00a3\u0010B,+`\u001c:7G<\u00ff8\u00c4M \u00ack\u0010\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u00daT\u0015c\u00aa\u00dc|\r\b2\u00c5\u0019L!Tk\u00d1\u0010\u0082\u00fc\tZJ\u00b6<[\u00f7\u0018\u00a4qS\u00a4\u0004\u0001\b]\u000e(\u00f2\u009b\u009d\n0\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2H\u00f8\u009b\u00b1\u00fe0CT\u00ea\u009f\u0001\u00f5\u0004\u00b67}\b&\u0091\u000f\u00fd\u0087N-@\u0010J\u00cc\u00b9\u0090v\u00c3\u0011\u00d6\u00edg\u00f2\u001b\u00de~\u008f\u0083\u0018\u0011\u0094\u00af\u00a9,~\"c\u00ae\u0084\u00cc\u001e\\\u00cb\u0016}\u0099\u0018\u00faN\u00b9\u00af\u0000\u00b7\u0010\u00c9\u00b8gt\u00a2\u000b\u00c4\u00d8\u00fd\u00acb:\u009fSX\u00e4 \u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\b.\u0004\u00f7\u00c8\u00ddC\u0082\u001b\u00dc\u00ec\u001c\u0011\u00e3\u009b\u009bmU\u0082\u00f9\u00fe\u00f9L}\u0018'\u008eu#\u0007\u000fOMKH\u00b2\u001b\u00bf\u00bb\u00c3g\u00c3\u0093p*B\u00f4\u0017\u00d2\b\u00c0\u0002:\u0092\u0098\u00e9k'\u0018\u0088$6\u001c\u00d6\"\u00bc\u0019?\u0015^V\u0085\u00a4\u00c2\u00e2\u009f\u00a02\u00bc^*\u00e2\u0016 \u00ae~B-]\u00de\u00b9\u00ed\u00c3\u00bf^\u00cf2\u00d9\u00e6Ukq\u0082\u00d2\u00af\u00ee\n\u00f8\u00d3\u0004~`u\b\u0089\u0012\u0018\u00ae~B-]\u00de\u00b9\u00ed\u00ee\u0083u\u00d0\u001d\u00b41_\u00df\"E:\u00d4\u0018L=\u0010\u0082\u00fc\tZJ\u00b6<[\u00f7\u0018\u00a4qS\u00a4\u0004\u0001\u0018\u00e2\u00bb\u0016+\u00b9\u0096\u0083\u00ef\u00ae\u00f7S\u00c3\u00eb\u00a6\u00aa\u00029\u00dd\u008f\u0089efG\u00c4\u0018\u0011\u0094\u00af\u00a9,~\"c\u00ae\u0084\u00cc\u001e\\\u00cb\u0016}\u0099\u0018\u00faN\u00b9\u00af\u0000\u00b7\u0018\u00ea5\u00e6\u001f1\u00bf\u00ab\u00d8S\u00e7\u001f'\u00e4\u0004\u0097\u00e0\u009b\u0086\u0011\u00f2\u0003\u0001h\u00dc\u0018\u00c6\u00c5\u00bc\u0097Iv\u00ae\u00e6h0\u00cb9i\u00b0\u0007\u00142t\u00f4\"\u00f9\u00c3\u00c9B\u00101\u00a3<?^\u00d7\u0088,]\u00a9\u008fU\u00a2n\r\u00a1\b\u00fc\u00ac\u00f4\u00adT\u0097r\u009d\u0010\u00ea\u00d3\u000b15\u00a6k_\u00a1\u008a\u00ad\u00aa\u00a4\u00e2\\\u00f4\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u001e\u00db\u0098\u00ef\u0091\u001f\u00c8g\u00f1\u0017\u00cc\u0017ql\u00b8c\u0010\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2S\u00f9\u0085\u00f4F\u0092\u00f9\u0017\u0018\u00c6\u00c5\u00bc\u0097Iv\u00ae\u00e6h0\u00cb9i\u00b0\u0007\u00142t\u00f4\"\u00f9\u00c3\u00c9B\u0018\u001e\u0019\u0084\u00d0\u00eb\"\u0091\u0005\u00049\u00d3Ffc\u00e7\u00ba|T\u00cevG\u0091\u00fb\u00f2\u0018\u00fb\u0012\u00a1\u00ea\u001fR\u0015\u00fc\r\u00dd\u0080\u0089y*\u00a8p:\u00f1\u00aa\u0088\u0084;\u00b0b\b\u0019\u001e6\u00ae\u0090`\u009eR\u0018EJ0\u009f\u008ct\u001d\u00ad\u000f\u0086\u00d2.\u00ffu\"\u009a\u00e2\u0004\u0082\u00d1\u00e6,jl\u0010s\u00fb\u0019cJ\u00c6!\u00c8\u0018\u00a8\u0097i0\u009d\u00b2\u00f1\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2C)>C\u00e0~\u0082^\u008b\u00fb\u00a59\u00ff\u00967\u00dc\u0018f[\u00ebS\u00fb\u00dfx\u00e9:c7\u0019RE@dSH\r\u00b8FB\u00bci";
                    var12_6 = "\u00e6&\\\u00f0\u00b5\u00d4\u00e5\u00c6\u0010x\u00cd\r\u0002\u0084m\u00de-\u0011{\u00ce%\u00f5\u0003\u00a0\u0091\u0018\u00ff\u00c3e\u0087\u001c\u00a8\u00e2\u00e5\u00e6\u008d.\u00e9\u00faT\u0098dD\u00d3f\u00c4\u00c8\u001c\u00bc\u00fa\u0010J\u00cag*\u00e8\u00e1\u0090\u00a3Wi?\u00c7,\u0092Uk\u0018\u00e2\u00bb\u0016+\u00b9\u0096\u0083\u00ef\u00ae\u00f7S\u00c3\u00eb\u00a6\u00aa\u00029\u00dd\u008f\u0089efG\u00c4\u0010\u00f9\u009cl\u00fd\u00b9 \u001e\u0085i\u00d3+\u0002\u0000\u0090\u00a7\u00e3\u0018\u00ed wJMy\u00f2\u009b\u00f2\u00a6\u0082a\u00d5\u00d4t)\u0080H\u00eby\u00f5\u00dff\u00ee\u0010q\u00b8\u0012\u0011\u0089\u0012\u00f5\u00ca\u00b0\u009b\u0089\u00acqj~\u00e3\u0010V\u001f\u00d3\u00dd\u00c0!\u009e\t\u00c2T?\u008f\u00ef\u00f5\u00abM\b\u00e97\u00fa%\u00e3\u001b\u00f1\u0091\u0018K\u00d6\u0003\u0091U1'/\u00a1^},\u00bc\u0015\u0094\u0018\u00cb\u0095\u00e5\u00f3\u00cen\u00fd\u0003\u0018\u00e4b\u00f6\u00ca\u00c6\u00caI\u00abU\u00b66\u00b2\u00eb\u008f\\\u00c7\u00a2\u00e8q}\u00bfwd\u00b0\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2H\u00f8\u009b\u00b1\u00fe0CT\u00ea\u009f\u0001\u00f5\u0004\u00b67}\u0010\u00dap\u00e2\u00ab\u009d\u001f\u00c6\u00c8\u008b3\u00a6\u00ec\u001d\u00f9\"g\u0018|\u0012\u00be\u00c6$\u00d0\u009bS\u00da\u00d0\t=\u00d0\u00fedO\u0010\u00c7\u0010u\u00c7Q91\u0010\u008cy\u0001P\u0084\u00fc&n\u001d(\u009a\u001a\u00e9\u00da\u00c0c\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u007fC>\u00d0n\b\u00e9s\u00c2/\u0087X\u0002\u00d5\u00cd\u00a3\u0010B,+`\u001c:7G<\u00ff8\u00c4M \u00ack\u0010\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u00daT\u0015c\u00aa\u00dc|\r\b2\u00c5\u0019L!Tk\u00d1\u0010\u0082\u00fc\tZJ\u00b6<[\u00f7\u0018\u00a4qS\u00a4\u0004\u0001\b]\u000e(\u00f2\u009b\u009d\n0\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2H\u00f8\u009b\u00b1\u00fe0CT\u00ea\u009f\u0001\u00f5\u0004\u00b67}\b&\u0091\u000f\u00fd\u0087N-@\u0010J\u00cc\u00b9\u0090v\u00c3\u0011\u00d6\u00edg\u00f2\u001b\u00de~\u008f\u0083\u0018\u0011\u0094\u00af\u00a9,~\"c\u00ae\u0084\u00cc\u001e\\\u00cb\u0016}\u0099\u0018\u00faN\u00b9\u00af\u0000\u00b7\u0010\u00c9\u00b8gt\u00a2\u000b\u00c4\u00d8\u00fd\u00acb:\u009fSX\u00e4 \u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\b.\u0004\u00f7\u00c8\u00ddC\u0082\u001b\u00dc\u00ec\u001c\u0011\u00e3\u009b\u009bmU\u0082\u00f9\u00fe\u00f9L}\u0018'\u008eu#\u0007\u000fOMKH\u00b2\u001b\u00bf\u00bb\u00c3g\u00c3\u0093p*B\u00f4\u0017\u00d2\b\u00c0\u0002:\u0092\u0098\u00e9k'\u0018\u0088$6\u001c\u00d6\"\u00bc\u0019?\u0015^V\u0085\u00a4\u00c2\u00e2\u009f\u00a02\u00bc^*\u00e2\u0016 \u00ae~B-]\u00de\u00b9\u00ed\u00c3\u00bf^\u00cf2\u00d9\u00e6Ukq\u0082\u00d2\u00af\u00ee\n\u00f8\u00d3\u0004~`u\b\u0089\u0012\u0018\u00ae~B-]\u00de\u00b9\u00ed\u00ee\u0083u\u00d0\u001d\u00b41_\u00df\"E:\u00d4\u0018L=\u0010\u0082\u00fc\tZJ\u00b6<[\u00f7\u0018\u00a4qS\u00a4\u0004\u0001\u0018\u00e2\u00bb\u0016+\u00b9\u0096\u0083\u00ef\u00ae\u00f7S\u00c3\u00eb\u00a6\u00aa\u00029\u00dd\u008f\u0089efG\u00c4\u0018\u0011\u0094\u00af\u00a9,~\"c\u00ae\u0084\u00cc\u001e\\\u00cb\u0016}\u0099\u0018\u00faN\u00b9\u00af\u0000\u00b7\u0018\u00ea5\u00e6\u001f1\u00bf\u00ab\u00d8S\u00e7\u001f'\u00e4\u0004\u0097\u00e0\u009b\u0086\u0011\u00f2\u0003\u0001h\u00dc\u0018\u00c6\u00c5\u00bc\u0097Iv\u00ae\u00e6h0\u00cb9i\u00b0\u0007\u00142t\u00f4\"\u00f9\u00c3\u00c9B\u00101\u00a3<?^\u00d7\u0088,]\u00a9\u008fU\u00a2n\r\u00a1\b\u00fc\u00ac\u00f4\u00adT\u0097r\u009d\u0010\u00ea\u00d3\u000b15\u00a6k_\u00a1\u008a\u00ad\u00aa\u00a4\u00e2\\\u00f4\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u001e\u00db\u0098\u00ef\u0091\u001f\u00c8g\u00f1\u0017\u00cc\u0017ql\u00b8c\u0010\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2S\u00f9\u0085\u00f4F\u0092\u00f9\u0017\u0018\u00c6\u00c5\u00bc\u0097Iv\u00ae\u00e6h0\u00cb9i\u00b0\u0007\u00142t\u00f4\"\u00f9\u00c3\u00c9B\u0018\u001e\u0019\u0084\u00d0\u00eb\"\u0091\u0005\u00049\u00d3Ffc\u00e7\u00ba|T\u00cevG\u0091\u00fb\u00f2\u0018\u00fb\u0012\u00a1\u00ea\u001fR\u0015\u00fc\r\u00dd\u0080\u0089y*\u00a8p:\u00f1\u00aa\u0088\u0084;\u00b0b\b\u0019\u001e6\u00ae\u0090`\u009eR\u0018EJ0\u009f\u008ct\u001d\u00ad\u000f\u0086\u00d2.\u00ffu\"\u009a\u00e2\u0004\u0082\u00d1\u00e6,jl\u0010s\u00fb\u0019cJ\u00c6!\u00c8\u0018\u00a8\u0097i0\u009d\u00b2\u00f1\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2C)>C\u00e0~\u0082^\u008b\u00fb\u00a59\u00ff\u00967\u00dc\u0018f[\u00ebS\u00fb\u00dfx\u00e9:c7\u0019RE@dSH\r\u00b8FB\u00bci".length();
                    var9_7 = 8;
                    var8_8 = -1;
lbl19:
                    // 2 sources

                    while (true) {
                        v3 = ++var8_8;
                        v4 = var10_5.substring(v3, v3 + var9_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = IlIlft.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = "\u008cy\u0001P\u0084\u00fc&nbH\u00cbE\u00d2\u0097\u00eb\u00bf\u0018|\u0012\u00be\u00c6$\u00d0\u009bS\u00da\u00d0\t=\u00d0\u00fedO\u0010\u00c7\u0010u\u00c7Q91";
                        var12_6 = "\u008cy\u0001P\u0084\u00fc&nbH\u00cbE\u00d2\u0097\u00eb\u00bf\u0018|\u0012\u00be\u00c6$\u00d0\u009bS\u00da\u00d0\t=\u00d0\u00fedO\u0010\u00c7\u0010u\u00c7Q91".length();
                        var9_7 = 16;
                        var8_8 = -1;
lbl33:
                        // 2 sources

                        while (true) {
                            v6 = ++var8_8;
                            v4 = var10_5.substring(v6, v6 + var9_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = IlIlft.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var13_9 = var6_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl50:
                    // 1 sources

                    ** continue;
                }
            }
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var14 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl62:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 3585532949718297115L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        IlIlft.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        IlIlft.IlIls = new VersionedRegistry<T>(var5_3[45]);
        IlIlft.IlIlr = IlIlft.IlIlN(var5_3[39], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlE(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Byte;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlu(int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Byte;)V)());
        IlIlft.IlIlW = IlIlft.IlIlN(var5_3[19], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlG(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Short;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlG(int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Short;)V)());
        IlIlft.IlIlf = IlIlft.IlIlN(var5_3[46], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$0(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Integer;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$1(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.lang.Integer ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Integer;)V)());
        IlIlft.IlIlF = IlIlft.IlIlN(var5_3[0], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlo(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Long;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIls(long ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Long;)V)());
        IlIlft.IlIlJ = IlIlft.IlIlN(var5_3[9], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlX(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Float;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlR(float ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Float;)V)());
        IlIlft.IlIlx = IlIlft.IlIlN(var5_3[29], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIli(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/String;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlM(java.lang.String ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/String;)V)());
        IlIlft.IlIlm = IlIlft.IlIlN(var5_3[33], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlk(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/String;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlY(java.lang.String ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/String;)V)());
        IlIlft.IlIlY = IlIlft.IlIlN(var5_3[20], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlJ(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/Component;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlz(me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/Component;)V)());
        IlIlft.IlIlC = IlIlft.IlIlN(var5_3[22], IlIlft.IlIlL(), IlIlft.IlIlC());
        IlIlft.IlIlO = IlIlft.IlIlN(var5_3[12], IlIlft.IlIlU(), IlIlft.IlIlN());
        IlIlft.IlIlV = IlIlft.IlIlN(var5_3[40], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlk(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/IlIlCg;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlj(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/IlIlCg;)V)());
        IlIlft.IlIld = IlIlft.IlIlN(var5_3[16], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$2(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/Optional;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$3(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.Optional ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
        IlIlft.IlIlt = IlIlft.IlIlN(var5_3[21], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlK(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Boolean;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIla(boolean ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Boolean;)V)());
        IlIlft.IlIlw = IlIlft.IlIlN(var5_3[5], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$4(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/IlIlQG;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$5(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/IlIlQG;)V)());
        IlIlft.IlIle = IlIlft.IlIlN(var5_3[1], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$6(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/IlIlAn;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$7(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/IlIlAn;)V)());
        IlIlft.IlIlo = IlIlft.IlIlN(var5_3[41], IlIlft.IlIlS(), IlIlft.IlIlL());
        IlIlft.IlIlQ = IlIlft.IlIlN(var5_3[7], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$8(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlAV;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$9(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlAV ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/IlIlAV;)V)());
        IlIlft.IlIlb = IlIlft.IlIlN(var5_3[42], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$10(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/Optional;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$11(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.Optional ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
        IlIlft.IlIlk = IlIlft.IlIlN(var5_3[17], IlIlft.IlIlv(), IlIlft.IlIlv());
        IlIlft.IlIlh = IlIlft.IlIlN(var5_3[49], IlIlft.IlIlv(), IlIlft.IlIlv());
        IlIlft.IlIlK = IlIlft.IlIlN(var5_3[23], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlS(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlc(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;)V)());
        IlIlft.IlIlR = IlIlft.IlIlN(var5_3[51], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlg(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/IlIlum;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlu(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.IlIlum<T> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/IlIlum;)V)());
        IlIlft.IlIli = IlIlft.IlIlN(var5_3[3], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlB(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/villager/IlIluD;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlE(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.IlIluD ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/villager/IlIluD;)V)());
        IlIlft.IlIlT = IlIlft.IlIlN(var5_3[18], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$12(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/Optional;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$13(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.Optional ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
        IlIlft.IlIly = IlIlft.IlIlN(var5_3[48], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$14(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/IlIlqX;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$15(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.IlIlqX ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/IlIlqX;)V)());
        IlIlft.IlIlg = IlIlft.IlIlN(var5_3[43], IlIlft.IlIlv(), IlIlft.IlIlv());
        IlIlft.IlIlq = IlIlft.IlIlN(var5_3[37], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlq(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/IlIlAW;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlA(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.IlIlAW ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/IlIlAW;)V)());
        IlIlft.IlIlA = IlIlft.IlIlN(var5_3[34], IlIlft.IlIlv(), IlIlft.IlIlv());
        IlIlft.IlIlu = IlIlft.IlIlN(var5_3[4], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlg(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/frog/IlIlqA;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlZ(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.frog.IlIlqA ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/frog/IlIlqA;)V)());
        IlIlft.IlIlZ = IlIlft.IlIlN(var5_3[27], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$17(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/Optional;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$19(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.Optional ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
        IlIlft.IlIlP = IlIlft.IlIlN(var5_3[25], IlIlft.IlIlv(), IlIlft.IlIlv());
        IlIlft.IlIlj = IlIlft.IlIlN(var5_3[35], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlc(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/IlIlG0;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlF(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.IlIlG0 ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/IlIlG0;)V)());
        IlIlft.IlIla = IlIlft.IlIlN(var5_3[13], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$20(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/IlIliR;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$21(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.IlIliR ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/IlIliR;)V)());
        IlIlft.IlIlM = IlIlft.IlIlN(var5_3[8], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$22(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/IlIlQG;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$23(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/IlIlQG;)V)());
        IlIlft.IlIlL = IlIlft.IlIlN(var5_3[38], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$24(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/IlIlhJ;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$25(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlhJ ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/IlIlhJ;)V)());
        IlIlft.IlIlN = IlIlft.IlIlN(var5_3[24], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$26(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/IlIlvu;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$27(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.IlIlvu ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/IlIlvu;)V)());
        IlIlft.IlIln = IlIlft.IlIlN(var5_3[15], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$28(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$29(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        IlIlft.IlIlX = IlIlft.IlIlN(var5_3[14], IlIlft.IlIlv(), IlIlft.IlIlv());
        IlIlft.IlIlE = IlIlft.IlIlN(var5_3[52], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlf(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/IlIldv;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIli(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIldv ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/IlIldv;)V)());
        IlIlft.IlIlG = IlIlft.IlIlN(var5_3[28], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIll(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/IlIldL;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlq(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIldL ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/IlIldL;)V)());
        IlIlft.IlIlc = IlIlft.IlIlN(var5_3[30], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIl_(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/IlIlXo;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIls(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIlXo ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/IlIlXo;)V)());
        IlIlft.IlIl_ = IlIlft.IlIlN(var5_3[47], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlD(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/IlIloN;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlr(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.IlIloN ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/IlIloN;)V)());
        IlIlft.IlIlv = IlIlft.IlIlN(var5_3[32], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIll(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/IlIlfP;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIls(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlfP ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/IlIlfP;)V)());
        IlIlft.IlIlH = IlIlft.IlIlN(var5_3[6], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlF(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/data/IlIlqq;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlZ(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.IlIlqq ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/data/IlIlqq;)V)());
        IlIlft.IlIlz = IlIlft.IlIlN(var5_3[36], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlX(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/data/IlIlxV;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlK(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.IlIlxV ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/data/IlIlxV;)V)());
        IlIlft.IlIll = IlIlft.IlIlN(var5_3[44], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlt(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/component/IlIlqa;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIli(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.IlIlqa ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/component/IlIlqa;)V)());
        IlIlft.IlIlB = IlIlft.IlIlN(var5_3[50], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlt(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/nautilus/IlIlXC;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlT(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.nautilus.IlIlXC ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/nautilus/IlIlXC;)V)());
        IlIlft.IlIlS = IlIlft.IlIlN(var5_3[26], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlE(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/IlIlOh;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlq(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlOh ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/IlIlOh;)V)());
        IlIlft.IlIlU = IlIlft.IlIlN(var5_3[10], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlX(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/IlIlQC;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlI(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.IlIlQC ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/IlIlQC;)V)());
        IlIlft.IlIlI = IlIlft.IlIlN(var5_3[31], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlv(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/IlIlfM;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlb(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlfM ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/IlIlfM;)V)());
        IlIlft.IlIlD = IlIlft.IlIlN(var5_3[2], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlJ(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/IlIly8;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlW(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIly8 ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/IlIly8;)V)());
        IlIlft.IlIlp = IlIlft.IlIlN(var5_3[11], (IlIlQ9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIlr(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/IlIluj;)(), (IlIlOw)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IlIlZ(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.IlIluj ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/IlIluj;)V)());
        IlIlft.IlIls.unloadMappings();
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

