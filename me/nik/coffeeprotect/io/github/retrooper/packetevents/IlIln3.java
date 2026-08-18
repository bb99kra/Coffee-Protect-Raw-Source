/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlrX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIlP8;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.IlIluP;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class IlIln3
extends JavaPlugin {
    private static String IlIlc;
    private static final long a;
    private static transient /* synthetic */ String HqaNrROgLa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public void onLoad() {
        IlIlr7.IlIla(IlIluP.IlIlE((Plugin)this));
        IlIlr7.IlIlb().IlIlA();
    }

    public void onEnable() {
        long l = a ^ 0x4ACFFB4BD75L;
        String string = IlIln3.IlIlY();
        IlIlr7.IlIlb().IlIlV().IlIlN(false).IlIlu(true).IlIlO(IlIlrX.MILLIS).IlIln(true);
        IlIlr7.IlIlb().IlIlR();
        String string2 = string;
        IlIlP8 ilIlP8 = new IlIlP8(this, IlIldF.HIGH);
        if (string2 != null) {
            PacketWrapper.IlIle(new int[3]);
        }
    }

    public void onDisable() {
        IlIlr7.IlIlb().IlIlh();
    }

    public static void IlIlI(String string) {
        IlIlc = string;
    }

    public static String IlIlY() {
        return IlIlc;
    }

    static {
        a = IlIls.a(1710202073226550836L, 3208825979645805252L, MethodHandles.lookup().lookupClass()).a(166512029219339L);
        if (IlIln3.IlIlY() != null) {
            IlIln3.IlIlI("vFVFm");
        }
    }
}

