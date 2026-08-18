/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlfd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlb7
extends PacketWrapper<IlIlb7> {
    private IlIlfd IlIlM;
    private static final long b = IlIls.a(-5652759534376067517L, 5788034843586504021L, MethodHandles.lookup().lookupClass()).a(147766684346107L);
    private static transient /* synthetic */ String uMHacIFsTA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb7(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlb7(IlIlfd ilIlfd) {
        super(IlIlnN.SET_DIFFICULTY);
        this.IlIlM = ilIlfd;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlb7 ilIlb7;
                block3: {
                    long l = b ^ 0x700D6311E5CAL;
                    String string = IlIlJH.IlIlw();
                    ilIlb7 = this;
                    if (string != null) break block2;
                    if (!ilIlb7.IlIlg.IlIlz(ServerVersion.V_1_21_6)) break block3;
                    this.IlIlM = this.IlIly(IlIlfd.class);
                    if (string == null) break block4;
                }
                ilIlb7 = this;
            }
            ilIlb7.IlIlM = IlIlfd.IlIlB(this.IlIlP());
        }
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlb7 ilIlb7;
            block2: {
                block3: {
                    long l = b ^ 0x69701EF8DB62L;
                    String string = IlIlJH.IlIlw();
                    ilIlb7 = this;
                    if (string != null) break block2;
                    if (!ilIlb7.IlIlg.IlIlz(ServerVersion.V_1_21_6)) break block3;
                    this.IlIlw(this.IlIlM);
                    if (string == null) break block4;
                }
                ilIlb7 = this;
            }
            ilIlb7.IlIlu(this.IlIlM.IlIlM());
        }
    }

    public void IlIlZ(IlIlb7 ilIlb7) {
        this.IlIlM = ilIlb7.IlIlM;
    }

    public IlIlfd IlIlt() {
        return this.IlIlM;
    }

    public void IlIlv(IlIlfd ilIlfd) {
        this.IlIlM = ilIlfd;
    }
}

