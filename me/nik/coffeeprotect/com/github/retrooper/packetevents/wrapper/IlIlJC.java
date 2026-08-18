/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIln0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlJC
extends PacketWrapper<IlIlJC> {
    private int IlIlt;
    private String IlIlf;
    private byte[] IlIlm;
    private static transient /* synthetic */ String GhjIkjiyki = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJC(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlJC(int n, String string, byte[] byArray) {
        super(IlIln0.LOGIN_PLUGIN_REQUEST);
        this.IlIlt = n;
        this.IlIlf = string;
        this.IlIlm = byArray;
    }

    @Override
    public void IlIle() {
        this.IlIlt = this.IlIlf();
        this.IlIlf = this.IlIli();
        int n = ByteBufHelper.IlIlH(this.IlIlS);
        this.IlIlm = this.IlIlW(n);
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlt);
        this.IlIlM(this.IlIlf);
        this.IlIle(this.IlIlm);
    }

    public void IlIlT(IlIlJC ilIlJC) {
        this.IlIlt = ilIlJC.IlIlt;
        this.IlIlf = ilIlJC.IlIlf;
        this.IlIlm = ilIlJC.IlIlm;
    }

    public int IlIlA() {
        return this.IlIlt;
    }

    public void IlIlt(int n) {
        this.IlIlt = n;
    }

    public String IlIls() {
        return this.IlIlf;
    }

    public void IlIlq(String string) {
        this.IlIlf = string;
    }

    public byte[] IlIle() {
        return this.IlIlm;
    }

    public void IlIlJ(byte[] byArray) {
        this.IlIlm = byArray;
    }
}

