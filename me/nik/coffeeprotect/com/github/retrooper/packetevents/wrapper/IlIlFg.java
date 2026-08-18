/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class IlIlFg
extends PacketWrapper<IlIlFg> {
    @Deprecated
    public static boolean IlIls = true;
    private Component IlIlw;
    private static transient /* synthetic */ String bAhcqhbCMd = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFg(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @Deprecated
    public IlIlFg(String string) {
        super(IlIlAG.SET_TITLE_SUBTITLE);
        this.IlIlw = this.IlIlq().IlIlx(string);
    }

    public IlIlFg(Component component) {
        super(IlIlAG.SET_TITLE_SUBTITLE);
        this.IlIlw = component;
    }

    @Override
    public void IlIle() {
        this.IlIlw = this.IlIlJ();
    }

    @Override
    public void IlIlJ() {
        this.IlIlz(this.IlIlw);
    }

    public void IlIln(IlIlFg ilIlFg) {
        this.IlIlw = ilIlFg.IlIlw;
    }

    public Component IlIlZ() {
        return this.IlIlw;
    }

    public void IlIlT(Component component) {
        this.IlIlw = component;
    }

    @Deprecated
    public String IlIlW() {
        return this.IlIlq().IlIlR(this.IlIlZ());
    }

    @Deprecated
    public void IlIlX(String string) {
        this.IlIlT(this.IlIlq().IlIlx(string));
    }
}

