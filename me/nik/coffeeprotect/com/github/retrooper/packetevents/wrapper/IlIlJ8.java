/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlvE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJ8
extends PacketWrapper<IlIlJ8> {
    private IlIlvE IlIlY;
    private int IlIll;
    private static final long b = IlIls.a(-2137856107838399271L, -5371465920437507787L, MethodHandles.lookup().lookupClass()).a(236660800996294L);
    private static transient /* synthetic */ String VQEpIuWhJu = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ8(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJ8(IlIlvE ilIlvE) {
        super(IlIlnN.CHAT_ACK);
        this.IlIlY = ilIlvE;
    }

    public IlIlJ8(int n) {
        super(IlIlnN.CHAT_ACK);
        this.IlIll = n;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlJ8 ilIlJ8;
                block3: {
                    long l = b ^ 0x1FE28E46F162L;
                    String string = IlIlJH.IlIlw();
                    ilIlJ8 = this;
                    if (string != null) break block2;
                    if (!ilIlJ8.IlIlg.IlIlz(ServerVersion.V_1_19_3)) break block3;
                    this.IlIll = this.IlIlf();
                    if (string == null) break block4;
                }
                ilIlJ8 = this;
            }
            ilIlJ8.IlIlY = this.IlIle();
        }
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlJ8 ilIlJ8;
            block2: {
                block3: {
                    long l = b ^ 0x69FF3AFCFCAL;
                    String string = IlIlJH.IlIlw();
                    ilIlJ8 = this;
                    if (string != null) break block2;
                    if (!ilIlJ8.IlIlg.IlIlz(ServerVersion.V_1_19_3)) break block3;
                    this.IlIlJ(this.IlIll);
                    if (string == null) break block4;
                }
                ilIlJ8 = this;
            }
            ilIlJ8.IlIlh(this.IlIlY);
        }
    }

    public void IlIlb(IlIlJ8 ilIlJ8) {
        this.IlIlY = ilIlJ8.IlIlY;
        this.IlIll = ilIlJ8.IlIll;
    }

    public int IlIlj() {
        return this.IlIll;
    }

    public void IlIlf(int n) {
        this.IlIll = n;
    }

    public IlIlvE IlIlK() {
        return this.IlIlY;
    }

    public void IlIlO(IlIlvE ilIlvE) {
        this.IlIlY = ilIlvE;
    }
}

