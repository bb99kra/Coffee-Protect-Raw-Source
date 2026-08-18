/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.IlIlQL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.IlIlXx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlFu
extends PacketWrapper<IlIlFu> {
    private int IlIlM;
    private IlIlQL IlIln;
    private static final long b = IlIls.a(-1133505491477535749L, -9178148373309585364L, MethodHandles.lookup().lookupClass()).a(4243553952877L);
    private static transient /* synthetic */ String bkclWJRrHy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFu(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFu(int n, IlIlQL ilIlQL) {
        super(IlIlAG.REMOVE_ENTITY_EFFECT);
        this.IlIlM = n;
        this.IlIln = ilIlQL;
    }

    @Override
    public void IlIle() {
        int n;
        block4: {
            int n2;
            block2: {
                block3: {
                    long l = b ^ 0x1ED0D0D3D992L;
                    this.IlIlM = this.IlIlf();
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    n2 = this.IlIlg.IlIlz(ServerVersion.V_1_18_2);
                    if (packetWrapperArray == null) break block2;
                    if (n2 == 0) break block3;
                    n = this.IlIlf();
                    if (packetWrapperArray != null) break block4;
                }
                n2 = this.IlIlE();
            }
            n = n2;
        }
        this.IlIln = IlIlXx.IlIlz(n, this.IlIlg);
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlFu ilIlFu;
            block2: {
                block3: {
                    long l = b ^ 0x7ADAD3AE73AL;
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    this.IlIlJ(this.IlIlM);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlFu = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlFu.IlIlg.IlIlz(ServerVersion.V_1_18_2)) break block3;
                    this.IlIlJ(this.IlIln.IlIlH(this.IlIlg.IlIlE()));
                    if (packetWrapperArray2 != null) break block4;
                }
                ilIlFu = this;
            }
            ilIlFu.IlIlu(this.IlIln.IlIlH(this.IlIlg.IlIlE()));
        }
    }

    public void IlIla(IlIlFu ilIlFu) {
        this.IlIlM = ilIlFu.IlIlM;
        this.IlIln = ilIlFu.IlIln;
    }

    public int IlIlU() {
        return this.IlIlM;
    }

    public void IlIlc(int n) {
        this.IlIlM = n;
    }

    public IlIlQL IlIlI() {
        return this.IlIln;
    }

    public void IlIlN(IlIlQL ilIlQL) {
        this.IlIln = ilIlQL;
    }
}

