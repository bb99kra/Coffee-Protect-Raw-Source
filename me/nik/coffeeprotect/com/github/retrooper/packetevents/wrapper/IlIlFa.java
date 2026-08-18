/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.IlIljx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFa
extends PacketWrapper<IlIlFa> {
    private IlIljx IlIlw;
    private static transient /* synthetic */ String ZoyYRUVGME = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFa(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFa(IlIljx ilIljx) {
        super(IlIlAG.RECIPE_BOOK_SETTINGS);
        this.IlIlw = ilIljx;
    }

    @Override
    public void IlIle() {
        this.IlIlw = IlIljx.IlIlI(this);
    }

    @Override
    public void IlIlJ() {
        IlIljx.IlIlX(this, this.IlIlw);
    }

    public void IlIlT(IlIlFa ilIlFa) {
        this.IlIlw = ilIlFa.IlIlw;
    }

    public IlIljx IlIlq() {
        return this.IlIlw;
    }

    public void IlIlP(IlIljx ilIljx) {
        this.IlIlw = ilIljx;
    }
}

