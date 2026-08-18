/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class IlIlJu
extends PacketWrapper<IlIlJu> {
    private String IlIl_;
    private static transient /* synthetic */ String dlsDJDIQLC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJu(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJu(String string) {
        super(IlIlWz.CODE_OF_CONDUCT);
        this.IlIl_ = string;
    }

    @Override
    public void IlIle() {
        this.IlIl_ = this.IlIli();
    }

    @Override
    public void IlIlJ() {
        this.IlIlM(this.IlIl_);
    }

    public void IlIlc(IlIlJu ilIlJu) {
        this.IlIl_ = ilIlJu.IlIl_;
    }

    public String IlIlG() {
        return this.IlIl_;
    }

    public void IlIlS(String string) {
        this.IlIl_ = string;
    }
}

