/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlh9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFW
extends PacketWrapper<IlIlFW> {
    private int IlIld;
    private byte IlIlo;
    private double IlIlu;
    private double IlIlE;
    private double IlIln;
    private static final long b = IlIls.a(3405179736477782648L, 2044165443473905924L, MethodHandles.lookup().lookupClass()).a(206545745928493L);
    private static transient /* synthetic */ String owFnljWKtU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFW(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFW(int n, byte by, double d, double d2, double d3) {
        super(IlIlAG.SPAWN_WEATHER_ENTITY);
        this.IlIld = n;
        this.IlIlo = by;
        this.IlIlu = d;
        this.IlIlE = d2;
        this.IlIln = d3;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlFW ilIlFW;
                block3: {
                    long l = b ^ 0x1A3DA87D8400L;
                    this.IlIld = this.IlIlf();
                    this.IlIlo = this.IlIlE();
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlFW = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlFW.IlIlg.IlIlz(ServerVersion.V_1_9)) break block3;
                    this.IlIlu = this.IlIlb();
                    this.IlIlE = this.IlIlb();
                    this.IlIln = this.IlIlb();
                    if (packetWrapperArray != null) break block4;
                }
                this.IlIlu = (double)this.IlIlW() / 32.0;
                this.IlIlE = (double)this.IlIlW() / 32.0;
                ilIlFW = this;
            }
            ilIlFW.IlIln = (double)this.IlIlW() / 32.0;
        }
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlFW ilIlFW;
            block2: {
                block3: {
                    long l = b ^ 0x340D594BAA8L;
                    this.IlIlJ(this.IlIld);
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    this.IlIlu(this.IlIlo);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlFW = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlFW.IlIlg.IlIlz(ServerVersion.V_1_9)) break block3;
                    this.IlIlY(this.IlIlu);
                    this.IlIlY(this.IlIlE);
                    this.IlIlY(this.IlIln);
                    if (packetWrapperArray2 != null) break block4;
                }
                this.IlIla(IlIlh9.IlIlK(this.IlIlu * 32.0));
                this.IlIla(IlIlh9.IlIlK(this.IlIlE * 32.0));
                ilIlFW = this;
            }
            ilIlFW.IlIla(IlIlh9.IlIlK(this.IlIln * 32.0));
        }
    }

    public void IlIlK(IlIlFW ilIlFW) {
        this.IlIld = ilIlFW.IlIld;
    }

    public int IlIln() {
        return this.IlIld;
    }

    public void IlIlF(int n) {
        this.IlIld = n;
    }

    public byte IlIlW() {
        return this.IlIlo;
    }

    public void IlIle(byte by) {
        this.IlIlo = by;
    }

    public double IlIll() {
        return this.IlIlu;
    }

    public void IlIlW(double d) {
        this.IlIlu = d;
    }

    public double IlIlp() {
        return this.IlIlE;
    }

    public void IlIlT(double d) {
        this.IlIlE = d;
    }

    public double IlIlc() {
        return this.IlIln;
    }

    public void IlIly(double d) {
        this.IlIln = d;
    }
}

