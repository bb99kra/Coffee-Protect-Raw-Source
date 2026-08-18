/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlfx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJW
extends PacketWrapper<IlIlJW> {
    private IlIlfx IlIls;
    private static final long b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a(1359581677393010607L, 2889836139784056508L, MethodHandles.lookup().lookupClass()).a(253141520132532L);
    private static transient /* synthetic */ String nGqKGxwKTq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJW(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJW(IlIlfx ilIlfx) {
        super(IlIlnN.ANIMATION);
        this.IlIls = ilIlfx;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlJW ilIlJW;
                block3: {
                    long l = b ^ 0x1C08488FEDC4L;
                    String string = IlIlJH.IlIlw();
                    ilIlJW = this;
                    if (string != null) break block2;
                    if (!ilIlJW.IlIlg.IlIlz(ServerVersion.V_1_9)) break block3;
                    this.IlIls = IlIlfx.IlIlH(this.IlIlf());
                    if (string == null) break block4;
                }
                ilIlJW = this;
            }
            ilIlJW.IlIls = IlIlfx.MAIN_HAND;
        }
    }

    public void IlIlK(IlIlJW ilIlJW) {
        this.IlIls = ilIlJW.IlIls;
    }

    @Override
    public void IlIlJ() {
        block3: {
            IlIlJW ilIlJW;
            block2: {
                long l = b ^ 0x5753566D36CL;
                String string = IlIlJH.IlIlw();
                ilIlJW = this;
                if (string != null) break block2;
                if (!ilIlJW.IlIlg.IlIlz(ServerVersion.V_1_9)) break block3;
                ilIlJW = this;
            }
            ilIlJW.IlIlJ(this.IlIls.IlIlr());
        }
    }

    public IlIlfx IlIlk() {
        return this.IlIls;
    }

    public void IlIlk(IlIlfx ilIlfx) {
        this.IlIls = ilIlfx;
    }
}

