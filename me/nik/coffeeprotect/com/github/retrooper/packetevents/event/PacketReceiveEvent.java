/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIljj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.ProtocolPacketEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlhC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PacketReceiveEvent
extends ProtocolPacketEvent {
    private static PacketWrapper[] IlIlO;
    private static transient /* synthetic */ String iCqiTfoQnE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    protected PacketReceiveEvent(Object object, IlIlG2 ilIlG2, @UnknownNullability Object object2, Object object3, boolean bl) throws IlIljj {
        super(IlIlhC.CLIENT, object, ilIlG2, object2, object3, bl);
    }

    protected PacketReceiveEvent(int n, IlIloL ilIloL, ServerVersion serverVersion, Object object, IlIlG2 ilIlG2, @UnknownNullability Object object2, Object object3) throws IlIljj {
        super(n, ilIloL, serverVersion, object, ilIlG2, object2, object3);
    }

    @Override
    public void call(IlIlPs ilIlPs) {
        ilIlPs.IlIlP(this);
    }

    @Override
    public PacketReceiveEvent clone() {
        Object object = ByteBufHelper.IlIlU(this.getByteBuf());
        return new PacketReceiveEvent(this.getPacketId(), this.getPacketType(), this.getServerVersion(), this.getChannel(), this.getUser(), this.getPlayer(), object);
    }

    public static void IlIlb(PacketWrapper[] packetWrapperArray) {
        IlIlO = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlm() {
        return IlIlO;
    }

    static {
        if (PacketReceiveEvent.IlIlm() != null) {
            PacketReceiveEvent.IlIlb(new PacketWrapper[4]);
        }
    }
}

