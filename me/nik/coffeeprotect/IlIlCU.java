/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.Location;

class IlIlCU {
    private final UUID IlIlp;
    private final double IlIlY;
    private final double IlIlh;
    private final double IlIlR;
    private static final long a = IlIls.a(426801613118855249L, 2122564356039343365L, MethodHandles.lookup().lookupClass()).a(149366168496475L);
    private static transient /* synthetic */ String KVgLTlgyVf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlCU(UUID uUID, double d, double d2, double d3) {
        long l = a ^ 0x3D5C178C8EC7L;
        this.IlIlp = uUID;
        this.IlIlY = d;
        this.IlIlh = d2;
        this.IlIlR = d3;
        String string = IlIlu7.IlIlq();
        if (string != null) {
            PacketWrapper.IlIle(new int[5]);
        }
    }

    public Location IlIlP() {
        return new Location(Bukkit.getWorld((UUID)this.IlIlp), this.IlIlY, this.IlIlh, this.IlIlR);
    }
}
