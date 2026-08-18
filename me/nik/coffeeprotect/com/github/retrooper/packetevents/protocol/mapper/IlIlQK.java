/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlZA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

@Deprecated
public class IlIlQK
implements IlIlZA {
    private final int IlIl_;
    private static transient /* synthetic */ String zqNtiRxJQU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlQK(ClientVersion clientVersion, int n) {
        this(n);
    }

    public IlIlQK(int n) {
        this.IlIl_ = n;
    }

    public static IlIlQK IlIlC(ClientVersion clientVersion, int n) {
        return new IlIlQK(clientVersion, n);
    }

    public static IlIlQK IlIlD(PacketWrapper<?> packetWrapper) {
        return packetWrapper.IlIlA(IlIlQK::new);
    }

    public static void IlIlj(PacketWrapper<?> packetWrapper, IlIlQK ilIlQK) {
        packetWrapper.IlIle(ilIlQK);
    }

    @Override
    public int getId() {
        return this.IlIl_;
    }

    @Override
    public ResourceLocation getName() {
        throw new UnsupportedOperationException();
    }
}

