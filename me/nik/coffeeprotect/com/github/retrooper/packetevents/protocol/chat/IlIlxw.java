/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIljA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlX7;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class IlIlxw {
    private Component IlIlH;
    private IlIljA IlIlX;
    private static boolean IlIlh;
    private static transient /* synthetic */ String xTjDriMXJR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    protected IlIlxw(Component component, IlIljA ilIljA) {
        this.IlIlH = component;
        this.IlIlX = ilIljA;
    }

    public Component IlIlb() {
        return this.IlIlH;
    }

    public String IlIlH(ClientVersion clientVersion) {
        return IlIlX7.IlIlX(clientVersion).IlIlR(this.IlIlb());
    }

    public void IlIlv(Component component) {
        this.IlIlH = component;
    }

    public void IlIlx(ClientVersion clientVersion, String string) {
        this.IlIlv(IlIlX7.IlIlX(clientVersion).IlIlx(string));
    }

    public IlIljA IlIlE() {
        return this.IlIlX;
    }

    public void IlIlf(IlIljA ilIljA) {
        this.IlIlX = ilIljA;
    }

    public static void IlIl_(boolean bl) {
        IlIlh = bl;
    }

    public static boolean IlIlP() {
        return IlIlh;
    }

    public static boolean IlIlv() {
        boolean bl = IlIlxw.IlIlP();
        return !bl;
    }

    static {
        if (IlIlxw.IlIlv()) {
            IlIlxw.IlIl_(true);
        }
    }
}

