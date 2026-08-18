/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension;

import java.lang.invoke.MethodHandles;
import java.util.OptionalLong;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlOK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlTq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIljH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.IlIlyH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.IlIlGp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.timelines.IlIliy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.clock.IlIljT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlQs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlXA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlfK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlro;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.IlIlx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.IlIlGw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface IlIlnq
extends MappedEntity,
IlIlTq<IlIlnq>,
IlIljH {
    public static final NbtCodec<IlIlnq> IlIlY;
    public static final long a;

    public boolean hasFixedTime();

    @ApiStatus.Obsolete
    public OptionalLong getFixedTime();

    public boolean hasSkyLight();

    public boolean hasCeiling();

    @ApiStatus.Obsolete
    public boolean isUltraWarm();

    @ApiStatus.Obsolete
    public boolean isNatural();

    public double getCoordinateScale();

    default public boolean IlIlQ() {
        long l = a ^ 0x7D1ED76A8BC5L;
        String string = IlIlQs.IlIlY();
        double d = this.getCoordinateScale() - 1.0;
        double d2 = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
        if (string != null) {
            d2 = d2 > 0 ? 1.0 : 0.0;
        }
        return (boolean)d2;
    }

    @ApiStatus.Obsolete
    public boolean isBedWorking();

    @ApiStatus.Obsolete
    public boolean isRespawnAnchorWorking();

    public int getMinY();

    @Deprecated
    default public int IlIlW(ClientVersion clientVersion) {
        return this.getMinY();
    }

    public int getHeight();

    default public int IlIlR(ClientVersion clientVersion) {
        return this.getHeight();
    }

    public int getLogicalHeight();

    @Deprecated
    default public int IlIlj(ClientVersion clientVersion) {
        return this.getLogicalHeight();
    }

    public IlIlGw getInfiniburn();

    @Deprecated
    default public String IlIlk() {
        return this.getInfiniburn().toString();
    }

    @ApiStatus.Obsolete
    public ResourceLocation getEffectsLocation();

    public float getAmbientLight();

    @ApiStatus.Obsolete
    public @Nullable Integer getCloudHeight();

    public @Nullable IlIljT getDefaultClock();

    public boolean isHasEnderDragonFight();

    @ApiStatus.Obsolete
    public boolean isPiglinSafe();

    @ApiStatus.Obsolete
    public boolean hasRaids();

    @ApiStatus.Experimental
    public NBT getMonsterSpawnLightLevel();

    public int getMonsterSpawnBlockLightLimit();

    public IlIlXA getSkybox();

    public IlIlfK getCardinalLight();

    public IlIlGp getAttributes();

    public IlIlOK<IlIliy> getTimelines();

    public IlIlyH<IlIliy> getTimelinesRef();

    default public IlIlx IlIlq(PacketWrapper<?> packetWrapper) {
        return new IlIlQs(this, packetWrapper);
    }

    @Deprecated
    default public IlIlx IlIlJ(ClientVersion clientVersion) {
        return this.IlIlq(PacketWrapper.IlIlE(clientVersion));
    }

    @Deprecated
    public static IlIlnq IlIlV(NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return (IlIlnq)((IlIlnq)IlIlY.IlIlA(nBT, PacketWrapper.IlIlE(clientVersion))).copy(typesBuilderData);
    }

    @Deprecated
    public static NBT IlIle(IlIlnq ilIlnq, ClientVersion clientVersion) {
        return IlIlY.IlIl_(PacketWrapper.IlIlE(clientVersion), ilIlnq);
    }

    static {
        a = IlIls.a(8964668576111670553L, -6642792755507014527L, MethodHandles.lookup().lookupClass()).a(60755530484858L);
        IlIlY = new IlIlro().IlIlq();
    }
}

