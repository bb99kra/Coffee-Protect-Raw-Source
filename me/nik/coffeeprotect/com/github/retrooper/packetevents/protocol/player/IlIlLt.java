/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player;

import java.security.PublicKey;
import java.time.Instant;

public class IlIlLt {
    private final Instant IlIlX;
    private final PublicKey IlIls;
    private final byte[] IlIlB;
    private static transient /* synthetic */ String scuHJEDMRp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlLt(Instant instant, PublicKey publicKey, byte[] byArray) {
        this.IlIlX = instant;
        this.IlIls = publicKey;
        this.IlIlB = byArray;
    }

    public Instant IlIlN() {
        return this.IlIlX;
    }

    public PublicKey IlIlk() {
        return this.IlIls;
    }

    public byte[] IlIlH() {
        return this.IlIlB;
    }

    public boolean IlIlV() {
        return this.IlIlX.isBefore(Instant.now());
    }
}

