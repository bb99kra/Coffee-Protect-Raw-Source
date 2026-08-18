/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlQW {
    private final int IlIll;
    private int IlIlt;
    private final boolean IlIlp;
    private final boolean IlIlI;
    private byte[] IlIlZ;
    private static transient /* synthetic */ String VLmIfAJqZR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlQW(int n, boolean bl, boolean bl2, byte[] byArray) {
        this.IlIll = n;
        this.IlIlp = bl;
        this.IlIlI = bl2;
        this.IlIlZ = byArray;
    }

    public IlIlQW(int n, int n2, boolean bl, boolean bl2, byte[] byArray) {
        this(n, bl, bl2, byArray);
        this.IlIlt = n2;
    }

    public int IlIlD() {
        return this.IlIll;
    }

    public int IlIlA() {
        return this.IlIlt;
    }

    public boolean IlIlA() {
        return this.IlIlp;
    }

    public boolean IlIlm() {
        return this.IlIlI;
    }

    public byte[] IlIlV() {
        return this.IlIlZ;
    }

    public void IlIlI(byte[] byArray) {
        this.IlIlZ = byArray;
    }
}

