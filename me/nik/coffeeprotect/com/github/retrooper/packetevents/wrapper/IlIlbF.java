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

public class IlIlbF
extends PacketWrapper<IlIlbF> {
    private long IlIlC;
    private static final long b = IlIls.a(-649928335610195459L, -8564614338333168752L, MethodHandles.lookup().lookupClass()).a(75041876348856L);
    private static transient /* synthetic */ String kFDLqcVPfq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbF(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbF(long l) {
        super(IlIlnN.KEEP_ALIVE);
        this.IlIlC = l;
    }

    @Override
    public void IlIle() {
        block4: {
            block5: {
                IlIlbF ilIlbF;
                block6: {
                    boolean bl;
                    String string;
                    block2: {
                        block3: {
                            long l = b ^ 0x3CFE38EBF1EBL;
                            string = IlIlJH.IlIlw();
                            bl = this.IlIlg.IlIlz(ServerVersion.V_1_12_2);
                            if (string != null) break block2;
                            if (!bl) break block3;
                            this.IlIlC = this.IlIli();
                            if (string == null) break block4;
                        }
                        ilIlbF = this;
                        if (string != null) break block5;
                        bl = ilIlbF.IlIlg.IlIlz(ServerVersion.V_1_8);
                    }
                    if (!bl) break block6;
                    this.IlIlC = this.IlIlf();
                    if (string == null) break block4;
                }
                ilIlbF = this;
            }
            ilIlbF.IlIlC = this.IlIlW();
        }
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlbF ilIlbF;
            block5: {
                block6: {
                    boolean bl;
                    String string;
                    block2: {
                        block3: {
                            long l = b ^ 0x25834502CF43L;
                            string = IlIlJH.IlIlw();
                            bl = this.IlIlg.IlIlz(ServerVersion.V_1_12_2);
                            if (string != null) break block2;
                            if (!bl) break block3;
                            this.IlIlP(this.IlIlC);
                            if (string == null) break block4;
                        }
                        ilIlbF = this;
                        if (string != null) break block5;
                        bl = ilIlbF.IlIlg.IlIlz(ServerVersion.V_1_8);
                    }
                    if (!bl) break block6;
                    this.IlIlJ((int)this.IlIlC);
                    if (string == null) break block4;
                }
                ilIlbF = this;
            }
            ilIlbF.IlIla((int)this.IlIlC);
        }
    }

    public void IlIlS(IlIlbF ilIlbF) {
        this.IlIlC = ilIlbF.IlIlC;
    }

    public long IlIls() {
        return this.IlIlC;
    }

    public void IlIlp(long l) {
        this.IlIlC = l;
    }
}

