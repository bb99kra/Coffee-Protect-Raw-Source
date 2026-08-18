/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.IlIlWb;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlFh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class IlIlGZ {
    private static final byte IlIlP = 1;
    private static final byte IlIld;
    private IlIlWb IlIlG;
    private boolean IlIl_;
    private boolean IlIlm;
    private static final long a;
    private static transient /* synthetic */ String sdgduNNrHb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlGZ(IlIlWb ilIlWb, byte by) {
        long l = a ^ 0x608823720CA3L;
        this(ilIlWb, (by & 1) != 0, (by & 2) != 0);
    }

    public IlIlGZ(IlIlWb ilIlWb, boolean bl, boolean bl2) {
        this.IlIlG = ilIlWb;
        this.IlIl_ = bl;
        this.IlIlm = bl2;
    }

    public static IlIlGZ IlIlt(PacketWrapper<?> packetWrapper) {
        IlIlWb ilIlWb = IlIlWb.IlIlV(packetWrapper);
        byte by = packetWrapper.IlIlE();
        return new IlIlGZ(ilIlWb, by);
    }

    public static void IlIlz(PacketWrapper<?> packetWrapper, IlIlGZ ilIlGZ) {
        IlIlWb.IlIlt(packetWrapper, ilIlGZ.IlIlG);
        packetWrapper.IlIlu(ilIlGZ.IlIlI());
    }

    public IlIlWb IlIlK() {
        return this.IlIlG;
    }

    public void IlIlv(IlIlWb ilIlWb) {
        this.IlIlG = ilIlWb;
    }

    public boolean IlIl_() {
        return this.IlIl_;
    }

    public void IlIlu(boolean bl) {
        this.IlIl_ = bl;
    }

    public boolean IlIlo() {
        return this.IlIlm;
    }

    public void IlIlw(boolean bl) {
        this.IlIlm = bl;
    }

    public byte IlIlI() {
        long l = a ^ 0x11544B7AA1E0L;
        PacketWrapper[] packetWrapperArray = IlIlFh.IlIla();
        int n = this.IlIl_;
        if (packetWrapperArray != null) {
            n = n != 0 ? 1 : 0;
        }
        int n2 = this.IlIlm;
        if (packetWrapperArray != null) {
            n2 = n2 != 0 ? 2 : 0;
        }
        return (byte)(n | n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a(-8633205043034516624L, -7283409739166025720L, MethodHandles.lookup().lookupClass()).a(199996525694476L);
        long l = a ^ 0x61C5FFB68AD4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 2921890177128653319L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                IlIld = (byte)l3;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

