/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score.IlIlW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score.IlIlj7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score.IlIlqN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public final class IlIlQX
implements IlIlW {
    private final Component IlIls;
    private static transient /* synthetic */ String SFjSFRpqzp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlQX(Component component) {
        this.IlIls = component;
    }

    public static IlIlQX IlIlC(PacketWrapper<?> packetWrapper) {
        return new IlIlQX(packetWrapper.IlIlJ());
    }

    public static void IlIla(PacketWrapper<?> packetWrapper, IlIlQX ilIlQX) {
        packetWrapper.IlIlz(ilIlQX.IlIls);
    }

    @Override
    public Component IlIlM(int n) {
        return this.IlIls;
    }

    public IlIlqN<IlIlQX> IlIlw() {
        return IlIlj7.IlIlh;
    }

    public Component IlIlI() {
        return this.IlIls;
    }
}

