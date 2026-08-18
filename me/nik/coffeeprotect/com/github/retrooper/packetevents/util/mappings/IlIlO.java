/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIldt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIljA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.IlIlTm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.IlIlr_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.IlIlAW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.IlIlQC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.IlIlW_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.IlIluU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlAC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlfM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlfP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlyd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIldL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIlxN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIly8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.IlIlyU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.frog.IlIlZB;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.frog.IlIlqA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.nautilus.IlIlXC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.nautilus.IlIlre;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.IlIldX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.IlIloN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.IlIluj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.IlIlvt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIlXo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIlY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIldi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIldv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.banner.IlIlZd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.banner.IlIljw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.IlIlQY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.IlIlyM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.instrument.IlIlOE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.instrument.IlIlf7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.jukebox.IlIlXe;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.jukebox.IlIlht;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimmaterial.IlIlOM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimmaterial.IlIlW0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimpattern.IlIlWY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimpattern.IlIlh2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTList;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.timelines.IlIlQ0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.timelines.IlIliy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.biome.IlIldJ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.biome.IlIljF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.clock.IlIlhi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.clock.IlIljT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.damagetype.IlIlTk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.damagetype.IlIlqK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIliN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlnq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.IlIlG0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.IlIldO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlCJ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlO3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlTe;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlhN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlPz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
@ApiStatus.Internal
public final class IlIlO {
    private static final boolean IlIlM;
    private static final Map<ResourceLocation, IlIlTe<?>> IlIlf;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String zcuSDFiNDh = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlO() {
    }

    public static void IlIls() {
        long l = a ^ 0x3C7C0F45275EL;
        try {
            if (IlIlf.isEmpty()) {
                throw new AssertionError();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw IlIlO.a(illegalStateException);
        }
    }

    @Nullable
    public static IlIlTe<?> IlIlk(ResourceLocation resourceLocation) {
        return IlIlf.get(resourceLocation);
    }

    public static void IlIlR(IlIlG2 ilIlG2, PacketWrapper<?> packetWrapper, ResourceLocation resourceLocation, List<IlIlPz> list) {
        Object object = IlIlr7.IlIlb().IlIlq().IlIlP(ilIlG2, packetWrapper.IlIlw().IlIlE());
        IlIlO.IlIlu(ilIlG2, packetWrapper, resourceLocation, list, object);
    }

    public static void IlIlu(IlIlG2 ilIlG2, PacketWrapper<?> packetWrapper, ResourceLocation resourceLocation, List<IlIlPz> list, @Nullable Object object) {
        long l = a ^ 0xAEFE2823C37L;
        IlIlTe<?> ilIlTe = IlIlf.get(resourceLocation);
        int[] nArray = VersionedRegistry.IlIlB();
        try {
            if (ilIlTe == null) {
                return;
            }
        }
        catch (Exception exception) {
            throw IlIlO.a(exception);
        }
        try {
            IlIlO3<?> ilIlO3;
            block12: {
                block11: {
                    try {
                        if (!IlIlM && object != null) break block11;
                    }
                    catch (Exception exception) {
                        throw IlIlO.a(exception);
                    }
                    ilIlO3 = ilIlTe.IlIlb(list, packetWrapper);
                    if (nArray == null) break block12;
                }
                ilIlO3 = ilIlTe.IlIll(object, () -> ilIlTe.IlIlb(list, packetWrapper));
            }
            ilIlG2.IlIlK(ilIlO3);
        }
        catch (Exception exception) {
            throw new IllegalStateException((String)((Object)IlIlO.a("z", (int)28047, (long)(0x7E457D7F495E913FL ^ l))) + resourceLocation + (String)((Object)IlIlO.a("z", (int)6209, (long)(0x5C94B6CEA3CEE4F0L ^ l))) + ilIlG2, exception);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void IlIlP(IlIlG2 var0, PacketWrapper<?> var1_1, NBTCompound var2_2) {
        var3_3 = IlIlO.a ^ 24401232699148L;
        var6_4 = IlIlr7.IlIlb().IlIlq().IlIlP(var0, var1_1.IlIlw().IlIlE());
        var7_5 = var2_2.getTags().values().iterator();
        var5_6 = VersionedRegistry.IlIlB();
        while (var7_5.hasNext()) {
            block10: {
                block9: {
                    var8_7 = var7_5.next();
                    try {
                        v0 = var8_7;
                        if (var5_6 != null) break block9;
                        if (v0 instanceof NBTList) {
                        }
                        ** GOTO lbl19
                    }
                    catch (IllegalStateException v1) {
                        throw IlIlO.a(v1);
                    }
                    var9_8 = (NBTList)var8_7;
                    try {
                        IlIlO.IlIlu(var0, var1_1, IlIliN.IlIlQ().IlIlX(), IlIlPz.IlIls((NBTList<NBTCompound>)var9_8), var6_4);
                        if (var5_6 == null) break block10;
lbl19:
                        // 2 sources

                        v0 = var8_7;
                    }
                    catch (IllegalStateException v2) {
                        throw IlIlO.a(v2);
                    }
                }
                var9_8 = (NBTCompound)v0;
                var10_9 = new ResourceLocation(var9_8.getStringTagValueOrThrow((String)IlIlO.a("z", (int)21054, (long)(143429088110022070L ^ var3_3))));
                var11_10 = var9_8.getCompoundListTagOrNull((String)IlIlO.a("z", (int)29938, (long)(2581164094479707003L ^ var3_3)));
                try {
                    if (var11_10 != null) {
                        IlIlO.IlIlu(var0, var1_1, var10_9, IlIlPz.IlIls(var11_10), var6_4);
                    }
                }
                catch (IllegalStateException v3) {
                    throw IlIlO.a(v3);
                }
            }
            if (var5_6 == null) continue;
        }
    }

    private static /* synthetic */ void lambda$static$0(IlIlTe ilIlTe) {
        IlIlf.put(ilIlTe.IlIlX(), ilIlTe);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        IlIlO.a = IlIls.a(4668991612116246697L, 5682623976416115089L, MethodHandles.lookup().lookupClass()).a(146028670261871L);
                        var20 = IlIlO.a ^ 113981084131471L;
                        IlIlO.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[5];
                        var16_4 = 0;
                        var15_5 = "t\u00bb\u00997\u00fe8\u00ba\u00f5\u00d4\u008fQ\u00c1\u00f7\u0005\u00ba}\u0010/\u00a6\u00a5\u00d5\u00b0.hHr\u0016w\u000b\u009d\u00b7\u009dV\u0010}we\u008c\u0002\u000bg\u0007\u00bc\u00f29\u00f0\u0018SZ\u00a2";
                        var17_6 = "t\u00bb\u00997\u00fe8\u00ba\u00f5\u00d4\u008fQ\u00c1\u00f7\u0005\u00ba}\u0010/\u00a6\u00a5\u00d5\u00b0.hHr\u0016w\u000b\u009d\u00b7\u009dV\u0010}we\u008c\u0002\u000bg\u0007\u00bc\u00f29\u00f0\u0018SZ\u00a2".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = IlIlO.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u009e\u00c2?Y\u008a\u00f6\u001e\u00ba\u00fa\u00b8\u0011~T%?I\u0082BL\u00e2\u00a1\u00f1+\u00f1`\u001c#_\u0082\u00f8\u00b3\u00e9\u0007\u00ae#\u0006\u00ec\u00f7h\"\u0000{%\u0006\u00cb\u0011\u00d3s@\u001b/\u00c8gA,:\u009b<\u001b\u00e2\u00b1wr3\u0003g(\u0081v]\u001c\u008c?F\u00bb\u00a5\u00c7\u00fb\u001c\u00e2\u000f\u00e2;\u00db\u00f0K\u00af<\u00c7<\u00cfu|\u009eL&\u00d1\u00f10\u0083\u009b\u00ba@\u00be\u00d3\u00a6l\u0093S \u00d3\u00ad\u00bb";
                            var17_6 = "\u009e\u00c2?Y\u008a\u00f6\u001e\u00ba\u00fa\u00b8\u0011~T%?I\u0082BL\u00e2\u00a1\u00f1+\u00f1`\u001c#_\u0082\u00f8\u00b3\u00e9\u0007\u00ae#\u0006\u00ec\u00f7h\"\u0000{%\u0006\u00cb\u0011\u00d3s@\u001b/\u00c8gA,:\u009b<\u001b\u00e2\u00b1wr3\u0003g(\u0081v]\u001c\u008c?F\u00bb\u00a5\u00c7\u00fb\u001c\u00e2\u000f\u00e2;\u00db\u00f0K\u00af<\u00c7<\u00cfu|\u009eL&\u00d1\u00f10\u0083\u009b\u00ba@\u00be\u00d3\u00a6l\u0093S \u00d3\u00ad\u00bb".length();
                            var14_7 = 48;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = IlIlO.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                IlIlO.b = var18_3;
                IlIlO.c = new String[5];
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[21];
                var4_13 = 0;
                var5_14 = "\u0003A\u000f\u009e\u00c8to\u00a4N?\u00cds\u0011\u00ba\u0095\u000b5\u0000G\u00c8\u009f\u00c7\u0014\u00ca@\u00e6\u00cfw\u00f0\u00afu\u008f\u00d3\u00a5\u00bc)\u00a5d\u00b1/\u0096\u00b1q[\u00f5\u00a6@K\u00ec'\u00b6\u0001\u00ba\u00a5\u00e8J\u00dc\u00a6/\u009aL\u00d2\u008c\u00b2_\"9L\u00eda3\u0099M\u0081h\u00afB\u0017JL\u001b\u0082\u0007[8\u008a\u0096X\u00a3\u000e\u00cd\u0002\u0006\u00c1\u00e4a5\u00b5\u00e7\u00c7\u008d#N.f\u0092S\u00a9v\u00d7\u0086R\u0002N6\u00bd\u00f8+\u00e9\u00f1\u0097\u00b5\u000f~2%\u001e\u00c7\t\u00af\u00f8$\u0018\u00ceZo(\u00fe\u00d7\u00f5v\u00e6\u00c7\u0084\u0098\u00d5\u00af2\u00f8\u00b2\u00e6_";
                var6_15 = "\u0003A\u000f\u009e\u00c8to\u00a4N?\u00cds\u0011\u00ba\u0095\u000b5\u0000G\u00c8\u009f\u00c7\u0014\u00ca@\u00e6\u00cfw\u00f0\u00afu\u008f\u00d3\u00a5\u00bc)\u00a5d\u00b1/\u0096\u00b1q[\u00f5\u00a6@K\u00ec'\u00b6\u0001\u00ba\u00a5\u00e8J\u00dc\u00a6/\u009aL\u00d2\u008c\u00b2_\"9L\u00eda3\u0099M\u0081h\u00afB\u0017JL\u001b\u0082\u0007[8\u008a\u0096X\u00a3\u000e\u00cd\u0002\u0006\u00c1\u00e4a5\u00b5\u00e7\u00c7\u008d#N.f\u0092S\u00a9v\u00d7\u0086R\u0002N6\u00bd\u00f8+\u00e9\u00f1\u0097\u00b5\u000f~2%\u001e\u00c7\t\u00af\u00f8$\u0018\u00ceZo(\u00fe\u00d7\u00f5v\u00e6\u00c7\u0084\u0098\u00d5\u00af2\u00f8\u00b2\u00e6_".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00db\u00a0\u0095VF}:\u00d5\u00f6\u008aZ\u00e3\u008f\u00a7\u00c4P";
                    var6_15 = "\u00db\u00a0\u0095VF}:\u00d5\u00f6\u008aZ\u00e3\u008f\u00a7\u00c4P".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        IlIlO.IlIlM = Boolean.getBoolean((String)IlIlO.a("z", (int)22611, (long)(5632263010099165276L ^ var20)));
        IlIlO.IlIlf = new HashMap<ResourceLocation, IlIlTe<?>>();
        v15 = new IlIlTe[(int)var0_12[8]];
        v15[0] = new IlIlTe<IlIldJ>(IlIljF.IlIln(), IlIldJ.IlIlk);
        v15[1] = new IlIlTe<IlIljA>(IlIldt.IlIlc(), (IlIlCJ<IlIljA>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlc(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/IlIljA;)());
        v15[2] = new IlIlTe<IlIlh2>(IlIlWY.IlIln(), (IlIlhN<IlIlh2>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlv(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/trimpattern/IlIlh2;)());
        v15[3] = new IlIlTe<IlIlOM>(IlIlW0.IlIla(), (IlIlhN<IlIlOM>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlC(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/trimmaterial/IlIlOM;)());
        v15[4] = new IlIlTe<IlIldv>(IlIldi.IlIlp(), (IlIlhN<IlIldv>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIli(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/IlIldv;)());
        v15[5] = new IlIlTe<IlIlXo>(IlIlY.IlIll(), IlIlXo.IlIlJ);
        v15[(int)var0_12[14]] = new IlIlTe<IlIloN>(IlIlvt.IlIlG(), (IlIlCJ<IlIloN>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIle(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/IlIloN;)());
        v15[(int)var0_12[3]] = new IlIlTe<IlIlqA>(IlIlZB.IlIla(), (IlIlCJ<IlIlqA>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlv(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/frog/IlIlqA;)());
        v15[(int)var0_12[13]] = new IlIlTe<IlIlAW>(IlIlW_.IlIll(), IlIlAW.IlIl_);
        v15[(int)var0_12[12]] = new IlIlTe<IlIldL>(IlIlxN.IlIli(), IlIldL.IlIlk);
        v15[(int)var0_12[6]] = new IlIlTe<IlIlfP>(IlIlyd.IlIlM(), IlIlfP.IlIlh);
        v15[(int)var0_12[10]] = new IlIlTe<IlIlXC>(IlIlre.IlIly(), (IlIlCJ<IlIlXC>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlO(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/nautilus/IlIlXC;)());
        v15[(int)var0_12[2]] = new IlIlTe<IlIlG0>(IlIldO.IlIlQ(), IlIlG0.IlIlu);
        v15[(int)var0_12[7]] = new IlIlTe<IlIlnq>(IlIliN.IlIlQ(), IlIlnq.IlIlY);
        v15[(int)var0_12[19]] = new IlIlTe<IlIlTk>(IlIlqK.IlIlk(), (IlIlCJ<IlIlTk>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlu(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/damagetype/IlIlTk;)());
        v15[(int)var0_12[15]] = new IlIlTe<IlIlZd>(IlIljw.IlIlX(), (IlIlCJ<IlIlZd>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlA(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/banner/IlIlZd;)());
        v15[(int)var0_12[5]] = new IlIlTe<IlIlQY>(IlIlyM.IlIlV(), (IlIlhN<IlIlQY>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIln(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/enchantment/type/IlIlQY;)());
        v15[(int)var0_12[11]] = new IlIlTe<IlIlht>(IlIlXe.IlIlM(), (IlIlhN<IlIlht>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlI(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/jukebox/IlIlht;)());
        v15[(int)var0_12[4]] = new IlIlTe<IlIlOE>(IlIlf7.IlIlF(), (IlIlhN<IlIlOE>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlt(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/instrument/IlIlOE;)());
        v15[(int)var0_12[18]] = new IlIlTe<IlIlTm>(IlIlr_.IlIlR(), (IlIlhN<IlIlTm>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, IlIlQ(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/dialog/IlIlTm;)());
        v15[(int)var0_12[16]] = new IlIlTe<IlIliy>(IlIlQ0.IlIlF(), IlIliy.IlIlV);
        v15[(int)var0_12[20]] = new IlIlTe<IlIluj>(IlIldX.IlIlx(), IlIluj.IlIlg);
        v15[(int)var0_12[9]] = new IlIlTe<IlIlQC>(IlIluU.IlIlI(), IlIlQC.IlIlB);
        v15[(int)var0_12[1]] = new IlIlTe<IlIly8>(IlIlyU.IlIlV(), IlIly8.IlIlp);
        v15[(int)var0_12[17]] = new IlIlTe<IlIlfM>(IlIlAC.IlIlR(), IlIlfM.IlIlo);
        v15[(int)var0_12[0]] = new IlIlTe<IlIljT>(IlIlhi.IlIln(), IlIljT.IlIlP);
        Stream.of(v15).forEach((Consumer<IlIlTe>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$0(me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlTe ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/IlIlTe;)V)());
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4822;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/IlIlO", exception);
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
            IlIlO.c[n2] = IlIlO.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlO.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/IlIlO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlO.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

