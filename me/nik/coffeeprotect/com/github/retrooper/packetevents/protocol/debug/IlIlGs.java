/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.IlIlna;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlGs {
    private final IlIlna IlIlY;
    private static transient /* synthetic */ String QcQwhAmKVf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlGs(IlIlna ilIlna) {
        this.IlIlY = ilIlna;
    }

    public static IlIlGs IlIlQ(PacketWrapper<?> packetWrapper) {
        IlIlna ilIlna = (IlIlna)packetWrapper.IlIlH(IlIlna.values());
        return new IlIlGs(ilIlna);
    }

    public static void IlIlu(PacketWrapper<?> packetWrapper, IlIlGs ilIlGs) {
        packetWrapper.IlIlw(ilIlGs.IlIlY);
    }

    public IlIlna IlIlA() {
        return this.IlIlY;
    }
}

