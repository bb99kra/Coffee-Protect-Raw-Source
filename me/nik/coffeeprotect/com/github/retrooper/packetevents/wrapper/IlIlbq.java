/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbq
extends PacketWrapper<IlIlbq> {
    private int IlIlt;
    private IlIlAn IlIlY;
    private byte IlIlN;
    private static final long b = IlIls.a(-8134874350185090897L, 6062466982296223620L, MethodHandles.lookup().lookupClass()).a(84896658469978L);
    private static transient /* synthetic */ String mdzKlMdYsX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbq(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbq(int n, IlIlAn ilIlAn, byte by) {
        super(IlIlAG.BLOCK_BREAK_ANIMATION);
        this.IlIlt = n;
        this.IlIlY = ilIlAn;
        this.IlIlN = by;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlbq ilIlbq;
                block3: {
                    long l = b ^ 0x269DCB9D9642L;
                    this.IlIlt = this.IlIlf();
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlbq = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlbq.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block3;
                    int n = this.IlIlW();
                    int n2 = this.IlIlW();
                    int n3 = this.IlIlW();
                    this.IlIlY = new IlIlAn(n, n2, n3);
                    if (packetWrapperArray != null) break block4;
                }
                ilIlbq = this;
            }
            ilIlbq.IlIlY = this.IlIlE();
        }
        this.IlIlN = (byte)this.IlIlP();
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlbq ilIlbq;
            block2: {
                block3: {
                    long l = b ^ 0x3FE0B674A8EAL;
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    this.IlIlJ(this.IlIlt);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlbq = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlbq.IlIlg.IlIlS(ServerVersion.V_1_7_10)) break block3;
                    this.IlIla(this.IlIlY.IlIlj);
                    this.IlIla(this.IlIlY.IlIlw);
                    this.IlIla(this.IlIlY.IlIlk);
                    if (packetWrapperArray2 != null) break block4;
                }
                ilIlbq = this;
            }
            ilIlbq.IlIlh(this.IlIlY);
        }
        this.IlIlu(this.IlIlN);
    }

    public void IlIlM(IlIlbq ilIlbq) {
        this.IlIlt = ilIlbq.IlIlt;
        this.IlIlY = ilIlbq.IlIlY;
        this.IlIlN = ilIlbq.IlIlN;
    }

    public int IlIlI() {
        return this.IlIlt;
    }

    public void IlIl_(int n) {
        this.IlIlt = n;
    }

    public IlIlAn IlIls() {
        return this.IlIlY;
    }

    public void IlIlM(IlIlAn ilIlAn) {
        this.IlIlY = ilIlAn;
    }

    public byte IlIlO() {
        return this.IlIlN;
    }

    public void IlIl_(byte by) {
        this.IlIlN = by;
    }
}

