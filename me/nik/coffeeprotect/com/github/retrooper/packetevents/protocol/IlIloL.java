/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlhC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public interface IlIloL {
    default public String IlIlf() {
        return ((Enum)((Object)this)).name();
    }

    public int IlIlg(ClientVersion var1);

    public IlIlhC IlIlY();

    @Nullable
    public Class<? extends PacketWrapper<?>> IlIlB();
}

