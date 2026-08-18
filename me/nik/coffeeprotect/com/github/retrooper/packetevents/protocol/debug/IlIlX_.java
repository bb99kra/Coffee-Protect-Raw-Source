/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class IlIlX_ {
    private final List<IlIlAn> IlIlI;
    private static transient /* synthetic */ String UjyRUXjNLW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlX_(List<IlIlAn> list) {
        this.IlIlI = list;
    }

    public static IlIlX_ IlIlh(PacketWrapper<?> packetWrapper) {
        List<IlIlAn> list = packetWrapper.IlIll(PacketWrapper::IlIlE);
        return new IlIlX_(list);
    }

    public static void IlIlN(PacketWrapper<?> packetWrapper, IlIlX_ ilIlX_) {
        packetWrapper.IlIlQ(ilIlX_.IlIlI, PacketWrapper::IlIlh);
    }

    public List<IlIlAn> IlIlN() {
        return this.IlIlI;
    }
}

