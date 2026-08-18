/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFX
extends PacketWrapper<IlIlFX> {
    private IlIlCg IlIl_;
    private static transient /* synthetic */ String VDKFVjsXMy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFX(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFX(IlIlCg ilIlCg) {
        super(IlIlAG.SET_CURSOR_ITEM);
        this.IlIl_ = ilIlCg;
    }

    @Override
    public void IlIle() {
        this.IlIl_ = this.IlIlk();
    }

    @Override
    public void IlIlJ() {
        this.IlIlj(this.IlIl_);
    }

    public void IlIls(IlIlFX ilIlFX) {
        this.IlIl_ = ilIlFX.IlIl_;
    }

    public IlIlCg IlIlB() {
        return this.IlIl_;
    }

    public void IlIlu(IlIlCg ilIlCg) {
        this.IlIl_ = ilIlCg;
    }
}

