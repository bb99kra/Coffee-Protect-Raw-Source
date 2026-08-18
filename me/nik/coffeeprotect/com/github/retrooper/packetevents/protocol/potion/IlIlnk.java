/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.IlIlQL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.IlIlXx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.IlIly5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlnk {
    private final IlIlQL IlIlZ;
    private final IlIly5 IlIlE;
    private static String IlIll;
    private static transient /* synthetic */ String gCGMQzqULc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlnk(IlIlQL ilIlQL, int n, int n2, boolean bl, boolean bl2, boolean bl3, @Nullable IlIly5 ilIly5) {
        this(ilIlQL, new IlIly5(n, n2, bl, bl2, bl3, ilIly5));
    }

    public IlIlnk(IlIlQL ilIlQL, IlIly5 ilIly5) {
        this.IlIlZ = ilIlQL;
        this.IlIlE = ilIly5;
    }

    public static IlIlnk IlIlH(PacketWrapper<?> packetWrapper) {
        IlIlQL ilIlQL = packetWrapper.IlIlA(IlIlXx::IlIlS);
        IlIly5 ilIly5 = IlIly5.IlIlD(packetWrapper);
        return new IlIlnk(ilIlQL, ilIly5);
    }

    public static void IlIlR(PacketWrapper<?> packetWrapper, IlIlnk ilIlnk) {
        packetWrapper.IlIle(ilIlnk.IlIlZ);
        IlIly5.IlIlr(packetWrapper, ilIlnk.IlIlE);
    }

    public static void IlIlZ(String string) {
        IlIll = string;
    }

    public static String IlIlY() {
        return IlIll;
    }

    static {
        if (IlIlnk.IlIlY() == null) {
            IlIlnk.IlIlZ("jzTGlb");
        }
    }
}

