/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlrU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodecs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlX7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

class IlIloq
implements IlIlrU {
    private Component IlIlT;
    final Map.Entry IlIld;
    final String IlIlB;
    private static final long a = IlIls.a(4605149413150807025L, -3138647006722510783L, MethodHandles.lookup().lookupClass()).a(76731107804923L);
    private static transient /* synthetic */ String WOPTrWAeAa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    IlIloq(Map.Entry entry, String string) {
        this.IlIld = entry;
        this.IlIlB = string;
    }

    @Override
    public String IlIlk() {
        return (String)this.IlIld.getKey();
    }

    @Override
    public Component IlIlM() {
        long l = a ^ 0x5C71EC03989AL;
        String[] stringArray = NbtCodecs.IlIlu();
        Component component = this.IlIlT;
        if (stringArray != null) {
            if (component == null) {
                this.IlIlT = IlIlX7.IlIlP().IlIlx(this.IlIlB);
            }
            component = this.IlIlT;
        }
        return component;
    }

    public boolean equals(Object object) {
        long l = a ^ 0x478D405BD668L;
        String[] stringArray = NbtCodecs.IlIlu();
        boolean bl = object instanceof IlIlrU;
        if (stringArray != null) {
            if (bl) {
                return ((IlIlrU)object).IlIlk().equals(this.IlIlk());
            }
            bl = false;
        }
        return bl;
    }
}

