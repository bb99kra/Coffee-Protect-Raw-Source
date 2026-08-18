/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlAC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIlQy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.IlIloX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlTq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIljH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public interface IlIlfM
extends MappedEntity,
IlIlTq<IlIlfM>,
IlIljH {
    public static final NbtCodec<IlIlfM> IlIlo = new IlIloX().IlIlq();

    public static IlIlfM IlIlv(PacketWrapper<?> packetWrapper) {
        return packetWrapper.IlIlt(IlIlAC.IlIlR());
    }

    public static void IlIlb(PacketWrapper<?> packetWrapper, IlIlfM ilIlfM) {
        packetWrapper.IlIle(ilIlfM);
    }

    public IlIlQy getAdultSounds();

    public IlIlQy getBabySounds();
}

