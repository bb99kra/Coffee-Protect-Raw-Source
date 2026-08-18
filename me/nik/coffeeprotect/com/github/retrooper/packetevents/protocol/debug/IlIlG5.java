/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlG5 {
    private final IlIlAn IlIlT;
    private static transient /* synthetic */ String yXJbvwXJso = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlG5(IlIlAn ilIlAn) {
        this.IlIlT = ilIlAn;
    }

    public static IlIlG5 IlIlG(PacketWrapper<?> packetWrapper) {
        IlIlAn ilIlAn = packetWrapper.IlIlE();
        return new IlIlG5(ilIlAn);
    }

    public static void IlIlG(PacketWrapper<?> packetWrapper, IlIlG5 ilIlG5) {
        packetWrapper.IlIlh(ilIlG5.IlIlT);
    }

    public IlIlAn IlIlZ() {
        return this.IlIlT;
    }
}

