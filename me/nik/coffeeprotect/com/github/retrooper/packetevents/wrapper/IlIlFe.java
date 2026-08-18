/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlFe
extends PacketWrapper<IlIlFe> {
    private Component IlIlm;
    @Nullable
    private IlIlAn IlIlF;
    private static transient /* synthetic */ String RPuRVQwDcL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFe(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFe(Component component, @Nullable IlIlAn ilIlAn) {
        super(IlIlAG.TEST_INSTANCE_BLOCK_STATUS);
        this.IlIlm = component;
        this.IlIlF = ilIlAn;
    }

    @Override
    public void IlIle() {
        this.IlIlm = this.IlIlJ();
        this.IlIlF = (IlIlAn)this.IlIlN(IlIlAn::IlIlK);
    }

    @Override
    public void IlIlJ() {
        this.IlIlz(this.IlIlm);
        this.IlIlI(this.IlIlF, IlIlAn::IlIlF);
    }

    public void IlIla(IlIlFe ilIlFe) {
        this.IlIlm = ilIlFe.IlIlm;
        this.IlIlF = ilIlFe.IlIlF;
    }

    public Component IlIlh() {
        return this.IlIlm;
    }

    public void IlIlW(Component component) {
        this.IlIlm = component;
    }

    @Nullable
    public IlIlAn IlIlo() {
        return this.IlIlF;
    }

    public void IlIli(@Nullable IlIlAn ilIlAn) {
        this.IlIlF = ilIlAn;
    }
}

