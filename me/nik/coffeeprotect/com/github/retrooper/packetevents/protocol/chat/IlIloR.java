/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlOk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIldt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIljA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

public class IlIloR
implements IlIlOk {
    private static transient /* synthetic */ String JOqVBgsdJk = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public IlIlxw IlIlO(@NotNull PacketWrapper<?> packetWrapper) {
        Component component = packetWrapper.IlIlJ();
        IlIljA ilIljA = packetWrapper.IlIlt(IlIldt.IlIlc());
        UUID uUID = packetWrapper.IlIlv();
        return new IlIlxl(component, ilIljA, uUID);
    }

    @Override
    public void IlIlW(@NotNull PacketWrapper<?> packetWrapper, @NotNull IlIlxw ilIlxw) {
        packetWrapper.IlIlz(ilIlxw.IlIlb());
        packetWrapper.IlIle(ilIlxw.IlIlE());
        packetWrapper.IlIlc(((IlIlxl)ilIlxw).IlIll());
    }
}

