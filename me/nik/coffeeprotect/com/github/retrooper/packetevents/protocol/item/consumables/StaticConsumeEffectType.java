/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.consumables;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.consumables.IlIlLr;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.consumables.IlIln8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlT2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlOw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlQ9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticConsumeEffectType<T extends IlIlLr<?>>
extends IlIlT2
implements IlIln8<T> {
    private final IlIlQ9<T> reader;
    private final IlIlOw<T> writer;
    private static final long a = IlIls.a(3426103506160255431L, -1405348908786178063L, MethodHandles.lookup().lookupClass()).a(179164267160259L);
    private static transient /* synthetic */ String bOyIUPxKFx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticConsumeEffectType(@Nullable TypesBuilderData typesBuilderData, IlIlQ9<T> ilIlQ9, IlIlOw<T> ilIlOw) {
        long l = a ^ 0x3A5E08E14BA8L;
        super(typesBuilderData);
        this.reader = ilIlQ9;
        this.writer = ilIlOw;
        int[] nArray = IlIlLr.IlIla();
        if (nArray != null) {
            PacketWrapper.IlIle(new int[2]);
        }
    }

    @Override
    public T read(PacketWrapper<?> packetWrapper) {
        return (T)((IlIlLr)this.reader.apply(packetWrapper));
    }

    @Override
    public void write(PacketWrapper<?> packetWrapper, T t) {
        this.writer.accept(packetWrapper, t);
    }
}

