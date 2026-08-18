/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlCk;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlGI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.IlIlR;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Contract;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface IlIlCr
extends IlIlCk {
    @Contract(mutates="param")
    public void IlIli(@NotNull IlIlGI var1);

    @Override
    default public void IlIl_(@NotNull IlIlR<?, ?> ilIlR) {
        ilIlR.IlIlV(this::IlIli);
    }
}

