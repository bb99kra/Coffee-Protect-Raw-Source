/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlb2
extends PacketWrapper<IlIlb2> {
    private int IlIlz;
    private int IlIlA;
    private boolean IlIlf;
    private static final long b = IlIls.a(6163871611484386296L, 7954590781712370816L, MethodHandles.lookup().lookupClass()).a(81302117223064L);
    private static transient /* synthetic */ String kpxkAdDmDU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb2(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlb2(int n, int n2, boolean bl) {
        super(IlIlAG.ATTACH_ENTITY);
        this.IlIlz = n;
        this.IlIlA = n2;
        this.IlIlf = bl;
    }

    @Override
    public void IlIle() {
        block6: {
            block4: {
                IlIlb2 ilIlb2;
                block5: {
                    long l = b ^ 0x4560BAB5E83FL;
                    this.IlIlz = this.IlIlW();
                    this.IlIlA = this.IlIlW();
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlb2 = this;
                    if (packetWrapperArray == null) break block4;
                    if (!ilIlb2.IlIlg.IlIlS(ServerVersion.V_1_8_8)) break block5;
                    short s = this.IlIlP();
                    if (packetWrapperArray != null) {
                        this.IlIlf = s == 1 ? (short)1 : 0;
                        s = (short)(this.IlIlf ? 1 : 0);
                    }
                    if (packetWrapperArray != null) break block6;
                }
                ilIlb2 = this;
            }
            ilIlb2.IlIlf = true;
        }
    }

    @Override
    public void IlIlJ() {
        block5: {
            IlIlb2 ilIlb2;
            PacketWrapper[] packetWrapperArray;
            block4: {
                long l = b ^ 0x5C1DC75CD697L;
                PacketWrapper[] packetWrapperArray2 = IlIlFh.IlIla();
                this.IlIla(this.IlIlz);
                packetWrapperArray = packetWrapperArray2;
                this.IlIla(this.IlIlA);
                ilIlb2 = this;
                if (packetWrapperArray == null) break block4;
                if (!ilIlb2.IlIlg.IlIlS(ServerVersion.V_1_8_8)) break block5;
                ilIlb2 = this;
            }
            int n = this.IlIlf;
            if (packetWrapperArray != null) {
                n = n != 0 ? 1 : 0;
            }
            ilIlb2.IlIlu(n);
        }
    }

    public void IlIlD(IlIlb2 ilIlb2) {
        this.IlIlz = ilIlb2.IlIlz;
        this.IlIlA = ilIlb2.IlIlA;
        this.IlIlf = ilIlb2.IlIlf;
    }

    public int IlIlO() {
        return this.IlIlz;
    }

    public void IlIlv(int n) {
        this.IlIlz = n;
    }

    public int IlIlm() {
        return this.IlIlA;
    }

    public void IlIlX(int n) {
        this.IlIlA = n;
    }

    public boolean IlIlA() {
        return this.IlIlf;
    }

    public void IlIlG(boolean bl) {
        this.IlIlf = bl;
    }
}

