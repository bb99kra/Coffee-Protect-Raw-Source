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

public class IlIlJ3
extends PacketWrapper<IlIlJ3> {
    private int IlIln;
    @ApiStatus.Obsolete
    private ResourceLocation IlIlf;
    private IlIljZ IlIlT;
    private boolean IlIlu;
    private static final long b = IlIls.a(8847872129815086172L, -175981498238874763L, MethodHandles.lookup().lookupClass()).a(218320504068867L);
    private static transient /* synthetic */ String FAlHSWOTMT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJ3(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJ3(int n, int n2, boolean bl) {
        this(n, new IlIljZ(n2), bl);
    }

    public IlIlJ3(int n, IlIljZ ilIljZ, boolean bl) {
        super(IlIlnN.CRAFT_RECIPE_REQUEST);
        this.IlIln = n;
        this.IlIlT = ilIljZ;
        this.IlIlu = bl;
    }

    public IlIlJ3(int n, String string, boolean bl) {
        this(n, new ResourceLocation(string), bl);
    }

    public IlIlJ3(int n, ResourceLocation resourceLocation, boolean bl) {
        super(IlIlnN.CRAFT_RECIPE_REQUEST);
        this.IlIln = n;
        this.IlIlf = resourceLocation;
        this.IlIlu = bl;
    }

    @Override
    public void IlIle() {
        block4: {
            block2: {
                IlIlJ3 ilIlJ3;
                block3: {
                    long l = b ^ 0x28A63630D343L;
                    this.IlIln = this.IlIle();
                    String string = IlIlJH.IlIlw();
                    ilIlJ3 = this;
                    if (string != null) break block2;
                    if (!ilIlJ3.IlIlg.IlIlC(ServerVersion.V_1_21_2)) break block3;
                    ilIlJ3 = this;
                    if (string != null) break block2;
                    if (!ilIlJ3.IlIlg.IlIlz(ServerVersion.V_1_13)) break block3;
                    this.IlIlf = this.readIdentifier();
                    if (string == null) break block4;
                }
                ilIlJ3 = this;
            }
            ilIlJ3.IlIlT = IlIljZ.IlIlw(this);
        }
        this.IlIlu = this.IlIlK();
    }

    @Override
    public void IlIlJ() {
        block4: {
            IlIlJ3 ilIlJ3;
            block2: {
                block3: {
                    long l = b ^ 0x31DB4BD9EDEBL;
                    String string = IlIlJH.IlIlw();
                    this.IlIlr(this.IlIln);
                    String string2 = string;
                    ilIlJ3 = this;
                    if (string2 != null) break block2;
                    if (!ilIlJ3.IlIlg.IlIlC(ServerVersion.V_1_21_2)) break block3;
                    ilIlJ3 = this;
                    if (string2 != null) break block2;
                    if (!ilIlJ3.IlIlg.IlIlz(ServerVersion.V_1_13)) break block3;
                    this.writeIdentifier(this.IlIlf);
                    if (string2 == null) break block4;
                }
                ilIlJ3 = this;
            }
            IlIljZ.IlIlD(ilIlJ3, this.IlIlT);
        }
        this.IlIla(this.IlIlu);
    }

    public void IlIlj(IlIlJ3 ilIlJ3) {
        this.IlIln = ilIlJ3.IlIln;
        this.IlIlT = ilIlJ3.IlIlT;
        this.IlIlf = ilIlJ3.IlIlf;
        this.IlIlu = ilIlJ3.IlIlu;
    }

    public int IlIlV() {
        return this.IlIln;
    }

    public void IlIlE(int n) {
        this.IlIln = n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Deprecated
    public <T> T IlIlt() {
        var1_1 = IlIlJ3.b ^ 87306760515637L;
        var3_2 = IlIlJH.IlIlw();
        v0 = this.IlIlg.IlIlC(ServerVersion.V_1_21_2);
        if (var3_2 != null) ** GOTO lbl13
        if (v0 == 0) ** GOTO lbl-1000
        v0 = (int)this.IlIlg.IlIlz(ServerVersion.V_1_13);
        if (var3_2 == null) {
            ** if (v0 == 0) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v1 = this.IlIlf;
                ** GOTO lbl14
            }
        }
        ** GOTO lbl13
lbl-1000:
        // 2 sources

        {
            v0 = this.IlIlT.IlIlh();
lbl13:
            // 3 sources

            v1 = v0;
        }
lbl14:
        // 2 sources

        return (T)v1;
    }

    @Deprecated
    public <T> void IlIlK(T t) {
        block4: {
            block2: {
                IlIlJ3 ilIlJ3;
                block3: {
                    long l = b ^ 0x2865AEC4B7A3L;
                    String string = IlIlJH.IlIlw();
                    ilIlJ3 = this;
                    if (string != null) break block2;
                    if (!ilIlJ3.IlIlg.IlIlz(ServerVersion.V_1_13)) break block3;
                    this.IlIlf = new ResourceLocation((String)t);
                    if (string == null) break block4;
                }
                ilIlJ3 = this;
            }
            ilIlJ3.IlIlT = new IlIljZ((Integer)t);
        }
    }

    public ResourceLocation IlIlh() {
        return this.IlIlf;
    }

    public void IlIlp(ResourceLocation resourceLocation) {
        this.IlIlf = resourceLocation;
    }

    public IlIljZ IlIlP() {
        return this.IlIlT;
    }

    public void IlIll(IlIljZ ilIljZ) {
        this.IlIlT = ilIljZ;
    }

    public boolean IlIls() {
        return this.IlIlu;
    }

    public void IlIlm(boolean bl) {
        this.IlIlu = bl;
    }
}

