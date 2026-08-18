/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.MethodHandles;
import java.time.Instant;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlOG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIld2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIljA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlqI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlxC
extends IlIlxl {
    private String IlIlL;
    @Nullable
    private Component IlIlM;
    private IlIlOG IlIlA;
    private byte @Nullable [] IlIlj;
    private byte[] IlIlO;
    private Instant IlIld;
    private long IlIlY;
    private IlIlqI IlIlD;
    private IlIld2 IlIlF;
    private static final long a = IlIls.a(5319066692877758245L, -675264256816626723L, MethodHandles.lookup().lookupClass()).a(122811494032399L);
    private static transient /* synthetic */ String ciRnTuLLzd = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlxC(String string, Component component, @Nullable Component component2, UUID uUID, IlIlOG ilIlOG, byte @Nullable [] byArray, byte[] byArray2, Instant instant, long l, IlIlqI ilIlqI, IlIld2 ilIld2) {
        long l2 = a ^ 0x56035D0D781BL;
        super(component, ilIlOG.IlIlJ(), uUID);
        this.IlIlL = string;
        this.IlIlM = component2;
        this.IlIlA = ilIlOG;
        this.IlIlj = byArray;
        this.IlIlO = byArray2;
        this.IlIld = instant;
        this.IlIlY = l;
        this.IlIlD = ilIlqI;
        this.IlIlF = ilIld2;
        boolean bl = IlIlxw.IlIlP();
        if (PacketWrapper.IlIlz() == null) {
            IlIlxw.IlIl_(!bl);
        }
    }

    public String IlIlk() {
        return this.IlIlL;
    }

    public void IlIlJ(String string) {
        this.IlIlL = string;
    }

    public boolean IlIly() {
        long l = a ^ 0x4CC406C609D3L;
        boolean bl = IlIlxw.IlIlP();
        boolean bl2 = this.IlIlb().equals(Component.text(this.IlIlL));
        if (bl) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Nullable
    public Component IlIls() {
        return this.IlIlM;
    }

    public void IlIlZ(@Nullable Component component) {
        this.IlIlM = component;
    }

    @Override
    public IlIljA IlIlE() {
        return this.IlIlA.IlIlJ();
    }

    @Override
    public void IlIlf(IlIljA ilIljA) {
        this.IlIlA.IlIly(ilIljA);
    }

    public IlIlOG IlIlG() {
        return this.IlIlA;
    }

    public void IlIlj(IlIlOG ilIlOG) {
        this.IlIlA = ilIlOG;
    }

    @Deprecated
    public IlIlOG IlIlc() {
        return this.IlIlA;
    }

    @Deprecated
    public void IlIlc(IlIlOG ilIlOG) {
        this.IlIlA = ilIlOG;
    }

    public byte @Nullable [] IlIlM() {
        return this.IlIlj;
    }

    public void IlIlP(byte @Nullable [] byArray) {
        this.IlIlj = byArray;
    }

    public byte[] IlIlV() {
        return this.IlIlO;
    }

    public void IlIla(byte[] byArray) {
        this.IlIlO = byArray;
    }

    public Instant IlIlX() {
        return this.IlIld;
    }

    public void IlIlt(Instant instant) {
        this.IlIld = instant;
    }

    public long IlIlA() {
        return this.IlIlY;
    }

    public void IlIlg(long l) {
        this.IlIlY = l;
    }

    public IlIlqI IlIlg() {
        return this.IlIlD;
    }

    public void IlIl_(IlIlqI ilIlqI) {
        this.IlIlD = ilIlqI;
    }

    public IlIld2 IlIln() {
        return this.IlIlF;
    }

    public void IlIlr(IlIld2 ilIld2) {
        this.IlIlF = ilIld2;
    }
}

