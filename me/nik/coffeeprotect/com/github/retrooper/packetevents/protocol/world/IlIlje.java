/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlCV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlXH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlZq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlnq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public class IlIlje
implements IlIlXH {
    private static final long a = IlIls.a(-6025591208835711112L, 4246915924862263776L, MethodHandles.lookup().lookupClass()).a(197207349122480L);
    private static transient /* synthetic */ String pvIVsvdcCr = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    @ApiStatus.Internal
    public static int IlIlM(IlIlCV[] var0) {
        var1_1 = IlIlje.a ^ 132106153542618L;
        var4_2 = 0;
        var5_3 = var0;
        var6_4 = var5_3.length;
        var3_6 = IlIlCR.IlIlU();
        for (var7_5 = 0; var7_5 < var6_4; ++var7_5) {
            var8_7 = var5_3[var7_5];
            v0 = var9_8 = ((IlIlZq)var8_7).IlIlq().IlIle;
            if (!var3_6) ** GOTO lbl12
            if (v0 != null) {
                v0 = var9_8;
lbl12:
                // 2 sources

                v1 = v0.IlIl_().length;
            } else {
                v1 = 0;
            }
            var10_9 = ByteBufHelper.IlIlF(v1);
            v2 = var11_10 = ((IlIlZq)var8_7).IlIlV().IlIle;
            if (!var3_6) ** GOTO lbl20
            if (v2 != null) {
                v2 = var11_10;
lbl20:
                // 2 sources

                v3 = v2.IlIl_().length;
            } else {
                v3 = 0;
            }
            var12_11 = ByteBufHelper.IlIlF(v3);
            var4_2 += var10_9 + var12_11;
            if (var3_6) continue;
        }
        return var4_2;
    }

    @Override
    public IlIlCV[] IlIlZ(IlIlnq ilIlnq, BitSet bitSet, BitSet bitSet2, boolean bl, boolean bl2, boolean bl3, int n, int n2, PacketWrapper<?> packetWrapper) {
        IlIlCV[] ilIlCVArray;
        block7: {
            Object object;
            int n3;
            block9: {
                boolean bl4;
                int n4;
                block8: {
                    long l = a ^ 0x7E2D47465FF8L;
                    n4 = ByteBufHelper.readerIndex(packetWrapper.IlIlS);
                    bl4 = IlIlCR.IlIlf();
                    ilIlCVArray = new IlIlCV[n];
                    for (int i = 0; i < n; ++i) {
                        ilIlCVArray[i] = IlIlZq.IlIlc(packetWrapper);
                        if (!bl4) {
                            if (!bl4) continue;
                        }
                        break block7;
                    }
                    n3 = packetWrapper.IlIlw().IlIlC(ServerVersion.V_1_21_6);
                    if (bl4) break block8;
                    if (n3 == 0) break block7;
                    n3 = packetWrapper.IlIlw().IlIlz(ServerVersion.V_1_21_5) ? 1 : 0;
                }
                if (bl4) break block9;
                if (n3 == 0) break block7;
                object = packetWrapper.IlIlS;
                if (bl4) break block7;
                n3 = ByteBufHelper.readerIndex(object) - n4;
            }
            if (n3 < n2) {
                object = ByteBufHelper.IlIlJ(packetWrapper.IlIlS, IlIlje.IlIlM(ilIlCVArray));
            }
        }
        return ilIlCVArray;
    }
}

