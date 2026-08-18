/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.IlIlnk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIly5 {
    private final int IlIlU;
    private final int IlIlQ;
    private final boolean IlIlG;
    private final boolean IlIlm;
    private final boolean IlIlH;
    @Nullable
    private final IlIly5 IlIl_;
    private static final long a = IlIls.a(-7755896335743010920L, -3941081215459734231L, MethodHandles.lookup().lookupClass()).a(262459850586981L);
    private static transient /* synthetic */ String laWAAHGwOE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIly5(int n, int n2, boolean bl, boolean bl2, boolean bl3, @Nullable IlIly5 ilIly5) {
        this.IlIlU = n;
        this.IlIlQ = n2;
        this.IlIlG = bl;
        this.IlIlm = bl2;
        this.IlIlH = bl3;
        this.IlIl_ = ilIly5;
    }

    public static IlIly5 IlIlD(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x3BE67B49C46EL;
        int n = packetWrapper.IlIlf();
        String string = IlIlnk.IlIlY();
        int n2 = packetWrapper.IlIlf();
        boolean bl = packetWrapper.IlIlK();
        boolean bl2 = packetWrapper.IlIlK();
        boolean bl3 = packetWrapper.IlIlK();
        IlIly5 ilIly5 = (IlIly5)packetWrapper.IlIlN(IlIly5::IlIlD);
        IlIly5 ilIly52 = new IlIly5(n, n2, bl, bl2, bl3, ilIly5);
        if (string == null) {
            PacketWrapper.IlIle(new int[2]);
        }
        return ilIly52;
    }

    public static void IlIlr(PacketWrapper<?> packetWrapper, IlIly5 ilIly5) {
        long l = a ^ 0x5D0099C90294L;
        packetWrapper.IlIlJ(ilIly5.IlIlU);
        String string = IlIlnk.IlIlY();
        packetWrapper.IlIlJ(ilIly5.IlIlQ);
        packetWrapper.IlIla(ilIly5.IlIlG);
        String string2 = string;
        packetWrapper.IlIla(ilIly5.IlIlm);
        packetWrapper.IlIla(ilIly5.IlIlH);
        packetWrapper.IlIlI(ilIly5.IlIl_, IlIly5::IlIlr);
        if (PacketWrapper.IlIlz() == null) {
            IlIlnk.IlIlZ("At4prc");
        }
    }
}

