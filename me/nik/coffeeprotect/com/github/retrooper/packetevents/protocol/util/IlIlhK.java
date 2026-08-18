/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlAT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.IlIlXv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class IlIlhK
implements NbtCodec<T> {
    final IlIlAT IlIlT;
    final NbtCodec IlIlI;
    private static transient /* synthetic */ String lHncZfzAXX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    IlIlhK(NbtCodec nbtCodec, IlIlAT ilIlAT) {
        this.IlIlI = nbtCodec;
        this.IlIlT = ilIlAT;
    }

    @Override
    public T IlIlA(NBT nBT, PacketWrapper<?> packetWrapper) throws IlIlXv {
        try {
            return this.IlIlI.IlIlA(nBT, packetWrapper);
        }
        catch (IlIlXv ilIlXv) {
            try {
                return this.IlIlT.IlIlA(nBT, packetWrapper);
            }
            catch (IlIlXv ilIlXv2) {
                ilIlXv.addSuppressed(ilIlXv2);
                throw ilIlXv;
            }
        }
    }

    @Override
    public NBT IlIl_(PacketWrapper<?> packetWrapper, T t) throws IlIlXv {
        return this.IlIlI.IlIl_(packetWrapper, t);
    }
}

