/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlC3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlC8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlrO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.IlIlAR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlCG;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlCY;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlfr;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIly3;

public class IlIln_ {
    private static IlIlC8<IlIlCY> IlIlX;
    private static String IlIls;
    private static final long a;
    private static transient /* synthetic */ String voeHiYOgHw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public static void IlIlS() {
        IlIlX = null;
    }

    public static IlIlC8<IlIlCY> IlIlr(IlIlCY ilIlCY, IlIlC3 ilIlC3, IlIlAR ilIlAR, IlIlfr ilIlfr, IlIly3 ilIly3) {
        long l = a ^ 0x59BE35CA5EEFL;
        String string = IlIln_.IlIlk();
        IlIlC8<IlIlCY> ilIlC8 = IlIlX;
        if (string == null) {
            if (ilIlC8 == null) {
                IlIlX = IlIln_.IlIll(ilIlCY, ilIlC3, ilIlAR, ilIlfr, ilIly3);
            }
            ilIlC8 = IlIlX;
        }
        return ilIlC8;
    }

    public static IlIlC8<IlIlCY> IlIlw(IlIlCY ilIlCY, IlIlC3 ilIlC3, IlIlAR ilIlAR, IlIlfr ilIlfr, IlIly3 ilIly3, IlIlrO ilIlrO) {
        long l = a ^ 0x39DE1C0F4C17L;
        String string = IlIln_.IlIlk();
        IlIlC8<IlIlCY> ilIlC8 = IlIlX;
        if (string == null) {
            if (ilIlC8 == null) {
                IlIlX = IlIln_.IlIlX(ilIlCY, ilIlC3, ilIlAR, ilIlfr, ilIly3, ilIlrO);
            }
            ilIlC8 = IlIlX;
        }
        return ilIlC8;
    }

    public static IlIlC8<IlIlCY> IlIll(IlIlCY ilIlCY, IlIlC3 ilIlC3, IlIlAR ilIlAR, IlIlfr ilIlfr, IlIly3 ilIly3) {
        return IlIln_.IlIlX(ilIlCY, ilIlC3, ilIlAR, ilIlfr, ilIly3, new IlIlrO());
    }

    public static IlIlC8<IlIlCY> IlIlX(IlIlCY ilIlCY, IlIlC3 ilIlC3, IlIlAR ilIlAR, IlIlfr ilIlfr, IlIly3 ilIly3, IlIlrO ilIlrO) {
        long l = a ^ 0x1A3048FC0199L;
        String string = IlIln_.IlIlk();
        IlIlCG ilIlCG = new IlIlCG(ilIlrO, ilIlCY, ilIlC3, ilIlAR, ilIlfr, ilIly3);
        if (PacketWrapper.IlIlz() == null) {
            IlIln_.IlIlN("juHLrc");
        }
        return ilIlCG;
    }

    public static void IlIlN(String string) {
        IlIls = string;
    }

    public static String IlIlk() {
        return IlIls;
    }

    static {
        a = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(4770495036981164488L, 6397531853439609816L, MethodHandles.lookup().lookupClass()).a(141848321757315L);
        if (IlIln_.IlIlk() != null) {
            IlIln_.IlIlN("x3avnb");
        }
    }
}

