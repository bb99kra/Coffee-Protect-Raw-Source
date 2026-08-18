/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.armormaterial;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.armormaterial.IlIlA2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlT2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticArmorMaterial
extends IlIlT2
implements IlIlA2 {
    private static String[] IlIlq;
    private static transient /* synthetic */ String bBmbygqRjS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticArmorMaterial(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    public static void IlIlU(String[] stringArray) {
        IlIlq = stringArray;
    }

    public static String[] IlIlo() {
        return IlIlq;
    }

    static {
        if (StaticArmorMaterial.IlIlo() != null) {
            StaticArmorMaterial.IlIlU(new String[5]);
        }
    }
}

