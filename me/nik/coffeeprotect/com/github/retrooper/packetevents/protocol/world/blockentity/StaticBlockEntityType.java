/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlT2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity.IlIlCL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticBlockEntityType
extends IlIlT2
implements IlIlCL {
    private static String IlIlK;
    private static transient /* synthetic */ String BlQmZCWUZp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticBlockEntityType(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    public static void IlIlQ(String string) {
        IlIlK = string;
    }

    public static String IlIlv() {
        return IlIlK;
    }

    static {
        if (StaticBlockEntityType.IlIlv() == null) {
            StaticBlockEntityType.IlIlQ("wYoQlb");
        }
    }
}

