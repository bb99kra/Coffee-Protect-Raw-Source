/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.time.Instant;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlAS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlOG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIld2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxm;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlx_
extends IlIlxm {
    int IlIlr;
    private static transient /* synthetic */ String BLTVZZdhyl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlx_(int n, UUID uUID, int n2, byte[] byArray, String string, Instant instant, long l, IlIlAS ilIlAS, @Nullable Component component, IlIld2 ilIld2, IlIlOG ilIlOG) {
        super(uUID, n2, byArray, string, instant, l, ilIlAS, component, ilIld2, ilIlOG);
        this.IlIlr = n;
    }

    public int IlIlv() {
        return this.IlIlr;
    }

    public void IlIlR(int n) {
        this.IlIlr = n;
    }
}

