/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.util.function.Function;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class IlIlff
implements NbtCodec<Z> {
    final Function IlIlB;
    final Function IlIlJ;
    final NbtCodec IlIlX;
    private static transient /* synthetic */ String ainrwvOxMQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    IlIlff(NbtCodec nbtCodec, Function function, Function function2) {
        this.IlIlX = nbtCodec;
        this.IlIlB = function;
        this.IlIlJ = function2;
    }

    @Override
    public Z IlIlA(NBT nBT, PacketWrapper<?> packetWrapper) {
        return this.IlIlB.apply(this.IlIlX.IlIlA(nBT, packetWrapper));
    }

    @Override
    public NBT IlIl_(PacketWrapper<?> packetWrapper, Z z) {
        return this.IlIlX.IlIl_(packetWrapper, this.IlIlJ.apply(z));
    }
}

