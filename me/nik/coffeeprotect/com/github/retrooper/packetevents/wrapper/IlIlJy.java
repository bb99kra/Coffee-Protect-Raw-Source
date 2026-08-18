/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlJy
extends PacketWrapper<IlIlJy> {
    private ResourceLocation IlIlw;
    private static transient /* synthetic */ String JhpNuhqzzs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJy(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJy(ResourceLocation resourceLocation) {
        super(IlIlWz.COOKIE_REQUEST);
        this.IlIlw = resourceLocation;
    }

    @Override
    public void IlIle() {
        this.IlIlw = this.readIdentifier();
    }

    @Override
    public void IlIlJ() {
        this.writeIdentifier(this.IlIlw);
    }

    public void IlIlN(IlIlJy ilIlJy) {
        this.IlIlw = ilIlJy.IlIlw;
    }

    public ResourceLocation IlIlJ() {
        return this.IlIlw;
    }

    public void IlIlZ(ResourceLocation resourceLocation) {
        this.IlIlw = resourceLocation;
    }
}

