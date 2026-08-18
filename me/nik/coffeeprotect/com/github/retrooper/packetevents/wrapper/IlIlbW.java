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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlAn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlri;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlbW
extends PacketWrapper<IlIlbW> {
    private static final int IlIlc = 1;
    private static final int IlIlC;
    private static final int IlIlD;
    private IlIlAn IlIlV;
    private String IlIlh;
    private IlIlri IlIlb;
    private boolean IlIlT;
    private boolean IlIlM;
    private boolean IlIlZ;
    private short IlIld;
    private static final long b;
    private static transient /* synthetic */ String oQmAuvMNLQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbW(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbW(IlIlAn ilIlAn, String string, IlIlri ilIlri, boolean bl, boolean bl2, boolean bl3) {
        super(IlIlnN.UPDATE_COMMAND_BLOCK);
        this.IlIlV = ilIlAn;
        this.IlIlh = string;
        this.IlIlb = ilIlri;
        this.IlIlT = bl;
        this.IlIlM = bl2;
        this.IlIlZ = bl3;
    }

    @Override
    public void IlIle() {
        long l = b ^ 0x21329477793EL;
        this.IlIlV = new IlIlAn(this.IlIli(), this.IlIlg);
        this.IlIlh = this.IlIli();
        this.IlIlb = IlIlri.IlIle(this.IlIlf());
        this.IlIld = this.IlIlP();
        String string = IlIlJH.IlIlw();
        int n = this.IlIld & 1;
        if (string == null) {
            n = n != 0 ? 1 : 0;
        }
        this.IlIlT = n;
        int n2 = this.IlIld & 2;
        if (string == null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        this.IlIlM = n2;
        int n3 = this.IlIld & 4;
        if (string == null) {
            n3 = n3 != 0 ? 1 : 0;
        }
        this.IlIlZ = n3;
    }

    @Override
    public void IlIlJ() {
        IlIlbW ilIlbW;
        block8: {
            boolean bl;
            block7: {
                long l = b ^ 0x384FE99E4796L;
                String string = IlIlJH.IlIlw();
                this.IlIlP(this.IlIlV.IlIlb(this.IlIlg));
                String string2 = string;
                this.IlIlM(this.IlIlh);
                this.IlIlJ(this.IlIlb.ordinal());
                bl = this.IlIlT;
                if (string2 == null) {
                    if (bl) {
                        this.IlIld = (short)(this.IlIld | 1);
                    }
                    bl = this.IlIlM;
                }
                if (string2 != null) break block7;
                if (bl) {
                    this.IlIld = (short)(this.IlIld | 2);
                }
                ilIlbW = this;
                if (string2 != null) break block8;
                bl = ilIlbW.IlIlZ;
            }
            if (bl) {
                this.IlIld = (short)(this.IlIld | 4);
            }
            ilIlbW = this;
        }
        ilIlbW.IlIlu(this.IlIld);
    }

    public void IlIlc(IlIlbW ilIlbW) {
        this.IlIlV = ilIlbW.IlIlV;
        this.IlIlh = ilIlbW.IlIlh;
        this.IlIlb = ilIlbW.IlIlb;
        this.IlIlT = ilIlbW.IlIlT;
        this.IlIlM = ilIlbW.IlIlM;
        this.IlIlZ = ilIlbW.IlIlZ;
        this.IlIld = ilIlbW.IlIld;
    }

    public IlIlAn IlIlv() {
        return this.IlIlV;
    }

    public void IlIlA(IlIlAn ilIlAn) {
        this.IlIlV = ilIlAn;
    }

    public String IlIlP() {
        return this.IlIlh;
    }

    public void IlIlN(String string) {
        this.IlIlh = string;
    }

    public IlIlri IlIlk() {
        return this.IlIlb;
    }

    public void IlIlu(IlIlri ilIlri) {
        this.IlIlb = ilIlri;
    }

    public boolean IlIll() {
        return this.IlIlT;
    }

    public void IlIlP(boolean bl) {
        this.IlIlT = bl;
    }

    public boolean IlIlp() {
        return this.IlIlM;
    }

    public void IlIlz(boolean bl) {
        this.IlIlM = bl;
    }

    public boolean IlIlG() {
        return this.IlIlZ;
    }

    public void IlIlI(boolean bl) {
        this.IlIlZ = bl;
    }

    public short IlIlJ() {
        return this.IlIld;
    }

    public void IlIla(short s) {
        this.IlIld = s;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = IlIls.a(7386966187548575582L, -419509618622767104L, MethodHandles.lookup().lookupClass()).a(224565893694161L);
        long l = b ^ 0x703388058A77L;
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
        String string = "0T\u00bb\u00cay\u00b4\u00ea+1r\u001b\u00a6q\u0017\u00e8\u00f2";
        int n2 = "0T\u00bb\u00cay\u00b4\u00ea+1r\u001b\u00a6q\u0017\u00e8\u00f2".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        IlIlD = (int)lArray[1];
        IlIlC = (int)lArray[0];
    }
}

