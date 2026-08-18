/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlxS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlyd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlyw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlTq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIljH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface IlIlfP
extends MappedEntity,
IlIlTq<IlIlfP>,
IlIljH {
    public static final NbtCodec<IlIlfP> IlIlh = new IlIlyw().IlIlq();

    public IlIlxS getModelType();

    public ResourceLocation getAssetId();

    public ResourceLocation getBabyAssetId();

    public static IlIlfP IlIll(PacketWrapper<?> packetWrapper) {
        return packetWrapper.IlIlt(IlIlyd.IlIlM());
    }

    public static void IlIls(PacketWrapper<?> packetWrapper, IlIlfP ilIlfP) {
        packetWrapper.IlIle(ilIlfP);
    }

    @Deprecated
    public static IlIlfP IlIlm(NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return (IlIlfP)((IlIlfP)IlIlh.IlIlA(nBT, PacketWrapper.IlIlE(clientVersion))).copy(typesBuilderData);
    }

    @Deprecated
    public static NBT IlIlh(IlIlfP ilIlfP, ClientVersion clientVersion) {
        return IlIlh.IlIl_(PacketWrapper.IlIlE(clientVersion), ilIlfP);
    }
}

