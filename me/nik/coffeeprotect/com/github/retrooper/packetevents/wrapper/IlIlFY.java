/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIloV;

public class IlIlFY
extends PacketWrapper<IlIlFY> {
    @Deprecated
    public static boolean IlIlH = true;
    private Component IlIlm;
    private Component IlIlL;
    private static transient /* synthetic */ String bcUSXZMhkK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFY(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @Deprecated
    public IlIlFY(String string, String string2) {
        super(IlIlAG.PLAYER_LIST_HEADER_AND_FOOTER);
        IlIloV ilIloV = this.IlIlq().IlIls();
        this.IlIlm = ilIloV.IlIlu(string);
        this.IlIlL = ilIloV.IlIlu(string2);
    }

    public IlIlFY(Component component, Component component2) {
        super(IlIlAG.PLAYER_LIST_HEADER_AND_FOOTER);
        this.IlIlm = component;
        this.IlIlL = component2;
    }

    @Override
    public void IlIle() {
        this.IlIlm = this.IlIlJ();
        this.IlIlL = this.IlIlJ();
    }

    @Override
    public void IlIlJ() {
        this.IlIlz(this.IlIlm);
        this.IlIlz(this.IlIlL);
    }

    public void IlIlb(IlIlFY ilIlFY) {
        this.IlIlm = ilIlFY.IlIlm;
        this.IlIlL = ilIlFY.IlIlL;
    }

    public Component IlIlt() {
        return this.IlIlm;
    }

    public void IlIlN(Component component) {
        this.IlIlm = component;
    }

    public Component IlIlv() {
        return this.IlIlL;
    }

    public void IlIlE(Component component) {
        this.IlIlL = component;
    }

    @Deprecated
    public String IlIl_() {
        return this.IlIlq().IlIlR(this.IlIlt());
    }

    @Deprecated
    public void IlIlr(String string) {
        this.IlIlN(this.IlIlq().IlIlx(string));
    }

    @Deprecated
    public String IlIlp() {
        return this.IlIlq().IlIlR(this.IlIlv());
    }

    @Deprecated
    public void IlIl_(String string) {
        this.IlIlE(this.IlIlq().IlIlx(string));
    }

    @Deprecated
    public Component IlIlZ() {
        return this.IlIlt();
    }

    @Deprecated
    public void IlIlM(Component component) {
        this.IlIlN(component);
    }

    @Deprecated
    public Component IlIlX() {
        return this.IlIlv();
    }

    @Deprecated
    public void IlIl_(Component component) {
        this.IlIlE(component);
    }
}

