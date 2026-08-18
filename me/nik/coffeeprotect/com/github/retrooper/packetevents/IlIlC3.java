/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlhC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;

public interface IlIlC3 {
    default public boolean IlIlP() {
        return true;
    }

    public void IlIld();

    public void IlIlX();

    public void IlIlC(Object var1, IlIlG2 var2);

    public void IlIll(Object var1, Object var2);

    public boolean IlIlX(Object var1);

    public boolean IlIlK();

    default public IlIlhC IlIlT() {
        return IlIlhC.SERVER;
    }
}

