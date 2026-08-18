/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;

public interface IlIlZA
extends MappedEntity {
    public int getId();

    @Override
    default public int IlIlH(ClientVersion clientVersion) {
        return this.getId();
    }
}

