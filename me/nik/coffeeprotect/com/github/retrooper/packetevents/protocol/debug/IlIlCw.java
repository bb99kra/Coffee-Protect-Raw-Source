/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlC2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlZt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.Nullable;

public final class IlIlCw<T> {
    private final IlIlC2<T> IlIlp;
    private final @Nullable T IlIlJ;
    private static int IlIlE;
    private static final long a;
    private static transient /* synthetic */ String GuZbCHQeNx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlCw(IlIlC2<T> ilIlC2, @Nullable T t) {
        this.IlIlp = ilIlC2;
        this.IlIlJ = t;
    }

    public static IlIlCw<?> IlIlZ(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x25EFC4280DB5L;
        IlIlC2<?> ilIlC2 = packetWrapper.IlIlt(IlIlZt.IlIlp());
        Object r = packetWrapper.IlIlN(ilIlC2::read);
        int n = IlIlCw.IlIlO();
        IlIlCw ilIlCw = new IlIlCw(ilIlC2, r);
        if (n != 0) {
            PacketWrapper.IlIle(new int[4]);
        }
        return ilIlCw;
    }

    public static <T> void IlIls(PacketWrapper<?> packetWrapper, IlIlCw<T> ilIlCw) {
        packetWrapper.IlIle(ilIlCw.IlIlp);
        packetWrapper.IlIlI(ilIlCw.IlIlJ, ilIlCw.IlIlp::write);
    }

    public IlIlC2<T> IlIlS() {
        return this.IlIlp;
    }

    public @Nullable T IlIlh() {
        return this.IlIlJ;
    }

    public static void IlIlx(int n) {
        IlIlE = n;
    }

    public static int IlIlc() {
        return IlIlE;
    }

    public static int IlIlO() {
        int n = IlIlCw.IlIlc();
        if (n == 0) {
            return 72;
        }
        return 0;
    }

    static {
        a = IlIls.a(-8004458934478281660L, -7003518083679740427L, MethodHandles.lookup().lookupClass()).a(85994929643845L);
        if (IlIlCw.IlIlc() == 0) {
            IlIlCw.IlIlx(7);
        }
    }
}

