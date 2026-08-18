/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.IlIlCM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.IlIlGM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class IlIlAw
implements IlIlGM {
    private final IlIlCM IlIlo;
    private final IlIlCM IlIlb;
    private final IlIlCM IlIlP;
    private static transient /* synthetic */ String sDuzksxUmG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlAw(IlIlCM ilIlCM, IlIlCM ilIlCM2, IlIlCM ilIlCM3) {
        this.IlIlo = ilIlCM;
        this.IlIlb = ilIlCM2;
        this.IlIlP = ilIlCM3;
    }

    public static IlIlAw IlIlY(PacketWrapper<?> packetWrapper) {
        IlIlCM ilIlCM = IlIlCM.IlIlw(packetWrapper);
        IlIlCM ilIlCM2 = IlIlCM.IlIlw(packetWrapper);
        IlIlCM ilIlCM3 = IlIlCM.IlIlw(packetWrapper);
        return new IlIlAw(ilIlCM, ilIlCM2, ilIlCM3);
    }

    public static void IlIli(PacketWrapper<?> packetWrapper, IlIlAw ilIlAw) {
        IlIlCM.IlIlO(packetWrapper, ilIlAw.IlIlo);
        IlIlCM.IlIlO(packetWrapper, ilIlAw.IlIlb);
        IlIlCM.IlIlO(packetWrapper, ilIlAw.IlIlP);
    }

    public IlIlCM IlIly() {
        return this.IlIlo;
    }

    public IlIlCM IlIll() {
        return this.IlIlb;
    }

    public IlIlCM IlIlW() {
        return this.IlIlP;
    }
}

