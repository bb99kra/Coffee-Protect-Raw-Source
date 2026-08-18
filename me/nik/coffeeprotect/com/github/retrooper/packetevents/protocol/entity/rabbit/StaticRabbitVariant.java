/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.rabbit;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.rabbit.IlIljQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlT2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticRabbitVariant
extends IlIlT2
implements IlIljQ {
    private static PacketWrapper[] IlIlY;
    private static transient /* synthetic */ String EJwkrPKeFA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticRabbitVariant(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    public static void IlIlp(PacketWrapper[] packetWrapperArray) {
        IlIlY = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlX() {
        return IlIlY;
    }

    static {
        if (StaticRabbitVariant.IlIlX() != null) {
            StaticRabbitVariant.IlIlp(new PacketWrapper[3]);
        }
    }
}

