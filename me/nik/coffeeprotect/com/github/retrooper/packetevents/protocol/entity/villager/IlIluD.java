/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.IlIlxz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession.IlIlXj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession.IlIldl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.type.IlIlWw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.type.IlIly2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIluD {
    private IlIlWw IlIll;
    private IlIlXj IlIln;
    private int IlIlp;
    private static String[] IlIlu;
    private static final long a;
    private static transient /* synthetic */ String JAPLRGYSgJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIluD(IlIlWw ilIlWw, IlIlXj ilIlXj, IlIlxz ilIlxz) {
        this(ilIlWw, ilIlXj, ilIlxz.IlIla());
    }

    public IlIluD(IlIlWw ilIlWw, IlIlXj ilIlXj, int n) {
        long l = a ^ 0x239965961136L;
        String[] stringArray = IlIluD.IlIlI();
        this.IlIll = ilIlWw;
        String[] stringArray2 = stringArray;
        this.IlIln = ilIlXj;
        this.IlIlp = n;
        if (stringArray2 != null) {
            PacketWrapper.IlIle(new int[3]);
        }
    }

    @Deprecated
    public IlIluD(int n, int n2, int n3) {
        long l = a ^ 0x234A709D172FL;
        this(IlIly2.IlIlY(n), IlIldl.IlIlv(n2), n3);
        String[] stringArray = IlIluD.IlIlI();
        if (PacketWrapper.IlIlz() == null) {
            IlIluD.IlIlo(new String[4]);
        }
    }

    public IlIlWw IlIlP() {
        return this.IlIll;
    }

    public void IlIli(IlIlWw ilIlWw) {
        this.IlIll = ilIlWw;
    }

    public IlIlXj IlIlA() {
        return this.IlIln;
    }

    public void IlIlh(IlIlXj ilIlXj) {
        this.IlIln = ilIlXj;
    }

    public int IlIlF() {
        return this.IlIlp;
    }

    @Nullable
    public IlIlxz IlIlY() {
        return IlIlxz.IlIlf(this.IlIlp);
    }

    public void IlIlv(int n) {
        this.IlIlp = n;
    }

    public void IlIlw(IlIlxz ilIlxz) {
        this.IlIlp = ilIlxz.IlIla();
    }

    public static void IlIlo(String[] stringArray) {
        IlIlu = stringArray;
    }

    public static String[] IlIlI() {
        return IlIlu;
    }

    static {
        a = IlIls.a(4838331728384236773L, -5760291850961927687L, MethodHandles.lookup().lookupClass()).a(37963409380411L);
        if (IlIluD.IlIlI() != null) {
            IlIluD.IlIlo(new String[2]);
        }
    }
}

