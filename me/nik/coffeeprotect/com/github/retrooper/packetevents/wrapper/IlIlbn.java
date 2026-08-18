/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.IlIlQw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlbn
extends PacketWrapper<IlIlbn> {
    private IlIlAn IlIlb;
    private ResourceLocation IlIlx;
    @Nullable
    private ResourceLocation IlIlc;
    private ResourceLocation IlIlL;
    private String IlIlq;
    @Nullable
    private IlIlQw IlIlZ;
    private int IlIlt;
    private int IlIlQ;
    private static final long b = IlIls.a(1093754850800421919L, 770969115542174584L, MethodHandles.lookup().lookupClass()).a(90851156633223L);
    private static transient /* synthetic */ String wdANaSkfNj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbn(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbn(IlIlAn ilIlAn, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, String string) {
        this(ilIlAn, resourceLocation, null, resourceLocation2, string, null);
    }

    public IlIlbn(IlIlAn ilIlAn, ResourceLocation resourceLocation, @Nullable ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, String string, @Nullable IlIlQw ilIlQw) {
        this(ilIlAn, resourceLocation, resourceLocation2, resourceLocation3, string, ilIlQw, 0, 0);
    }

    public IlIlbn(IlIlAn ilIlAn, ResourceLocation resourceLocation, @Nullable ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, String string, @Nullable IlIlQw ilIlQw, int n, int n2) {
        super(IlIlnN.UPDATE_JIGSAW_BLOCK);
        this.IlIlb = ilIlAn;
        this.IlIlx = resourceLocation;
        this.IlIlc = resourceLocation2;
        this.IlIlL = resourceLocation3;
        this.IlIlq = string;
        this.IlIlZ = ilIlQw;
        this.IlIlt = n;
        this.IlIlQ = n2;
    }

    @Override
    public void IlIle() {
        block8: {
            block7: {
                IlIlbn ilIlbn;
                boolean bl;
                block6: {
                    long l = b ^ 0x7B161788E931L;
                    this.IlIlb = this.IlIlE();
                    String string = IlIlJH.IlIlw();
                    this.IlIlx = this.readIdentifier();
                    bl = this.IlIlC();
                    if (string == null) {
                        if (bl) {
                            this.IlIlc = this.readIdentifier();
                        }
                        this.IlIlL = this.readIdentifier();
                        this.IlIlq = this.IlIli();
                        bl = this.IlIlC();
                    }
                    if (string != null) break block6;
                    if (bl) {
                        this.IlIlZ = IlIlQw.IlIlY(this.IlIli()).orElse(IlIlQw.ALIGNED);
                    }
                    ilIlbn = this;
                    if (string != null) break block7;
                    bl = ilIlbn.IlIlg.IlIlz(ServerVersion.V_1_20_3);
                }
                if (!bl) break block8;
                this.IlIlt = this.IlIlf();
                ilIlbn = this;
            }
            ilIlbn.IlIlQ = this.IlIlf();
        }
    }

    @Override
    public void IlIlJ() {
        block8: {
            IlIlbn ilIlbn;
            block7: {
                boolean bl;
                block6: {
                    long l = b ^ 0x626B6A61D799L;
                    String string = IlIlJH.IlIlw();
                    this.IlIlh(this.IlIlb);
                    this.writeIdentifier(this.IlIlx);
                    String string2 = string;
                    bl = this.IlIlC();
                    if (string2 == null) {
                        if (bl) {
                            this.writeIdentifier(this.IlIlc);
                        }
                        this.writeIdentifier(this.IlIlL);
                        this.IlIlM(this.IlIlq);
                        bl = this.IlIlC();
                    }
                    if (string2 != null) break block6;
                    if (bl) {
                        this.IlIlM(this.IlIlZ.IlIlG());
                    }
                    ilIlbn = this;
                    if (string2 != null) break block7;
                    bl = ilIlbn.IlIlg.IlIlz(ServerVersion.V_1_20_3);
                }
                if (!bl) break block8;
                this.IlIlJ(this.IlIlt);
                ilIlbn = this;
            }
            ilIlbn.IlIlJ(this.IlIlQ);
        }
    }

    public void IlIlb(IlIlbn ilIlbn) {
        this.IlIlb = ilIlbn.IlIlb;
        this.IlIlx = ilIlbn.IlIlx;
        this.IlIlc = ilIlbn.IlIlc;
        this.IlIlL = ilIlbn.IlIlL;
        this.IlIlq = ilIlbn.IlIlq;
        this.IlIlZ = ilIlbn.IlIlZ;
        this.IlIlt = ilIlbn.IlIlt;
        this.IlIlQ = ilIlbn.IlIlQ;
    }

    private boolean IlIlC() {
        return this.IlIlg.IlIlz(ServerVersion.V_1_16);
    }

    public IlIlAn IlIlZ() {
        return this.IlIlb;
    }

    public void IlIlW(IlIlAn ilIlAn) {
        this.IlIlb = ilIlAn;
    }

    public ResourceLocation IlIli() {
        return this.IlIlx;
    }

    public void IlIlW(ResourceLocation resourceLocation) {
        this.IlIlx = resourceLocation;
    }

    public Optional<ResourceLocation> IlIlf() {
        return Optional.ofNullable(this.IlIlc);
    }

    public void IlIlP(@Nullable ResourceLocation resourceLocation) {
        this.IlIlc = resourceLocation;
    }

    public ResourceLocation IlIlh() {
        return this.IlIlL;
    }

    public void IlIlD(ResourceLocation resourceLocation) {
        this.IlIlL = resourceLocation;
    }

    public String IlIlS() {
        return this.IlIlq;
    }

    public void IlIlK(String string) {
        this.IlIlq = string;
    }

    public Optional<IlIlQw> IlIlx() {
        return Optional.ofNullable(this.IlIlZ);
    }

    public void IlIlF(@Nullable IlIlQw ilIlQw) {
        this.IlIlZ = ilIlQw;
    }

    public int IlIlj() {
        return this.IlIlt;
    }

    public void IlIlh(int n) {
        this.IlIlt = n;
    }

    public int IlIlH() {
        return this.IlIlQ;
    }

    public void IlIlW(int n) {
        this.IlIlQ = n;
    }
}

