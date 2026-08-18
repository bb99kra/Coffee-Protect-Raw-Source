/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlJI
extends PacketWrapper<IlIlJI> {
    private IlIlAn IlIlv;
    private int IlIlJ;
    private boolean IlIlx;
    private static transient /* synthetic */ String onCoEnWRve = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJI(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJI(IlIlAn ilIlAn, int n, boolean bl) {
        super(IlIlnN.GENERATE_STRUCTURE);
        this.IlIlv = ilIlAn;
        this.IlIlJ = n;
        this.IlIlx = bl;
    }

    @Override
    public void IlIle() {
        this.IlIlv = new IlIlAn(this.IlIli(), this.IlIlg);
        this.IlIlJ = this.IlIlf();
        this.IlIlx = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        this.IlIlP(this.IlIlv.IlIlb(this.IlIlg));
        this.IlIlJ(this.IlIlJ);
        this.IlIla(this.IlIlx);
    }

    public void IlIlh(IlIlJI ilIlJI) {
        this.IlIlv = ilIlJI.IlIlv;
        this.IlIlJ = ilIlJI.IlIlJ;
        this.IlIlx = ilIlJI.IlIlx;
    }

    public IlIlAn IlIlH() {
        return this.IlIlv;
    }

    public void IlIlu(IlIlAn ilIlAn) {
        this.IlIlv = ilIlAn;
    }

    public int IlIlS() {
        return this.IlIlJ;
    }

    public void IlIlO(int n) {
        this.IlIlJ = n;
    }

    public boolean IlIle() {
        return this.IlIlx;
    }

    public void IlIlQ(boolean bl) {
        this.IlIlx = bl;
    }
}

