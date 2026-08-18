/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIloS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlJ_
extends PacketWrapper<IlIlJ_> {
    private IlIloS IlIlu;
    @Nullable
    private String IlIlf;
    private static final long b = IlIls.a(2501797095912831227L, 7248829391743829377L, MethodHandles.lookup().lookupClass()).a(65007763077098L);
    private static transient /* synthetic */ String FOccXwKLrG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ_(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJ_(IlIloS ilIloS, @Nullable String string) {
        super(IlIlnN.ADVANCEMENT_TAB);
        this.IlIlu = ilIloS;
        this.IlIlf = string;
    }

    @Override
    public void IlIle() {
        block3: {
            block2: {
                long l = b ^ 0x1C9EACC96AD6L;
                this.IlIlu = IlIloS.IlIlj(this.IlIlf());
                String string = IlIlJH.IlIlw();
                IlIlJ_ ilIlJ_ = this;
                if (string != null) break block2;
                if (ilIlJ_.IlIlu != IlIloS.OPENED_TAB) break block3;
                ilIlJ_ = this;
            }
            ilIlJ_.IlIlf = this.IlIli();
        }
    }

    public void IlIlc(IlIlJ_ ilIlJ_) {
        this.IlIlu = ilIlJ_.IlIlu;
        this.IlIlf = ilIlJ_.IlIlf;
    }

    @Override
    public void IlIlJ() {
        block3: {
            IlIlJ_ ilIlJ_;
            block2: {
                long l = b ^ 0x5E3D120547EL;
                String string = IlIlJH.IlIlw();
                this.IlIlJ(this.IlIlu.ordinal());
                String string2 = string;
                ilIlJ_ = this;
                if (string2 != null) break block2;
                if (ilIlJ_.IlIlu != IlIloS.OPENED_TAB) break block3;
                ilIlJ_ = this;
            }
            ilIlJ_.IlIlM(this.IlIlf);
        }
    }

    public IlIloS IlIlj() {
        return this.IlIlu;
    }

    public void IlIlC(IlIloS ilIloS) {
        this.IlIlu = ilIloS;
    }

    public Optional<String> IlIlQ() {
        return Optional.ofNullable(this.IlIlf);
    }

    public void IlIlF(String string) {
        this.IlIlf = string;
    }
}

