/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event.simple;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIljj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PacketPlaySendEvent
extends PacketSendEvent {
    private static transient /* synthetic */ String UWtyWEGGfA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public PacketPlaySendEvent(Object object, IlIlG2 ilIlG2, @UnknownNullability Object object2, Object object3, boolean bl) throws IlIljj {
        super(object, ilIlG2, object2, object3, bl);
    }

    protected PacketPlaySendEvent(int n, IlIloL ilIloL, ServerVersion serverVersion, Object object, IlIlG2 ilIlG2, @UnknownNullability Object object2, Object object3) throws IlIljj {
        super(n, ilIloL, serverVersion, object, ilIlG2, object2, object3);
    }

    @Override
    public PacketPlaySendEvent clone() {
        Object object = ByteBufHelper.IlIlU(this.getByteBuf());
        return new PacketPlaySendEvent(this.getPacketId(), this.getPacketType(), this.getServerVersion(), this.getChannel(), this.getUser(), this.getPlayer(), object);
    }

    @Override
    public IlIlAG getPacketType() {
        return (IlIlAG)super.getPacketType();
    }
}

