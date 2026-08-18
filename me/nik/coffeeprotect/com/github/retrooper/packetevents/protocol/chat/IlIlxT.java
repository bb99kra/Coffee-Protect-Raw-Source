/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.time.Instant;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIljA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxl;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlxT
extends IlIlxl {
    @Nullable
    private Component IlIlo;
    private Component IlIlB;
    @Nullable
    private Component IlIlw;
    private Instant IlIlf;
    private long IlIlI;
    private byte[] IlIll;
    private static transient /* synthetic */ String mVtIwODkus = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlxT(Component component, @Nullable Component component2, IlIljA ilIljA, UUID uUID, Component component3, @Nullable Component component4, Instant instant, long l, byte[] byArray) {
        super(component, ilIljA, uUID);
        this.IlIlo = component2;
        this.IlIlB = component3;
        this.IlIlw = component4;
        this.IlIlf = instant;
        this.IlIlI = l;
        this.IlIll = byArray;
    }

    @Nullable
    public Component IlIll() {
        return this.IlIlo;
    }

    public Component IlIlF() {
        return this.IlIlB;
    }

    @Nullable
    public Component IlIlg() {
        return this.IlIlw;
    }

    public Instant IlIlH() {
        return this.IlIlf;
    }

    public long IlIlt() {
        return this.IlIlI;
    }

    public byte[] IlIlF() {
        return this.IlIll;
    }

    public void IlIlO(@Nullable Component component) {
        this.IlIlo = component;
    }

    public void IlIlE(Component component) {
        this.IlIlB = component;
    }

    public void IlIli(@Nullable Component component) {
        this.IlIlw = component;
    }

    public void IlIlo(Instant instant) {
        this.IlIlf = instant;
    }

    public void IlIlA(long l) {
        this.IlIlI = l;
    }

    public void IlIlw(byte[] byArray) {
        this.IlIll = byArray;
    }
}

