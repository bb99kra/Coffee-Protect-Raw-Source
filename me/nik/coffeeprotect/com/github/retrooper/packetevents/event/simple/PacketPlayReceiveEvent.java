/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event.simple;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIljj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PacketPlayReceiveEvent
extends PacketReceiveEvent {
    private static String[] IlIlp;
    private static final long b;
    private static transient /* synthetic */ String FDuNEpadth = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public PacketPlayReceiveEvent(Object object, IlIlG2 ilIlG2, @UnknownNullability Object object2, Object object3, boolean bl) throws IlIljj {
        super(object, ilIlG2, object2, object3, bl);
    }

    protected PacketPlayReceiveEvent(int n, IlIloL ilIloL, ServerVersion serverVersion, Object object, IlIlG2 ilIlG2, @UnknownNullability Object object2, Object object3) throws IlIljj {
        super(n, ilIloL, serverVersion, object, ilIlG2, object2, object3);
    }

    @Override
    public PacketPlayReceiveEvent clone() {
        PacketPlayReceiveEvent packetPlayReceiveEvent;
        long l = b ^ 0x60E638CAB8C5L;
        Object object = ByteBufHelper.IlIlU(this.getByteBuf());
        String[] stringArray = PacketPlayReceiveEvent.IlIll();
        try {
            packetPlayReceiveEvent = new PacketPlayReceiveEvent(this.getPacketId(), this.getPacketType(), this.getServerVersion(), this.getChannel(), this.getUser(), this.getPlayer(), object);
            if (PacketWrapper.IlIlz() == null) {
                PacketPlayReceiveEvent.IlIls(new String[2]);
            }
        }
        catch (IlIljj ilIljj) {
            throw PacketPlayReceiveEvent.a(ilIljj);
        }
        return packetPlayReceiveEvent;
    }

    @Override
    public IlIlnN getPacketType() {
        return (IlIlnN)super.getPacketType();
    }

    public static void IlIls(String[] stringArray) {
        IlIlp = stringArray;
    }

    public static String[] IlIll() {
        return IlIlp;
    }

    static {
        b = IlIls.a(-8805551161873620179L, 1120204273047690804L, MethodHandles.lookup().lookupClass()).a(46482139965241L);
        if (PacketPlayReceiveEvent.IlIll() == null) {
            PacketPlayReceiveEvent.IlIls(new String[2]);
        }
    }

    private static IlIljj a(IlIljj ilIljj) {
        return ilIljj;
    }
}

