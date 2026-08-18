/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.EnumSet;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlL9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIluG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.kyori.adventure.bossbar.BossBar;

public class IlIlbd
extends PacketWrapper<IlIlbd> {
    private UUID IlIlX;
    private IlIlL9 IlIlV;
    private Component IlIlE;
    private float IlIlh;
    private BossBar.Color IlIlO;
    private BossBar.Overlay IlIlT;
    private EnumSet<BossBar.Flag> IlIlB;
    private static final long b = IlIls.a(4285144128724232558L, -4724425570089761456L, MethodHandles.lookup().lookupClass()).a(63362943507895L);
    private static transient /* synthetic */ String vkxqyTestH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbd(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public IlIlbd(UUID uUID, IlIlL9 ilIlL9) {
        super(IlIlAG.BOSS_BAR);
        this.IlIlX = uUID;
        this.IlIlV = ilIlL9;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIle() {
        var1_1 = IlIlbd.b ^ 47835088065665L;
        this.IlIlX = this.IlIlv();
        var3_2 = IlIlFh.IlIla();
        this.IlIlV = this.IlIly(IlIlL9.class);
        v0 = this;
        if (var3_2 == null) ** GOTO lbl14
        switch (v0.IlIlV.ordinal()) {
            case 0: {
                this.IlIlE = this.IlIlJ();
                this.IlIlh = this.IlIlX();
                this.IlIlO = this.IlIly(BossBar.Color.class);
                this.IlIlT = this.IlIly(BossBar.Overlay.class);
                v0 = this;
lbl14:
                // 2 sources

                v0.IlIlB = this.IlIlT(this.IlIlP());
                if (var3_2 != null) break;
            }
            case 1: {
                if (var3_2 != null) break;
            }
            case 2: {
                this.IlIlh = this.IlIlX();
                if (var3_2 != null) break;
            }
            case 3: {
                this.IlIlE = this.IlIlJ();
                if (var3_2 != null) break;
            }
            case 4: {
                this.IlIlO = this.IlIly(BossBar.Color.class);
                this.IlIlT = this.IlIly(BossBar.Overlay.class);
                if (var3_2 != null) break;
            }
            case 5: {
                this.IlIlB = this.IlIlT(this.IlIlP());
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIlJ() {
        var1_1 = IlIlbd.b ^ 56057989147177L;
        this.IlIlc(this.IlIlX);
        v0 = IlIlFh.IlIla();
        this.IlIlw(this.IlIlV);
        var3_2 = v0;
        v1 = this;
        if (var3_2 == null) ** GOTO lbl15
        switch (v1.IlIlV.ordinal()) {
            case 0: {
                this.IlIlz(this.IlIlE);
                this.IlIlR(this.IlIlh);
                this.IlIlw(this.IlIlO);
                this.IlIlw(this.IlIlT);
                v1 = this;
lbl15:
                // 2 sources

                v1.IlIlu(this.IlIlB());
                if (var3_2 != null) break;
            }
            case 1: {
                if (var3_2 != null) break;
            }
            case 2: {
                this.IlIlR(this.IlIlh);
                if (var3_2 != null) break;
            }
            case 3: {
                this.IlIlz(this.IlIlE);
                if (var3_2 != null) break;
            }
            case 4: {
                this.IlIlw(this.IlIlO);
                this.IlIlw(this.IlIlT);
                if (var3_2 != null) break;
            }
            case 5: {
                this.IlIlu(this.IlIlB());
            }
        }
    }

    public void IlIlm(IlIlbd ilIlbd) {
        this.IlIlX = ilIlbd.IlIlX;
        this.IlIlV = ilIlbd.IlIlV;
        this.IlIlE = ilIlbd.IlIlE;
        this.IlIlh = ilIlbd.IlIlh;
        this.IlIlO = ilIlbd.IlIlO;
        this.IlIlT = ilIlbd.IlIlT;
        this.IlIlB = ilIlbd.IlIlB;
    }

    private EnumSet<BossBar.Flag> IlIlT(short s) {
        long l = b ^ 0x4BBC69772BE2L;
        EnumSet<BossBar.Flag> enumSet = EnumSet.noneOf(BossBar.Flag.class);
        PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
        int n = s & 1;
        if (packetWrapperArray != null) {
            if (n != 0) {
                enumSet.add(BossBar.Flag.DARKEN_SCREEN);
            }
            n = s & 2;
        }
        if (packetWrapperArray != null) {
            if (n != 0) {
                enumSet.add(BossBar.Flag.PLAY_BOSS_MUSIC);
            }
            n = s & 4;
        }
        if (packetWrapperArray != null && n != 0) {
            n = enumSet.add(BossBar.Flag.CREATE_WORLD_FOG) ? 1 : 0;
        }
        return enumSet;
    }

    private byte IlIlB() {
        byte by;
        block6: {
            long l = b ^ 0x43F193316062L;
            int n = 0;
            PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
            for (BossBar.Flag flag : this.IlIlB) {
                int n2;
                block8: {
                    boolean bl;
                    block7: {
                        by = (byte)IlIluG.IlIla[flag.ordinal()];
                        if (packetWrapperArray == null) break block6;
                        if (packetWrapperArray == null) break block7;
                        switch (by) {
                            case 1: {
                                n2 = 1;
                                if (packetWrapperArray != null) break block8;
                            }
                            case 2: {
                                n2 = 2;
                                if (packetWrapperArray != null) break block8;
                            }
                            case 3: {
                                n2 = 4;
                                if (packetWrapperArray != null) break block8;
                            }
                            default: {
                                bl = false;
                            }
                        }
                    }
                    n2 = bl;
                }
                n |= n2;
                if (packetWrapperArray != null) continue;
            }
            by = (byte)n;
        }
        return by;
    }

    public UUID IlIlI() {
        return this.IlIlX;
    }

    public void IlIlA(UUID uUID) {
        this.IlIlX = uUID;
    }

    public IlIlL9 IlIlk() {
        return this.IlIlV;
    }

    public void IlIlb(IlIlL9 ilIlL9) {
        this.IlIlV = ilIlL9;
    }

    public Component IlIlF() {
        return this.IlIlE;
    }

    public void IlIlF(Component component) {
        this.IlIlE = component;
    }

    public float IlIlc() {
        return this.IlIlh;
    }

    public void IlIlp(float f) {
        this.IlIlh = f;
    }

    public BossBar.Color IlIlD() {
        return this.IlIlO;
    }

    public void IlIlP(BossBar.Color color) {
        this.IlIlO = color;
    }

    public BossBar.Overlay IlIl_() {
        return this.IlIlT;
    }

    public void IlIlm(BossBar.Overlay overlay) {
        this.IlIlT = overlay;
    }

    public EnumSet<BossBar.Flag> IlIle() {
        return this.IlIlB;
    }

    public void IlIlz(EnumSet<BossBar.Flag> enumSet) {
        this.IlIlB = enumSet;
    }
}

