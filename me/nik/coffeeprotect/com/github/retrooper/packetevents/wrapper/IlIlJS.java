/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlPz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlJS
extends PacketWrapper<IlIlJS> {
    private NBTCompound IlIlh;
    private ResourceLocation IlIlu;
    private List<IlIlPz> IlIlX;
    private static int[] IlIlt;
    private static final long b;
    private static transient /* synthetic */ String PFIrkjMFcQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJS(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @ApiStatus.Obsolete
    public IlIlJS(NBTCompound nBTCompound) {
        this(nBTCompound, null, null);
    }

    public IlIlJS(ResourceLocation resourceLocation, List<IlIlPz> list) {
        this(null, resourceLocation, list);
    }

    @ApiStatus.Obsolete
    public IlIlJS(@Nullable NBTCompound nBTCompound, @Nullable ResourceLocation resourceLocation, @Nullable List<IlIlPz> list) {
        super(IlIlWz.REGISTRY_DATA);
        this.IlIlh = nBTCompound;
        this.IlIlu = resourceLocation;
        this.IlIlX = list;
    }

    @Override
    public void IlIle() {
        long l = b ^ 0x384195796B8FL;
        int[] nArray = IlIlJS.IlIlv();
        IlIlJS ilIlJS = this;
        if (nArray != null) {
            if (ilIlJS.IlIlg.IlIlC(ServerVersion.V_1_20_5)) {
                this.IlIlh = this.IlIlf();
                return;
            }
            this.IlIlu = this.readIdentifier();
            ilIlJS = this;
        }
        ilIlJS.IlIlX = this.IlIll(packetWrapper -> {
            ResourceLocation resourceLocation = packetWrapper.readIdentifier();
            NBT nBT = (NBT)packetWrapper.IlIlN(PacketWrapper::IlIlx);
            return new IlIlPz(resourceLocation, nBT);
        });
    }

    @Override
    public void IlIlJ() {
        long l = b ^ 0x213CE8905527L;
        int[] nArray = IlIlJS.IlIlv();
        IlIlJS ilIlJS = this;
        if (nArray != null) {
            if (ilIlJS.IlIlg.IlIlC(ServerVersion.V_1_20_5)) {
                this.IlIlc(this.IlIlh);
                return;
            }
            this.writeIdentifier(this.IlIlu);
            ilIlJS = this;
        }
        ilIlJS.IlIlQ(this.IlIlX, (packetWrapper, ilIlPz) -> {
            packetWrapper.writeIdentifier(ilIlPz.IlIlj());
            packetWrapper.IlIlI(ilIlPz.IlIlH(), PacketWrapper::IlIlO);
        });
    }

    public void IlIlV(IlIlJS ilIlJS) {
        this.IlIlh = ilIlJS.IlIlh;
        this.IlIlu = ilIlJS.IlIlu;
        this.IlIlX = ilIlJS.IlIlX;
    }

    @ApiStatus.Obsolete
    @Nullable
    public NBTCompound IlIlk() {
        return this.IlIlh;
    }

    @ApiStatus.Obsolete
    public void IlIll(NBTCompound nBTCompound) {
        this.IlIlh = nBTCompound;
    }

    @Nullable
    public ResourceLocation IlIlt() {
        return this.IlIlu;
    }

    public void IlIla(ResourceLocation resourceLocation) {
        this.IlIlu = resourceLocation;
    }

    @Nullable
    public List<IlIlPz> IlIlo() {
        return this.IlIlX;
    }

    public void IlIlh(List<IlIlPz> list) {
        this.IlIlX = list;
    }

    public static void IlIls(int[] nArray) {
        IlIlt = nArray;
    }

    public static int[] IlIlv() {
        return IlIlt;
    }

    static {
        b = IlIls.a(5399660297605727242L, -2109212608054320907L, MethodHandles.lookup().lookupClass()).a(184590494363589L);
        if (IlIlJS.IlIlv() == null) {
            IlIlJS.IlIls(new int[3]);
        }
    }
}

