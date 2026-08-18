/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlAj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlC9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlL8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlOk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlTQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlTi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlZO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIloR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public class IlIlbN
extends PacketWrapper<IlIlbN> {
    private static final IlIlOk IlIlt;
    private static final IlIlOk IlIln;
    private static final IlIlOk IlIlG;
    private static final IlIlOk IlIlm;
    private static final IlIlOk IlIlr;
    private static final IlIlOk IlIl_;
    private static final IlIlOk IlIla;
    private IlIlxw IlIlO;
    private static final long b;
    private static transient /* synthetic */ String zAXWuoGLJn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbN(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbN(IlIlxw ilIlxw) {
        super(IlIlAG.CHAT_MESSAGE);
        this.IlIlO = ilIlxw;
    }

    @Override
    public void IlIle() {
        this.IlIlO = this.IlIlH().IlIlO(this);
    }

    @Override
    public void IlIlJ() {
        this.IlIlH().IlIlW(this, this.IlIlO);
    }

    public void IlIlZ(IlIlbN ilIlbN) {
        this.IlIlO = ilIlbN.IlIlO;
    }

    public IlIlxw IlIlu() {
        return this.IlIlO;
    }

    public void IlIlc(IlIlxw ilIlxw) {
        this.IlIlO = ilIlxw;
    }

    @ApiStatus.Internal
    protected IlIlOk IlIlH() {
        long l = b ^ 0x2783F22FA4DBL;
        PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
        boolean bl = this.IlIlg.IlIlz(ServerVersion.V_1_21_5);
        if (packetWrapperArray != null) {
            if (bl) {
                return IlIla;
            }
            bl = this.IlIlg.IlIlz(ServerVersion.V_1_19_3);
        }
        if (packetWrapperArray != null) {
            if (bl) {
                return IlIl_;
            }
            bl = this.IlIlg.IlIlz(ServerVersion.V_1_19_1);
        }
        if (packetWrapperArray != null) {
            if (bl) {
                return IlIlr;
            }
            bl = this.IlIlg.IlIlz(ServerVersion.V_1_19);
        }
        if (packetWrapperArray != null) {
            if (bl) {
                return IlIlm;
            }
            bl = this.IlIlg.IlIlz(ServerVersion.V_1_16);
        }
        if (packetWrapperArray != null) {
            if (bl) {
                return IlIlG;
            }
            bl = this.IlIlg.IlIlz(ServerVersion.V_1_8);
        }
        if (bl) {
            return IlIln;
        }
        return IlIlt;
    }

    static {
        b = IlIls.a(-6696890644565006668L, -1421782617087597040L, MethodHandles.lookup().lookupClass()).a(131330349441342L);
        IlIlt = new IlIlAj();
        IlIln = new IlIlZO();
        IlIlG = new IlIloR();
        IlIlm = new IlIlTQ();
        IlIlr = new IlIlC9();
        IlIl_ = new IlIlTi();
        IlIla = new IlIlL8();
    }
}

