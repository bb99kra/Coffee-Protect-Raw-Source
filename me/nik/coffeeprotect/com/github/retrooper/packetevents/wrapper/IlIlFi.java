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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlFi
extends PacketWrapper<IlIlFi> {
    private int IlIlL;
    private IlIlAn IlIlA;
    private static final long b = IlIls.a(-5602598538376486318L, 1913397627085454772L, MethodHandles.lookup().lookupClass()).a(219217294271659L);
    private static transient /* synthetic */ String YkUJGcAzcQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFi(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFi(int n, IlIlAn ilIlAn) {
        super(IlIlAG.USE_BED);
        this.IlIlL = n;
        this.IlIlA = ilIlAn;
    }

    @Override
    public void IlIle() {
        block4: {
            int n;
            block2: {
                block3: {
                    long l = b ^ 0x40A90B2DCC26L;
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    n = this.IlIlg.IlIlz(ServerVersion.V_1_8);
                    if (packetWrapperArray == null) break block2;
                    if (n == 0) break block3;
                    this.IlIlL = this.IlIlf();
                    this.IlIlA = this.IlIlE();
                    if (packetWrapperArray != null) break block4;
                }
                this.IlIlL = this.IlIlW();
                n = this.IlIlW();
            }
            int n2 = n;
            short s = this.IlIlP();
            int n3 = this.IlIlW();
            this.IlIlA = new IlIlAn(n2, s, n3);
        }
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlFi ilIlFi;
            block2: {
                block3: {
                    long l = b ^ 0x59D476C4F28EL;
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlFi = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlFi.IlIlg.IlIlz(ServerVersion.V_1_8)) break block3;
                    this.IlIlJ(this.IlIlL);
                    this.IlIlh(this.IlIlA);
                    if (packetWrapperArray != null) break block4;
                }
                this.IlIla(this.IlIlL);
                this.IlIla(this.IlIlA.IlIlw());
                this.IlIlu(this.IlIlA.IlIlc());
                ilIlFi = this;
            }
            ilIlFi.IlIla(this.IlIlA.IlIlk());
        }
    }

    public void IlIll(IlIlFi ilIlFi) {
        ilIlFi.IlIlL = this.IlIlL;
        ilIlFi.IlIlA = this.IlIlA;
    }

    public int IlIlo() {
        return this.IlIlL;
    }

    public void IlIlS(int n) {
        this.IlIlL = n;
    }

    public IlIlAn IlIlJ() {
        return this.IlIlA;
    }

    public void IlIlz(IlIlAn ilIlAn) {
        this.IlIlA = ilIlAn;
    }
}

