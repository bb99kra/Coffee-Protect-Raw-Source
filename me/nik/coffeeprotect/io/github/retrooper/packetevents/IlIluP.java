/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlC8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlrO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlC1;
import org.bukkit.plugin.Plugin;

public class IlIluP {
    private static IlIlC8<Plugin> IlIlH;
    private static PacketWrapper[] IlIlN;
    private static final long a;
    private static transient /* synthetic */ String OxyFqJmycD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public static void IlIla() {
        IlIlH = null;
    }

    public static IlIlC8<Plugin> IlIlE(Plugin plugin) {
        long l = a ^ 0x3E76A60F92B9L;
        PacketWrapper[] packetWrapperArray = IlIluP.IlIlt();
        IlIlC8<Plugin> ilIlC8 = IlIlH;
        if (packetWrapperArray == null) {
            if (ilIlC8 == null) {
                IlIlH = IlIluP.IlIlL(plugin);
            }
            ilIlC8 = IlIlH;
        }
        return ilIlC8;
    }

    public static IlIlC8<Plugin> IlIlB(Plugin plugin, IlIlrO ilIlrO) {
        long l = a ^ 0x2A3C03C53BF1L;
        PacketWrapper[] packetWrapperArray = IlIluP.IlIlt();
        IlIlC8<Plugin> ilIlC8 = IlIlH;
        if (packetWrapperArray == null) {
            if (ilIlC8 == null) {
                IlIlH = IlIluP.IlIlD(plugin, ilIlrO);
            }
            ilIlC8 = IlIlH;
        }
        return ilIlC8;
    }

    public static IlIlC8<Plugin> IlIlL(Plugin plugin) {
        return IlIluP.IlIlD(plugin, new IlIlrO());
    }

    public static IlIlC8<Plugin> IlIlD(Plugin plugin, IlIlrO ilIlrO) {
        return new IlIlC1(ilIlrO, plugin);
    }

    public static void IlIla(PacketWrapper[] packetWrapperArray) {
        IlIlN = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlt() {
        return IlIlN;
    }

    static {
        a = IlIls.a(206711332962496313L, 1831682055115991092L, MethodHandles.lookup().lookupClass()).a(169494859163301L);
        if (IlIluP.IlIlt() != null) {
            IlIluP.IlIla(new PacketWrapper[3]);
        }
    }
}

