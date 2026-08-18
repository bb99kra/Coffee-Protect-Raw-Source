/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Optional;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlFo
extends PacketWrapper<IlIlFo> {
    private byte @Nullable [] IlIlB;
    private UUID IlIlo;
    private byte[] IlIlp;
    private byte[] IlIlJ;
    private static transient /* synthetic */ String gKwKEgzOjR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlFo(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlFo(byte @Nullable [] byArray, UUID uUID, byte[] byArray2, byte[] byArray3) {
        super(IlIlAG.PLAYER_CHAT_HEADER);
        this.IlIlB = byArray;
        this.IlIlo = uUID;
        this.IlIlp = byArray2;
        this.IlIlJ = byArray3;
    }

    @Override
    public void IlIle() {
        this.IlIlB = (byte[])this.IlIlN(PacketWrapper::IlIll);
        this.IlIlo = this.IlIlv();
        this.IlIlp = this.IlIll();
        this.IlIlJ = this.IlIll();
    }

    @Override
    public void IlIlJ() {
        this.IlIlI(this.IlIlB, PacketWrapper::IlIlU);
        this.IlIlc(this.IlIlo);
        this.IlIlU(this.IlIlp);
        this.IlIlU(this.IlIlJ);
    }

    public void IlIlV(IlIlFo ilIlFo) {
        this.IlIlB = ilIlFo.IlIlB;
        this.IlIlo = ilIlFo.IlIlo;
        this.IlIlp = ilIlFo.IlIlp;
        this.IlIlJ = ilIlFo.IlIlJ;
    }

    public Optional<byte[]> IlIlK() {
        return Optional.ofNullable(this.IlIlB);
    }

    public void IlIlY(byte @Nullable [] byArray) {
        this.IlIlB = byArray;
    }

    public UUID IlIlG() {
        return this.IlIlo;
    }

    public void IlIlm(UUID uUID) {
        this.IlIlo = uUID;
    }

    public byte[] IlIlD() {
        return this.IlIlp;
    }

    public void IlIlx(byte[] byArray) {
        this.IlIlp = byArray;
    }

    public byte[] IlIlg() {
        return this.IlIlJ;
    }

    public void IlIlh(byte[] byArray) {
        this.IlIlJ = byArray;
    }
}

