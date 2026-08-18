/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlXp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlZL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIlCg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.IlIln7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public final class IlIlnJ {
    public static final int IlIlt = 1;
    public static final int IlIlZ;
    public static final int IlIlh;
    private Component IlIlj;
    private Component IlIlX;
    private IlIlCg IlIlJ;
    private IlIlXp IlIlb;
    private boolean IlIlE;
    private boolean IlIlU;
    @Nullable
    private ResourceLocation IlIla;
    private float IlIlr;
    private float IlIlK;
    private static final long a;
    private static transient /* synthetic */ String gREQWgiUjE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlnJ(Component component, Component component2, IlIlCg ilIlCg, IlIlXp ilIlXp, @Nullable ResourceLocation resourceLocation, boolean bl, boolean bl2, float f, float f2) {
        this.IlIlj = component;
        this.IlIlX = component2;
        this.IlIlJ = ilIlCg;
        this.IlIlb = ilIlXp;
        this.IlIlE = bl;
        this.IlIlU = bl2;
        this.IlIla = resourceLocation;
        this.IlIlr = f;
        this.IlIlK = f2;
    }

    public static IlIlnJ IlIlL(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x12B3C728CF91L;
        Component component = packetWrapper.IlIlJ();
        Component component2 = packetWrapper.IlIlJ();
        IlIlCg ilIlCg = IlIln7.IlIlq(packetWrapper);
        String[] stringArray = IlIlZL.IlIlK();
        IlIlXp ilIlXp = packetWrapper.IlIly(IlIlXp.class);
        int n = packetWrapper.IlIlW();
        ResourceLocation resourceLocation = (n & 1) != 0 ? ResourceLocation.read(packetWrapper) : null;
        boolean bl = n & 2;
        if (stringArray != null) {
            bl = bl;
        }
        boolean bl2 = bl;
        boolean bl3 = n & 4;
        if (stringArray != null) {
            bl3 = bl3;
        }
        boolean bl4 = bl3;
        float f = packetWrapper.IlIlX();
        float f2 = packetWrapper.IlIlX();
        IlIlnJ ilIlnJ = new IlIlnJ(component, component2, ilIlCg, ilIlXp, resourceLocation, bl2, bl4, f, f2);
        if (stringArray == null) {
            PacketWrapper.IlIle(new int[3]);
        }
        return ilIlnJ;
    }

    public static void IlIlv(PacketWrapper<?> packetWrapper, IlIlnJ ilIlnJ) {
        long l = a ^ 0x6952B61AD837L;
        String[] stringArray = IlIlZL.IlIlK();
        packetWrapper.IlIlz(ilIlnJ.IlIlj);
        packetWrapper.IlIlz(ilIlnJ.IlIlX);
        String[] stringArray2 = stringArray;
        IlIln7.IlIlx(packetWrapper, ilIlnJ.IlIlJ);
        packetWrapper.IlIlw(ilIlnJ.IlIlb);
        packetWrapper.IlIla(ilIlnJ.IlIlo());
        if (stringArray2 != null) {
            if (ilIlnJ.IlIla != null) {
                ResourceLocation.write(packetWrapper, ilIlnJ.IlIla);
            }
            packetWrapper.IlIlR(ilIlnJ.IlIlr);
            packetWrapper.IlIlR(ilIlnJ.IlIlK);
        }
    }

    public int IlIlo() {
        long l = a ^ 0x6BE0751D00ADL;
        int n = 0;
        String[] stringArray = IlIlZL.IlIlK();
        IlIlnJ ilIlnJ = this;
        if (stringArray != null) {
            if (ilIlnJ.IlIla != null) {
                n |= 1;
            }
            ilIlnJ = this;
        }
        int n2 = ilIlnJ.IlIlE;
        if (stringArray != null) {
            if (n2 != 0) {
                n |= 2;
            }
            n2 = this.IlIlU;
        }
        if (stringArray != null) {
            if (n2 != 0) {
                n |= 4;
            }
            n2 = n;
        }
        return n2;
    }

    public Component IlIls() {
        return this.IlIlj;
    }

    public void IlIlU(Component component) {
        this.IlIlj = component;
    }

    public Component IlIlP() {
        return this.IlIlX;
    }

    public void IlIlA(Component component) {
        this.IlIlX = component;
    }

    public IlIlCg IlIlA() {
        return this.IlIlJ;
    }

    public void IlIlC(IlIlCg ilIlCg) {
        this.IlIlJ = ilIlCg;
    }

    public IlIlXp IlIlS() {
        return this.IlIlb;
    }

    public void IlIlF(IlIlXp ilIlXp) {
        this.IlIlb = ilIlXp;
    }

    public boolean IlIlx() {
        return this.IlIlE;
    }

    public void IlIln(boolean bl) {
        this.IlIlE = bl;
    }

    public boolean IlIlY() {
        return this.IlIlU;
    }

    public void IlIlw(boolean bl) {
        this.IlIlU = bl;
    }

    @Nullable
    public ResourceLocation IlIla() {
        return this.IlIla;
    }

    public void IlIlU(@Nullable ResourceLocation resourceLocation) {
        this.IlIla = resourceLocation;
    }

    public float IlIlG() {
        return this.IlIlr;
    }

    public void IlIlN(float f) {
        this.IlIlr = f;
    }

    public float IlIlJ() {
        return this.IlIlK;
    }

    public void IlIlw(float f) {
        this.IlIlK = f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a(2709233601086049909L, 182412047121032348L, MethodHandles.lookup().lookupClass()).a(180216224662550L);
        long l = a ^ 0x5D823B04C745L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00f1s\u00f6'\u00ac\u00de\u00f6B#\u001c\u00c8\u009a\u00a0R\u0003\u0004";
        int n2 = "\u00f1s\u00f6'\u00ac\u00de\u00f6B#\u001c\u00c8\u009a\u00a0R\u0003\u0004".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        IlIlZ = (int)lArray[0];
        IlIlh = (int)lArray[1];
    }
}

