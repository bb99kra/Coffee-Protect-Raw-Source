/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlFk
extends PacketWrapper<IlIlFk> {
    private String IlIlQ;
    @Nullable
    private String IlIlD;
    private static transient /* synthetic */ String YajHLtDpRf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFk(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFk(String string, @Nullable String string2) {
        super(IlIlAG.RESET_SCORE);
        this.IlIlQ = string;
        this.IlIlD = string2;
    }

    @Override
    public void IlIle() {
        this.IlIlQ = this.IlIli();
        this.IlIlD = (String)this.IlIlN(PacketWrapper::IlIli);
    }

    @Override
    public void IlIlJ() {
        this.IlIlM(this.IlIlQ);
        this.IlIlI(this.IlIlD, PacketWrapper::IlIlM);
    }

    public void IlIlq(IlIlFk ilIlFk) {
        this.IlIlQ = ilIlFk.IlIlQ;
        this.IlIlD = ilIlFk.IlIlD;
    }

    public String IlIlq() {
        return this.IlIlQ;
    }

    public void IlIlS(String string) {
        this.IlIlQ = string;
    }

    @Nullable
    public String IlIl_() {
        return this.IlIlD;
    }

    public void IlIly(@Nullable String string) {
        this.IlIlD = string;
    }
}

