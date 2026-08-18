/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.IlIlOu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public interface IlIlz {
    public static final long b = IlIls.a(-6133476703895788055L, -366564501909387452L, MethodHandles.lookup().lookupClass()).a(77420489786952L);

    default public <T extends MappedEntity> IlIlOu<T> IlIlw(IlIlOu<T> ilIlOu) {
        return this.IlIlF(ilIlOu, IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE());
    }

    default public <T extends MappedEntity> IlIlOu<T> IlIlF(IlIlOu<T> ilIlOu, ClientVersion clientVersion) {
        long l = b ^ 0x63FFAB64DDE1L;
        IlIlOu<?> ilIlOu2 = this.IlIlz(ilIlOu.IlIlX(), clientVersion);
        int[] nArray = VersionedRegistry.IlIlB();
        IlIlOu<Object> ilIlOu3 = ilIlOu2;
        if (nArray == null) {
            ilIlOu3 = ilIlOu3 != null ? ilIlOu2 : ilIlOu;
        }
        return ilIlOu3;
    }

    @Nullable
    default public IlIlOu<?> IlIly(ResourceLocation resourceLocation) {
        return this.IlIlz(resourceLocation, IlIlr7.IlIlb().IlIlq().IlIlF().IlIlE());
    }

    @Nullable
    public IlIlOu<?> IlIlz(ResourceLocation var1, ClientVersion var2);
}

