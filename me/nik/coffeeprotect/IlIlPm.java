/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlZ6;
import me.nik.coffeeprotect.IlIlvF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public class IlIlPm
extends IlIlPw {
    private static final long a = IlIls.a(-5537763915283580032L, 738479468704196657L, MethodHandles.lookup().lookupClass()).a(215853433674779L);
    private static transient /* synthetic */ String RTMyyGnfHW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlPm() {
        super(IlIldF.NORMAL);
    }

    @Override
    public void IlIlP(PacketReceiveEvent packetReceiveEvent) {
        boolean bl;
        block7: {
            block8: {
                block5: {
                    PacketReceiveEvent packetReceiveEvent2;
                    String[] stringArray;
                    block6: {
                        IlIlG2 ilIlG2;
                        block4: {
                            long l = a ^ 0x323DBA8CEED4L;
                            stringArray = IlIlvF.IlIlo();
                            ilIlG2 = packetReceiveEvent.getUser();
                            if (stringArray == null) break block4;
                            if (ilIlG2 == null) break block5;
                            packetReceiveEvent2 = packetReceiveEvent;
                            if (stringArray == null) break block6;
                            ilIlG2 = packetReceiveEvent2.getPlayer();
                        }
                        if (ilIlG2 == null) break block5;
                        packetReceiveEvent2 = packetReceiveEvent;
                    }
                    bl = packetReceiveEvent2.isCancelled();
                    if (stringArray == null) break block7;
                    if (!bl) break block8;
                }
                return;
            }
            bl = IlIlZ6.IlIli(IlIlOq.DISABLED_PACKETS_PACKETS.IlIlT(), string -> packetReceiveEvent.getPacketType().IlIlf().equalsIgnoreCase((String)string));
        }
        if (bl) {
            packetReceiveEvent.setCancelled(true);
        }
    }
}
