/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.parrot;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.parrot.IlIlLe;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlT2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticParrotVariant
extends IlIlT2
implements IlIlLe {
    private static boolean IlIlb;
    private static transient /* synthetic */ String AAmNrjIWBl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticParrotVariant(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    public static void IlIlr(boolean bl) {
        IlIlb = bl;
    }

    public static boolean IlIlY() {
        return IlIlb;
    }

    public static boolean IlIlU() {
        boolean bl = StaticParrotVariant.IlIlY();
        return !bl;
    }

    static {
        if (!StaticParrotVariant.IlIlU()) {
            StaticParrotVariant.IlIlr(true);
        }
    }
}

