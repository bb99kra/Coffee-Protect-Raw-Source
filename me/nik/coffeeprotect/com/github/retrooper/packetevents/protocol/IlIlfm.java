/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlfC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class IlIlfm
extends IlIlfC {
    private final PacketWrapper<?> IlIla;
    private static transient /* synthetic */ String hKUCXlKAkK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlfm(PacketWrapper<?> packetWrapper) {
        super(null);
        this.IlIla = packetWrapper;
    }

    @Override
    public int read() {
        return this.IlIla.IlIlP();
    }

    @Override
    public int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        int n3 = ByteBufHelper.readerIndex(this.IlIla.IlIlS);
        ByteBufHelper.IlIlS(this.IlIla.IlIlS, byArray, n, n2);
        return ByteBufHelper.readerIndex(this.IlIla.IlIlS) - n3;
    }

    @Override
    public long skip(long l) {
        int n = ByteBufHelper.readerIndex(this.IlIla.IlIlS);
        ByteBufHelper.IlIlJ(this.IlIla.IlIlS, (int)l);
        return ByteBufHelper.readerIndex(this.IlIla.IlIlS) - n;
    }

    @Override
    public int available() {
        return ByteBufHelper.IlIlH(this.IlIla.IlIlS);
    }

    @Override
    public void close() {
    }

    @Override
    public void mark(int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    public PacketWrapper<?> IlIlZ() {
        return this.IlIla;
    }
}

