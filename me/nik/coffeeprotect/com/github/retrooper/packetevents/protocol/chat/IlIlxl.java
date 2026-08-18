/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIljA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxw;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class IlIlxl
extends IlIlxw {
    private UUID IlIlq;
    private static transient /* synthetic */ String YtcTWSwwMt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlxl(Component component, IlIljA ilIljA, UUID uUID) {
        super(component, ilIljA);
        this.IlIlq = uUID;
    }

    public UUID IlIll() {
        return this.IlIlq;
    }

    public void IlIll(UUID uUID) {
        this.IlIlq = uUID;
    }
}

