/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlAT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlrm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class IlIlqd
implements NbtCodec<T> {
    final IlIlAT IlIlC;
    final IlIlrm IlIlE;
    private static transient /* synthetic */ String cobtUcZCzM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    IlIlqd(IlIlAT ilIlAT, IlIlrm ilIlrm) {
        this.IlIlC = ilIlAT;
        this.IlIlE = ilIlrm;
    }

    @Override
    public T IlIlA(NBT nBT, PacketWrapper<?> packetWrapper) {
        return this.IlIlC.IlIlA(nBT, packetWrapper);
    }

    @Override
    public NBT IlIl_(PacketWrapper<?> packetWrapper, T t) {
        return this.IlIlE.IlIl_(packetWrapper, t);
    }
}

