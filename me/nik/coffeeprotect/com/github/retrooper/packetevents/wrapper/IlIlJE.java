/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJ5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIldR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJE
extends PacketWrapper<IlIlJE> {
    private UUID IlIlJ;
    private IlIldR IlIlh;
    private static final long b = IlIls.a(-8549300490353597261L, 9102850934403369936L, MethodHandles.lookup().lookupClass()).a(28223671983304L);
    private static transient /* synthetic */ String enDuPJFOtI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJE(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJE(IlIldR ilIldR) {
        this(UUID.randomUUID(), ilIldR);
    }

    public IlIlJE(UUID uUID, IlIldR ilIldR) {
        super(IlIlqy.RESOURCE_PACK_STATUS);
        this.IlIlJ = uUID;
        this.IlIlh = ilIldR;
    }

    @Override
    public void IlIle() {
        long l = b ^ 0x2D81243D634EL;
        int n = IlIlJ5.IlIlo();
        IlIlJE ilIlJE = this;
        if (n == 0) {
            if (ilIlJE.IlIlg.IlIlz(ServerVersion.V_1_20_3)) {
                this.IlIlJ = this.IlIlv();
            }
            ilIlJE = this;
        }
        ilIlJE.IlIlh = IlIldR.VALUES[this.IlIlf()];
    }

    @Override
    public void IlIlJ() {
        long l = b ^ 0x34FC59D45DE6L;
        int n = IlIlJ5.IlIlp();
        IlIlJE ilIlJE = this;
        if (n != 0) {
            if (ilIlJE.IlIlg.IlIlz(ServerVersion.V_1_20_3)) {
                this.IlIlc(this.IlIlJ);
            }
            ilIlJE = this;
        }
        ilIlJE.IlIlJ(this.IlIlh.ordinal());
    }

    public void IlIlG(IlIlJE ilIlJE) {
        this.IlIlJ = ilIlJE.IlIlJ;
        this.IlIlh = ilIlJE.IlIlh;
    }

    public UUID IlIlm() {
        return this.IlIlJ;
    }

    public void IlIlF(UUID uUID) {
        this.IlIlJ = uUID;
    }

    public IlIldR IlIlA() {
        return this.IlIlh;
    }

    public void IlIla(IlIldR ilIldR) {
        this.IlIlh = ilIldR;
    }
}

