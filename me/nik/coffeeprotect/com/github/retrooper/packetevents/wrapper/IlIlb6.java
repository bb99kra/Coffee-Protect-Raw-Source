/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlb6
extends PacketWrapper<IlIlb6> {
    private int IlIlF;
    private int IlIlB;
    private static final long b = IlIls.a(3707803121974813627L, -5656349647792743244L, MethodHandles.lookup().lookupClass()).a(119769937724614L);
    private static transient /* synthetic */ String RAtfDNhHJS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb6(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlb6(int n, int n2) {
        super(IlIlnN.SET_BEACON_EFFECT);
        this.IlIlF = n;
        this.IlIlB = n2;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlb6 ilIlb6;
                block3: {
                    long l = b ^ 0x15C5E698A9FFL;
                    String string = IlIlJH.IlIlw();
                    ilIlb6 = this;
                    if (string != null) break block2;
                    if (!ilIlb6.IlIlg.IlIlz(ServerVersion.V_1_19)) break block3;
                    this.IlIlF = this.IlIlq();
                    this.IlIlB = this.IlIlq();
                    if (string == null) break block4;
                }
                this.IlIlF = this.IlIlf();
                ilIlb6 = this;
            }
            ilIlb6.IlIlB = this.IlIlf();
        }
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlb6 ilIlb6;
            block2: {
                block3: {
                    long l = b ^ 0xCB89B719757L;
                    String string = IlIlJH.IlIlw();
                    ilIlb6 = this;
                    if (string != null) break block2;
                    if (!ilIlb6.IlIlg.IlIlz(ServerVersion.V_1_19)) break block3;
                    this.IlIli(this.IlIlF);
                    this.IlIli(this.IlIlB);
                    if (string == null) break block4;
                }
                this.IlIlJ(this.IlIlF);
                ilIlb6 = this;
            }
            ilIlb6.IlIlJ(this.IlIlB);
        }
    }

    public void IlIlp(IlIlb6 ilIlb6) {
        this.IlIlF = ilIlb6.IlIlF;
        this.IlIlB = ilIlb6.IlIlB;
    }

    public int IlIlB() {
        return this.IlIlF;
    }

    public void IlIlc(int n) {
        this.IlIlF = n;
    }

    public int IlIlg() {
        return this.IlIlB;
    }

    @Override
    public void IlIlB(int n) {
        this.IlIlB = n;
    }

    private int IlIlq() {
        long l = b ^ 0x298711EE6749L;
        String string = IlIlJH.IlIlw();
        int n = this.IlIlK();
        if (string == null) {
            if (n != 0) {
                return this.IlIlf();
            }
            n = -1;
        }
        return n;
    }

    private void IlIli(int n) {
        long l = b ^ 0x2BC16E72824L;
        String string = IlIlJH.IlIlw();
        boolean bl = n;
        if (string == null) {
            bl = !bl;
        }
        this.IlIla(bl);
        if (n != -1) {
            this.IlIlJ(n);
        }
    }
}

