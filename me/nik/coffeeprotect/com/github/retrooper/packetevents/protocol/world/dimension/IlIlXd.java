/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlnq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlOu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class IlIlXd
implements IlIlx {
    private final int IlIla;
    private static transient /* synthetic */ String FjsNDYmutJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlXd(int n) {
        this.IlIla = n;
    }

    @Override
    public IlIlnq IlIlT(IlIlOu<IlIlnq> ilIlOu, PacketWrapper<?> packetWrapper) {
        ClientVersion clientVersion = packetWrapper.IlIlw().IlIlE();
        return ilIlOu.IlIlA(clientVersion, this.IlIla);
    }

    @Override
    public int IlIlD() {
        return this.IlIla;
    }
}

