/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlAS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlOG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIld2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.IlIlxw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class IlIlxm
extends IlIlxl {
    int IlIlW;
    byte[] IlIlc;
    String IlIlo;
    Instant IlIlB;
    long IlIlP;
    IlIlAS IlIlU;
    @Nullable
    Component IlIlK;
    IlIld2 IlIlZ;
    IlIlOG IlIlw;
    private static final long a = IlIls.a(-8806765314095255380L, 9195170564708604800L, MethodHandles.lookup().lookupClass()).a(274083291729091L);
    private static final String b;
    private static transient /* synthetic */ String pJZFOqoKOl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlxm(UUID uUID, int n, byte[] byArray, String string, Instant instant, long l, IlIlAS ilIlAS, @Nullable Component component, IlIld2 ilIld2, IlIlOG ilIlOG) {
        long l2 = a ^ 0x534A0426D9F5L;
        super(Component.text(string), ilIlOG.IlIlJ(), uUID);
        this.IlIlW = n;
        this.IlIlc = byArray;
        this.IlIlo = string;
        this.IlIlB = instant;
        this.IlIlP = l;
        this.IlIlU = ilIlAS;
        this.IlIlK = component;
        boolean bl = IlIlxw.IlIlv();
        try {
            this.IlIlZ = ilIld2;
            this.IlIlw = ilIlOG;
            if (bl) {
                PacketWrapper.IlIle(new int[5]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw IlIlxm.a(unsupportedOperationException);
        }
    }

    public int IlIlR() {
        return this.IlIlW;
    }

    public void IlIlP(int n) {
        this.IlIlW = n;
    }

    public byte[] IlIlg() {
        return this.IlIlc;
    }

    public void IlIlX(byte[] byArray) {
        this.IlIlc = byArray;
    }

    @Override
    public Component IlIlb() {
        return Component.text(this.IlIlo);
    }

    @Override
    @Deprecated
    public void IlIlv(Component component) {
        long l = a ^ 0x482E08AFC274L;
        throw new UnsupportedOperationException(b);
    }

    public String IlIlr() {
        return this.IlIlo;
    }

    public void IlIlq(String string) {
        this.IlIlo = string;
    }

    public Instant IlIll() {
        return this.IlIlB;
    }

    public void IlIld(Instant instant) {
        this.IlIlB = instant;
    }

    public long IlIlc() {
        return this.IlIlP;
    }

    public void IlIlV(long l) {
        this.IlIlP = l;
    }

    public IlIlAS IlIla() {
        return this.IlIlU;
    }

    public void IlIlj(IlIlAS ilIlAS) {
        this.IlIlU = ilIlAS;
    }

    public Optional<Component> IlIlU() {
        return Optional.ofNullable(this.IlIlK);
    }

    public void IlIlw(@Nullable Component component) {
        this.IlIlK = component;
    }

    public IlIld2 IlIls() {
        return this.IlIlZ;
    }

    public void IlIln(IlIld2 ilIld2) {
        this.IlIlZ = ilIld2;
    }

    public IlIlOG IlIlJ() {
        return this.IlIlw;
    }

    public void IlIlI(IlIlOG ilIlOG) {
        this.IlIlw = ilIlOG;
    }

    @Deprecated
    public IlIlOG IlIlw() {
        return this.IlIlw;
    }

    @Deprecated
    public void IlIlx(IlIlOG ilIlOG) {
        this.IlIlw = ilIlOG;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0xDD009D42904L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0086\u0093\u00b26;\u00eb\u0003i\u00e4\u00f6g\u00aa\u00a0\u00a0a\u009aS\u00a9b\u00cf/;\u00b8\u00ddik\t\u000bS\u00a7C\u0014m\u0016S\u00b7\u00c4\u00e8(\u0011\u00afz\u00d5;\u00b7\bk\u00e2w\u00bb8\u00de\u00e1\u00d0>\u00a5\u00bb\u00ce\u00c3\u009f\u009dz\u00f3?B'\u00a4\u00c2$TL\u00c59T\u00db\u00a35\u00b4k%\u00f1\u008c\n\u00b0\u00a6\u00dc\u00af\u00a3\u0080\u0081\u0086\u009a\u00b7\u00d1A\u0013\u0097K\u001db\u00b6\u0087\u00dd\u00a4\u0000\u00d0\u000e\u0087Z\n\u0082\u00b2\t\u00b4G\u0014\u00dcG\u0013\u00ce\u00cal\u00c4B\u00bc(1g".getBytes("ISO-8859-1"));
                b = IlIlxm.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    private static String a(byte[] byArray) {
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

