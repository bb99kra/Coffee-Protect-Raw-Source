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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlbb
extends PacketWrapper<IlIlbb> {
    private int IlIlM;
    private int IlIlQ;
    private static final long b = IlIls.a(2972321024573618715L, 8987313649604939817L, MethodHandles.lookup().lookupClass()).a(154897888820612L);
    private static final String c;
    private static transient /* synthetic */ String yoIMFBlFVA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlbb(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlbb(int n, int n2) {
        super(IlIlnN.SELECT_BUNDLE_ITEM);
        this.IlIlM = n;
        this.IlIlQ = n2;
    }

    @Override
    public void IlIle() {
        block8: {
            int n;
            block7: {
                long l = b ^ 0x68F65FB9CA8L;
                this.IlIlM = this.IlIlf();
                String string = IlIlJH.IlIlw();
                try {
                    try {
                        n = this.IlIlQ = this.IlIlf();
                        if (string != null) break block7;
                        if (n >= 0) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIlbb.a(illegalArgumentException);
                    }
                    n = this.IlIlQ;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIlbb.a(illegalArgumentException);
                }
            }
            try {
                if (n != -1) {
                    throw new IllegalArgumentException(c + this.IlIlQ);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw IlIlbb.a(illegalArgumentException);
            }
        }
    }

    @Override
    public void IlIlJ() {
        this.IlIlJ(this.IlIlM);
        this.IlIlJ(this.IlIlQ);
    }

    public void IlIle(IlIlbb ilIlbb) {
        this.IlIlM = ilIlbb.IlIlM;
        this.IlIlQ = ilIlbb.IlIlQ;
    }

    public int IlIlc() {
        return this.IlIlM;
    }

    public void IlIlk(int n) {
        this.IlIlM = n;
    }

    public int IlIlo() {
        return this.IlIlQ;
    }

    public void IlIlF(int n) {
        this.IlIlQ = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x4E0DE64AD546L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("n\u008d\u00eaqH\u0011\u00d0'\u00e8\u00df\u0015\u00a5\u00eby\u000b\u00bd\u00fc}\u009a\u00fe\u00b9\u0099\u00f88\u00a5\u0090\u00a6\u00fb\u00f0\u00cb\u0011\u00fb".getBytes("ISO-8859-1"));
                c = IlIlbb.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}

