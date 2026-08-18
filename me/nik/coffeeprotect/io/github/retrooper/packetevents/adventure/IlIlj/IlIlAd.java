/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlj;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.IlIlZ1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlj.IlIlA9;

final class IlIlAd<E extends Enum<E>>
extends IlIlA9<E> {
    private final Map<String, E> IlIlk;
    private static final long c = IlIls.a(7210992146366921178L, -153733907156705431L, MethodHandles.lookup().lookupClass()).a(171545955100927L);
    private static transient /* synthetic */ String IDQljAoIpw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlAd(Class<E> clazz) {
        long l = c ^ 0x7F7540007AFFL;
        String string = IlIlZ1.IlIlb();
        super(clazz);
        String string2 = string;
        this.IlIlk = new HashMap<String, E>();
        for (Enum enum_ : (Enum[])clazz.getEnumConstants()) {
            this.IlIlk.put(enum_.name().toLowerCase(Locale.ROOT), enum_);
            if (string2 == null) continue;
        }
    }

    public E IlIlw(String string) throws IllegalArgumentException {
        Enum enum_;
        block4: {
            Enum enum_2;
            block5: {
                long l = c ^ 0x4CDBFBA64749L;
                enum_2 = (Enum)this.IlIlk.get(string.toLowerCase(Locale.ROOT));
                String string2 = IlIlZ1.IlIlb();
                try {
                    try {
                        enum_ = enum_2;
                        if (string2 != null) break block4;
                        if (enum_ != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlAd.b(illegalArgumentException);
                    }
                    throw IlIlAd.IlIlk(string, this.IlIlI(), null);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlAd.b(illegalArgumentException);
                }
            }
            enum_ = enum_2;
        }
        return (E)enum_;
    }

    private static IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

