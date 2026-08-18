/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.util.function.Supplier;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlOU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlXv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class IlIlns
implements IlIlOU<T> {
    final Supplier IlIlD;
    private static transient /* synthetic */ String HqUEeTQNIP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    IlIlns(Supplier supplier) {
        this.IlIlD = supplier;
    }

    @Override
    public T IlIlj(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws IlIlXv {
        return this.IlIlD.get();
    }

    @Override
    public void IlIlr(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, T t) throws IlIlXv {
    }
}

