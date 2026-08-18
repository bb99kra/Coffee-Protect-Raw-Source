/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.Nullable;

public final class IlIlor {
    private @Nullable Long IlIlE;
    private static transient /* synthetic */ String ccBFmilJKv = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlor(@Nullable Long l) {
        this.IlIlE = l;
    }

    public static IlIlor IlIlG(PacketWrapper<?> packetWrapper) {
        return new IlIlor((Long)packetWrapper.IlIlN(PacketWrapper::IlIli));
    }

    public static void IlIld(PacketWrapper<?> packetWrapper, IlIlor ilIlor) {
        packetWrapper.IlIlI(ilIlor.IlIlE, PacketWrapper::IlIlP);
    }

    public @Nullable Long IlIlW() {
        return this.IlIlE;
    }

    public void IlIle(@Nullable Long l) {
        this.IlIlE = l;
    }
}

