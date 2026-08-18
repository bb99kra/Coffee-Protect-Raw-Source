/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlbR
extends PacketWrapper<IlIlbR> {
    private int IlIlV;
    @Nullable
    private Component IlIlc;
    private static transient /* synthetic */ String ufFruXepWM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbR(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbR(int n, @Nullable Component component) {
        super(IlIlAG.CHAT_PREVIEW_PACKET);
        this.IlIlV = n;
        this.IlIlc = component;
    }

    @Override
    public void IlIle() {
        this.IlIlV = this.IlIlW();
        this.IlIlc = (Component)this.IlIlN(PacketWrapper::IlIlJ);
    }

    @Override
    public void IlIlJ() {
        this.IlIla(this.IlIlV);
        this.IlIlI(this.IlIlc, PacketWrapper::IlIlz);
    }

    public void IlIlg(IlIlbR ilIlbR) {
        this.IlIlV = ilIlbR.IlIlV;
        this.IlIlc = ilIlbR.IlIlc;
    }

    public int IlIlE() {
        return this.IlIlV;
    }

    public void IlIl_(int n) {
        this.IlIlV = n;
    }

    public Optional<Component> IlIlk() {
        return Optional.ofNullable(this.IlIlc);
    }

    public void IlIlC(@Nullable Component component) {
        this.IlIlc = component;
    }
}

