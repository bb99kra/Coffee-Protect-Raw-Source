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
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class IlIlFl
extends PacketWrapper<IlIlFl> {
    private int IlIlo;
    private double IlIly;
    private double IlIlm;
    private double IlIlT;
    private short IlIlp;
    private static final long b = IlIls.a(7954329323146821095L, -2717841519529925860L, MethodHandles.lookup().lookupClass()).a(17606432033079L);
    private static transient /* synthetic */ String hJidhcpASW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFl(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFl(int n, double d, double d2, double d3, short s) {
        super(IlIlAG.SPAWN_EXPERIENCE_ORB);
        this.IlIlo = n;
        this.IlIly = d;
        this.IlIlm = d2;
        this.IlIlT = d3;
        this.IlIlp = s;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlFl ilIlFl;
                block3: {
                    long l = b ^ 0x17BAA77F2AB2L;
                    this.IlIlo = this.IlIlf();
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlFl = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlFl.IlIlg.IlIlz(ServerVersion.V_1_9)) break block3;
                    this.IlIly = this.IlIlb();
                    this.IlIlm = this.IlIlb();
                    this.IlIlT = this.IlIlb();
                    if (packetWrapperArray != null) break block4;
                }
                this.IlIly = (double)this.IlIlW() / 32.0;
                this.IlIlm = (double)this.IlIlW() / 32.0;
                ilIlFl = this;
            }
            ilIlFl.IlIlT = (double)this.IlIlW() / 32.0;
        }
        this.IlIlp = this.IlIlG();
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlFl ilIlFl;
            block2: {
                block3: {
                    long l = b ^ 0xEC7DA96141AL;
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    this.IlIlJ(this.IlIlo);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlFl = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlFl.IlIlg.IlIlz(ServerVersion.V_1_9)) break block3;
                    this.IlIlY(this.IlIly);
                    this.IlIlY(this.IlIlm);
                    this.IlIlY(this.IlIlT);
                    if (packetWrapperArray2 != null) break block4;
                }
                this.IlIla(IlIlh9.IlIlK(this.IlIly * 32.0));
                this.IlIla(IlIlh9.IlIlK(this.IlIlm * 32.0));
                ilIlFl = this;
            }
            ilIlFl.IlIla(IlIlh9.IlIlK(this.IlIlT * 32.0));
        }
        this.IlIlG(this.IlIlp);
    }

    public void IlIlZ(IlIlFl ilIlFl) {
        this.IlIlo = ilIlFl.IlIlo;
        this.IlIly = ilIlFl.IlIly;
        this.IlIlm = ilIlFl.IlIlm;
        this.IlIlT = ilIlFl.IlIlT;
        this.IlIlp = ilIlFl.IlIlp;
    }

    public int IlIlQ() {
        return this.IlIlo;
    }

    public void IlIlb(int n) {
        this.IlIlo = n;
    }

    public double IlIlh() {
        return this.IlIly;
    }

    public void IlIlX(double d) {
        this.IlIly = d;
    }

    public double IlIlR() {
        return this.IlIlm;
    }

    public void IlIlK(double d) {
        this.IlIlm = d;
    }

    public double IlIlI() {
        return this.IlIlT;
    }

    public void IlIlI(double d) {
        this.IlIlT = d;
    }

    public short IlIlv() {
        return this.IlIlp;
    }

    public void IlIla(short s) {
        this.IlIlp = s;
    }
}

