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

public class IlIlFU
extends PacketWrapper<IlIlFU> {
    private float IlIla;
    private int IlIlb;
    private float IlIlh;
    private static final long b = IlIls.a(-2144960714857006617L, 9114745197381687577L, MethodHandles.lookup().lookupClass()).a(268801976812792L);
    private static transient /* synthetic */ String iqNHFXVBaC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFU(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFU(float f, int n, float f2) {
        super(IlIlAG.UPDATE_HEALTH);
        this.IlIla = f;
        this.IlIlb = n;
        this.IlIlh = f2;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlFU ilIlFU;
                block3: {
                    long l = b ^ 0x65F37B3C9198L;
                    this.IlIla = this.IlIlX();
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlFU = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlFU.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block3;
                    this.IlIlb = this.IlIlG();
                    if (packetWrapperArray != null) break block4;
                }
                ilIlFU = this;
            }
            ilIlFU.IlIlb = this.IlIlf();
        }
        this.IlIlh = this.IlIlX();
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlFU ilIlFU;
            block2: {
                block3: {
                    long l = b ^ 0x7C8E06D5AF30L;
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    this.IlIlR(this.IlIla);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlFU = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlFU.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block3;
                    this.IlIlG(this.IlIlb);
                    if (packetWrapperArray2 != null) break block4;
                }
                ilIlFU = this;
            }
            ilIlFU.IlIlJ(this.IlIlb);
        }
        this.IlIlR(this.IlIlh);
    }

    public void IlIlP(IlIlFU ilIlFU) {
        this.IlIla = ilIlFU.IlIla;
        this.IlIlb = ilIlFU.IlIlb;
        this.IlIlh = ilIlFU.IlIlh;
    }

    public float IlIlt() {
        return this.IlIla;
    }

    public void IlIlb(float f) {
        this.IlIla = f;
    }

    public int IlIlV() {
        return this.IlIlb;
    }

    public void IlIlP(int n) {
        this.IlIlb = n;
    }

    public float IlIlI() {
        return this.IlIlh;
    }

    public void IlIlk(float f) {
        this.IlIlh = f;
    }
}

