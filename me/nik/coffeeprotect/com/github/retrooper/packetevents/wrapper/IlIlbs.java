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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlbs
extends PacketWrapper<IlIlbs> {
    private int IlIlb;
    private int IlIlO;
    private boolean IlIlu;
    private static final long b = IlIls.a(3802116460486184672L, -5221222058175580115L, MethodHandles.lookup().lookupClass()).a(110953846149053L);
    private static transient /* synthetic */ String OjZSCHqtlJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbs(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbs(int n, int n2, boolean bl) {
        super(IlIlnN.SLOT_STATE_CHANGE);
        this.IlIlb = n;
        this.IlIlO = n2;
        this.IlIlu = bl;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        var1_1 = IlIlbs.b ^ 121789242053893L;
        this.IlIlb = this.IlIlf();
        var3_2 = IlIlJH.IlIlw();
        v0 = this;
        if (var3_2 != null) ** GOTO lbl10
        if (v0.IlIlg.IlIlz(ServerVersion.V_1_21_2)) {
            v1 = this.IlIle();
        } else {
            v0 = this;
lbl10:
            // 2 sources

            v1 = v0.IlIlf();
        }
        this.IlIlO = v1;
        this.IlIlu = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlbs ilIlbs;
            block2: {
                block3: {
                    long l = b ^ 0x77B9396BABADL;
                    String string = IlIlJH.IlIlw();
                    this.IlIlJ(this.IlIlb);
                    String string2 = string;
                    ilIlbs = this;
                    if (string2 != null) break block2;
                    if (!ilIlbs.IlIlg.IlIlz(ServerVersion.V_1_21_2)) break block3;
                    this.IlIlr(this.IlIlO);
                    if (string2 == null) break block4;
                }
                ilIlbs = this;
            }
            ilIlbs.IlIlJ(this.IlIlO);
        }
        this.IlIla(this.IlIlu);
    }

    public void IlIlH(IlIlbs ilIlbs) {
        this.IlIlb = ilIlbs.IlIlb;
        this.IlIlO = ilIlbs.IlIlO;
        this.IlIlu = ilIlbs.IlIlu;
    }

    public int IlIlz() {
        return this.IlIlb;
    }

    public void IlIlN(int n) {
        this.IlIlb = n;
    }

    public int IlIlE() {
        return this.IlIlO;
    }

    public void IlIlf(int n) {
        this.IlIlO = n;
    }

    public boolean IlIlE() {
        return this.IlIlu;
    }

    public void IlIlu(boolean bl) {
        this.IlIlu = bl;
    }
}

