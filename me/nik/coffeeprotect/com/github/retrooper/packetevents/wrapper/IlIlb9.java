/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlo6;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity.IlIlCL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity.IlIlyI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlb9
extends PacketWrapper<IlIlb9> {
    private IlIlAn IlIll;
    private IlIlCL IlIlJ;
    private NBTCompound IlIlX;
    private static final long b = IlIls.a(3397257594512042431L, -6220528877477410095L, MethodHandles.lookup().lookupClass()).a(114976111644143L);
    private static transient /* synthetic */ String JNpkTCsfFq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb9(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @Deprecated
    public IlIlb9(IlIlAn ilIlAn, IlIlo6 ilIlo6, NBTCompound nBTCompound) {
        this(ilIlAn, ilIlo6.IlIlx(), nBTCompound);
    }

    @Deprecated
    public IlIlb9(IlIlAn ilIlAn, int n, NBTCompound nBTCompound) {
        this(ilIlAn, IlIlyI.IlIlv(IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE(), n), nBTCompound);
    }

    public IlIlb9(IlIlAn ilIlAn, IlIlCL ilIlCL, NBTCompound nBTCompound) {
        super(IlIlAG.BLOCK_ENTITY_DATA);
        this.IlIll = ilIlAn;
        this.IlIlJ = ilIlCL;
        this.IlIlX = nBTCompound;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        var1_1 = IlIlb9.b ^ 97497848022069L;
        this.IlIll = this.IlIlE();
        var3_2 = IlIlFh.IlIla();
        v0 = this;
        if (var3_2 == null) ** GOTO lbl10
        if (v0.IlIlg.IlIlz(ServerVersion.V_1_18)) {
            v1 = this.IlIlf();
        } else {
            v0 = this;
lbl10:
            // 2 sources

            v1 = v0.IlIlP();
        }
        var4_3 = v1;
        this.IlIlJ = IlIlyI.IlIlv(this.IlIlg.IlIlE(), var4_3);
        this.IlIlX = this.IlIlS();
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlb9 ilIlb9;
            int n;
            block2: {
                block3: {
                    long l = b ^ 0x41D101703A9DL;
                    this.IlIlh(this.IlIll);
                    n = this.IlIlJ.IlIlH(this.IlIlg.IlIlE());
                    PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
                    ilIlb9 = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlb9.IlIlg.IlIlz(ServerVersion.V_1_18)) break block3;
                    this.IlIlJ(n);
                    if (packetWrapperArray != null) break block4;
                }
                ilIlb9 = this;
            }
            ilIlb9.IlIlu(n);
        }
        this.IlIlc(this.IlIlX);
    }

    public void IlIlx(IlIlb9 ilIlb9) {
        this.IlIll = ilIlb9.IlIll;
        this.IlIlJ = ilIlb9.IlIlJ;
        this.IlIlX = ilIlb9.IlIlX;
    }

    public IlIlAn IlIlK() {
        return this.IlIll;
    }

    @Override
    public void IlIlB(IlIlAn ilIlAn) {
        this.IlIll = ilIlAn;
    }

    @Deprecated
    public int IlIlV() {
        return this.IlIlJ.IlIlH(this.IlIlg.IlIlE());
    }

    public IlIlCL IlIlK() {
        return this.IlIlJ;
    }

    @Deprecated
    public IlIlo6 IlIlh() {
        return IlIlo6.IlIlY(this.IlIlV());
    }

    @Deprecated
    public void IlIlV(int n) {
        this.IlIlI(IlIlyI.IlIlv(this.IlIlg.IlIlE(), n));
    }

    public void IlIlI(IlIlCL ilIlCL) {
        this.IlIlJ = ilIlCL;
    }

    @Deprecated
    public void IlIlX(IlIlo6 ilIlo6) {
        this.IlIlV(ilIlo6.IlIlx());
    }

    @Override
    public NBTCompound IlIlx() {
        return this.IlIlX;
    }

    public void IlIl_(NBTCompound nBTCompound) {
        this.IlIlX = nBTCompound;
    }
}

