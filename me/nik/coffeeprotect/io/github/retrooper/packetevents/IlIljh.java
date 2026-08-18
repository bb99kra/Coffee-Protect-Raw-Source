/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlC8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.UserLoginEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class IlIljh
implements Listener {
    private static transient /* synthetic */ String aJNVWeMELw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @EventHandler
    public void IlIlm(PlayerJoinEvent playerJoinEvent) {
        IlIlC8<?> ilIlC8 = IlIlr7.IlIlb();
        IlIlG2 ilIlG2 = ilIlC8.IlIlq().IlIlV(playerJoinEvent.getPlayer());
        IlIlr7.IlIlb().IlIlg().IlIlH(new UserLoginEvent(ilIlG2, playerJoinEvent.getPlayer()));
    }
}

