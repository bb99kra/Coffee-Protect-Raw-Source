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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlCd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlJq
extends PacketWrapper<IlIlJq> {
    private IlIlCd IlIld;
    private static final long b = IlIls.a(6063385408992199477L, 5329040714117781057L, MethodHandles.lookup().lookupClass()).a(226504860119671L);
    private static final String c;
    private static transient /* synthetic */ String bLRspreIZv = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlJq(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public IlIlJq(IlIlCd ilIlCd) {
        super(IlIlnN.CLIENT_STATUS);
        this.IlIld = ilIlCd;
    }

    @Override
    public void IlIle() {
        block8: {
            block6: {
                long l = b ^ 0x150D02EA2A38L;
                String string = IlIlJH.IlIlw();
                try {
                    IlIlJq ilIlJq;
                    block7: {
                        try {
                            try {
                                ilIlJq = this;
                                if (string != null) break block6;
                                if (!ilIlJq.IlIlg.IlIlz(ServerVersion.V_1_8)) break block7;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw IlIlJq.a(illegalStateException);
                            }
                            this.IlIld = (IlIlCd)this.IlIlH(IlIlCd.IlIlN());
                            if (string == null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw IlIlJq.a(illegalStateException);
                        }
                    }
                    ilIlJq = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw IlIlJq.a(illegalStateException);
                }
            }
            ilIlJq.IlIld = IlIlCd.IlIlN()[this.IlIlE()];
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIlJ() {
        block22: {
            block19: {
                block20: {
                    block21: {
                        var1_1 = IlIlJq.b ^ 13677306778768L;
                        var3_2 = IlIlJH.IlIlw();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v0 = this;
                                                        if (var3_2 != null) break block19;
                                                        if (v0.IlIlg.IlIlz(ServerVersion.V_1_8)) {
                                                        }
                                                        ** GOTO lbl54
                                                    }
                                                    catch (IllegalStateException v1) {
                                                        throw IlIlJq.a(v1);
                                                    }
                                                    v2 = this;
                                                    if (var3_2 != null) break block20;
                                                }
                                                catch (IllegalStateException v3) {
                                                    throw IlIlJq.a(v3);
                                                }
                                                if (v2.IlIld != IlIlCd.THIRD_ENTRY) break block21;
                                            }
                                            catch (IllegalStateException v4) {
                                                throw IlIlJq.a(v4);
                                            }
                                            v2 = this;
                                            if (var3_2 != null) break block20;
                                        }
                                        catch (IllegalStateException v5) {
                                            throw IlIlJq.a(v5);
                                        }
                                        if (!v2.IlIlg.IlIlC(ServerVersion.V_26_1)) break block21;
                                    }
                                    catch (IllegalStateException v6) {
                                        throw IlIlJq.a(v6);
                                    }
                                    v2 = this;
                                    if (var3_2 != null) break block20;
                                }
                                catch (IllegalStateException v7) {
                                    throw IlIlJq.a(v7);
                                }
                                if (!v2.IlIlg.IlIlz(ServerVersion.V_1_16)) break block21;
                            }
                            catch (IllegalStateException v8) {
                                throw IlIlJq.a(v8);
                            }
                            throw new IllegalStateException(IlIlJq.c);
                        }
                        catch (IllegalStateException v9) {
                            throw IlIlJq.a(v9);
                        }
                    }
                    v2 = this;
                }
                try {
                    v2.IlIlw(this.IlIld);
                    if (var3_2 == null) break block22;
lbl54:
                    // 2 sources

                    v0 = this;
                }
                catch (IllegalStateException v10) {
                    throw IlIlJq.a(v10);
                }
            }
            v0.IlIlu(this.IlIld.ordinal());
        }
    }

    public void IlIlc(IlIlJq ilIlJq) {
        this.IlIld = ilIlJq.IlIld;
    }

    public IlIlCd IlIlP() {
        return this.IlIld;
    }

    public void IlIlQ(IlIlCd ilIlCd) {
        this.IlIld = ilIlCd;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x10B38F8105D3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0082\u00af\u00eee\u00d8+2k\u00ef\u00c9\u00c7E(\u00dfs\u00bf\u00afJ\u0098\u00a3\u00f5\u00adF\u00f8\u00ecA\u0011\u00f4J\u00f3\u009ft".getBytes("ISO-8859-1"));
                c = IlIlJq.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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

