/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIln0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJw
extends PacketWrapper<IlIlJw> {
    private ResourceLocation IlIlv;
    private static transient /* synthetic */ String EfNhBhXUze = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJw(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJw(ResourceLocation resourceLocation) {
        super(IlIln0.COOKIE_REQUEST);
        this.IlIlv = resourceLocation;
    }

    @Override
    public void IlIle() {
        this.IlIlv = this.readIdentifier();
    }

    @Override
    public void IlIlJ() {
        this.writeIdentifier(this.IlIlv);
    }

    public void IlIlp(IlIlJw ilIlJw) {
        this.IlIlv = ilIlJw.IlIlv;
    }

    public ResourceLocation IlIly() {
        return this.IlIlv;
    }

    public void IlIlm(ResourceLocation resourceLocation) {
        this.IlIlv = resourceLocation;
    }
}

