/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIlAO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIlY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.IlIld0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlTq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIljH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.IlIlQO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface IlIlXo
extends MappedEntity,
IlIlTq<IlIlXo>,
IlIljH {
    public static final NbtCodec<IlIlXo> IlIlJ = new IlIlAO();

    public IlIld0 getAdultSounds();

    public IlIld0 getBabySounds();

    @Deprecated
    default public IlIlQO IlIlV() {
        return this.getAdultSounds().IlIlR();
    }

    @Deprecated
    default public IlIlQO IlIll() {
        return this.getAdultSounds().IlIlX();
    }

    @Deprecated
    default public IlIlQO IlIlv() {
        return this.getAdultSounds().IlIlK();
    }

    @Deprecated
    default public IlIlQO IlIlp() {
        return this.getAdultSounds().IlIlz();
    }

    @Deprecated
    default public IlIlQO IlIlI() {
        return this.getAdultSounds().IlIlN();
    }

    @Deprecated
    default public IlIlQO IlIlu() {
        return this.getAdultSounds().IlIlp();
    }

    public static IlIlXo IlIl_(PacketWrapper<?> packetWrapper) {
        return packetWrapper.IlIlt(IlIlY.IlIll());
    }

    public static void IlIls(PacketWrapper<?> packetWrapper, IlIlXo ilIlXo) {
        packetWrapper.IlIle(ilIlXo);
    }

    @Deprecated
    public static IlIlXo IlIll(NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return (IlIlXo)((IlIlXo)IlIlJ.IlIlA(nBT, PacketWrapper.IlIlE(clientVersion))).copy(typesBuilderData);
    }

    @Deprecated
    public static NBT IlIlO(IlIlXo ilIlXo, ClientVersion clientVersion) {
        return IlIlJ.IlIl_(PacketWrapper.IlIlE(clientVersion), ilIlXo);
    }
}

