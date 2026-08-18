/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.IlIljZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlb4
extends PacketWrapper<IlIlb4> {
    @ApiStatus.Obsolete
    private ResourceLocation IlIlQ;
    private IlIljZ IlIlx;
    private static final long b = IlIls.a(3118578946157218759L, 4090294240883742908L, MethodHandles.lookup().lookupClass()).a(106838922104413L);
    private static transient /* synthetic */ String JpFeDxTWaB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb4(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    @ApiStatus.Obsolete
    public IlIlb4(ResourceLocation resourceLocation) {
        super(IlIlnN.SET_DISPLAYED_RECIPE);
        this.IlIlQ = resourceLocation;
    }

    public IlIlb4(IlIljZ ilIljZ) {
        super(IlIlnN.SET_DISPLAYED_RECIPE);
        this.IlIlx = ilIljZ;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlb4 ilIlb4;
                block3: {
                    long l = b ^ 0x593F2A385C07L;
                    String string = IlIlJH.IlIlw();
                    ilIlb4 = this;
                    if (string != null) break block2;
                    if (!ilIlb4.IlIlg.IlIlz(ServerVersion.V_1_21_2)) break block3;
                    this.IlIlx = IlIljZ.IlIlw(this);
                    if (string == null) break block4;
                }
                ilIlb4 = this;
            }
            ilIlb4.IlIlQ = this.readIdentifier();
        }
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlb4 ilIlb4;
            block2: {
                block3: {
                    long l = b ^ 0x404257D162AFL;
                    String string = IlIlJH.IlIlw();
                    ilIlb4 = this;
                    if (string != null) break block2;
                    if (!ilIlb4.IlIlg.IlIlz(ServerVersion.V_1_21_2)) break block3;
                    IlIljZ.IlIlD(this, this.IlIlx);
                    if (string == null) break block4;
                }
                ilIlb4 = this;
            }
            ilIlb4.writeIdentifier(this.IlIlQ);
        }
    }

    public void IlIlM(IlIlb4 ilIlb4) {
        this.IlIlQ = ilIlb4.IlIlQ;
        this.IlIlx = ilIlb4.IlIlx;
    }

    @ApiStatus.Obsolete
    public ResourceLocation IlIle() {
        return this.IlIlQ;
    }

    @ApiStatus.Obsolete
    public void IlIlT(ResourceLocation resourceLocation) {
        this.IlIlQ = resourceLocation;
    }

    public IlIljZ IlIlK() {
        return this.IlIlx;
    }

    public void IlIlU(IlIljZ ilIljZ) {
        this.IlIlx = ilIljZ;
    }
}

