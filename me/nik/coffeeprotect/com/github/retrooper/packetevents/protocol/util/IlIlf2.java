/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.util.ArrayList;
import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlyZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlOw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlQ9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlf2<T> {
    private final List<IlIlyZ<T>> IlIlL;
    private static transient /* synthetic */ String vliEUXQGkg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlf2() {
        this(new ArrayList<IlIlyZ<T>>());
    }

    public IlIlf2(List<IlIlyZ<T>> list) {
        this.IlIlL = list;
    }

    public static <T> IlIlf2<T> IlIlI(PacketWrapper<?> packetWrapper, IlIlQ9<T> ilIlQ9) {
        List<IlIlyZ<T>> list = packetWrapper.IlIll(packetWrapper2 -> IlIlyZ.IlIlZ(packetWrapper, ilIlQ9));
        return new IlIlf2<T>(list);
    }

    public static <T> void IlIlw(PacketWrapper<?> packetWrapper2, IlIlf2<T> ilIlf2, IlIlOw<T> ilIlOw) {
        packetWrapper2.IlIlQ(ilIlf2.IlIlL, (packetWrapper, ilIlyZ) -> IlIlyZ.IlIlt(packetWrapper, ilIlyZ, ilIlOw));
    }

    public List<IlIlyZ<T>> IlIlN() {
        return this.IlIlL;
    }
}

