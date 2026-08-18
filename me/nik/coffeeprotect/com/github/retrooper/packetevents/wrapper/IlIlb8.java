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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlb8
extends PacketWrapper<IlIlb8> {
    private IlIlAn IlIlM;
    private String[] IlIld;
    private boolean IlIlZ;
    private static final long b = IlIls.a(5171570608187491530L, -3830344956316178671L, MethodHandles.lookup().lookupClass()).a(190453344268893L);
    private static final long c;
    private static transient /* synthetic */ String fcczeGAgxi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlb8(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlb8(IlIlAn ilIlAn, String[] stringArray, boolean bl) {
        super(IlIlnN.UPDATE_SIGN);
        this.IlIlM = ilIlAn;
        this.IlIld = stringArray;
        this.IlIlZ = bl;
    }

    @Override
    public void IlIle() {
        int n;
        String string;
        block10: {
            block8: {
                IlIlb8 ilIlb8;
                block9: {
                    block7: {
                        int n2;
                        block5: {
                            block6: {
                                long l = b ^ 0x79C987815140L;
                                string = IlIlJH.IlIlw();
                                n2 = this.IlIlg.IlIlz(ServerVersion.V_1_8);
                                if (string != null) break block5;
                                if (n2 == 0) break block6;
                                this.IlIlM = new IlIlAn(this.IlIli(), this.IlIlg);
                                if (string == null) break block7;
                            }
                            n2 = this.IlIlW();
                        }
                        n = n2;
                        short s = this.IlIlG();
                        int n3 = this.IlIlW();
                        this.IlIlM = new IlIlAn(n, s, n3);
                    }
                    ilIlb8 = this;
                    if (string != null) break block8;
                    if (!ilIlb8.IlIlg.IlIlz(ServerVersion.V_1_20)) break block9;
                    this.IlIlZ = this.IlIlK();
                    if (string == null) break block10;
                }
                ilIlb8 = this;
            }
            ilIlb8.IlIlZ = true;
        }
        this.IlIld = new String[4];
        for (n = 0; n < 4; ++n) {
            this.IlIld[n] = this.IlIlp((int)c);
            if (string == null) continue;
        }
    }

    @Override
    public void IlIlJ() {
        int n;
        String string;
        block8: {
            IlIlb8 ilIlb8;
            block6: {
                block7: {
                    long l = b ^ 0x60B4FA686FE8L;
                    string = IlIlJH.IlIlw();
                    ilIlb8 = this;
                    if (string != null) break block6;
                    if (!ilIlb8.IlIlg.IlIlz(ServerVersion.V_1_8)) break block7;
                    long l2 = this.IlIlM.IlIlb(this.IlIlg);
                    this.IlIlP(l2);
                    if (string == null) break block8;
                }
                this.IlIla(this.IlIlM.IlIlj);
                this.IlIlG(this.IlIlM.IlIlw);
                ilIlb8 = this;
            }
            ilIlb8.IlIla(this.IlIlM.IlIlk);
        }
        int n2 = this.IlIlg.IlIlz(ServerVersion.V_1_20);
        if (string == null) {
            if (n2 != 0) {
                this.IlIla(this.IlIlZ);
            }
            n2 = n = 0;
        }
        while (n < 4) {
            this.IlIlM(this.IlIld[n]);
            ++n;
            if (string == null) continue;
        }
    }

    public void IlIlM(IlIlb8 ilIlb8) {
        this.IlIlM = ilIlb8.IlIlM;
        this.IlIlZ = ilIlb8.IlIlZ;
        this.IlIld = ilIlb8.IlIld;
    }

    public IlIlAn IlIlX() {
        return this.IlIlM;
    }

    public void IlIlE(IlIlAn ilIlAn) {
        this.IlIlM = ilIlAn;
    }

    public String[] IlIlE() {
        return this.IlIld;
    }

    public void IlIl_(String[] stringArray) {
        this.IlIld = stringArray;
    }

    public boolean IlIlV() {
        return this.IlIlZ;
    }

    public void IlIlh(boolean bl) {
        this.IlIlZ = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x677B6ECCF78EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 6862156474189994872L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

