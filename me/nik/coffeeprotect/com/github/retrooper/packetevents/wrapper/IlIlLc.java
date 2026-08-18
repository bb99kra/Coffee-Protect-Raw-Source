/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlLc {
    private String IlIlm;
    private Optional<Component> IlIlu;
    private static final long a = IlIls.a(1288025771127484469L, -7178469380905542043L, MethodHandles.lookup().lookupClass()).a(235214138823078L);
    private static transient /* synthetic */ String heQIfdgEzk = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlLc(String string, @Nullable Component component) {
        this.IlIlm = string;
        this.IlIlx(component);
    }

    public IlIlLc(String string) {
        this.IlIlm = string;
        this.IlIlu = Optional.empty();
    }

    public String IlIlR() {
        return this.IlIlm;
    }

    public void IlIlu(String string) {
        this.IlIlm = string;
    }

    public Optional<Component> IlIl_() {
        return this.IlIlu;
    }

    public void IlIlx(@Nullable Component component) {
        block4: {
            block3: {
                PacketWrapper[] packetWrapperArray;
                block2: {
                    long l = a ^ 0x7ECB21C06969L;
                    packetWrapperArray = IlIlFh.IlIla();
                    if (packetWrapperArray == null) break block2;
                    if (component == null) break block3;
                    this.IlIlu = Optional.of(component);
                }
                if (packetWrapperArray != null) break block4;
            }
            this.IlIlu = Optional.empty();
        }
    }
}

